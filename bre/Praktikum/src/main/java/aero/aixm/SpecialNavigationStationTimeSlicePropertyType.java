//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r SpecialNavigationStationTimeSlicePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SpecialNavigationStationTimeSlicePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}SpecialNavigationStationTimeSlice"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialNavigationStationTimeSlicePropertyType", propOrder = {
    "specialNavigationStationTimeSlice"
})
public class SpecialNavigationStationTimeSlicePropertyType {

    @XmlElement(name = "SpecialNavigationStationTimeSlice", required = true)
    protected SpecialNavigationStationTimeSliceType specialNavigationStationTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Ruft den Wert der specialNavigationStationTimeSlice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpecialNavigationStationTimeSliceType }
     *     
     */
    public SpecialNavigationStationTimeSliceType getSpecialNavigationStationTimeSlice() {
        return specialNavigationStationTimeSlice;
    }

    /**
     * Legt den Wert der specialNavigationStationTimeSlice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialNavigationStationTimeSliceType }
     *     
     */
    public void setSpecialNavigationStationTimeSlice(SpecialNavigationStationTimeSliceType value) {
        this.specialNavigationStationTimeSlice = value;
    }

    /**
     * Ruft den Wert der owns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Legt den Wert der owns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(Boolean value) {
        this.owns = value;
    }

}