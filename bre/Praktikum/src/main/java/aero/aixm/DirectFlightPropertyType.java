//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package aero.aixm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r DirectFlightPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DirectFlightPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractDirectFlight"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectFlightPropertyType", propOrder = {
    "abstractDirectFlight"
})
public class DirectFlightPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElementRef(name = "AbstractDirectFlight", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractDirectFlightType> abstractDirectFlight;

    /**
     * Ruft den Wert der abstractDirectFlight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractDirectFlightType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectFlightSegmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectFlightClassType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractDirectFlightType> getAbstractDirectFlight() {
        return abstractDirectFlight;
    }

    /**
     * Legt den Wert der abstractDirectFlight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractDirectFlightType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectFlightSegmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectFlightClassType }{@code >}
     *     
     */
    public void setAbstractDirectFlight(JAXBElement<? extends AbstractDirectFlightType> value) {
        this.abstractDirectFlight = value;
    }

}
