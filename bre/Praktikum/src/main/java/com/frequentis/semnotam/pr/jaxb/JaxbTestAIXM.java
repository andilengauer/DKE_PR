package com.frequentis.semnotam.pr.jaxb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import aero.aixm.message.AIXMBasicMessageType;
import net.opengis.wfs._2.FeatureCollectionType;
import net.opengis.wfs._2.MemberPropertyType;

/**
 * Test class for showing some examples of using JAXB to marshal and unmarshal
 * Java objects and XML files. Unmarshal: Load XML files into Java objects
 * Marshal: Serialize Java objects into XML files
 * 
 * @author steiner
 *
 */
public class JaxbTestAIXM {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		// Test unmarhsalling of simple feature collection with access to AIXMBasicMessage elements
		File input = new File("src/main/resources/samples/sample_dnotams_incl_schedule.xml");
		FeatureCollectionType collection = unmarshalFeatureCollection(input);

		List<AIXMBasicMessageType> messages = getMessages(collection);
		
		// Print the ID of all DNOTAMs contained in the FeatureCollection
		for (AIXMBasicMessageType m : messages) {
			System.out.println(m.getId());
		}

	}
	
	private static List<AIXMBasicMessageType> getMessages(FeatureCollectionType collection) {
		List<AIXMBasicMessageType> list = new ArrayList<AIXMBasicMessageType>();
		
		// For each MemberPropertyTyp ~ <wfs:member> Element
		for (MemberPropertyType member : collection.getMember()) {
			// Get the element at list index 1 = AIXMBasicMessage
			// Due to the structure of the sample DNOTAM files the content list
			// has always 3 entries:
			//  1. entry = whitespace/returns before AIXMBasicMessage element
			//  2. entry = AIXMBasicMessage Element
			//  3. entry = whitespace/returns after AIXMBasicMessage element
			AIXMBasicMessageType message = (AIXMBasicMessageType) JAXBIntrospector.getValue(member.getContent().get(1));
			list.add(message);
		}
		return list;
	}

	private static JAXBContext getCombinedContext() throws JAXBException {
		return JAXBContext.newInstance(aero.aixm.ObjectFactory.class, net.opengis.wfs._2.ObjectFactory.class);
	}

	/**
	 * Get jaxb context for marshalling/unmarshalling AIXM elements.
	 * 
	 * @return JAXBContext used for handling AIXMBasicMessage
	 * @throws JAXBException
	 */
	private static JAXBContext getAixmContext() throws JAXBException {
		return JAXBContext.newInstance(aero.aixm.ObjectFactory.class);
	}

	/**
	 * Get jaxb context for marshalling/unmarshalling wfs feature collection.
	 * 
	 * @return JAXBContext used for FeatureCollection
	 * @throws JAXBException
	 */
	private static JAXBContext getWfsContext() throws JAXBException {
		return JAXBContext.newInstance(net.opengis.wfs._2.ObjectFactory.class);
	}

	/**
	 * Get jaxb context for marshalling/unmarshalling FilterInput and
	 * FilterOutput elements.
	 * 
	 * @return JAXBContext used for FilterInput and FilterOutput
	 * @throws JAXBException
	 */
	private static JAXBContext getPrContext() throws JAXBException {
		return JAXBContext.newInstance(com.frequentis.semnotam.pr.ObjectFactory.class);
	}

	/**
	 * Unmarshal the specified file into a FeatureCollectionType object.
	 * 
	 * @param input
	 * @return
	 * @throws JAXBException
	 */
	private static FeatureCollectionType unmarshalFeatureCollection(File input) throws JAXBException {
		Unmarshaller wfsUnmarshaller = getCombinedContext().createUnmarshaller();

		FeatureCollectionType collection = (FeatureCollectionType) JAXBIntrospector
				.getValue(wfsUnmarshaller.unmarshal(input));

		return collection;
	}

	/**
	 * Marshal the specified FeatureCollectionType object as FeatureCollection
	 * into the specified file.
	 * 
	 * @param collection
	 * @param outputFile
	 * @throws JAXBException
	 */
	private static void marshalFeatureCollection(FeatureCollectionType collection, File outputFile)
			throws JAXBException {
		Marshaller wfsMarshaller = getWfsContext().createMarshaller();

		wfsMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); // NOI18N
		wfsMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		wfsMarshaller.marshal(
				new JAXBElement<FeatureCollectionType>(new QName("http://www.opengis.net/wfs/2.0", "FeatureCollection"),
						FeatureCollectionType.class, collection),
				outputFile);
	}
	
}

