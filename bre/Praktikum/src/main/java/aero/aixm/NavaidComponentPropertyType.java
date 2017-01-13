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
 * <p>Java-Klasse für NavaidComponentPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NavaidComponentPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}NavaidComponent"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidComponentPropertyType", propOrder = {
    "navaidComponent"
})
public class NavaidComponentPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "NavaidComponent", required = true)
    protected NavaidComponentType navaidComponent;

    /**
     * Ruft den Wert der navaidComponent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NavaidComponentType }
     *     
     */
    public NavaidComponentType getNavaidComponent() {
        return navaidComponent;
    }

    /**
     * Legt den Wert der navaidComponent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidComponentType }
     *     
     */
    public void setNavaidComponent(NavaidComponentType value) {
        this.navaidComponent = value;
    }

}
