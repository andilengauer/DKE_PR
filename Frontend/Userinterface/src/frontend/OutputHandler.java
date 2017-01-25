package frontend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.gml.AbstractTimePrimitiveType;
import net.opengis.gml.PointPropertyType;
import net.opengis.gml.TimeInstantType;
import net.opengis.gml.TimePeriodType;
import aero.aixm.AbstractAIXMFeatureType;
import aero.aixm.event.EventTimeSliceType;
import aero.aixm.event.EventType;
import aero.aixm.message.AIXMBasicMessageType;
import aero.aixm.message.BasicMessageMemberAIXMPropertyType;

import com.frequentis.semnotam.pr.AircraftType;
import com.frequentis.semnotam.pr.EventScenarioClassificationPropertyType;
import com.frequentis.semnotam.pr.FilterInputType;
import com.frequentis.semnotam.pr.FilterOutputType;
import com.frequentis.semnotam.pr.ImportanceClassificationPropertyType;
import com.frequentis.semnotam.pr.LocationClassificationPropertyType;
import com.frequentis.semnotam.pr.ResultPropertyType;
import com.frequentis.semnotam.pr.SegmentPropertyType;

import frontend.preparedobjects.Aircraft;
import frontend.preparedobjects.PreparedInput;
import frontend.preparedobjects.PreparedMessage;
import frontend.preparedobjects.PreparedNotam;
import frontend.preparedobjects.PreparedOutput;
import frontend.preparedobjects.PreparedResult;
import frontend.preparedobjects.PreparedSegment;

public class OutputHandler {
	
