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
 * <p>Java-Klasse für AuthorityForNavaidEquipmentPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AuthorityForNavaidEquipmentPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AuthorityForNavaidEquipment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityForNavaidEquipmentPropertyType", propOrder = {
    "authorityForNavaidEquipment"
})
public class AuthorityForNavaidEquipmentPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AuthorityForNavaidEquipment", required = true)
    protected AuthorityForNavaidEquipmentType authorityForNavaidEquipment;

    /**
     * Ruft den Wert der authorityForNavaidEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityForNavaidEquipmentType }
     *     
     */
    public AuthorityForNavaidEquipmentType getAuthorityForNavaidEquipment() {
        return authorityForNavaidEquipment;
    }

    /**
     * Legt den Wert der authorityForNavaidEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityForNavaidEquipmentType }
     *     
     */
    public void setAuthorityForNavaidEquipment(AuthorityForNavaidEquipmentType value) {
        this.authorityForNavaidEquipment = value;
    }

}
