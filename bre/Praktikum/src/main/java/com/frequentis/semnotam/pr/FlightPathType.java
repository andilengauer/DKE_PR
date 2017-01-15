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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für FlightPathType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlightPathType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasDepartureAerodrome" type="{http://semnotam.frequentis.com/pr}DepartureAerodromePropertyType"/&gt;
 *         &lt;element name="hasDestinationAerodrome" type="{http://semnotam.frequentis.com/pr}DestinationAerodromePropertyType"/&gt;
 *         &lt;element name="hasAlternateAerodrome" type="{http://semnotam.frequentis.com/pr}AlternateAerodromePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hasArea" type="{http://semnotam.frequentis.com/pr}AreaPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hasSegment" type="{http://semnotam.frequentis.com/pr}SegmentPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FlightPathType", propOrder = {
    "routeName",
    "hasDepartureAerodrome",
    "hasDestinationAerodrome",
    "hasAlternateAerodrome",
    "hasArea",
    "hasSegment"
})
public class FlightPathType {

    protected String routeName;
    @XmlElement(required = true)
    protected DepartureAerodromePropertyType hasDepartureAerodrome;
    @XmlElement(required = true)
    protected DestinationAerodromePropertyType hasDestinationAerodrome;
    protected List<AlternateAerodromePropertyType> hasAlternateAerodrome;
    protected List<AreaPropertyType> hasArea;
    protected List<SegmentPropertyType> hasSegment;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;

    /**
     * Ruft den Wert der routeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * Legt den Wert der routeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteName(String value) {
        this.routeName = value;
    }

    /**
     * Ruft den Wert der hasDepartureAerodrome-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepartureAerodromePropertyType }
     *     
     */
    public DepartureAerodromePropertyType getHasDepartureAerodrome() {
        return hasDepartureAerodrome;
    }

    /**
     * Legt den Wert der hasDepartureAerodrome-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureAerodromePropertyType }
     *     
     */
    public void setHasDepartureAerodrome(DepartureAerodromePropertyType value) {
        this.hasDepartureAerodrome = value;
    }

    /**
     * Ruft den Wert der hasDestinationAerodrome-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationAerodromePropertyType }
     *     
     */
    public DestinationAerodromePropertyType getHasDestinationAerodrome() {
        return hasDestinationAerodrome;
    }

    /**
     * Legt den Wert der hasDestinationAerodrome-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationAerodromePropertyType }
     *     
     */
    public void setHasDestinationAerodrome(DestinationAerodromePropertyType value) {
        this.hasDestinationAerodrome = value;
    }

    /**
     * Gets the value of the hasAlternateAerodrome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasAlternateAerodrome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasAlternateAerodrome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateAerodromePropertyType }
     * 
     * 
     */
    public List<AlternateAerodromePropertyType> getHasAlternateAerodrome() {
        if (hasAlternateAerodrome == null) {
            hasAlternateAerodrome = new ArrayList<AlternateAerodromePropertyType>();
        }
        return this.hasAlternateAerodrome;
    }

    /**
     * Gets the value of the hasArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaPropertyType }
     * 
     * 
     */
    public List<AreaPropertyType> getHasArea() {
        if (hasArea == null) {
            hasArea = new ArrayList<AreaPropertyType>();
        }
        return this.hasArea;
    }

    /**
     * Gets the value of the hasSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentPropertyType }
     * 
     * 
     */
    public List<SegmentPropertyType> getHasSegment() {
        if (hasSegment == null) {
            hasSegment = new ArrayList<SegmentPropertyType>();
        }
        return this.hasSegment;
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
