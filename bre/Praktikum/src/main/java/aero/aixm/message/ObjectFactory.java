//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package aero.aixm.message;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aero.aixm.message package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AIXMBasicMessage_QNAME = new QName("http://www.aixm.aero/schema/5.1/message", "AIXMBasicMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aero.aixm.message
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AIXMBasicMessageType }
     * 
     */
    public AIXMBasicMessageType createAIXMBasicMessageType() {
        return new AIXMBasicMessageType();
    }

    /**
     * Create an instance of {@link BasicMessageMemberAIXMPropertyType }
     * 
     */
    public BasicMessageMemberAIXMPropertyType createBasicMessageMemberAIXMPropertyType() {
        return new BasicMessageMemberAIXMPropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AIXMBasicMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/message", name = "AIXMBasicMessage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<AIXMBasicMessageType> createAIXMBasicMessage(AIXMBasicMessageType value) {
        return new JAXBElement<AIXMBasicMessageType>(_AIXMBasicMessage_QNAME, AIXMBasicMessageType.class, null, value);
    }

}