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
 * <p>Java-Klasse für EquipmentUnavailableAdjustmentPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EquipmentUnavailableAdjustmentPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}EquipmentUnavailableAdjustment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentUnavailableAdjustmentPropertyType", propOrder = {
    "equipmentUnavailableAdjustment"
})
public class EquipmentUnavailableAdjustmentPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "EquipmentUnavailableAdjustment", required = true)
    protected EquipmentUnavailableAdjustmentType equipmentUnavailableAdjustment;

    /**
     * Ruft den Wert der equipmentUnavailableAdjustment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentUnavailableAdjustmentType }
     *     
     */
    public EquipmentUnavailableAdjustmentType getEquipmentUnavailableAdjustment() {
        return equipmentUnavailableAdjustment;
    }

    /**
     * Legt den Wert der equipmentUnavailableAdjustment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentUnavailableAdjustmentType }
     *     
     */
    public void setEquipmentUnavailableAdjustment(EquipmentUnavailableAdjustmentType value) {
        this.equipmentUnavailableAdjustment = value;
    }

}
