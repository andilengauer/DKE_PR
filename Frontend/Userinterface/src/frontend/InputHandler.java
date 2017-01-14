package frontend;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import net.opengis.gml.DirectPositionType;
import net.opengis.gml.PointPropertyType;
import net.opengis.gml.PointType;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import aero.aixm.CodeFlightRuleType;

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
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

public class InputHandler {

	public FilterInputType createFilterInput(Map<String, String[]> inputData) {
		FilterInputType filterInput = new FilterInputType();
		filterInput.setId("fi1");
		try {

			filterInput.setHasAircraft(getPreparedAircraft(inputData));
			filterInput.setHasFlightPath(getPreparedFlightPath(inputData));

		} catch (Exception e) {
			System.out.println("createFilterInput: " + e.toString());
			e.printStackTrace();
		}

		return filterInput;

	}

	private FlightPathPropertyType getPreparedFlightPath(
			Map<String, String[]> inputData) {
		FlightPathPropertyType flightpath = new FlightPathPropertyType();
		FlightPathType fpType = new FlightPathType();
		DepartureAerodromePropertyType departureAerodrome;
		DestinationAerodromePropertyType destinationAerodrome;

		// Set Departure Aerodrome
		String depDesignator = inputData.get("Id_Abflugflughafen")[0];
		String depId = "";
		String depStartdate = inputData.get("Datum_Anfang_Abflugflughafen")[0];
		String depStarttime = inputData.get("Uhrzeit_Anfang_Abflugflughafen")[0];
		String depEnddate = inputData.get("Datum_Ende_Abflugflughafen")[0];
		String depEndtime = inputData.get("Uhrzeit_Ende_Abflugflughafen")[0];
		String depFlightRule = inputData.get("Flugregel_Abflugflughafen")[0];
		String depWeather = inputData.get("Wetter_Abflugflughafen")[0];

		departureAerodrome = new DepartureAerodromePropertyType();
		departureAerodrome.setDepartureAerodrome(getPreparedAerodrome(
				depDesignator, depId, depStartdate, depStarttime, depEnddate,
				depEndtime, depFlightRule, depWeather));

		// Set Destination Aerodrome
		String destDesignator = inputData.get("Id_Zielflughafen")[0];
		String destId = "";
		String destStartdate = inputData.get("Datum_Anfang_Zielflughafen")[0];
		String destStarttime = inputData.get("Uhrzeit_Anfang_Zielflughafen")[0];
		String destEnddate = inputData.get("Datum_Ende_Zielflughafen")[0];
		String destEndtime = inputData.get("Uhrzeit_Ende_Zielflughafen")[0];
		String destFlightRule = inputData.get("Flugregel_Zielflughafen")[0];
		String destWeather = inputData.get("Wetter_Zielflughafen")[0];

		destinationAerodrome = new DestinationAerodromePropertyType();
		destinationAerodrome.setDestinationAerodrome(getPreparedAerodrome(
				destDesignator, destId, destStartdate, destStarttime,
				destEnddate, destEndtime, destFlightRule, destWeather));

		// Set Area
		// SurfacePropertyType surface = new SurfacePropertyType();
		// surface.setSurface(new JAXBElement<>());
		// fpType.getHasArea().add(new)

		// Set Segment

		JSONArray segments = null;
		List<SegmentPropertyType> segmentPropertyList = new ArrayList<SegmentPropertyType>();
		try {
			segments = new JSONArray(inputData.get("SegmentList")[0]);
			if (segments != null) {
				for (int i = 0; i < segments.length(); i++) {
					System.out.println(segments.getJSONObject(i).toString());
					JSONObject current = segments.getJSONObject(i);

					SegmentType segment = new SegmentType();
					segment.setDesignator(current.getString("id"));
					segment.setStartPoint(getPreparedPoint(current
							.getString("start")));
					segment.setEndPoint(getPreparedPoint(current
							.getString("end")));
					SegmentPropertyType segmentProperty = new SegmentPropertyType();
					segmentProperty.setSegment(segment);
					segmentPropertyList.add(segmentProperty);
				}
			}
		} catch (JSONException e) {
			System.out.println("Fehler beim Parsen der Segment JSON");
			e.printStackTrace();
		}

		// System.out.println(segments.);

		// Set Flight Path
		fpType.setId("RouteID");
		fpType.setRouteName("RoutenName");
		fpType.setHasDepartureAerodrome(departureAerodrome);
		fpType.setHasDestinationAerodrome(destinationAerodrome);

		fpType.getHasSegment().addAll(segmentPropertyList);

		flightpath.setFlightPath(fpType);

		return flightpath;
	}

