//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.BooleanPropertyType;


/**
 * Geographic area of the dataset
 * 
 * <p>Java-Klasse f�r AbstractEX_GeographicExtent_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractEX_GeographicExtent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extentTypeCode" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEX_GeographicExtent_Type", propOrder = {
    "extentTypeCode"
})
@XmlSeeAlso({
    EXBoundingPolygonType.class,
    EXGeographicBoundingBoxType.class,
    EXGeographicDescriptionType.class
})
public abstract class AbstractEXGeographicExtentType
    extends AbstractObjectType
{

    protected BooleanPropertyType extentTypeCode;

    /**
     * Ruft den Wert der extentTypeCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getExtentTypeCode() {
        return extentTypeCode;
    }

    /**
     * Legt den Wert der extentTypeCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setExtentTypeCode(BooleanPropertyType value) {
        this.extentTypeCode = value;
    }

}
