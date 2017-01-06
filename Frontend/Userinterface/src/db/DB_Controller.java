package db;

import java.io.File;
import java.util.Collection;

import javax.xml.transform.OutputKeys;

public class DB_Controller {
	protected static String driver = "org.exist.xmldb.DatabaseImpl";
	protected static String URI = "xmldb:exist://localhost:8080/exist/xmlrpc";
	
	private Database database;
	
	public DB_Controller() 
	{
		
	}
	public void initDB()
	{
		try{
		Class<?> cl = Class.forName(driver);
		database = (Database) cl.newInstance();
        
        // Set to TRUE to connectect over HTTPS-uri 
        // like 'xmldb:exist://localhost:8443/exist/xmlrpc' (port changed 8080->8443)
        database.setProperty("ssl-enable", "false");
        
		DatabaseManager.registerDatabase(database);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public String getData(String collection, String file)
	{
		String result = "";
		try{
		// get the collection
				Collection col = DatabaseManager.getCollection(URI + collection);
				col.setProperty(OutputKeys.INDENT, "yes");
				col.setProperty(EXistOutputKeys.EXPAND_XINCLUDES, "no");
		        col.setProperty(EXistOutputKeys.PROCESS_XSL_PI, "yes");
				XMLResource res = (XMLResource)col.getResource(file);
				if(res == null)
					result = "document not found!";
				else {
					result = res.getContent().toString();
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	public void putFile(String collection, String file)
	{
		try{
		database.setProperty("create-database", "true");
		DatabaseManager.registerDatabase(database);
		
        // try to get collection
		Collection col = 
			DatabaseManager.getCollection(URI + collection);
		if(col == null) {
			String[] splitted = collection.split("/");
            for(int i=0; i < splitted.length; i++)
            {
            	col = DatabaseManager.getCollection(URI+ splitted[i]);
            	if(col == null)
            	{
            		Collection root = DatabaseManager.getCollection(URI + XmldbURI.ROOT_COLLECTION);
                    CollectionManagementService mgtService = 
                        (CollectionManagementService)root.getService("CollectionManagementService", "1.0");
                    col = mgtService.createCollection(collection.substring((XmldbURI.ROOT_COLLECTION + "/").length()));
            	}
            }
		}
		
		File f = new File(file);
        // create new XMLResource
		XMLResource document = (XMLResource)col.createResource(f.getName(), "XMLResource");
		document.setContent(f);
		System.out.print("storing document " + document.getId() + "...");
		col.storeResource(document);
		System.out.println("ok.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String executeXQuery(String query)
	{
		String returnVal = "";
		
		try{
        // get root-collection
        Collection col =
            DatabaseManager.getCollection(URI + XmldbURI.ROOT_COLLECTION);
        // get query-service
        XQueryService service =
            (XQueryService) col.getService( "XQueryService", "1.0" );
        
        // set pretty-printing on
        service.setProperty( OutputKeys.INDENT, "yes" );
        service.setProperty( OutputKeys.ENCODING, "UTF-8" );
        
        CompiledExpression compiled = service.compile( query );
        
        // execute query and get results in ResourceSet
        ResourceSet result = service.execute( compiled );
        //System.out.println(result.toString());
        
        
        for ( int i = 0; i < (int) result.getSize(); i++ ) {
            XMLResource resource = (XMLResource) result.getResource( (long) i ); 
            //resource.getContentAsSAX(serializer);
            
            returnVal += resource.getContent().toString();
        }
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        
        
        
        return returnVal;
	}
    
}