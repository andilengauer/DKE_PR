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
 * <p>Java-Klasse für AlternateAerodromePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AlternateAerodromePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternateAerodrome" type="{http://semnotam.frequentis.com/pr}AerodromeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateAerodromePropertyType", propOrder = {
    "alternateAerodrome"
})
public class AlternateAerodromePropertyType {

    @XmlElement(name = "AlternateAerodrome", required = true)
    protected AerodromeType alternateAerodrome;

    /**
     * Ruft den Wert der alternateAerodrome-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeType }
     *     
     */
    public AerodromeType getAlternateAerodrome() {
        return alternateAerodrome;
    }

    /**
     * Legt den Wert der alternateAerodrome-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeType }
     *     
     */
    public void setAlternateAerodrome(AerodromeType value) {
        this.alternateAerodrome = value;
    }

}
