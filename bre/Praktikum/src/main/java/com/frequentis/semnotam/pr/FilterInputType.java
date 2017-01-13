//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package com.frequentis.semnotam.pr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für FilterInputType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FilterInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasAircraft" type="{http://semnotam.frequentis.com/pr}AircraftPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="hasTimePeriod" type="{http://semnotam.frequentis.com/pr}TimePeriodPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="hasFlightPath" type="{http://semnotam.frequentis.com/pr}FlightPathPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterInputType", propOrder = {
    "hasAircraft",
    "hasTimePeriod",
    "hasFlightPath"
})
public class FilterInputType {

    protected AircraftPropertyType hasAircraft;
    protected TimePeriodPropertyType hasTimePeriod;
    @XmlElement(required = true)
    protected FlightPathPropertyType hasFlightPath;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;

    /**
     * Ruft den Wert der hasAircraft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AircraftPropertyType }
     *     
     */
    public AircraftPropertyType getHasAircraft() {
        return hasAircraft;
    }

    /**
     * Legt den Wert der hasAircraft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftPropertyType }
     *     
     */
    public void setHasAircraft(AircraftPropertyType value) {
        this.hasAircraft = value;
    }

    /**
     * Ruft den Wert der hasTimePeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getHasTimePeriod() {
        return hasTimePeriod;
    }

    /**
     * Legt den Wert der hasTimePeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setHasTimePeriod(TimePeriodPropertyType value) {
        this.hasTimePeriod = value;
    }

    /**
     * Ruft den Wert der hasFlightPath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlightPathPropertyType }
     *     
     */
    public FlightPathPropertyType getHasFlightPath() {
        return hasFlightPath;
    }

    /**
     * Legt den Wert der hasFlightPath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPathPropertyType }
     *     
     */
    public void setHasFlightPath(FlightPathPropertyType value) {
        this.hasFlightPath = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
