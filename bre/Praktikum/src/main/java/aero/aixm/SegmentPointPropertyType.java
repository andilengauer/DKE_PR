//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package aero.aixm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SegmentPointPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SegmentPointPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSegmentPoint"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentPointPropertyType", propOrder = {
    "abstractSegmentPoint"
})
public class SegmentPointPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElementRef(name = "AbstractSegmentPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractSegmentPointType> abstractSegmentPoint;

    /**
     * Ruft den Wert der abstractSegmentPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPointType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractSegmentPointType> getAbstractSegmentPoint() {
        return abstractSegmentPoint;
    }

    /**
     * Legt den Wert der abstractSegmentPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPointType }{@code >}
     *     
     */
    public void setAbstractSegmentPoint(JAXBElement<? extends AbstractSegmentPointType> value) {
        this.abstractSegmentPoint = value;
    }

}
