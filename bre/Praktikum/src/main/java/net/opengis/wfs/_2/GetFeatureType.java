//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package net.opengis.wfs._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.fes._2.AbstractAdhocQueryExpressionType;
import net.opengis.fes._2.AbstractQueryExpressionType;


/**
 * <p>Java-Klasse f�r GetFeatureType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetFeatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/wfs/2.0}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/fes/2.0}AbstractQueryExpression" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/wfs/2.0}StandardPresentationParameters"/&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/wfs/2.0}StandardResolveParameters"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeatureType", propOrder = {
    "abstractQueryExpression"
})
@XmlSeeAlso({
    GetFeatureWithLockType.class
})
public class GetFeatureType
    extends BaseRequestType
{

    @XmlElementRef(name = "AbstractQueryExpression", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractQueryExpressionType>> abstractQueryExpression;
    @XmlAttribute(name = "startIndex")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger startIndex;
    @XmlAttribute(name = "count")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;
    @XmlAttribute(name = "resultType")
    protected ResultTypeType resultType;
    @XmlAttribute(name = "outputFormat")
    protected String outputFormat;
    @XmlAttribute(name = "resolve")
    protected ResolveValueType resolve;
    @XmlAttribute(name = "resolveDepth")
    protected String resolveDepth;
    @XmlAttribute(name = "resolveTimeout")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger resolveTimeout;

    /**
     * Gets the value of the abstractQueryExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractQueryExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractQueryExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link StoredQueryType }{@code >}
     * {@link JAXBElement }{@code <}{@link QueryType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractQueryExpressionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAdhocQueryExpressionType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractQueryExpressionType>> getAbstractQueryExpression() {
        if (abstractQueryExpression == null) {
            abstractQueryExpression = new ArrayList<JAXBElement<? extends AbstractQueryExpressionType>>();
        }
        return this.abstractQueryExpression;
    }

    /**
     * Ruft den Wert der startIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartIndex() {
        if (startIndex == null) {
            return new BigInteger("0");
        } else {
            return startIndex;
        }
    }

    /**
     * Legt den Wert der startIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartIndex(BigInteger value) {
        this.startIndex = value;
    }

    /**
     * Ruft den Wert der count-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Legt den Wert der count-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Ruft den Wert der resultType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResultTypeType }
     *     
     */
    public ResultTypeType getResultType() {
        if (resultType == null) {
            return ResultTypeType.RESULTS;
        } else {
            return resultType;
        }
    }

    /**
     * Legt den Wert der resultType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultTypeType }
     *     
     */
    public void setResultType(ResultTypeType value) {
        this.resultType = value;
    }

    /**
     * Ruft den Wert der outputFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputFormat() {
        if (outputFormat == null) {
            return "application/gml+xml; version=3.2";
        } else {
            return outputFormat;
        }
    }

    /**
     * Legt den Wert der outputFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputFormat(String value) {
        this.outputFormat = value;
    }

    /**
     * Ruft den Wert der resolve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResolveValueType }
     *     
     */
    public ResolveValueType getResolve() {
        if (resolve == null) {
            return ResolveValueType.NONE;
        } else {
            return resolve;
        }
    }

    /**
     * Legt den Wert der resolve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolveValueType }
     *     
     */
    public void setResolve(ResolveValueType value) {
        this.resolve = value;
    }

    /**
     * Ruft den Wert der resolveDepth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolveDepth() {
        if (resolveDepth == null) {
            return "*";
        } else {
            return resolveDepth;
        }
    }

    /**
     * Legt den Wert der resolveDepth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolveDepth(String value) {
        this.resolveDepth = value;
    }

    /**
     * Ruft den Wert der resolveTimeout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResolveTimeout() {
        if (resolveTimeout == null) {
            return new BigInteger("300");
        } else {
            return resolveTimeout;
        }
    }

    /**
     * Legt den Wert der resolveTimeout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResolveTimeout(BigInteger value) {
        this.resolveTimeout = value;
    }

}
