//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ImageDatumType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ImageDatumType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractDatumType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}pixelInCell"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageDatumType", propOrder = {
    "pixelInCell"
})
public class ImageDatumType
    extends AbstractDatumType
{

    @XmlElement(required = true)
    protected CodeWithAuthorityType pixelInCell;

    /**
     * Ruft den Wert der pixelInCell-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getPixelInCell() {
        return pixelInCell;
    }

    /**
     * Legt den Wert der pixelInCell-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public void setPixelInCell(CodeWithAuthorityType value) {
        this.pixelInCell = value;
    }

}
