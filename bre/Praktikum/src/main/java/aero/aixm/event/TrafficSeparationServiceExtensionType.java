//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package aero.aixm.event;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractExtensionType;


/**
 * <p>Java-Klasse f�r TrafficSeparationServiceExtensionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrafficSeparationServiceExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractExtensionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1/event}TrafficSeparationServiceExtensionPropertyGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficSeparationServiceExtensionType", propOrder = {
    "theEvent"
})
public class TrafficSeparationServiceExtensionType
    extends AbstractExtensionType
{

    @XmlElement(nillable = true)
    protected List<EventPropertyType> theEvent;

    /**
     * Gets the value of the theEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventPropertyType }
     * 
     * 
     */
    public List<EventPropertyType> getTheEvent() {
        if (theEvent == null) {
            theEvent = new ArrayList<EventPropertyType>();
        }
        return this.theEvent;
    }

}
