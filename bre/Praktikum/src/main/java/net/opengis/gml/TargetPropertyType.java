//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractAIXMFeatureType;
import aero.aixm.AbstractAirportGroundServiceType;
import aero.aixm.AbstractAirportHeliportProtectionAreaType;
import aero.aixm.AbstractApproachLegType;
import aero.aixm.AbstractGroundLightSystemType;
import aero.aixm.AbstractMarkingType;
import aero.aixm.AbstractNavaidEquipmentType;
import aero.aixm.AbstractNavigationSystemCheckpointType;
import aero.aixm.AbstractProcedureType;
import aero.aixm.AbstractRadarEquipmentType;
import aero.aixm.AbstractSegmentLegType;
import aero.aixm.AbstractServiceType;
import aero.aixm.AbstractSurveillanceRadarType;
import aero.aixm.AbstractTrafficSeparationServiceType;
import aero.aixm.AerialRefuellingType;
import aero.aixm.AeronauticalGroundLightType;
import aero.aixm.AirTrafficControlServiceType;
import aero.aixm.AirTrafficManagementServiceType;
import aero.aixm.AircraftGroundServiceType;
import aero.aixm.AircraftStandType;
import aero.aixm.AirportClearanceServiceType;
import aero.aixm.AirportHeliportCollocationType;
import aero.aixm.AirportHeliportType;
import aero.aixm.AirportHotSpotType;
import aero.aixm.AirportProtectionAreaMarkingType;
import aero.aixm.AirportSuppliesServiceType;
import aero.aixm.AirspaceBorderCrossingType;
import aero.aixm.AirspaceType;
import aero.aixm.AltimeterSourceType;
import aero.aixm.AngleIndicationType;
import aero.aixm.ApproachLightingSystemType;
import aero.aixm.ApronElementType;
import aero.aixm.ApronLightSystemType;
import aero.aixm.ApronMarkingType;
import aero.aixm.ApronType;
import aero.aixm.ArrestingGearType;
import aero.aixm.ArrivalFeederLegType;
import aero.aixm.ArrivalLegType;
import aero.aixm.AuthorityForAirspaceType;
import aero.aixm.AzimuthType;
import aero.aixm.ChangeOverPointType;
import aero.aixm.CheckpointINSType;
import aero.aixm.CheckpointVORType;
import aero.aixm.CirclingAreaType;
import aero.aixm.DMEType;
import aero.aixm.DeicingAreaMarkingType;
import aero.aixm.DeicingAreaType;
import aero.aixm.DepartureLegType;
import aero.aixm.DesignatedPointType;
import aero.aixm.DirectionFinderType;
import aero.aixm.DistanceIndicationType;
import aero.aixm.ElevatedCurveType;
import aero.aixm.ElevatedPointType;
import aero.aixm.ElevatedSurfaceType;
import aero.aixm.ElevationType;
import aero.aixm.FinalLegType;
import aero.aixm.FireFightingServiceType;
import aero.aixm.FlightRestrictionType;
import aero.aixm.FloatingDockSiteType;
import aero.aixm.GeoBorderType;
import aero.aixm.GlidepathType;
import aero.aixm.GroundTrafficControlServiceType;
import aero.aixm.GuidanceLineLightSystemType;
import aero.aixm.GuidanceLineMarkingType;
import aero.aixm.GuidanceLineType;
import aero.aixm.HoldingAssessmentType;
import aero.aixm.HoldingPatternType;
import aero.aixm.InformationServiceType;
import aero.aixm.InitialLegType;
import aero.aixm.InstrumentApproachProcedureType;
import aero.aixm.IntermediateLegType;
import aero.aixm.LocalizerType;
import aero.aixm.MarkerBeaconType;
import aero.aixm.MarkingBuoyType;
import aero.aixm.MissedApproachLegType;
import aero.aixm.NDBType;
import aero.aixm.NavaidType;
import aero.aixm.NavigationAreaRestrictionType;
import aero.aixm.NavigationAreaType;
import aero.aixm.NonMovementAreaType;
import aero.aixm.ObstacleAreaType;
import aero.aixm.OrganisationAuthorityType;
import aero.aixm.PassengerLoadingBridgeType;
import aero.aixm.PassengerServiceType;
import aero.aixm.PilotControlledLightingType;
import aero.aixm.PrecisionApproachRadarType;
import aero.aixm.PrimarySurveillanceRadarType;
import aero.aixm.ProcedureDMEType;
import aero.aixm.RadarSystemType;
import aero.aixm.RadioCommunicationChannelType;
import aero.aixm.RadioFrequencyAreaType;
import aero.aixm.RoadType;
import aero.aixm.RouteDMEType;
import aero.aixm.RouteSegmentType;
import aero.aixm.RouteType;
import aero.aixm.RulesProceduresType;
import aero.aixm.RunwayBlastPadType;
import aero.aixm.RunwayCentrelinePointType;
import aero.aixm.RunwayDirectionLightSystemType;
import aero.aixm.RunwayDirectionType;
import aero.aixm.RunwayElementType;
import aero.aixm.RunwayMarkingType;
import aero.aixm.RunwayProtectAreaLightSystemType;
import aero.aixm.RunwayProtectAreaType;
import aero.aixm.RunwayType;
import aero.aixm.RunwayVisualRangeType;
import aero.aixm.SDFType;
import aero.aixm.SafeAltitudeAreaType;
import aero.aixm.SeaplaneLandingAreaType;
import aero.aixm.SeaplaneRampSiteType;
import aero.aixm.SearchRescueServiceType;
import aero.aixm.SecondarySurveillanceRadarType;
import aero.aixm.SignificantPointInAirspaceType;
import aero.aixm.SpecialDateType;
import aero.aixm.SpecialNavigationStationType;
import aero.aixm.SpecialNavigationSystemType;
import aero.aixm.StandMarkingType;
import aero.aixm.StandardInstrumentArrivalType;
import aero.aixm.StandardInstrumentDepartureType;
import aero.aixm.StandardLevelColumnType;
import aero.aixm.StandardLevelSectorType;
import aero.aixm.StandardLevelTableType;
import aero.aixm.SurveyControlPointType;
import aero.aixm.TACANType;
import aero.aixm.TaxiHoldingPositionLightSystemType;
import aero.aixm.TaxiHoldingPositionMarkingType;
import aero.aixm.TaxiHoldingPositionType;
import aero.aixm.TaxiwayElementType;
import aero.aixm.TaxiwayLightSystemType;
import aero.aixm.TaxiwayMarkingType;
import aero.aixm.TaxiwayType;
import aero.aixm.TerminalArrivalAreaType;
import aero.aixm.TouchDownLiftOffLightSystemType;
import aero.aixm.TouchDownLiftOffMarkingType;
import aero.aixm.TouchDownLiftOffSafeAreaType;
import aero.aixm.TouchDownLiftOffType;
import aero.aixm.UnitType;
import aero.aixm.UnplannedHoldingType;
import aero.aixm.VORType;
import aero.aixm.VerticalStructureType;
import aero.aixm.VisualGlideSlopeIndicatorType;
import aero.aixm.WorkAreaType;
import aero.aixm.event.EventType;
import aero.aixm.message.AIXMBasicMessageType;
import org.w3.xlink.v1999.ActuateType;
import org.w3.xlink.v1999.ShowType;
import org.w3.xlink.v1999.TypeType;


