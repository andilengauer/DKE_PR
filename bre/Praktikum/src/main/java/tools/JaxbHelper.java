package tools;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import com.frequentis.semnotam.pr.AircraftTypeType;
import com.frequentis.semnotam.pr.FilterInputType;
import com.frequentis.semnotam.pr.FilterOutputType;
import com.frequentis.semnotam.pr.ImportanceClassificationPropertyType;
import com.frequentis.semnotam.pr.ImportanceClassificationType;
import com.frequentis.semnotam.pr.ImportanceClassificationValueType;
import com.frequentis.semnotam.pr.ResultPropertyType;

import aero.aixm.AirportHeliportType;
import aero.aixm.message.AIXMBasicMessageType;
import aero.aixm.message.BasicMessageMemberAIXMPropertyType;
import net.opengis.wfs._2.FeatureCollectionType;
import net.opengis.wfs._2.MemberPropertyType;

/**
 * Test class for showing some examples of using JAXB to marshal and unmarshal
 * Java objects and XML files.
 * Unmarshal: Load XML files into Java objects
 * Marshal: Serialize Java objects into XML files
 * 
 * @author steiner
 *
 */
public class JaxbHelper {

	public static void main(String[] args) throws JAXBException {
		//testUnmarshalFeatureCollection();
		
		// Test unmarhsalling of simple feature collection
		File input = new File("src/main/resources/samples/sample_notams.xml");
		unmarshalFeatureCollection(input);
		
		// Test unmarshalling of sample DNOTAM set
		input = new File("src/main/resources/samples/DNOTAMS.xml");
		FeatureCollectionType collection = unmarshalFeatureCollection(input);
		
		//Beispiel zur Verarbeitung von Messages
		List<AIXMBasicMessageType> messages = getMessages(collection); //Liste von Messages
		AIXMBasicMessageType m = messages.get(0); //erste Message
		BasicMessageMemberAIXMPropertyType member = m.getHasMember().get(0); //erster Member der message
		member.getAbstractAIXMFeature();
		if(member.getAbstractAIXMFeature().getValue() instanceof AirportHeliportType) //Überprüfung von welchen Typ das Feature ist
		{
			//wichtig AirPortHeliportType extends AbstractAixmFeature
			//dies muss für alle gelten da sonst kein Typecast erfolgen kann
			AirportHeliportType airHeliType = (AirportHeliportType)member.getAbstractAIXMFeature().getValue() ;
			airHeliType.getTimeSlice().get(0).getAirportHeliportTimeSlice().getValidTime();
		}
		
		
		
		// Test unmarshalling of aerodromes		
		input = new File("src/main/resources/samples/AD.CLS2.0-ADclosedexceptforspecialflights.xml");
		AIXMBasicMessageType message = unmarshalAixmBasicMessage(input);
		
		// Test unmarshalling of input_ex1
		input = new File("src/main/resources/samples/input_ex1.xml");
		FilterInputType filterInput = unmarshalFilterInput(input);
		
		// Test unmarshalling of output_ex1
		input = new File("src/main/resources/samples/output_ex1.xml");
		FilterOutputType filterOutput = unmarshalFilterOutput(input);
		
		
		// Test marshalling of AIXMBasicMessage
		message.setId("101515");
		File output = new File("src/main/resources/samples/aixmMarshal.xml");
		marshalAixmBasicMessage(message, output);
		
		// Test marshalling of FeatureCollection
		collection.setNumberMatched("3");
		output = new File("src/main/resources/samples/wfsMarshal.xml");
		marshalFeatureCollection(collection, output);
		
		// Test marshalling of FilterInput
		filterInput.getHasAircraft().getAircraft().setType(AircraftTypeType.HELICOPTER);
		output = new File("src/main/resources/samples/filterInputMarshal.xml");
		marshalFilterInput(filterInput, output);
		
		// Test marshalling of FilterOutput
		for (ResultPropertyType r : filterOutput.getHasResultSet().getResultSet().getHasResult()) {
			ImportanceClassificationType ip = new ImportanceClassificationType();
			ip.setValue(ImportanceClassificationValueType.ESSENTIAL.toString());			
			ImportanceClassificationPropertyType ipp = new ImportanceClassificationPropertyType();
			ipp.setImportanceClassification(ip);
			r.getResult().getHasImportanceClassification().add(ipp);	
		}
		output = new File("src/main/resources/samples/filterOutputMarshal.xml");
		marshalFilterOutput(filterOutput, output);
	}
	
	/**
	 * Get jaxb context for marshalling/unmarshalling AIXM elements.
	 * @return JAXBContext used for handling AIXMBasicMessage
	 * @throws JAXBException
	 */
	private static JAXBContext getAixmContext() throws JAXBException {
		return JAXBContext.newInstance(aero.aixm.ObjectFactory.class);
	}
	
	/**
	 * Get jaxb context for marshalling/unmarshalling wfs feature
	 * collection.
	 * @return JAXBContext used for FeatureCollection
	 * @throws JAXBException
	 */
	public static JAXBContext getWfsContext() throws JAXBException {
		return JAXBContext.newInstance(net.opengis.wfs._2.ObjectFactory.class);
	}	
	
	/**
	 * Get jaxb context for marshalling/unmarshalling FilterInput and FilterOutput
	 * elements.
	 * @return JAXBContext used for FilterInput and FilterOutput
	 * @throws JAXBException
	 */
	public static JAXBContext getPrContext() throws JAXBException {
		return JAXBContext.newInstance(com.frequentis.semnotam.pr.ObjectFactory.class);
	}

