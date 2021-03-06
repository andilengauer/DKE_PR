//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;
import org.isotc211.gco.DateTimePropertyType;


/**
 * <p>Java-Klasse f�r LI_ProcessStep_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LI_ProcessStep_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="rationale" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="dateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="processor" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.isotc211.org/2005/gmd}LI_Source_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LI_ProcessStep_Type", propOrder = {
    "description",
    "rationale",
    "dateTime",
    "processor",
    "source"
})
public class LIProcessStepType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType description;
    protected CharacterStringPropertyType rationale;
    protected DateTimePropertyType dateTime;
    protected List<CIResponsiblePartyPropertyType> processor;
    protected List<LISourcePropertyType> source;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescription(CharacterStringPropertyType value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der rationale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getRationale() {
        return rationale;
    }

    /**
     * Legt den Wert der rationale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setRationale(CharacterStringPropertyType value) {
        this.rationale = value;
    }

    /**
     * Ruft den Wert der dateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getDateTime() {
        return dateTime;
    }

    /**
     * Legt den Wert der dateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setDateTime(DateTimePropertyType value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the processor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getProcessor() {
        if (processor == null) {
            processor = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.processor;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISourcePropertyType }
     * 
     * 
     */
    public List<LISourcePropertyType> getSource() {
        if (source == null) {
            source = new ArrayList<LISourcePropertyType>();
        }
        return this.source;
    }

}
