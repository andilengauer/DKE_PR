package frontend;

import java.io.File;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.XMLGregorianCalendar;

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
		FilterInputType filterInput = new FilterInputType();
		filterInput.setId("Test1");
		filterInput.setHasAircraft(getPreparedAircraft(inputData));
		filterInput.setHasFlightPath(getPreparedFlightPath(inputData));
		
		
		//File outputFile = new File("/Users/Andreas/Documents/output.xml");
		File outputFile = new File("output.xml");
		
		try {
			JaxbHelper.marshalFilterInput(filterInput, outputFile);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private FlightPathPropertyType getPreparedFlightPath(Map<String, String[]> inputData) {
		FlightPathPropertyType flightpath = new FlightPathPropertyType();
		FlightPathType fpType = new FlightPathType();
		AerodromeType depature = new AerodromeType();
		AerodromeType destination = new AerodromeType();
		DepartureAerodromePropertyType departureAerodrome;
		DestinationAerodromePropertyType destinationAerodrome;
		CodeFlightRuleType depFlightRule = new CodeFlightRuleType();
		CodeFlightRuleType destFlightRule = new CodeFlightRuleType();
		
		//Set Departure Aerodrome
		depature.setDesignator(inputData.get("Id_Abflugflughafen")[0]);
		depature.setId("ID unknown");
		depature.setTime(getPreparedTimePeriod(inputData.get("Datum_Anfang_Abflugflughafen")[0],inputData.get("Uhrzeit_Anfang_Abflugflughafen")[0],inputData.get("Datum_Ende_Abflugflughafen")[0],inputData.get("Uhrzeit_Ende_Abflugflughafen")[0]));
		
		depFlightRule.setValue(inputData.get("Flugregel_Abflugflughafen")[0]);
		depature.setFlightRule(depFlightRule);
		depature.setWeather(inputData.get("Wetter_Abflugflughafen")[0]);
		departureAerodrome = new DepartureAerodromePropertyType();
		departureAerodrome.setDepartureAerodrome(depature);
		
		//Set Destination Aerodrome
		destination.setDesignator(inputData.get("Id_Abflugflughafen")[0]);
		destination.setId("ID unknown");
		destination.setTime(getPreparedTimePeriod(inputData.get("Datum_Anfang_Abflugflughafen")[0],inputData.get("Uhrzeit_Anfang_Abflugflughafen")[0],inputData.get("Datum_Ende_Abflugflughafen")[0],inputData.get("Uhrzeit_Ende_Abflugflughafen")[0]));
		
		destFlightRule.setValue(inputData.get("Flugregel_Abflugflughafen")[0]);
		destination.setFlightRule(depFlightRule);
		destination.setWeather(inputData.get("Wetter_Abflugflughafen")[0]);
		destinationAerodrome = new DestinationAerodromePropertyType();
		destinationAerodrome.setDestinationAerodrome(depature);
		
		
		//Set Flight Path
		fpType.setId("RouteID");
		fpType.setRouteName("RoutenName");
		fpType.setHasDepartureAerodrome(departureAerodrome);
		fpType.setHasDestinationAerodrome(destinationAerodrome);
		
		//Set Area
		SurfacePropertyType surface = new SurfacePropertyType();
		//surface.setSurface(new JAXBElement<>());
		//fpType.getHasArea().add(new)
		
		//Set Segment
		SegmentType segment = new SegmentType();
		segment.setDesignator(inputData.get("Segment_bezeichnung")[0]);
		segment.setStartPoint(getPreparedPoint(inputData.get("Segment_startpunkt")[0]));
		segment.se
		SegmentPropertyType segmentProperty = new SegmentPropertyType();
		segmentProperty.setSegment(segment);
		
		
		fpType.getHasSegment().add(segmentProperty);
		
		flightpath.setFlightPath(fpType);
		
		return flightpath;
	}

	private PointPropertyType getPreparedPoint(String string) {
		//PointPropertyType pointProperty = new PointPropertyType();
		//JAXBElement<? extends PointType> pt = new JAXBElement<? extends PointType>();
		//pointProperty.setPoint();
		
		return pointProperty;
	}

	private TimePeriodPropertyType getPreparedTimePeriod(String begindate, String begintime, String enddate, String endtime) {
		TimePeriodPropertyType timePeriod = new TimePeriodPropertyType();
		TimePeriodType p = new TimePeriodType();
		XMLGregorianCalendar beginCal = new XMLGregorianCalendarImpl();
		XMLGregorianCalendar endCal = new XMLGregorianCalendarImpl();
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH:mm");
		
		
		try {
			c.setTimeInMillis(sdf.parse(begindate+ "-" + begintime).getTime());
			beginCal.setYear(c.get(Calendar.YEAR));
			beginCal.setMonth(c.get(Calendar.MONTH) + 1);
			beginCal.setDay(c.get(Calendar.DAY_OF_MONTH));
			beginCal.setHour(c.get(Calendar.HOUR));
			beginCal.setMinute(c.get(Calendar.MINUTE));
			
			c.setTimeInMillis(sdf.parse(enddate+ "-" + endtime).getTime());
			endCal.setYear(c.get(Calendar.YEAR));
			endCal.setMonth(c.get(Calendar.MONTH) + 1);
			endCal.setDay(c.get(Calendar.DAY_OF_MONTH));
			endCal.setHour(c.get(Calendar.HOUR));
			endCal.setMinute(c.get(Calendar.MINUTE));
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		p.setBeginPosition(beginCal);
		p.setEndPosition(endCal);
		
		timePeriod.setTimePeriod(p);
		return null;
	}

	private AircraftPropertyType getPreparedAircraft(Map<String,String[]> inputData)
	{
		AircraftPropertyType aircraft = new AircraftPropertyType();
		AircraftType aircraftType = new AircraftType();
		
		aircraftType.setDesignator(inputData.get("Id_Flugzeug")[0]);
		aircraftType.setId("ID not set");
		aircraftType.setMaxWeightLb(new BigDecimal( inputData.get("Maximalgewicht_Flugzeug")[0]));
		aircraftType.setMinWeightLb(new BigDecimal( inputData.get("Minimalgewicht_Flugzeug")[0]));
		aircraftType.setType(AircraftTypeType.fromValue(inputData.get("Typ_Flugzeug")[0]));
		
		aircraft.setAircraft(aircraftType);
		
		return aircraft;
	}
	
}
