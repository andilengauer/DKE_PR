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
 * <p>Java-Klasse f�r AirportHeliportResponsibilityOrganisationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirportHeliportResponsibilityOrganisationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AirportHeliportResponsibilityOrganisation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportHeliportResponsibilityOrganisationPropertyType", propOrder = {
    "airportHeliportResponsibilityOrganisation"
})
public class AirportHeliportResponsibilityOrganisationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirportHeliportResponsibilityOrganisation", required = true)
    protected AirportHeliportResponsibilityOrganisationType airportHeliportResponsibilityOrganisation;

    /**
     * Ruft den Wert der airportHeliportResponsibilityOrganisation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AirportHeliportResponsibilityOrganisationType }
     *     
     */
    public AirportHeliportResponsibilityOrganisationType getAirportHeliportResponsibilityOrganisation() {
        return airportHeliportResponsibilityOrganisation;
    }

    /**
     * Legt den Wert der airportHeliportResponsibilityOrganisation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportHeliportResponsibilityOrganisationType }
     *     
     */
    public void setAirportHeliportResponsibilityOrganisation(AirportHeliportResponsibilityOrganisationType value) {
        this.airportHeliportResponsibilityOrganisation = value;
    }

}
