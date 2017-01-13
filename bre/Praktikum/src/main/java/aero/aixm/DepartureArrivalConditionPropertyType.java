//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DepartureArrivalConditionPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DepartureArrivalConditionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}DepartureArrivalCondition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartureArrivalConditionPropertyType", propOrder = {
    "departureArrivalCondition"
})
public class DepartureArrivalConditionPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "DepartureArrivalCondition", required = true)
    protected DepartureArrivalConditionType departureArrivalCondition;

    /**
     * Ruft den Wert der departureArrivalCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepartureArrivalConditionType }
     *     
     */
    public DepartureArrivalConditionType getDepartureArrivalCondition() {
        return departureArrivalCondition;
    }

    /**
     * Legt den Wert der departureArrivalCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureArrivalConditionType }
     *     
     */
    public void setDepartureArrivalCondition(DepartureArrivalConditionType value) {
        this.departureArrivalCondition = value;
    }

}
