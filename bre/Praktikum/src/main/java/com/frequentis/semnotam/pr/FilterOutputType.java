//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package com.frequentis.semnotam.pr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für FilterOutputType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FilterOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasInput" type="{http://semnotam.frequentis.com/pr}FilterInputPropertyType"/&gt;
 *         &lt;element name="hasResultSet" type="{http://semnotam.frequentis.com/pr}ResultSetPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterOutputType", propOrder = {
    "hasInput",
    "hasResultSet"
})
public class FilterOutputType {

    @XmlElement(required = true)
    protected FilterInputPropertyType hasInput;
    @XmlElement(required = true)
    protected ResultSetPropertyType hasResultSet;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;

    /**
     * Ruft den Wert der hasInput-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilterInputPropertyType }
     *     
     */
    public FilterInputPropertyType getHasInput() {
        return hasInput;
    }

    /**
     * Legt den Wert der hasInput-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterInputPropertyType }
     *     
     */
    public void setHasInput(FilterInputPropertyType value) {
        this.hasInput = value;
    }

    /**
     * Ruft den Wert der hasResultSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResultSetPropertyType }
     *     
     */
    public ResultSetPropertyType getHasResultSet() {
        return hasResultSet;
    }

    /**
     * Legt den Wert der hasResultSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSetPropertyType }
     *     
     */
    public void setHasResultSet(ResultSetPropertyType value) {
        this.hasResultSet = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
