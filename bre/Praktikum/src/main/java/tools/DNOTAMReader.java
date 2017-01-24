package tools;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBException;

import net.opengis.gml.AbstractTimePrimitiveType;
import net.opengis.gml.TimeInstantType;
import net.opengis.gml.TimePeriodType;
import net.opengis.gml.TimePositionType;
import net.opengis.wfs._2.FeatureCollectionType;
import aero.aixm.TextDesignatorType;
import aero.aixm.event.EventTimeSlicePropertyType;
import aero.aixm.event.EventType;
import aero.aixm.event.TextNOTAMType;
import aero.aixm.message.AIXMBasicMessageType;
import aero.aixm.message.BasicMessageMemberAIXMPropertyType;
import dataobjects.AixmMessage;
import dataobjects.Member;
import dataobjects.ValidTime;

public class DNOTAMReader {
	
	
	/*public static void main(String[] args) {
		try{
			
			
			List<AixmMessage> messages = getAixmMessages();
			
			System.out.println("--------------");
			for(AixmMessage m: messages)
			{
				System.out.println(m.getMessageId());
				for(Member member: m.getMembers())
				{
					System.out.println(member.getMemberId());
				}
			}
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	*/
	public static List<AixmMessage> getAixmMessages(List<AIXMBasicMessageType> messages) {
		
		
    	List<AixmMessage> aixmMessages = new ArrayList<>();
    	
    	
		// Print the ID of all DNOTAMs contained in the FeatureCollection
		for (AIXMBasicMessageType m : messages) 
		{
			AixmMessage mess = new AixmMessage();
			mess.setMessageId(m.getId());
			
			List<Member> members = new ArrayList<>();
			
			for(BasicMessageMemberAIXMPropertyType member : m.getHasMember()){
		
				Member mem= new Member();
				
		
				if(member.getAbstractAIXMFeature().getValue() instanceof EventType) //Überprüfung von welchen Typ das Feature ist
				{
					EventType eventType = (EventType)member.getAbstractAIXMFeature().getValue() ;
					
					LinkedList<ValidTime> validTimes = new LinkedList<>();
					
					List<EventTimeSlicePropertyType> listTimeslices = eventType.getTimeSlice();
					 
					mem.setMemberId(eventType.getId());
					mem.setMemberType("EventType");
					
					AbstractTimePrimitiveType dummy = listTimeslices.get(0).getEventTimeSlice().getValidTime().getAbstractTimePrimitive().getValue();
					
					TextDesignatorType scenario=listTimeslices.get(0).getEventTimeSlice().getScenario().getValue();
					String test = scenario.getValue();
					
					mem.setScenarioType(test);
					
					TextNOTAMType loc = listTimeslices.get(0).getEventTimeSlice().getTextNOTAM().get(0).getNOTAM().getLocation().getValue();
					String location = loc.getValue();
					
					mem.setEventLocation(location);
						
							
				//	System.out.println(location);
					
					
					
					if(dummy instanceof TimeInstantType){
						TimeInstantType x =(TimeInstantType) dummy;
						x.getTimePosition().getValue();
						
						
					}
					
					if(dummy instanceof TimePeriodType){
						TimePositionType begin = ((TimePeriodType) dummy).getBeginPosition();
						TimePositionType end = ((TimePeriodType) dummy).getEndPosition();
						
						List<String>endPos = end.getValue();
						List<String> beginPos = begin.getValue();
						
						 SimpleDateFormat sdfToDate = new SimpleDateFormat(
				                    "yyyy-MM-dd'T'HH:mm:ss'Z'");
						 
						 Date beginDate = null;
						 Date endDate = null;
						try {
							beginDate = sdfToDate.parse(beginPos.get(0));
							 endDate = sdfToDate.parse(endPos.get(0));
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						 ValidTime validTime = new ValidTime();
						 validTime.setBegin(beginDate);
						 validTime.setEnd(endDate);
						 
						 validTimes.add(validTime);
						 
						 
						/*TODO String in Date umwandeln
						 * 2014-11-22T22:00:00Z
						 * yyyy-MM-dd'T'HH:mm:ss.SSSZ
						 */
						
						System.out.println(beginDate);
						mem.setValidTimeList(validTimes);
						
					}
					
					members.add(mem);
				
				}
			
		}
			
		
		mess.setMembers(members);
		aixmMessages.add(mess);	
	}
		return aixmMessages;
		
	}

}
