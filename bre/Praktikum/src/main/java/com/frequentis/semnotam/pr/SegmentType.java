//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package com.frequentis.semnotam.pr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.PointPropertyType;


/**
 * <p>Java-Klasse für SegmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/pr}FlightPathComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startPoint" type="{http://www.opengis.net/gml/3.2}PointPropertyType"/&gt;
 *         &lt;element name="endPoint" type="{http://www.opengis.net/gml/3.2}PointPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentType", propOrder = {
    "startPoint",
    "endPoint"
})
public class SegmentType
    extends FlightPathComponentType
{

    @XmlElement(required = true)
    protected PointPropertyType startPoint;
    @XmlElement(required = true)
    protected PointPropertyType endPoint;

    /**
     * Ruft den Wert der startPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getStartPoint() {
        return startPoint;
    }

    /**
     * Legt den Wert der startPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setStartPoint(PointPropertyType value) {
        this.startPoint = value;
    }

    /**
     * Ruft den Wert der endPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getEndPoint() {
        return endPoint;
    }

    /**
     * Legt den Wert der endPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setEndPoint(PointPropertyType value) {
        this.endPoint = value;
    }

}