	/**
	 * Marshal the specified AIXMBasicMessageType object as AIXMBasicMessage into the 
	 * specified file.
	 * @param message
	 * @param outputFile
	 * @throws JAXBException
	 */
	public static void marshalAixmBasicMessage(AIXMBasicMessageType message, File outputFile) throws JAXBException {
		Marshaller aixmMarshaller = getAixmContext().createMarshaller();
		
		aixmMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
		aixmMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	
		aixmMarshaller.marshal(
				new JAXBElement<AIXMBasicMessageType>(new QName("http://www.aixm.aero/schema/5.1", "AIXMBasicMessage"),
						AIXMBasicMessageType.class, message),
				outputFile);
	}
	
	/**
	 * Unmarshal the specified file into an AIXMBasicMessageType object.
	 * @param input
	 * @return
	 * @throws JAXBException
	 */
	public static AIXMBasicMessageType unmarshalAixmBasicMessage(File input) throws JAXBException {
		Unmarshaller aixmUnmarshaller = getAixmContext().createUnmarshaller();
		
		AIXMBasicMessageType message = (AIXMBasicMessageType) JAXBIntrospector.getValue(aixmUnmarshaller.unmarshal(input));
		System.out.println(message.getClass());
		return message;
	}
	
	public static List<AIXMBasicMessageType> getMessages(FeatureCollectionType collection) {
		List<AIXMBasicMessageType> list = new ArrayList<AIXMBasicMessageType>();
		
		// For each MemberPropertyTyp ~ <wfs:member> Element
		for (MemberPropertyType member : collection.getMember()) {
			// Get the element at list index 1 = AIXMBasicMessage
			// Due to the structure of the sample DNOTAM files the content list
			// has always 3 entries:
			//  1. entry = whitespace/returns before AIXMBasicMessage element
			//  2. entry = AIXMBasicMessage Element
			//  3. entry = whitespace/returns after AIXMBasicMessage element
			AIXMBasicMessageType message =(AIXMBasicMessageType) JAXBIntrospector.getValue(member.getContent().get(1));
			list.add(message);
		}
		return list;
	}

	/**
	 * Unmarshal the specified file into a FeatureCollectionType object.
	 * 
	 * @param input
	 * @return
	 * @throws JAXBException
	 */
	public static FeatureCollectionType unmarshalFeatureCollection(File input) throws JAXBException {
		Unmarshaller wfsUnmarshaller = getCombinedContext().createUnmarshaller();

		FeatureCollectionType collection = (FeatureCollectionType) JAXBIntrospector
				.getValue(wfsUnmarshaller.unmarshal(input));

		return collection;
	}
	private static JAXBContext getCombinedContext() throws JAXBException {
		return JAXBContext.newInstance(aero.aixm.ObjectFactory.class, net.opengis.wfs._2.ObjectFactory.class);
	}
	
		
	/**
	 * Marshal the specified FeatureCollectionType object as FeatureCollection
	 * into the specified file.
	 * 
	 * @param collection
	 * @param outputFile
	 * @throws JAXBException
	 */
	public static void marshalFeatureCollection(FeatureCollectionType collection, File outputFile)
			throws JAXBException {
		Marshaller wfsMarshaller = getWfsContext().createMarshaller();

		wfsMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); // NOI18N
		wfsMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		wfsMarshaller.marshal(
				new JAXBElement<FeatureCollectionType>(new QName("http://www.opengis.net/wfs/2.0", "FeatureCollection"),
						FeatureCollectionType.class, collection),
				outputFile);
	}
	
	/**
	 * Unmarshal the specified file into a FilterInputType object.
	 * @param input
	 * @return
	 * @throws JAXBException
	 */
	public static FilterInputType unmarshalFilterInput(File input) throws JAXBException {
		//File input = new File("src/main/resources/sample_notams.xml");
		
		Unmarshaller prUnmarshaller = getPrContext().createUnmarshaller();		
						
		FilterInputType filterInput = (FilterInputType) JAXBIntrospector.getValue(prUnmarshaller.unmarshal(input));
		System.out.println(filterInput.getClass());	
		return filterInput;
	}
	
	/**
	 * Unmarshal the specified file into a FilterOutputType object.
	 * @param input
	 * @return
	 * @throws JAXBException
	 */
	public static FilterOutputType unmarshalFilterOutput(File input) throws JAXBException {
		//File input = new File("src/main/resources/sample_notams.xml");
		
		Unmarshaller prUnmarshaller = getPrContext().createUnmarshaller();		
						
		FilterOutputType filterOutput = (FilterOutputType) JAXBIntrospector.getValue(prUnmarshaller.unmarshal(input));
		System.out.println(filterOutput.getClass());	
		return filterOutput;
	}	

	/**
	 * Marshal the specified FilterInputType object as FilterInput into the 
	 * specified file.
	 * @param filterInput
	 * @param outputFile
	 * @throws JAXBException
	 */
	public static void marshalFilterInput(FilterInputType filterInput, File outputFile) throws JAXBException {			
		Marshaller prMarshaller = getPrContext().createMarshaller();
		
		prMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
		prMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		
		prMarshaller.marshal(
				new JAXBElement<FilterInputType>(new QName("http://semnotam.frequentis.com/pr", "FilterInput"),
						FilterInputType.class, filterInput),
				outputFile);
	}
	
	/**
	 * Marshal the specified FilterOutputType object as FilterOutput into the 
	 * specified file.
	 * @param filterOutput
	 * @param outputFile
	 * @throws JAXBException
	 */
	public static void marshalFilterOutput(FilterOutputType filterOutput, File outputFile) throws JAXBException {			
		Marshaller prMarshaller = getPrContext().createMarshaller();
		
		prMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
		prMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		
		prMarshaller.marshal(
				new JAXBElement<FilterOutputType>(new QName("http://semnotam.frequentis.com/pr", "FilterOutput"),
						FilterOutputType.class, filterOutput),
				outputFile);
	}
}
