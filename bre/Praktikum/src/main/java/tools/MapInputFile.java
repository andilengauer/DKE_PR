package tools;

import java.io.File;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import com.frequentis.semnotam.pr.FilterInputType;
import com.frequentis.semnotam.pr.FlightPathType;
import com.frequentis.semnotam.pr.SegmentPropertyType;

import net.opengis.gml.CoordinatesType;

public class MapInputFile {

	

	public static Aircraft getAircraftProperties(FilterInputType input){
		String aircraftDesignator = input.getHasAircraft().getAircraft().getDesignator();
    	String aircraftType = input.getHasAircraft().getAircraft().getType().toString();
    	double wingspan = input.getHasAircraft().getAircraft().getWingspanFt().doubleValue();
    	double maxWeight = input.getHasAircraft().getAircraft().getMaxWeightLb().doubleValue();
    	double minWeight = input.getHasAircraft().getAircraft().getMinWeightLb().doubleValue();
    	
    	Aircraft aircraft = new Aircraft(aircraftDesignator, aircraftType, wingspan, maxWeight, minWeight);
    	
    	return aircraft;
	}
	
	public static TimePeriod getTimePeriod(FilterInputType input){
		GregorianCalendar beginTime = input.getHasTimePeriod().getTimePeriod().getBeginPosition().toGregorianCalendar();
    	GregorianCalendar endTime = input.getHasTimePeriod().getTimePeriod().getEndPosition().toGregorianCalendar();
    	
    	TimePeriod timePeriod = new TimePeriod(beginTime, endTime);
    	
    	return timePeriod;
	}
	
	
	public static Flightpath getFlightPath(FilterInputType input){
		FlightPathType flightpath = input.getHasFlightPath().getFlightPath();
    	String routeName = flightpath.getRouteName();
    	String depatureAerodrome = flightpath.getHasDepartureAerodrome().getDepartureAerodrome().getDesignator();
    	String destinationAerodrome = flightpath.getHasDestinationAerodrome().getDestinationAerodrome().getDesignator();
    	//String altnernateAerodrome = flightpath.getHasAlternateAerodrome().
    	
    	LinkedList<Segment> segments = new LinkedList<>();
    	
    	for(SegmentPropertyType st : flightpath.getHasSegment()){
    		
    		CoordinatesType coordinates = st.getSegment().getStartPoint().getPoint().getValue().getCoordinates();
    		String sCoordinates = coordinates.toString();
    		
    		String segmentDesignator = st.getSegment().getDesignator();
    		
    		String [] splittedCoordinates = sCoordinates.split(" ");
    		
    		if(splittedCoordinates.length > 1)
    		{
    		double startCoor = Double.parseDouble(splittedCoordinates[0]);
    		double endCoor= Double.parseDouble(splittedCoordinates[1]);
    		
    		Segment s = new Segment(segmentDesignator,startCoor, endCoor);
    		segments.add(s);
    		}
    	}
    	
    	Flightpath flight = new Flightpath(routeName, depatureAerodrome, destinationAerodrome, null, segments);
    	
    	return flight;
	}
	
	
}