	public static PreparedOutput getPreparedOutput(FilterOutputType filteroutput)
	{
		PreparedOutput prepOutput = new PreparedOutput();
		
		try{
		
		PreparedInput prepInput = getPreparedInput(filteroutput.getHasInput().getFilterInput());
		prepOutput.setInput(prepInput);
		
		prepOutput.setResults(getPreparedResults(filteroutput.getHasResultSet().getResultSet().getHasResult()));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return prepOutput;
	}

	private static List<PreparedResult> getPreparedResults(
			List<ResultPropertyType> hasResult) {
		
		List<PreparedResult> results = new ArrayList<PreparedResult>();
		
		for(ResultPropertyType rpt : hasResult)
		{
			AIXMBasicMessageType basicmessage = rpt.getResult().getDnotam().getAIXMBasicMessage();
			PreparedResult result = new PreparedResult();
			PreparedMessage message = new PreparedMessage();
			message.setId(basicmessage.getId());
			List<PreparedNotam> notams = new ArrayList<PreparedNotam>();
			
			List<EventScenarioClassificationPropertyType> scenarios = rpt.getResult().getHasEventScenarioClassification();
			List<LocationClassificationPropertyType> locations = rpt.getResult().getHasLocationClassification();
			List<ImportanceClassificationPropertyType> importances = rpt.getResult().getHasImportanceClassification();
			
			if(scenarios.size() > 0)
				result.setEventscenario(scenarios.get(0).getEventScenarioClassification().getValue());
			if(locations.size() >0)
				result.setLocation(locations.get(0).getLocationClassification().getValue());
			if(importances.size()> 0)
				result.setImportance(importances.get(0).getImportanceClassification().getValue());
			
			for(BasicMessageMemberAIXMPropertyType basicmember: basicmessage.getHasMember())
			{
				AbstractAIXMFeatureType feature = basicmember.getAbstractAIXMFeature().getValue();
				
				if(feature instanceof EventType)
				{
					PreparedNotam notam = new PreparedNotam();
					EventType e = (EventType)feature;
					EventTimeSliceType eventTimeSlice = e.getTimeSlice().get(0).getEventTimeSlice();
					System.out.println(eventTimeSlice.getInterpretation());
					if(eventTimeSlice.getInterpretation().compareToIgnoreCase("BASELINE") == 0)
					{
						
						AbstractTimePrimitiveType abstractTime = eventTimeSlice.getValidTime().getAbstractTimePrimitive().getValue();
						if(abstractTime instanceof TimeInstantType)
						{
							TimeInstantType timeInstant = (TimeInstantType) abstractTime;
							System.out.println("TimeInstant:" + timeInstant.getTimePosition().getValue());
						}
						else if(abstractTime instanceof TimePeriodType)
						{
							TimePeriodType timePeriod = (TimePeriodType) abstractTime;
							System.out.println("TimePeriod begin:" + timePeriod.getBeginPosition().getValue().get(0));
							System.out.println("TimePeriod end:" + timePeriod.getEndPosition().getValue().get(0));
							
							notam.setBegin(timePeriod.getBeginPosition().getValue().get(0));
							notam.setEnd(timePeriod.getEndPosition().getValue().get(0));
							
							
						}
						
						notam.setText(eventTimeSlice.getTextNOTAM().get(0).getNOTAM().getText().getValue().getValue());
						notams.add(notam);
					}
					
					
				}
			}
			message.setNotams(notams);
			result.setMessage(message);
			results.add(result);
		}
		
		return results;
	}

	private static PreparedInput getPreparedInput(FilterInputType filterInput) {
			PreparedInput input = new PreparedInput();
			
			try{
			input.setAircraft(getPreparedAircraft(filterInput.getHasAircraft().getAircraft()));
			Date begin = getDateFromXmlCalendar(filterInput.getHasTimePeriod().getTimePeriod().getBeginPosition());
			Date end = getDateFromXmlCalendar(filterInput.getHasTimePeriod().getTimePeriod().getBeginPosition());
			input.setBegindate(begin);
			input.setEnddate(end);
			
			input.setRoutename(filterInput.getHasFlightPath().getFlightPath().getRouteName());
			input.setDeparture(filterInput.getHasFlightPath().getFlightPath().getHasDepartureAerodrome().getDepartureAerodrome().getDesignator());
			input.setDestination(filterInput.getHasFlightPath().getFlightPath().getHasDestinationAerodrome().getDestinationAerodrome().getDesignator());
			
			input.setSegments(getPreparedSegments(filterInput.getHasFlightPath().getFlightPath().getHasSegment()));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return input;
	}

	private static List<PreparedSegment> getPreparedSegments(
			List<SegmentPropertyType> hasSegment) {
		
		List<PreparedSegment> segments = new ArrayList<PreparedSegment>();
		
		for(SegmentPropertyType segment : hasSegment)
		{
			PreparedSegment newSeg = new PreparedSegment();
			String designator = "";
			String startPoint = "";
			String endPoint = "";
			
			try{
			designator = segment.getSegment().getDesignator();
			PointPropertyType startProperty = segment.getSegment().getStartPoint();
			PointPropertyType endProperty = segment.getSegment().getEndPoint();
			
			if(startProperty.getHref() != null)
			{
				System.out.println(startProperty.getHref());
				startPoint = startProperty.getHref();
			}
			else
			{
				startPoint = startProperty.getPoint().getValue().getPos().getValue().get(0).toString();
				startPoint += " " + startProperty.getPoint().getValue().getPos().getValue().get(1);
			}
			endPoint = endProperty.getPoint().getValue().getPos().getValue().get(0).toString();
			endPoint += " " + endProperty.getPoint().getValue().getPos().getValue().get(1).toString();
			
			System.out.println("startpoint: " + startPoint + " endpoint:" + endPoint);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			newSeg.setDesignator(designator);
			newSeg.setStartPoint(startPoint);
			newSeg.setEndPoint(endPoint);
			
			segments.add(newSeg);
			
		}
		return null;
	}

	private static Date getDateFromXmlCalendar(
			XMLGregorianCalendar cal) {
		
		Date date = new Date(cal.getMillisecond());
		
;
		return date;
	}

	private static Aircraft getPreparedAircraft(AircraftType aircraftType) {
		Aircraft aircraft = new Aircraft();
		
		String designator = "";
		String type = "";
		double wingspan, minweight,maxweight;
		
		designator = aircraftType.getDesignator();
		type = aircraftType.getType().value();
		wingspan = aircraftType.getWingspanFt().doubleValue();
		minweight = aircraftType.getMinWeightLb().doubleValue();
		maxweight = aircraftType.getMaxWeightLb().doubleValue();
		
		aircraft.setDesignator(designator);
		aircraft.setType(type);
		aircraft.setWingspan(wingspan);
		aircraft.setMinWeight(minweight);
		aircraft.setMaxWeight(maxweight);
		
		
		
		return null;
	}

}
