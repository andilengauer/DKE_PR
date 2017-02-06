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
public class DroolsTest {

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
        	 
        	
        	 
        	 File InputFile = new File("src/main/resources/samples/input_ex1.xml");
        	 
        	 //String result = db.getData(dbInputCollection, "input_ex1.xml");
        	 
        	 //File inputFile = new File("input.xml");
        	 //FileWriter writer = new FileWriter(inputFile);
        	 
        	 //writer.write(result);
        	 
        	 //writer.close();
        	 
        	//unmarshall InputFile
        	FilterInputType input = JaxbHelper.unmarshalFilterInput(InputFile);
        	
        	//get Aircraft Properties
        	Aircraft aircraft = MapInputFile.getAircraftProperties(input);

        	
        	
        	//get Time Period
        	TimePeriod timePeriod = MapInputFile.getTimePeriod(input);
        	
        	//get Flight Path
        	Flightpath flightpath = MapInputFile.getFlightPath(input);
        	
        	System.out.println("Flightpath" + flightpath.getDepatureAerodrome());
        	
        	//List<MemberPropertyType> members = collection.getMember();
        	

    		FeatureCollectionType collection = JaxbHelper.unmarshalFeatureCollection(new File("src/main/resources/samples/sample_dnotams.xml"));
    		
    		List<AIXMBasicMessageType> messages = JaxbHelper.getMessages(collection);
        	
        	ArrayList<AixmMessage> aixmMessages = (ArrayList<AixmMessage>) DNOTAMReader.getAixmMessages(messages);
    		
        	for(AixmMessage m : aixmMessages){
        		System.out.println(m.getMessageId() + " /// " + m.getBegintime() + " /// " + m.getScenario());
        		kSession.insert(m);
        		
        		
        	}
        	
        	//System.out.println(members.get(0).getContent().get(0).toString());
        	
        	
        	
        	
            // go !
            //Message message = new Message();
            //message.setMessage("Hello World");
            //message.setStatus(Message.HELLO);
        	
        	timePeriod.setBeginPosition(new Date());
        	timePeriod.setEndPosition(new Date());
        	kSession.setGlobal("aircraft", aircraft);
        	kSession.setGlobal("timeperiod", timePeriod);
        	kSession.setGlobal("flightpath", flightpath);
        	
           // kSession.insert(aircraft);
           // kSession.insert(timePeriod);
           // kSession.insert(flightpath);
            //kSession.insert(message);
            kSession.fireAllRules();
            
            List<AIXMBasicMessageType> relevantDnotams = new ArrayList<>();
            
            for(AixmMessage fMess : aixmMessages){
            	if(fMess.isRelevant()){
            		
            		
            		for(AIXMBasicMessageType relevant : messages){
            			
            			if(relevant.getId().equals(fMess.getMessageId())){
            				relevantDnotams.add(relevant);
            				continue;
            			}
            			
            		}
            		
            		System.out.println("relevantMessage" + fMess.getMessageId());
            		
            	}
            }
            
            
            
           FilterOutputType output = new FilterOutputType();
          
          
           FilterInputPropertyType inputPropT= new FilterInputPropertyType();
           inputPropT.setFilterInput(input);
           
           output.setHasInput(inputPropT);
           
           
           
           List<AIXMBasicMessagePropertyType> propTypes = new ArrayList<>();
           
           
           for(AIXMBasicMessageType x : relevantDnotams){
        	   AIXMBasicMessagePropertyType prop = new AIXMBasicMessagePropertyType();
        	   prop.setAIXMBasicMessage(x);
        	   propTypes.add(prop);
           }
           
           
           List<ResultType> resTypes = new ArrayList<>();
           
           for (AIXMBasicMessagePropertyType y : propTypes){
        	   ResultType re= new ResultType();
        	   re.setDnotam(y);
        	   resTypes.add(re);
           }
           
           
         List<ResultPropertyType> resPropTypes = new ArrayList<>();
         
          for(ResultType rType : resTypes){
        	  ResultPropertyType re = new ResultPropertyType();
        	  re.setResult(rType);
        	  resPropTypes.add(re);
          }
          
          
          
        ResultSetPropertyType rsp = new ResultSetPropertyType();
       ResultSetType rpt = new ResultSetType();
       
       rpt.getHasResult().addAll(resPropTypes);
       
       rsp.setResultSet(rpt);
       
       output.setHasResultSet(rsp);
       
       File outputFile = new File("fo1.xml");
       
       JaxbHelper.marshalFilterOutput(output, outputFile);
       
       db.putFile(dbOutputCollection, outputFile);
       
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

   /* public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }
*/
}
