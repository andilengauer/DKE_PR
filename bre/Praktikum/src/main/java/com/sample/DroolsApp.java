package com.sample;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.frequentis.semnotam.pr.*;
import com.frequentis.semnotam.pr.ResultType;
import com.google.protobuf.Extension.MessageType;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import aero.aixm.AirportHeliportType;
import aero.aixm.TextDesignatorType;
import aero.aixm.event.EventTimeSlicePropertyType;
import aero.aixm.event.EventType;
import aero.aixm.event.TextNOTAMType;
import aero.aixm.message.AIXMBasicMessageType;
import aero.aixm.message.BasicMessageMemberAIXMPropertyType;
import dataobjects.AixmMessage;
import dataobjects.Member;
import dataobjects.ValidTime;
import net.opengis.gml.*;
import net.opengis.wfs._2.FeatureCollectionType;
import net.opengis.wfs._2.MemberPropertyType;
import net.opengis.wfs._2.OutputFormatListType;
import tools.Aircraft;
import tools.DB_Controller;
import tools.DNOTAMReader;
import tools.Flightpath;
import tools.JaxbHelper;
import tools.MapInputFile;
import tools.Segment;
import tools.TimePeriod;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsApp {
	private static List<AIXMBasicMessageType> dnotams;
    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	
        	DB_Controller db = new DB_Controller();
        	db.initDB();
        	
        	 String dbOutputCollection = "db/DKE_PR/FilterOutput";
        	 String dbInputCollection = "db/DKE_PR/FilterInput";
        	 
        	
        	 
        	 //File InputFile = new File("src/main/resources/samples/input_ex2.xml");
        	 
        	 String result = db.getData(dbInputCollection, "fi1.xml");
        	 String dbDnotams = db.getData("db/DKE_PR","dnotams.xml" );
        	 
        	 File inputFile = new File("input.xml");
        	 FileWriter writer = new FileWriter(inputFile);
        	 writer.write(result);
        	 writer.close();
        	 
        	 File dnotamFile = new File("dnotams.xml");
        	 writer = new FileWriter(dnotamFile);
        	 writer.write(dbDnotams);
        	 writer.close();
        	 
        	//unmarshall InputFile
        	FilterInputType filterInput = JaxbHelper.unmarshalFilterInput(inputFile);
        	
        	//get Aircraft Properties
        	Aircraft aircraft = MapInputFile.getAircraftProperties(filterInput);

        	
        	
        	//get Time Period
        	TimePeriod timePeriod = MapInputFile.getTimePeriod(filterInput);
        	
        	//get Flight Path
        	Flightpath flightpath = MapInputFile.getFlightPath(filterInput);
        	
        	System.out.println("Flightpath" + flightpath.getDepatureAerodrome());
        	
        	//List<MemberPropertyType> members = collection.getMember();
        	

    		FeatureCollectionType collection = JaxbHelper.unmarshalFeatureCollection(dnotamFile);
    		
    		List<AIXMBasicMessageType> messages = JaxbHelper.getMessages(collection);
        	dnotams = messages;
        	ArrayList<AixmMessage> aixmMessages = (ArrayList<AixmMessage>) DNOTAMReader.getAixmMessages(messages);
    		
        	for(AixmMessage m : aixmMessages){
        		System.out.println(m.getMessageId() + " /// " + m.getBegintime() + " /// " + m.getScenario());
        		kSession.insert(m);
        		
        		
        	}
        	

        	kSession.setGlobal("aircraft", aircraft);
        	kSession.setGlobal("timeperiod", timePeriod);
        	kSession.setGlobal("flightpath", flightpath);
        	
           // kSession.insert(aircraft);
           // kSession.insert(timePeriod);
           // kSession.insert(flightpath);
            //kSession.insert(message);
            kSession.fireAllRules();
            
            List<AIXMBasicMessageType> relevantDnotams = new ArrayList<>();
           
            
            
            //generate filteroutput type---
            
            FilterOutputType filterOutput;
            
            filterOutput = generateFilterOutput(filterInput,messages,aixmMessages);
            
       
       File outputFile = new File("fo1.xml");
       
       JaxbHelper.marshalFilterOutput(filterOutput, outputFile);
       
       db.putFile(dbOutputCollection, outputFile);
       
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

	private static FilterOutputType generateFilterOutput(FilterInputType filterInput,
			List<AIXMBasicMessageType> basicMessages,
			ArrayList<AixmMessage> myMessages) {
		
		FilterOutputType filterOutput = new FilterOutputType();
		FilterInputPropertyType inputProperty = new FilterInputPropertyType();
		inputProperty.setFilterInput(filterInput);
		filterOutput.setHasInput(inputProperty);
		filterOutput.setId("fo1");
		ResultSetPropertyType resultSetPropertyType = new ResultSetPropertyType();
		ResultSetType resultSetType = new ResultSetType();
		
		
		for(AixmMessage message: myMessages)
		{
			if(message.isRelevant())
			{
				ResultPropertyType result = new ResultPropertyType();
				ResultType resultType = new ResultType();
				
				
				resultType.setDnotam(getAixmMessageForId(message.getMessageId()));
				if(message.getImportance() != null && message.getImportance() != "")
				{
					ImportanceClassificationPropertyType importanceClassificationProperty = new ImportanceClassificationPropertyType();
					ImportanceClassificationType importanceType = new ImportanceClassificationType();
					importanceType.setValue(message.getImportance());
					importanceClassificationProperty.setImportanceClassification(importanceType);
					resultType.getHasImportanceClassification().add(importanceClassificationProperty);
				}
				if(message.getScenario() != null && message.getScenario() != "")
				{
					EventScenarioClassificationPropertyType scenarioProperty = new EventScenarioClassificationPropertyType();
					EventScenarioClassificationType scenarioType = new EventScenarioClassificationType();
					scenarioType.setValue(message.getScenario());
					scenarioProperty.setEventScenarioClassification(scenarioType);
					resultType.getHasEventScenarioClassification().add(scenarioProperty);
				}
				if(message.getLocation() != null && message.getLocation() != "")
				{
					LocationClassificationPropertyType locationProperty = new LocationClassificationPropertyType();
					LocationClassificationType locationType = new LocationClassificationType();
					locationType.setValue(message.getLocation());
					locationProperty.setLocationClassification(locationType);
					resultType.getHasLocationClassification().add(locationProperty);
				}
				result.setResult(resultType);
				resultSetType.getHasResult().add(result);
			}
		}
		
		resultSetPropertyType.setResultSet(resultSetType);
		filterOutput.setHasResultSet(resultSetPropertyType);
		
		return filterOutput;
	}

	private static AIXMBasicMessagePropertyType getAixmMessageForId(
			String messageId) {
		if(dnotams != null)
		{
			for(AIXMBasicMessageType m :dnotams)
			{
				if(m.getId().equalsIgnoreCase(messageId))
				{
					AIXMBasicMessagePropertyType returnVal = new AIXMBasicMessagePropertyType();
					returnVal.setAIXMBasicMessage(m);
					return returnVal;
				}
			}
		}
		return null;
	}

}