	private AerodromeType getPreparedAerodrome(String designator, String id,
			String begindate, String begintime, String enddate, String endtime,
			String flightRule, String weather) {
		AerodromeType aerodrome = new AerodromeType();
		CodeFlightRuleType depFlightRule = new CodeFlightRuleType();
		aerodrome.setDesignator(designator);
		aerodrome.setId(id);
		aerodrome.setTime(getPreparedTimePeriod(begindate, begintime, enddate,
				endtime));

		depFlightRule.setValue(flightRule);
		aerodrome.setFlightRule(depFlightRule);
		aerodrome.setWeather(weather);
		return aerodrome;
	}

	private PointPropertyType getPreparedPoint(String coordinates) {
		PointPropertyType pointProperty = new PointPropertyType();
		PointType pt = new PointType();
		DirectPositionType posType = new DirectPositionType();
		BigDecimal c1, c2;
		String[] splitted = coordinates.split(",");
		if (splitted.length > 1) {
			c1 = new BigDecimal(splitted[0]);
			c2 = new BigDecimal(splitted[1].replace(" ", ""));

			posType.getValue().add(c1.doubleValue());
			posType.getValue().add(c2.doubleValue());

			pt.setPos(posType);
			pointProperty.setPoint(new JAXBElement<PointType>(
					new QName("Point"), PointType.class, pt));
		}
		return pointProperty;
	}

	private TimePeriodPropertyType getPreparedTimePeriod(String begindate,
			String begintime, String enddate, String endtime) {
		TimePeriodPropertyType timePeriod = new TimePeriodPropertyType();
		TimePeriodType p = new TimePeriodType();
		XMLGregorianCalendar beginCal = new XMLGregorianCalendarImpl();
		XMLGregorianCalendar endCal = new XMLGregorianCalendarImpl();
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH:mm");

		try {
			c.setTimeInMillis(sdf.parse(begindate + "-" + begintime).getTime());
			beginCal.setYear(c.get(Calendar.YEAR));
			beginCal.setMonth(c.get(Calendar.MONTH) + 1);
			beginCal.setDay(c.get(Calendar.DAY_OF_MONTH));
			beginCal.setHour(c.get(Calendar.HOUR));
			beginCal.setMinute(c.get(Calendar.MINUTE));

			c.setTimeInMillis(sdf.parse(enddate + "-" + endtime).getTime());
			endCal.setYear(c.get(Calendar.YEAR));
			endCal.setMonth(c.get(Calendar.MONTH) + 1);
			endCal.setDay(c.get(Calendar.DAY_OF_MONTH));
			endCal.setHour(c.get(Calendar.HOUR));
			endCal.setMinute(c.get(Calendar.MINUTE));

			p.setBeginPosition(beginCal);
			p.setEndPosition(endCal);

			timePeriod.setTimePeriod(p);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return timePeriod;
	}

	private AircraftPropertyType getPreparedAircraft(
			Map<String, String[]> inputData) {
		AircraftPropertyType aircraft = new AircraftPropertyType();
		AircraftType aircraftType = new AircraftType();

		aircraftType.setDesignator(inputData.get("Id_Flugzeug")[0]);
		aircraftType.setId("ID not set");
		aircraftType.setMaxWeightLb(new BigDecimal(inputData
				.get("Maximalgewicht_Flugzeug")[0]));
		aircraftType.setMinWeightLb(new BigDecimal(inputData
				.get("Minimalgewicht_Flugzeug")[0]));
		aircraftType.setType(AircraftTypeType.fromValue(inputData
				.get("Typ_Flugzeug")[0]));

		aircraft.setAircraft(aircraftType);

		return aircraft;
	}

}