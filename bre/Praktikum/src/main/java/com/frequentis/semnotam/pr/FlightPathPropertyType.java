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


/**
 * <p>Java-Klasse für FlightPathPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlightPathPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightPath" type="{http://semnotam.frequentis.com/pr}FlightPathType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightPathPropertyType", propOrder = {
    "flightPath"
})
public class FlightPathPropertyType {

    @XmlElement(name = "FlightPath", required = true)
    protected FlightPathType flightPath;

    /**
     * Ruft den Wert der flightPath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlightPathType }
     *     
     */
    public FlightPathType getFlightPath() {
        return flightPath;
    }

    /**
     * Legt den Wert der flightPath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPathType }
     *     
     */
    public void setFlightPath(FlightPathType value) {
        this.flightPath = value;
    }

}