/**
 * <p>Java-Klasse f�r TargetPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TargetPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractFeature"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractGeometry"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetPropertyType", propOrder = {
    "abstractFeature",
    "abstractGeometry"
})
public class TargetPropertyType {

    @XmlElementRef(name = "AbstractFeature", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractFeatureType> abstractFeature;
    @XmlElementRef(name = "AbstractGeometry", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractGeometryType> abstractGeometry;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;
    @XmlAttribute(name = "nilReason")
    protected List<String> nilReason;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String titleAttribute;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Ruft den Wert der abstractFeature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GuidanceLineLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportSuppliesServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WorkAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurveyControlPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AeronauticalGroundLightType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FloatingDockSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntermediateLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MissedApproachLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NonMovementAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractRadarEquipmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArrestingGearType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TerminalArrivalAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerLoadingBridgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AngleIndicationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DepartureLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardLevelSectorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectionFinderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObstacleAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportCollocationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlightRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAirportGroundServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeicingAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractProcedureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayVisualRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FireFightingServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioFrequencyAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDepartureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeaplaneRampSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialDateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FinalLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSegmentLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayBlastPadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PilotControlledLightingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiHoldingPositionMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarkingBuoyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractNavaidEquipmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractApproachLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadarSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftStandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AIXMBasicMessageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SearchRescueServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeoBorderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroundTrafficControlServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnplannedHoldingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHotSpotType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayProtectAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrecisionApproachRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigationAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SDFType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VORType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSurveillanceRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayProtectAreaLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApproachLightingSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftGroundServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RulesProceduresType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AzimuthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CirclingAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcedureDMEType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractNavigationSystemCheckpointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteDMEType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportClearanceServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChangeOverPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteSegmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoldingAssessmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GuidanceLineType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GlidepathType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardLevelColumnType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArrivalFeederLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SafeAltitudeAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirTrafficManagementServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityForAirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoldingPatternType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffSafeAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarkerBeaconType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GuidanceLineMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InitialLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltimeterSourceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimarySurveillanceRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceIndicationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TACANType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DesignatedPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAirportHeliportProtectionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArrivalLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGroundLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardLevelTableType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CheckpointVORType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirTrafficControlServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationChannelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractTrafficSeparationServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NDBType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EventType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiHoldingPositionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CheckpointINSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DMEType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeicingAreaMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiHoldingPositionLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InformationServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractFeatureType> getAbstractFeature() {
        return abstractFeature;
    }

    /**
     * Legt den Wert der abstractFeature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GuidanceLineLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportSuppliesServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WorkAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurveyControlPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AeronauticalGroundLightType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FloatingDockSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntermediateLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MissedApproachLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NonMovementAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractRadarEquipmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArrestingGearType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TerminalArrivalAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerLoadingBridgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AngleIndicationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DepartureLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardLevelSectorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectionFinderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObstacleAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportCollocationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlightRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAirportGroundServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeicingAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractProcedureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayVisualRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FireFightingServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioFrequencyAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDepartureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeaplaneRampSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialDateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FinalLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSegmentLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayBlastPadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PilotControlledLightingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiHoldingPositionMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarkingBuoyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractNavaidEquipmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractApproachLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadarSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftStandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AIXMBasicMessageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SearchRescueServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeoBorderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroundTrafficControlServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnplannedHoldingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHotSpotType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayProtectAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrecisionApproachRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalizerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigationAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SDFType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VORType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSurveillanceRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayProtectAreaLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApproachLightingSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftGroundServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RulesProceduresType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AzimuthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CirclingAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcedureDMEType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractNavigationSystemCheckpointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteDMEType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportClearanceServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChangeOverPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteSegmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoldingAssessmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GuidanceLineType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GlidepathType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardLevelColumnType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArrivalFeederLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SafeAltitudeAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirTrafficManagementServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityForAirspaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HoldingPatternType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffSafeAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarkerBeaconType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GuidanceLineMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InitialLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltimeterSourceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimarySurveillanceRadarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceIndicationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TACANType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DesignatedPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAirportHeliportProtectionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ArrivalLegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGroundLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardLevelTableType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CheckpointVORType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirTrafficControlServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationChannelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractTrafficSeparationServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NDBType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EventType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiHoldingPositionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CheckpointINSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DMEType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeicingAreaMarkingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiHoldingPositionLightSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InformationServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     *     
     */
    public void setAbstractFeature(JAXBElement<? extends AbstractFeatureType> value) {
        this.abstractFeature = value;
    }

    /**
     * Ruft den Wert der abstractGeometry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevatedPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeometricComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link aero.aixm.SurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GridType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.gml.SurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.gml.CurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.gml.PointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link aero.aixm.CurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiSolidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevatedCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TinType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.gml.SurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RectifiedGridType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.gml.SurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link aero.aixm.PointType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractGeometryType> getAbstractGeometry() {
        return abstractGeometry;
    }

    /**
     * Legt den Wert der abstractGeometry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevatedPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeometricComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link aero.aixm.SurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GridType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.gml.SurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.gml.CurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.gml.PointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link aero.aixm.CurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiSolidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevatedCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TinType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.gml.SurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RectifiedGridType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.gml.SurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link aero.aixm.PointType }{@code >}
     *     
     */
    public void setAbstractGeometry(JAXBElement<? extends AbstractGeometryType> value) {
        this.abstractGeometry = value;
    }

    /**
     * Ruft den Wert der owns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Legt den Wert der owns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(java.lang.Boolean value) {
        this.owns = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    /**
     * Ruft den Wert der remoteSchema-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Legt den Wert der remoteSchema-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der href-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Legt den Wert der href-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Ruft den Wert der role-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Legt den Wert der role-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Ruft den Wert der arcrole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Legt den Wert der arcrole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Ruft den Wert der titleAttribute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleAttribute() {
        return titleAttribute;
    }

    /**
     * Legt den Wert der titleAttribute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleAttribute(String value) {
        this.titleAttribute = value;
    }

    /**
     * Ruft den Wert der show-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Legt den Wert der show-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    /**
     * Ruft den Wert der actuate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Legt den Wert der actuate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

}
