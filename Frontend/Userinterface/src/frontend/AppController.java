package frontend;

import java.io.File;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import net.opengis.gml.DirectPositionType;
import net.opengis.gml.PointPropertyType;
import net.opengis.gml.PointType;
import tools.JaxbHelper;
import aero.aixm.CodeFlightRuleType;
import aero.aixm.SurfacePropertyType;

import com.frequentis.semnotam.pr.AerodromeType;
import com.frequentis.semnotam.pr.AircraftPropertyType;
import com.frequentis.semnotam.pr.AircraftType;
import com.frequentis.semnotam.pr.AircraftTypeType;
import com.frequentis.semnotam.pr.DepartureAerodromePropertyType;
import com.frequentis.semnotam.pr.DestinationAerodromePropertyType;
import com.frequentis.semnotam.pr.FilterInputType;
import com.frequentis.semnotam.pr.FlightPathPropertyType;
import com.frequentis.semnotam.pr.FlightPathType;
import com.frequentis.semnotam.pr.SegmentPropertyType;
import com.frequentis.semnotam.pr.SegmentType;
import com.frequentis.semnotam.pr.TimePeriodPropertyType;
import com.frequentis.semnotam.pr.TimePeriodType;
import com.frequentis.semnotam.pr.jaxb.JaxbTest;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import db.DB_Controller;

public class AppController {
	private static AppController controller = null;
	//private static Map<String,String> map ;
	private String currentId = null;
	
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
		
		InputHandler inputHandler = new InputHandler();
		FilterInputType filterInput = inputHandler.createFilterInput(inputData);
		
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
	
	
}
