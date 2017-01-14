package com.sample;

import java.io.File;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.frequentis.semnotam.pr.FilterInputType;
import com.frequentis.semnotam.pr.FlightPathPropertyType;
import com.frequentis.semnotam.pr.FlightPathType;
import com.frequentis.semnotam.pr.SegmentPropertyType;
import com.frequentis.semnotam.pr.SegmentType;

import net.opengis.gml.*;
import net.opengis.wfs._2.FeatureCollectionType;
import net.opengis.wfs._2.MemberPropertyType;
import tools.Aircraft;
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
        	
        	
        	//unmarshall InputFile
        	FilterInputType input = JaxbHelper.unmarshalFilterInput(new File("src/main/resources/samples/input_ex1.xml"));
        	
        	//get Aircraft Properties
        	Aircraft aircraft = MapInputFile.getAircraftProperties(input);

        	
        	
        	//get Time Period
        	TimePeriod timePeriod = MapInputFile.getTimePeriod(input);
        	
        	//get Flight Path
        	Flightpath flightpath = MapInputFile.getFlightPath(input);
        	
        	
        	FeatureCollectionType collection = JaxbHelper.unmarshalFeatureCollection(new File("src/main/resources/samples/sample_dnotams.xml"));
        	List<MemberPropertyType> members = collection.getMember();
        	System.out.println(members.get(0).getContent().get(0).toString());
        	
        	
        	
        	
            // go !
            Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            kSession.insert(message);
            kSession.insert(aircraft);
            kSession.insert(timePeriod);
            kSession.insert(flightpath);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static class Message {

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

}