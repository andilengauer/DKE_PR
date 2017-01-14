package com.sample;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

import aero.aixm.message.AIXMBasicMessageType;

import com.frequentis.semnotam.pr.AIXMBasicMessagePropertyType;

import net.opengis.wfs._2.FeatureCollectionType;
import net.opengis.wfs._2.MemberPropertyType;
import net.opengis.wfs._2.SimpleFeatureCollectionType;
import tools.JaxbHelper;

public class DNOTAMReader {
	public static final void main(String[] args) throws JAXBException {
		FeatureCollectionType collection = JaxbHelper.unmarshalFeatureCollection(new File("src/main/resources/samples/sample_dnotams.xml"));
    	List<MemberPropertyType> members = collection.getMember();
    	//List<Object> l1 = members.get(0).getContent();
    	//System.out.println(((AIXMBasicMessageType) l1.get(0)).getId());
    	//MemberPropertyType m1 = members.get(0);
    	//System.out.println("Inhalt:" + m1.getContent().get(1) + "ENDE");
    	//System.out.println(((JAXBElement<FeatureCollectionType>) m1.getContent().get(1)).getName());
    	
    	AIXMBasicMessageType m2 = JaxbHelper.unmarshalAixmBasicMessage(new File("src/main/resources/samples/test.xml"));
    	
    	System.out.println(m2.getHasMember().get(0).getTitleAttribute());
		
	}
	

}
