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
import org.isotc211.gco.DatePropertyType;
import org.isotc211.gco.ObjectReferencePropertyType;


/**
 * Information about the metadata
 * 
 * <p>Java-Klasse f�r MD_Metadata_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_Metadata_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileIdentifier" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="characterSet" type="{http://www.isotc211.org/2005/gmd}MD_CharacterSetCode_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="parentIdentifier" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="hierarchyLevel" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hierarchyLevelName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="dateStamp" type="{http://www.isotc211.org/2005/gco}Date_PropertyType"/&gt;
 *         &lt;element name="metadataStandardName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="metadataStandardVersion" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="dataSetURI" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="locale" type="{http://www.isotc211.org/2005/gmd}PT_Locale_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="spatialRepresentationInfo" type="{http://www.isotc211.org/2005/gmd}MD_SpatialRepresentation_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenceSystemInfo" type="{http://www.isotc211.org/2005/gmd}MD_ReferenceSystem_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="metadataExtensionInfo" type="{http://www.isotc211.org/2005/gmd}MD_MetadataExtensionInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="identificationInfo" type="{http://www.isotc211.org/2005/gmd}MD_Identification_PropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="contentInfo" type="{http://www.isotc211.org/2005/gmd}MD_ContentInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="distributionInfo" type="{http://www.isotc211.org/2005/gmd}MD_Distribution_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="dataQualityInfo" type="{http://www.isotc211.org/2005/gmd}DQ_DataQuality_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="portrayalCatalogueInfo" type="{http://www.isotc211.org/2005/gmd}MD_PortrayalCatalogueReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="metadataConstraints" type="{http://www.isotc211.org/2005/gmd}MD_Constraints_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="applicationSchemaInfo" type="{http://www.isotc211.org/2005/gmd}MD_ApplicationSchemaInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="metadataMaintenance" type="{http://www.isotc211.org/2005/gmd}MD_MaintenanceInformation_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="series" type="{http://www.isotc211.org/2005/gmd}DS_Aggregate_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="describes" type="{http://www.isotc211.org/2005/gmd}DS_DataSet_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="propertyType" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="featureType" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="featureAttribute" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Metadata_Type", propOrder = {
    "fileIdentifier",
    "language",
    "characterSet",
    "parentIdentifier",
    "hierarchyLevel",
    "hierarchyLevelName",
    "contact",
    "dateStamp",
    "metadataStandardName",
    "metadataStandardVersion",
    "dataSetURI",
    "locale",
    "spatialRepresentationInfo",
    "referenceSystemInfo",
    "metadataExtensionInfo",
    "identificationInfo",
    "contentInfo",
    "distributionInfo",
    "dataQualityInfo",
    "portrayalCatalogueInfo",
    "metadataConstraints",
    "applicationSchemaInfo",
    "metadataMaintenance",
    "series",
    "describes",
    "propertyType",
    "featureType",
    "featureAttribute"
})
public class MDMetadataType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType fileIdentifier;
    protected CharacterStringPropertyType language;
    protected MDCharacterSetCodePropertyType characterSet;
    protected CharacterStringPropertyType parentIdentifier;
    protected List<MDScopeCodePropertyType> hierarchyLevel;
    protected List<CharacterStringPropertyType> hierarchyLevelName;
    @XmlElement(required = true)
    protected List<CIResponsiblePartyPropertyType> contact;
    @XmlElement(required = true)
    protected DatePropertyType dateStamp;
    protected CharacterStringPropertyType metadataStandardName;
    protected CharacterStringPropertyType metadataStandardVersion;
    protected CharacterStringPropertyType dataSetURI;
    protected List<PTLocalePropertyType> locale;
    protected List<MDSpatialRepresentationPropertyType> spatialRepresentationInfo;
    protected List<MDReferenceSystemPropertyType> referenceSystemInfo;
    protected List<MDMetadataExtensionInformationPropertyType> metadataExtensionInfo;
    @XmlElement(required = true)
    protected List<MDIdentificationPropertyType> identificationInfo;
    protected List<MDContentInformationPropertyType> contentInfo;
    protected MDDistributionPropertyType distributionInfo;
    protected List<DQDataQualityPropertyType> dataQualityInfo;
    protected List<MDPortrayalCatalogueReferencePropertyType> portrayalCatalogueInfo;
    protected List<MDConstraintsPropertyType> metadataConstraints;
    protected List<MDApplicationSchemaInformationPropertyType> applicationSchemaInfo;
    protected MDMaintenanceInformationPropertyType metadataMaintenance;
    protected List<DSAggregatePropertyType> series;
    protected List<DSDataSetPropertyType> describes;
    protected List<ObjectReferencePropertyType> propertyType;
    protected List<ObjectReferencePropertyType> featureType;
    protected List<ObjectReferencePropertyType> featureAttribute;

    /**
     * Ruft den Wert der fileIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFileIdentifier() {
        return fileIdentifier;
    }

    /**
     * Legt den Wert der fileIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFileIdentifier(CharacterStringPropertyType value) {
        this.fileIdentifier = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setLanguage(CharacterStringPropertyType value) {
        this.language = value;
    }

    /**
     * Ruft den Wert der characterSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public MDCharacterSetCodePropertyType getCharacterSet() {
        return characterSet;
    }

    /**
     * Legt den Wert der characterSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public void setCharacterSet(MDCharacterSetCodePropertyType value) {
        this.characterSet = value;
    }

    /**
     * Ruft den Wert der parentIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getParentIdentifier() {
        return parentIdentifier;
    }

    /**
     * Legt den Wert der parentIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setParentIdentifier(CharacterStringPropertyType value) {
        this.parentIdentifier = value;
    }

    /**
     * Gets the value of the hierarchyLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchyLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchyLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeCodePropertyType }
     * 
     * 
     */
    public List<MDScopeCodePropertyType> getHierarchyLevel() {
        if (hierarchyLevel == null) {
            hierarchyLevel = new ArrayList<MDScopeCodePropertyType>();
        }
        return this.hierarchyLevel;
    }

    /**
     * Gets the value of the hierarchyLevelName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchyLevelName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchyLevelName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getHierarchyLevelName() {
        if (hierarchyLevelName == null) {
            hierarchyLevelName = new ArrayList<CharacterStringPropertyType>();
        }
        return this.hierarchyLevelName;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getContact() {
        if (contact == null) {
            contact = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.contact;
    }

    /**
     * Ruft den Wert der dateStamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DatePropertyType }
     *     
     */
    public DatePropertyType getDateStamp() {
        return dateStamp;
    }

    /**
     * Legt den Wert der dateStamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePropertyType }
     *     
     */
    public void setDateStamp(DatePropertyType value) {
        this.dateStamp = value;
    }

    /**
     * Ruft den Wert der metadataStandardName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMetadataStandardName() {
        return metadataStandardName;
    }

    /**
     * Legt den Wert der metadataStandardName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMetadataStandardName(CharacterStringPropertyType value) {
        this.metadataStandardName = value;
    }

    /**
     * Ruft den Wert der metadataStandardVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMetadataStandardVersion() {
        return metadataStandardVersion;
    }

    /**
     * Legt den Wert der metadataStandardVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMetadataStandardVersion(CharacterStringPropertyType value) {
        this.metadataStandardVersion = value;
    }

    /**
     * Ruft den Wert der dataSetURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDataSetURI() {
        return dataSetURI;
    }

    /**
     * Legt den Wert der dataSetURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDataSetURI(CharacterStringPropertyType value) {
        this.dataSetURI = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTLocalePropertyType }
     * 
     * 
     */
    public List<PTLocalePropertyType> getLocale() {
        if (locale == null) {
            locale = new ArrayList<PTLocalePropertyType>();
        }
        return this.locale;
    }

    /**
     * Gets the value of the spatialRepresentationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialRepresentationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialRepresentationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDSpatialRepresentationPropertyType }
     * 
     * 
     */
    public List<MDSpatialRepresentationPropertyType> getSpatialRepresentationInfo() {
        if (spatialRepresentationInfo == null) {
            spatialRepresentationInfo = new ArrayList<MDSpatialRepresentationPropertyType>();
        }
        return this.spatialRepresentationInfo;
    }

    /**
     * Gets the value of the referenceSystemInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceSystemInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceSystemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDReferenceSystemPropertyType }
     * 
     * 
     */
    public List<MDReferenceSystemPropertyType> getReferenceSystemInfo() {
        if (referenceSystemInfo == null) {
            referenceSystemInfo = new ArrayList<MDReferenceSystemPropertyType>();
        }
        return this.referenceSystemInfo;
    }

    /**
     * Gets the value of the metadataExtensionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataExtensionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataExtensionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDMetadataExtensionInformationPropertyType }
     * 
     * 
     */
    public List<MDMetadataExtensionInformationPropertyType> getMetadataExtensionInfo() {
        if (metadataExtensionInfo == null) {
            metadataExtensionInfo = new ArrayList<MDMetadataExtensionInformationPropertyType>();
        }
        return this.metadataExtensionInfo;
    }

    /**
     * Gets the value of the identificationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identificationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDIdentificationPropertyType }
     * 
     * 
     */
    public List<MDIdentificationPropertyType> getIdentificationInfo() {
        if (identificationInfo == null) {
            identificationInfo = new ArrayList<MDIdentificationPropertyType>();
        }
        return this.identificationInfo;
    }

    /**
     * Gets the value of the contentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDContentInformationPropertyType }
     * 
     * 
     */
    public List<MDContentInformationPropertyType> getContentInfo() {
        if (contentInfo == null) {
            contentInfo = new ArrayList<MDContentInformationPropertyType>();
        }
        return this.contentInfo;
    }

    /**
     * Ruft den Wert der distributionInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDDistributionPropertyType }
     *     
     */
    public MDDistributionPropertyType getDistributionInfo() {
        return distributionInfo;
    }

    /**
     * Legt den Wert der distributionInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDDistributionPropertyType }
     *     
     */
    public void setDistributionInfo(MDDistributionPropertyType value) {
        this.distributionInfo = value;
    }

    /**
     * Gets the value of the dataQualityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataQualityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataQualityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQDataQualityPropertyType }
     * 
     * 
     */
    public List<DQDataQualityPropertyType> getDataQualityInfo() {
        if (dataQualityInfo == null) {
            dataQualityInfo = new ArrayList<DQDataQualityPropertyType>();
        }
        return this.dataQualityInfo;
    }

    /**
     * Gets the value of the portrayalCatalogueInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portrayalCatalogueInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortrayalCatalogueInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDPortrayalCatalogueReferencePropertyType }
     * 
     * 
     */
    public List<MDPortrayalCatalogueReferencePropertyType> getPortrayalCatalogueInfo() {
        if (portrayalCatalogueInfo == null) {
            portrayalCatalogueInfo = new ArrayList<MDPortrayalCatalogueReferencePropertyType>();
        }
        return this.portrayalCatalogueInfo;
    }

    /**
     * Gets the value of the metadataConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDConstraintsPropertyType }
     * 
     * 
     */
    public List<MDConstraintsPropertyType> getMetadataConstraints() {
        if (metadataConstraints == null) {
            metadataConstraints = new ArrayList<MDConstraintsPropertyType>();
        }
        return this.metadataConstraints;
    }

    /**
     * Gets the value of the applicationSchemaInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationSchemaInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationSchemaInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDApplicationSchemaInformationPropertyType }
     * 
     * 
     */
    public List<MDApplicationSchemaInformationPropertyType> getApplicationSchemaInfo() {
        if (applicationSchemaInfo == null) {
            applicationSchemaInfo = new ArrayList<MDApplicationSchemaInformationPropertyType>();
        }
        return this.applicationSchemaInfo;
    }

    /**
     * Ruft den Wert der metadataMaintenance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDMaintenanceInformationPropertyType }
     *     
     */
    public MDMaintenanceInformationPropertyType getMetadataMaintenance() {
        return metadataMaintenance;
    }

    /**
     * Legt den Wert der metadataMaintenance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMaintenanceInformationPropertyType }
     *     
     */
    public void setMetadataMaintenance(MDMaintenanceInformationPropertyType value) {
        this.metadataMaintenance = value;
    }

    /**
     * Gets the value of the series property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the series property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAggregatePropertyType }
     * 
     * 
     */
    public List<DSAggregatePropertyType> getSeries() {
        if (series == null) {
            series = new ArrayList<DSAggregatePropertyType>();
        }
        return this.series;
    }

    /**
     * Gets the value of the describes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the describes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescribes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSDataSetPropertyType }
     * 
     * 
     */
    public List<DSDataSetPropertyType> getDescribes() {
        if (describes == null) {
            describes = new ArrayList<DSDataSetPropertyType>();
        }
        return this.describes;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getPropertyType() {
        if (propertyType == null) {
            propertyType = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.propertyType;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatureType() {
        if (featureType == null) {
            featureType = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.featureType;
    }

    /**
     * Gets the value of the featureAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatureAttribute() {
        if (featureAttribute == null) {
            featureAttribute = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.featureAttribute;
    }

}
