package frontend;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;

import tools.JaxbHelper;

import com.frequentis.semnotam.pr.FilterInputType;
import com.frequentis.semnotam.pr.FilterOutputType;

import db.DB_Controller;
import frontend.preparedobjects.PreparedOutput;

public class AppController {
	private static AppController controller = null;
	//private static Map<String,String> map ;
	private String currentId = null;
	private List<FilterInputType> filterInputs = new ArrayList<FilterInputType>();
	public FilterInputType inputType;
	private DB_Controller existDb = new DB_Controller();
	
	private final String dbOutputCollection = "db/DKE_PR/FilterOutput";
	private final String dbInputCollection = "db/DKE_PR/FilterInput";
	
	public static AppController getInstance()
	{
		if(controller == null)
			controller = new AppController();
		
		return controller;
	}
	
	public void setCurrentId(String Id)
	{
		currentId = Id;
	}
	public String getCurrentId()
	{
		return currentId;
	}
	
	public void handleInputData(Map<String,String[]> inputData)
	{
		currentId = "TEST";
		InputHandler inputHandler = new InputHandler();
		FilterInputType filterInput = inputHandler.createFilterInput(inputData);
		filterInputs.add(filterInput);
		inputType = filterInput;
		
		Date now = new Date();
		String fileName = "fi1.xml";
		
		File outputFile = new File("/Users/Andreas/Documents/" + fileName);
		//File outputFile = new File("fi1.xml");
		
		try {
			JaxbHelper.marshalFilterInput(filterInput, outputFile);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//push file into exist database
		
		existDb.initDB();
		existDb.putFile(dbInputCollection, outputFile);
		
	}

	public List<FilterInputType> getFilterInputs() {
		return filterInputs;
	}
	
	public FilterOutputType getFilterOutput(int nr)
	{
		String filterOutput = "";
		existDb.initDB();
		//filterOutput = existDb.getData(dbOutputCollection, "output_ex1.xml");
		filterOutput = existDb.getData(dbOutputCollection, "fo" + nr + ".xml");
		if( filterOutput == null || filterOutput == "")
			return null;
		//System.out.println(filterOutput);
		File filterOutputFile = new File("fo1.xml");
		FileWriter writer = null;
		FilterOutputType outputType = null;
		
		try {
			writer = new FileWriter(filterOutputFile);
			writer.write(filterOutput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(writer != null)
				try {
					writer.close();
				} catch (IOException e) {}
		}
		
		try {
			outputType = JaxbHelper.unmarshalFilterOutput(filterOutputFile);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		filterOutputFile.delete();
		
		return outputType;
	}
	
	public PreparedOutput getPreparedOutput(FilterOutputType filteroutput)
	{
		return OutputHandler.getPreparedOutput(filteroutput);
	}
	
}
