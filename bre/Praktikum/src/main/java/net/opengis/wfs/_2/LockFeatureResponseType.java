//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package net.opengis.wfs._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r LockFeatureResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LockFeatureResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeaturesLocked" type="{http://www.opengis.net/wfs/2.0}FeaturesLockedType" minOccurs="0"/&gt;
 *         &lt;element name="FeaturesNotLocked" type="{http://www.opengis.net/wfs/2.0}FeaturesNotLockedType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lockId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockFeatureResponseType", propOrder = {
    "featuresLocked",
    "featuresNotLocked"
})
public class LockFeatureResponseType {

    @XmlElement(name = "FeaturesLocked")
    protected FeaturesLockedType featuresLocked;
    @XmlElement(name = "FeaturesNotLocked")
    protected FeaturesNotLockedType featuresNotLocked;
    @XmlAttribute(name = "lockId")
    protected String lockId;

    /**
     * Ruft den Wert der featuresLocked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesLockedType }
     *     
     */
    public FeaturesLockedType getFeaturesLocked() {
        return featuresLocked;
    }

    /**
     * Legt den Wert der featuresLocked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesLockedType }
     *     
     */
    public void setFeaturesLocked(FeaturesLockedType value) {
        this.featuresLocked = value;
    }

    /**
     * Ruft den Wert der featuresNotLocked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesNotLockedType }
     *     
     */
    public FeaturesNotLockedType getFeaturesNotLocked() {
        return featuresNotLocked;
    }

    /**
     * Legt den Wert der featuresNotLocked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesNotLockedType }
     *     
     */
    public void setFeaturesNotLocked(FeaturesNotLockedType value) {
        this.featuresNotLocked = value;
    }

    /**
     * Ruft den Wert der lockId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockId() {
        return lockId;
    }

    /**
     * Legt den Wert der lockId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockId(String value) {
        this.lockId = value;
    }

}
