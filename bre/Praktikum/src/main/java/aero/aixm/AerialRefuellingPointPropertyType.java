//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r AerialRefuellingPointPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AerialRefuellingPointPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AerialRefuellingPoint"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerialRefuellingPointPropertyType", propOrder = {
    "aerialRefuellingPoint"
})
public class AerialRefuellingPointPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AerialRefuellingPoint", required = true)
    protected AerialRefuellingPointType aerialRefuellingPoint;

    /**
     * Ruft den Wert der aerialRefuellingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AerialRefuellingPointType }
     *     
     */
    public AerialRefuellingPointType getAerialRefuellingPoint() {
        return aerialRefuellingPoint;
    }

    /**
     * Legt den Wert der aerialRefuellingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AerialRefuellingPointType }
     *     
     */
    public void setAerialRefuellingPoint(AerialRefuellingPointType value) {
        this.aerialRefuellingPoint = value;
    }

}
