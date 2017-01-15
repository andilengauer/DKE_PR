package frontend;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;

import tools.JaxbHelper;

import com.frequentis.semnotam.pr.FilterInputType;

import db.DB_Controller;

public class AppController {
	private static AppController controller = null;
	//private static Map<String,String> map ;
	private String currentId = null;
	private List<FilterInputType> filterInputs = new ArrayList<FilterInputType>();
	public FilterInputType inputType;
	
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
		DB_Controller existDb = new DB_Controller();
		existDb.initDB();
		existDb.putFile("db/DKE_PR/FilterInput", outputFile);
		
	}

	public List<FilterInputType> getFilterInputs() {
		return filterInputs;
	}
	
	
}
