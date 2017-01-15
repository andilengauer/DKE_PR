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
 * <p>Java-Klasse für EventScenarioClassificationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EventScenarioClassificationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventScenarioClassification" type="{http://semnotam.frequentis.com/pr}EventScenarioClassificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventScenarioClassificationPropertyType", propOrder = {
    "eventScenarioClassification"
})
public class EventScenarioClassificationPropertyType {

    @XmlElement(name = "EventScenarioClassification", required = true)
    protected EventScenarioClassificationType eventScenarioClassification;

    /**
     * Ruft den Wert der eventScenarioClassification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EventScenarioClassificationType }
     *     
     */
    public EventScenarioClassificationType getEventScenarioClassification() {
        return eventScenarioClassification;
    }

    /**
     * Legt den Wert der eventScenarioClassification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EventScenarioClassificationType }
     *     
     */
    public void setEventScenarioClassification(EventScenarioClassificationType value) {
        this.eventScenarioClassification = value;
    }

}
