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
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;


/**
 * Keywords, their type and reference source
 * 
 * <p>Java-Klasse f�r MD_Keywords_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_Keywords_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="keyword" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="type" type="{http://www.isotc211.org/2005/gmd}MD_KeywordTypeCode_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="thesaurusName" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Keywords_Type", propOrder = {
    "keyword",
    "type",
    "thesaurusName"
})
public class MDKeywordsType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected List<CharacterStringPropertyType> keyword;
    protected MDKeywordTypeCodePropertyType type;
    protected CICitationPropertyType thesaurusName;

    /**
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<CharacterStringPropertyType>();
        }
        return this.keyword;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDKeywordTypeCodePropertyType }
     *     
     */
    public MDKeywordTypeCodePropertyType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDKeywordTypeCodePropertyType }
     *     
     */
    public void setType(MDKeywordTypeCodePropertyType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der thesaurusName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getThesaurusName() {
        return thesaurusName;
    }

    /**
     * Legt den Wert der thesaurusName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setThesaurusName(CICitationPropertyType value) {
        this.thesaurusName = value;
    }

}
