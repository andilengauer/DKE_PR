//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Extent with respect to date and time
 * 
 * <p>Java-Klasse f�r EX_SpatialTemporalExtent_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EX_SpatialTemporalExtent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}EX_TemporalExtent_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spatialExtent" type="{http://www.isotc211.org/2005/gmd}EX_GeographicExtent_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_SpatialTemporalExtent_Type", propOrder = {
    "spatialExtent"
})
public class EXSpatialTemporalExtentType
    extends EXTemporalExtentType
{

    @XmlElement(required = true)
    protected List<EXGeographicExtentPropertyType> spatialExtent;

    /**
     * Gets the value of the spatialExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXGeographicExtentPropertyType }
     * 
     * 
     */
    public List<EXGeographicExtentPropertyType> getSpatialExtent() {
        if (spatialExtent == null) {
            spatialExtent = new ArrayList<EXGeographicExtentPropertyType>();
        }
        return this.spatialExtent;
    }

}
