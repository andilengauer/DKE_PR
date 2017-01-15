package tools;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import com.frequentis.semnotam.pr.FilterInputType;
import com.frequentis.semnotam.pr.FlightPathType;
import com.frequentis.semnotam.pr.SegmentPropertyType;

import net.opengis.gml.CoordinatesType;
import net.opengis.gml.DirectPositionType;

public class MapInputFile {

	public static Aircraft getAircraftProperties(FilterInputType input) {
		String aircraftDesignator = input.getHasAircraft().getAircraft().getDesignator();
		String aircraftType = input.getHasAircraft().getAircraft().getType().toString();
		double wingspan = input.getHasAircraft().getAircraft().getWingspanFt().doubleValue();
		double maxWeight = input.getHasAircraft().getAircraft().getMaxWeightLb().doubleValue();
		double minWeight = input.getHasAircraft().getAircraft().getMinWeightLb().doubleValue();

		Aircraft aircraft = new Aircraft(aircraftDesignator, aircraftType, wingspan, maxWeight, minWeight);

		return aircraft;
	}

	public static TimePeriod getTimePeriod(FilterInputType input) {
		GregorianCalendar beginTime = input.getHasTimePeriod().getTimePeriod().getBeginPosition().toGregorianCalendar();
		GregorianCalendar endTime = input.getHasTimePeriod().getTimePeriod().getEndPosition().toGregorianCalendar();

		Date eTime = endTime.getTime();
		Date sTime = beginTime.getTime();


		TimePeriod timePeriod = new TimePeriod(sTime, eTime);

		return timePeriod;
	}

	public static Flightpath getFlightPath(FilterInputType input) {
		FlightPathType flightpath = input.getHasFlightPath().getFlightPath();
		String routeName = flightpath.getRouteName();
		String depatureAerodrome = flightpath.getHasDepartureAerodrome().getDepartureAerodrome().getDesignator();
		String destinationAerodrome = flightpath.getHasDestinationAerodrome().getDestinationAerodrome().getDesignator();
		// String altnernateAerodrome = flightpath.getHasAlternateAerodrome().

		LinkedList<Segment> segments = new LinkedList<>();

		for (SegmentPropertyType st : flightpath.getHasSegment()) {

			String segmentDesignator = st.getSegment().getDesignator();

			List<Double> startCoordinates = st.getSegment().getStartPoint().getPoint().getValue().getPos().getValue();
			List<Double> endCoordinates = st.getSegment().getEndPoint().getPoint().getValue().getPos().getValue();

			Coordinate startCoor = new Coordinate(startCoordinates.get(0), startCoordinates.get(1));
			Coordinate endCoor= new Coordinate(endCoordinates.get(0), endCoordinates.get(1));

			System.out.println(endCoor);
			
			Segment s = new Segment(segmentDesignator, startCoor, endCoor);
			segments.add(s);

		}

		Flightpath flight = new Flightpath(routeName, depatureAerodrome, destinationAerodrome, null, segments);

		return flight;
	}

}
