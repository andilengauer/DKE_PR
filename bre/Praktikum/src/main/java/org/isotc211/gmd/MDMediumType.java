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
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;
import org.isotc211.gco.IntegerPropertyType;
import org.isotc211.gco.RealPropertyType;


/**
 * Information about the media on which the data can be distributed
 * 
 * <p>Java-Klasse f�r MD_Medium_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_Medium_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.isotc211.org/2005/gmd}MD_MediumNameCode_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="density" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="densityUnits" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="volumes" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="mediumFormat" type="{http://www.isotc211.org/2005/gmd}MD_MediumFormatCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mediumNote" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Medium_Type", propOrder = {
    "name",
    "density",
    "densityUnits",
    "volumes",
    "mediumFormat",
    "mediumNote"
})
public class MDMediumType
    extends AbstractObjectType
{

    protected MDMediumNameCodePropertyType name;
    protected List<RealPropertyType> density;
    protected CharacterStringPropertyType densityUnits;
    protected IntegerPropertyType volumes;
    protected List<MDMediumFormatCodePropertyType> mediumFormat;
    protected CharacterStringPropertyType mediumNote;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDMediumNameCodePropertyType }
     *     
     */
    public MDMediumNameCodePropertyType getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMediumNameCodePropertyType }
     *     
     */
    public void setName(MDMediumNameCodePropertyType value) {
        this.name = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the density property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDensity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealPropertyType }
     * 
     * 
     */
    public List<RealPropertyType> getDensity() {
        if (density == null) {
            density = new ArrayList<RealPropertyType>();
        }
        return this.density;
    }

    /**
     * Ruft den Wert der densityUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDensityUnits() {
        return densityUnits;
    }

    /**
     * Legt den Wert der densityUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDensityUnits(CharacterStringPropertyType value) {
        this.densityUnits = value;
    }

    /**
     * Ruft den Wert der volumes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getVolumes() {
        return volumes;
    }

    /**
     * Legt den Wert der volumes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setVolumes(IntegerPropertyType value) {
        this.volumes = value;
    }

    /**
     * Gets the value of the mediumFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediumFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediumFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDMediumFormatCodePropertyType }
     * 
     * 
     */
    public List<MDMediumFormatCodePropertyType> getMediumFormat() {
        if (mediumFormat == null) {
            mediumFormat = new ArrayList<MDMediumFormatCodePropertyType>();
        }
        return this.mediumFormat;
    }

    /**
     * Ruft den Wert der mediumNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMediumNote() {
        return mediumNote;
    }

    /**
     * Legt den Wert der mediumNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMediumNote(CharacterStringPropertyType value) {
        this.mediumNote = value;
    }

}
