//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package com.frequentis.semnotam.pr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ResultType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dnotam" type="{http://semnotam.frequentis.com/pr}AIXMBasicMessagePropertyType"/&gt;
 *         &lt;element name="hasLocationClassification" type="{http://semnotam.frequentis.com/pr}LocationClassificationPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hasImportanceClassification" type="{http://semnotam.frequentis.com/pr}ImportanceClassificationPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hasEventScenarioClassification" type="{http://semnotam.frequentis.com/pr}EventScenarioClassificationPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultType", propOrder = {
    "dnotam",
    "hasLocationClassification",
    "hasImportanceClassification",
    "hasEventScenarioClassification"
})
public class ResultType {

    @XmlElement(required = true)
    protected AIXMBasicMessagePropertyType dnotam;
    protected List<LocationClassificationPropertyType> hasLocationClassification;
    protected List<ImportanceClassificationPropertyType> hasImportanceClassification;
    protected List<EventScenarioClassificationPropertyType> hasEventScenarioClassification;

    /**
     * Ruft den Wert der dnotam-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AIXMBasicMessagePropertyType }
     *     
     */
    public AIXMBasicMessagePropertyType getDnotam() {
        return dnotam;
    }

    /**
     * Legt den Wert der dnotam-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AIXMBasicMessagePropertyType }
     *     
     */
    public void setDnotam(AIXMBasicMessagePropertyType value) {
        this.dnotam = value;
    }

    /**
     * Gets the value of the hasLocationClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasLocationClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasLocationClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationClassificationPropertyType }
     * 
     * 
     */
    public List<LocationClassificationPropertyType> getHasLocationClassification() {
        if (hasLocationClassification == null) {
            hasLocationClassification = new ArrayList<LocationClassificationPropertyType>();
        }
        return this.hasLocationClassification;
    }

    /**
     * Gets the value of the hasImportanceClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasImportanceClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasImportanceClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportanceClassificationPropertyType }
     * 
     * 
     */
    public List<ImportanceClassificationPropertyType> getHasImportanceClassification() {
        if (hasImportanceClassification == null) {
            hasImportanceClassification = new ArrayList<ImportanceClassificationPropertyType>();
        }
        return this.hasImportanceClassification;
    }

    /**
     * Gets the value of the hasEventScenarioClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasEventScenarioClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasEventScenarioClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventScenarioClassificationPropertyType }
     * 
     * 
     */
    public List<EventScenarioClassificationPropertyType> getHasEventScenarioClassification() {
        if (hasEventScenarioClassification == null) {
            hasEventScenarioClassification = new ArrayList<EventScenarioClassificationPropertyType>();
        }
        return this.hasEventScenarioClassification;
    }

}
