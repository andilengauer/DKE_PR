//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package net.opengis.fes._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r PropertyIsLikeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PropertyIsLikeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/fes/2.0}ComparisonOpsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/fes/2.0}expression" maxOccurs="2" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="wildCard" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="singleChar" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="escapeChar" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyIsLikeType", propOrder = {
    "expression"
})
public class PropertyIsLikeType
    extends ComparisonOpsType
{

    @XmlElementRef(name = "expression", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class)
    protected List<JAXBElement<?>> expression;
    @XmlAttribute(name = "wildCard", required = true)
    protected String wildCard;
    @XmlAttribute(name = "singleChar", required = true)
    protected String singleChar;
    @XmlAttribute(name = "escapeChar", required = true)
    protected String escapeChar;

    /**
     * Gets the value of the expression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link LiteralType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getExpression() {
        if (expression == null) {
            expression = new ArrayList<JAXBElement<?>>();
        }
        return this.expression;
    }

    /**
     * Ruft den Wert der wildCard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWildCard() {
        return wildCard;
    }

    /**
     * Legt den Wert der wildCard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWildCard(String value) {
        this.wildCard = value;
    }

    /**
     * Ruft den Wert der singleChar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleChar() {
        return singleChar;
    }

    /**
     * Legt den Wert der singleChar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleChar(String value) {
        this.singleChar = value;
    }

    /**
     * Ruft den Wert der escapeChar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscapeChar() {
        return escapeChar;
    }

    /**
     * Legt den Wert der escapeChar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscapeChar(String value) {
        this.escapeChar = value;
    }

}