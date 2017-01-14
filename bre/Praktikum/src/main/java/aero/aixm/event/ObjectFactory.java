//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package aero.aixm.event;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import aero.aixm.AbstractExtensionType;
import aero.aixm.CodeLanguageType;
import aero.aixm.CodeUpperAlphaType;
import aero.aixm.DateTimeType;
import aero.aixm.DateYearType;
import aero.aixm.NoNumberType;
import aero.aixm.TextDesignatorType;
import aero.aixm.TextNameType;
import aero.aixm.UnitPropertyType;
import aero.aixm.XHTMLType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aero.aixm.event package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Event_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "Event");
    private final static QName _EventTimeSlice_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "EventTimeSlice");
    private final static QName _AbstractEventExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AbstractEventExtension");
    private final static QName _NOTAM_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "NOTAM");
    private final static QName _AbstractNOTAMExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AbstractNOTAMExtension");
    private final static QName _AISPublication_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AIS_Publication");
    private final static QName _AbstractAISPublicationExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AbstractAIS_PublicationExtension");
    private final static QName _NOTAMTranslation_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "NOTAMTranslation");
    private final static QName _AbstractNOTAMTranslationExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AbstractNOTAMTranslationExtension");
    private final static QName _RunwayProtectAreaExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RunwayProtectAreaExtension");
    private final static QName _RunwayDirectionExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RunwayDirectionExtension");
    private final static QName _RunwayCentrelinePointExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RunwayCentrelinePointExtension");
    private final static QName _RunwayExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RunwayExtension");
    private final static QName _ArrestingGearExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ArrestingGearExtension");
    private final static QName _RunwayElementExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RunwayElementExtension");
    private final static QName _VisualGlideSlopeIndicatorExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "VisualGlideSlopeIndicatorExtension");
    private final static QName _RunwayVisualRangeExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RunwayVisualRangeExtension");
    private final static QName _RunwayBlastPadExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RunwayBlastPadExtension");
    private final static QName _TaxiHoldingPositionExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TaxiHoldingPositionExtension");
    private final static QName _TaxiwayExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TaxiwayExtension");
    private final static QName _TaxiwayElementExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TaxiwayElementExtension");
    private final static QName _GuidanceLineExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "GuidanceLineExtension");
    private final static QName _ApronExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ApronExtension");
    private final static QName _ApronElementExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ApronElementExtension");
    private final static QName _AircraftStandExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AircraftStandExtension");
    private final static QName _RoadExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RoadExtension");
    private final static QName _DeicingAreaExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "DeicingAreaExtension");
    private final static QName _PassengerLoadingBridgeExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "PassengerLoadingBridgeExtension");
    private final static QName _TouchDownLiftOffSafeAreaExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TouchDownLiftOffSafeAreaExtension");
    private final static QName _TouchDownLiftOffExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TouchDownLiftOffExtension");
    private final static QName _GroundLightSystemExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "GroundLightSystemExtension");
    private final static QName _ApronLightSystemExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ApronLightSystemExtension");
    private final static QName _TaxiwayLightSystemExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TaxiwayLightSystemExtension");
    private final static QName _RunwayDirectionLightSystemExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RunwayDirectionLightSystemExtension");
    private final static QName _TouchDownLiftOffLightSystemExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TouchDownLiftOffLightSystemExtension");
    private final static QName _GuidanceLineLightSystemExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "GuidanceLineLightSystemExtension");
    private final static QName _RunwayProtectAreaLightSystemExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RunwayProtectAreaLightSystemExtension");
    private final static QName _TaxiHoldingPositionLightSystemExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TaxiHoldingPositionLightSystemExtension");
    private final static QName _ApproachLightingSystemExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ApproachLightingSystemExtension");
    private final static QName _MarkingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "MarkingExtension");
    private final static QName _TaxiwayMarkingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TaxiwayMarkingExtension");
    private final static QName _ApronMarkingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ApronMarkingExtension");
    private final static QName _AirportProtectionAreaMarkingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AirportProtectionAreaMarkingExtension");
    private final static QName _TouchDownLiftOffMarkingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TouchDownLiftOffMarkingExtension");
    private final static QName _RunwayMarkingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RunwayMarkingExtension");
    private final static QName _GuidanceLineMarkingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "GuidanceLineMarkingExtension");
    private final static QName _DeicingAreaMarkingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "DeicingAreaMarkingExtension");
    private final static QName _TaxiHoldingPositionMarkingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TaxiHoldingPositionMarkingExtension");
    private final static QName _StandMarkingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "StandMarkingExtension");
    private final static QName _FloatingDockSiteExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "FloatingDockSiteExtension");
    private final static QName _MarkingBuoyExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "MarkingBuoyExtension");
    private final static QName _SeaplaneLandingAreaExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "SeaplaneLandingAreaExtension");
    private final static QName _SeaplaneRampSiteExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "SeaplaneRampSiteExtension");
    private final static QName _WorkAreaExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "WorkAreaExtension");
    private final static QName _SurveyControlPointExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "SurveyControlPointExtension");
    private final static QName _NonMovementAreaExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "NonMovementAreaExtension");
    private final static QName _AirportHeliportProtectionAreaExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AirportHeliportProtectionAreaExtension");
    private final static QName _AirportHeliportCollocationExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AirportHeliportCollocationExtension");
    private final static QName _AirportHeliportExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AirportHeliportExtension");
    private final static QName _AltimeterSourceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AltimeterSourceExtension");
    private final static QName _AirportHotSpotExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AirportHotSpotExtension");
    private final static QName _AuthorityForAirspaceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AuthorityForAirspaceExtension");
    private final static QName _AirspaceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AirspaceExtension");
    private final static QName _GeoBorderExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "GeoBorderExtension");
    private final static QName _PrecisionApproachRadarExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "PrecisionApproachRadarExtension");
    private final static QName _PrimarySurveillanceRadarExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "PrimarySurveillanceRadarExtension");
    private final static QName _RadarEquipmentExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RadarEquipmentExtension");
    private final static QName _RadarSystemExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RadarSystemExtension");
    private final static QName _SecondarySurveillanceRadarExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "SecondarySurveillanceRadarExtension");
    private final static QName _SurveillanceRadarExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "SurveillanceRadarExtension");
    private final static QName _HoldingAssessmentExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "HoldingAssessmentExtension");
    private final static QName _StandardLevelTableExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "StandardLevelTableExtension");
    private final static QName _StandardLevelSectorExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "StandardLevelSectorExtension");
    private final static QName _StandardLevelColumnExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "StandardLevelColumnExtension");
    private final static QName _RadioFrequencyAreaExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RadioFrequencyAreaExtension");
    private final static QName _SpecialDateExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "SpecialDateExtension");
    private final static QName _ServiceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ServiceExtension");
    private final static QName _RadioCommunicationChannelExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RadioCommunicationChannelExtension");
    private final static QName _PilotControlledLightingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "PilotControlledLightingExtension");
    private final static QName _InformationServiceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "InformationServiceExtension");
    private final static QName _TrafficSeparationServiceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TrafficSeparationServiceExtension");
    private final static QName _GroundTrafficControlServiceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "GroundTrafficControlServiceExtension");
    private final static QName _AirTrafficControlServiceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AirTrafficControlServiceExtension");
    private final static QName _AirTrafficManagementServiceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AirTrafficManagementServiceExtension");
    private final static QName _SearchRescueServiceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "SearchRescueServiceExtension");
    private final static QName _AirportGroundServiceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AirportGroundServiceExtension");
    private final static QName _PassengerServiceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "PassengerServiceExtension");
    private final static QName _AircraftGroundServiceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AircraftGroundServiceExtension");
    private final static QName _FireFightingServiceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "FireFightingServiceExtension");
    private final static QName _AirportClearanceServiceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AirportClearanceServiceExtension");
    private final static QName _AirportSuppliesServiceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AirportSuppliesServiceExtension");
    private final static QName _AngleIndicationExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AngleIndicationExtension");
    private final static QName _DistanceIndicationExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "DistanceIndicationExtension");
    private final static QName _AzimuthExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AzimuthExtension");
    private final static QName _CheckpointINSExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "CheckpointINSExtension");
    private final static QName _CheckpointVORExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "CheckpointVORExtension");
    private final static QName _DMEExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "DMEExtension");
    private final static QName _ElevationExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ElevationExtension");
    private final static QName _GlidepathExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "GlidepathExtension");
    private final static QName _LocalizerExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "LocalizerExtension");
    private final static QName _MarkerBeaconExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "MarkerBeaconExtension");
    private final static QName _NavaidExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "NavaidExtension");
    private final static QName _NavaidEquipmentExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "NavaidEquipmentExtension");
    private final static QName _NavigationSystemCheckpointExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "NavigationSystemCheckpointExtension");
    private final static QName _SDFExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "SDFExtension");
    private final static QName _NDBExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "NDBExtension");
    private final static QName _SpecialNavigationStationExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "SpecialNavigationStationExtension");
    private final static QName _VORExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "VORExtension");
    private final static QName _TACANExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TACANExtension");
    private final static QName _SpecialNavigationSystemExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "SpecialNavigationSystemExtension");
    private final static QName _DirectionFinderExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "DirectionFinderExtension");
    private final static QName _DesignatedPointExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "DesignatedPointExtension");
    private final static QName _SignificantPointInAirspaceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "SignificantPointInAirspaceExtension");
    private final static QName _AeronauticalGroundLightExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AeronauticalGroundLightExtension");
    private final static QName _OrganisationAuthorityExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "OrganisationAuthorityExtension");
    private final static QName _UnitExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "UnitExtension");
    private final static QName _ObstacleAreaExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ObstacleAreaExtension");
    private final static QName _VerticalStructureExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "VerticalStructureExtension");
    private final static QName _CirclingAreaExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "CirclingAreaExtension");
    private final static QName _TerminalArrivalAreaExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "TerminalArrivalAreaExtension");
    private final static QName _InstrumentApproachProcedureExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "InstrumentApproachProcedureExtension");
    private final static QName _StandardInstrumentDepartureExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "StandardInstrumentDepartureExtension");
    private final static QName _NavigationAreaExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "NavigationAreaExtension");
    private final static QName _StandardInstrumentArrivalExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "StandardInstrumentArrivalExtension");
    private final static QName _ProcedureExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ProcedureExtension");
    private final static QName _NavigationAreaRestrictionExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "NavigationAreaRestrictionExtension");
    private final static QName _SegmentLegExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "SegmentLegExtension");
    private final static QName _ApproachLegExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ApproachLegExtension");
    private final static QName _ArrivalFeederLegExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ArrivalFeederLegExtension");
    private final static QName _ArrivalLegExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ArrivalLegExtension");
    private final static QName _DepartureLegExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "DepartureLegExtension");
    private final static QName _FinalLegExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "FinalLegExtension");
    private final static QName _InitialLegExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "InitialLegExtension");
    private final static QName _IntermediateLegExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "IntermediateLegExtension");
    private final static QName _MissedApproachLegExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "MissedApproachLegExtension");
    private final static QName _ProcedureDMEExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ProcedureDMEExtension");
    private final static QName _SafeAltitudeAreaExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "SafeAltitudeAreaExtension");
    private final static QName _HoldingPatternExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "HoldingPatternExtension");
    private final static QName _UnplannedHoldingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "UnplannedHoldingExtension");
    private final static QName _AirspaceBorderCrossingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AirspaceBorderCrossingExtension");
    private final static QName _FlightRestrictionExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "FlightRestrictionExtension");
    private final static QName _RouteSegmentExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RouteSegmentExtension");
    private final static QName _RouteDMEExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RouteDMEExtension");
    private final static QName _RouteExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RouteExtension");
    private final static QName _ChangeOverPointExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "ChangeOverPointExtension");
    private final static QName _AerialRefuellingExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "AerialRefuellingExtension");
    private final static QName _RulesProceduresExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "RulesProceduresExtension");
    private final static QName _NOTAMTranslationTypeType_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "type");
    private final static QName _NOTAMTranslationTypeLanguage_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "language");
    private final static QName _NOTAMTranslationTypeSimpleText_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "simpleText");
    private final static QName _NOTAMTranslationTypeFormattedText_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "formattedText");
    private final static QName _AISPublicationTypeSeries_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "series");
    private final static QName _AISPublicationTypeNumber_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "number");
    private final static QName _AISPublicationTypeYear_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "year");
    private final static QName _AISPublicationTypeIssued_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "issued");
    private final static QName _AISPublicationTypeEffectiveStart_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "effectiveStart");
    private final static QName _AISPublicationTypeEffectiveEnd_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "effectiveEnd");
    private final static QName _AISPublicationTypeContent_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "content");
    private final static QName _AISPublicationTypePublisher_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "publisher");
    private final static QName _NOTAMTypeReferredSeries_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "referredSeries");
    private final static QName _NOTAMTypeReferredNumber_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "referredNumber");
    private final static QName _NOTAMTypeReferredYear_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "referredYear");
    private final static QName _NOTAMTypeAffectedFIR_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "affectedFIR");
    private final static QName _NOTAMTypeSelectionCode_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "selectionCode");
    private final static QName _NOTAMTypeTraffic_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "traffic");
    private final static QName _NOTAMTypePurpose_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "purpose");
    private final static QName _NOTAMTypeScope_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "scope");
    private final static QName _NOTAMTypeMinimumFL_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "minimumFL");
    private final static QName _NOTAMTypeMaximumFL_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "maximumFL");
    private final static QName _NOTAMTypeCoordinates_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "coordinates");
    private final static QName _NOTAMTypeRadius_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "radius");
    private final static QName _NOTAMTypeLocation_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "location");
    private final static QName _NOTAMTypeSchedule_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "schedule");
    private final static QName _NOTAMTypeText_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "text");
    private final static QName _NOTAMTypeLowerLimit_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "lowerLimit");
    private final static QName _NOTAMTypeUpperLimit_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "upperLimit");
    private final static QName _NOTAMTypePublisherNOF_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "publisherNOF");
    private final static QName _EventTimeSliceTypeName_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "name");
    private final static QName _EventTimeSliceTypeEncoding_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "encoding");
    private final static QName _EventTimeSliceTypeScenario_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "scenario");
    private final static QName _EventTimeSliceTypeVersion_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "version");
    private final static QName _EventTimeSliceTypeRevision_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "revision");
    private final static QName _EventTimeSliceTypeCauseEvent_QNAME = new QName("http://www.aixm.aero/schema/5.1/event", "causeEvent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aero.aixm.event
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NOTAMTranslationType }
     * 
     */
    public NOTAMTranslationType createNOTAMTranslationType() {
        return new NOTAMTranslationType();
    }

    /**
     * Create an instance of {@link AISPublicationType }
     * 
     */
    public AISPublicationType createAISPublicationType() {
        return new AISPublicationType();
    }

    /**
     * Create an instance of {@link NOTAMType }
     * 
     */
    public NOTAMType createNOTAMType() {
        return new NOTAMType();
    }

    /**
     * Create an instance of {@link EventTimeSliceType }
     * 
     */
    public EventTimeSliceType createEventTimeSliceType() {
        return new EventTimeSliceType();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link RunwayProtectAreaExtensionType }
     * 
     */
    public RunwayProtectAreaExtensionType createRunwayProtectAreaExtensionType() {
        return new RunwayProtectAreaExtensionType();
    }

    /**
     * Create an instance of {@link RunwayDirectionExtensionType }
     * 
     */
    public RunwayDirectionExtensionType createRunwayDirectionExtensionType() {
        return new RunwayDirectionExtensionType();
    }

    /**
     * Create an instance of {@link RunwayCentrelinePointExtensionType }
     * 
     */
    public RunwayCentrelinePointExtensionType createRunwayCentrelinePointExtensionType() {
        return new RunwayCentrelinePointExtensionType();
    }

    /**
     * Create an instance of {@link RunwayExtensionType }
     * 
     */
    public RunwayExtensionType createRunwayExtensionType() {
        return new RunwayExtensionType();
    }

    /**
     * Create an instance of {@link ArrestingGearExtensionType }
     * 
     */
    public ArrestingGearExtensionType createArrestingGearExtensionType() {
        return new ArrestingGearExtensionType();
    }

    /**
     * Create an instance of {@link RunwayElementExtensionType }
     * 
     */
    public RunwayElementExtensionType createRunwayElementExtensionType() {
        return new RunwayElementExtensionType();
    }

    /**
     * Create an instance of {@link VisualGlideSlopeIndicatorExtensionType }
     * 
     */
    public VisualGlideSlopeIndicatorExtensionType createVisualGlideSlopeIndicatorExtensionType() {
        return new VisualGlideSlopeIndicatorExtensionType();
    }

    /**
     * Create an instance of {@link RunwayVisualRangeExtensionType }
     * 
     */
    public RunwayVisualRangeExtensionType createRunwayVisualRangeExtensionType() {
        return new RunwayVisualRangeExtensionType();
    }

    /**
     * Create an instance of {@link RunwayBlastPadExtensionType }
     * 
     */
    public RunwayBlastPadExtensionType createRunwayBlastPadExtensionType() {
        return new RunwayBlastPadExtensionType();
    }

    /**
     * Create an instance of {@link TaxiHoldingPositionExtensionType }
     * 
     */
    public TaxiHoldingPositionExtensionType createTaxiHoldingPositionExtensionType() {
        return new TaxiHoldingPositionExtensionType();
    }

    /**
     * Create an instance of {@link TaxiwayExtensionType }
     * 
     */
    public TaxiwayExtensionType createTaxiwayExtensionType() {
        return new TaxiwayExtensionType();
    }

    /**
     * Create an instance of {@link TaxiwayElementExtensionType }
     * 
     */
    public TaxiwayElementExtensionType createTaxiwayElementExtensionType() {
        return new TaxiwayElementExtensionType();
    }

    /**
     * Create an instance of {@link GuidanceLineExtensionType }
     * 
     */
    public GuidanceLineExtensionType createGuidanceLineExtensionType() {
        return new GuidanceLineExtensionType();
    }

    /**
     * Create an instance of {@link ApronExtensionType }
     * 
     */
    public ApronExtensionType createApronExtensionType() {
        return new ApronExtensionType();
    }

    /**
     * Create an instance of {@link ApronElementExtensionType }
     * 
     */
    public ApronElementExtensionType createApronElementExtensionType() {
        return new ApronElementExtensionType();
    }

    /**
     * Create an instance of {@link AircraftStandExtensionType }
     * 
     */
    public AircraftStandExtensionType createAircraftStandExtensionType() {
        return new AircraftStandExtensionType();
    }

    /**
     * Create an instance of {@link RoadExtensionType }
     * 
     */
    public RoadExtensionType createRoadExtensionType() {
        return new RoadExtensionType();
    }

    /**
     * Create an instance of {@link DeicingAreaExtensionType }
     * 
     */
    public DeicingAreaExtensionType createDeicingAreaExtensionType() {
        return new DeicingAreaExtensionType();
    }

    /**
     * Create an instance of {@link PassengerLoadingBridgeExtensionType }
     * 
     */
    public PassengerLoadingBridgeExtensionType createPassengerLoadingBridgeExtensionType() {
        return new PassengerLoadingBridgeExtensionType();
    }

    /**
     * Create an instance of {@link TouchDownLiftOffSafeAreaExtensionType }
     * 
     */
    public TouchDownLiftOffSafeAreaExtensionType createTouchDownLiftOffSafeAreaExtensionType() {
        return new TouchDownLiftOffSafeAreaExtensionType();
    }

    /**
     * Create an instance of {@link TouchDownLiftOffExtensionType }
     * 
     */
    public TouchDownLiftOffExtensionType createTouchDownLiftOffExtensionType() {
        return new TouchDownLiftOffExtensionType();
    }

    /**
     * Create an instance of {@link GroundLightSystemExtensionType }
     * 
     */
    public GroundLightSystemExtensionType createGroundLightSystemExtensionType() {
        return new GroundLightSystemExtensionType();
    }

    /**
     * Create an instance of {@link ApronLightSystemExtensionType }
     * 
     */
    public ApronLightSystemExtensionType createApronLightSystemExtensionType() {
        return new ApronLightSystemExtensionType();
    }

    /**
     * Create an instance of {@link TaxiwayLightSystemExtensionType }
     * 
     */
    public TaxiwayLightSystemExtensionType createTaxiwayLightSystemExtensionType() {
        return new TaxiwayLightSystemExtensionType();
    }

    /**
     * Create an instance of {@link RunwayDirectionLightSystemExtensionType }
     * 
     */
    public RunwayDirectionLightSystemExtensionType createRunwayDirectionLightSystemExtensionType() {
        return new RunwayDirectionLightSystemExtensionType();
    }

    /**
     * Create an instance of {@link TouchDownLiftOffLightSystemExtensionType }
     * 
     */
    public TouchDownLiftOffLightSystemExtensionType createTouchDownLiftOffLightSystemExtensionType() {
        return new TouchDownLiftOffLightSystemExtensionType();
    }

    /**
     * Create an instance of {@link GuidanceLineLightSystemExtensionType }
     * 
     */
    public GuidanceLineLightSystemExtensionType createGuidanceLineLightSystemExtensionType() {
        return new GuidanceLineLightSystemExtensionType();
    }

    /**
     * Create an instance of {@link RunwayProtectAreaLightSystemExtensionType }
     * 
     */
    public RunwayProtectAreaLightSystemExtensionType createRunwayProtectAreaLightSystemExtensionType() {
        return new RunwayProtectAreaLightSystemExtensionType();
    }

    /**
     * Create an instance of {@link TaxiHoldingPositionLightSystemExtensionType }
     * 
     */
    public TaxiHoldingPositionLightSystemExtensionType createTaxiHoldingPositionLightSystemExtensionType() {
        return new TaxiHoldingPositionLightSystemExtensionType();
    }

    /**
     * Create an instance of {@link ApproachLightingSystemExtensionType }
     * 
     */
    public ApproachLightingSystemExtensionType createApproachLightingSystemExtensionType() {
        return new ApproachLightingSystemExtensionType();
    }

    /**
     * Create an instance of {@link MarkingExtensionType }
     * 
     */
    public MarkingExtensionType createMarkingExtensionType() {
        return new MarkingExtensionType();
    }

    /**
     * Create an instance of {@link TaxiwayMarkingExtensionType }
     * 
     */
    public TaxiwayMarkingExtensionType createTaxiwayMarkingExtensionType() {
        return new TaxiwayMarkingExtensionType();
    }

    /**
     * Create an instance of {@link ApronMarkingExtensionType }
     * 
     */
    public ApronMarkingExtensionType createApronMarkingExtensionType() {
        return new ApronMarkingExtensionType();
    }

    /**
     * Create an instance of {@link AirportProtectionAreaMarkingExtensionType }
     * 
     */
    public AirportProtectionAreaMarkingExtensionType createAirportProtectionAreaMarkingExtensionType() {
        return new AirportProtectionAreaMarkingExtensionType();
    }

    /**
     * Create an instance of {@link TouchDownLiftOffMarkingExtensionType }
     * 
     */
    public TouchDownLiftOffMarkingExtensionType createTouchDownLiftOffMarkingExtensionType() {
        return new TouchDownLiftOffMarkingExtensionType();
    }

    /**
     * Create an instance of {@link RunwayMarkingExtensionType }
     * 
     */
    public RunwayMarkingExtensionType createRunwayMarkingExtensionType() {
        return new RunwayMarkingExtensionType();
    }

    /**
     * Create an instance of {@link GuidanceLineMarkingExtensionType }
     * 
     */
    public GuidanceLineMarkingExtensionType createGuidanceLineMarkingExtensionType() {
        return new GuidanceLineMarkingExtensionType();
    }

    /**
     * Create an instance of {@link DeicingAreaMarkingExtensionType }
     * 
     */
    public DeicingAreaMarkingExtensionType createDeicingAreaMarkingExtensionType() {
        return new DeicingAreaMarkingExtensionType();
    }

    /**
     * Create an instance of {@link TaxiHoldingPositionMarkingExtensionType }
     * 
     */
    public TaxiHoldingPositionMarkingExtensionType createTaxiHoldingPositionMarkingExtensionType() {
        return new TaxiHoldingPositionMarkingExtensionType();
    }

    /**
     * Create an instance of {@link StandMarkingExtensionType }
     * 
     */
    public StandMarkingExtensionType createStandMarkingExtensionType() {
        return new StandMarkingExtensionType();
    }

    /**
     * Create an instance of {@link FloatingDockSiteExtensionType }
     * 
     */
    public FloatingDockSiteExtensionType createFloatingDockSiteExtensionType() {
        return new FloatingDockSiteExtensionType();
    }

    /**
     * Create an instance of {@link MarkingBuoyExtensionType }
     * 
     */
    public MarkingBuoyExtensionType createMarkingBuoyExtensionType() {
        return new MarkingBuoyExtensionType();
    }

    /**
     * Create an instance of {@link SeaplaneLandingAreaExtensionType }
     * 
     */
    public SeaplaneLandingAreaExtensionType createSeaplaneLandingAreaExtensionType() {
        return new SeaplaneLandingAreaExtensionType();
    }

    /**
     * Create an instance of {@link SeaplaneRampSiteExtensionType }
     * 
     */
    public SeaplaneRampSiteExtensionType createSeaplaneRampSiteExtensionType() {
        return new SeaplaneRampSiteExtensionType();
    }

    /**
     * Create an instance of {@link WorkAreaExtensionType }
     * 
     */
    public WorkAreaExtensionType createWorkAreaExtensionType() {
        return new WorkAreaExtensionType();
    }

    /**
     * Create an instance of {@link SurveyControlPointExtensionType }
     * 
     */
    public SurveyControlPointExtensionType createSurveyControlPointExtensionType() {
        return new SurveyControlPointExtensionType();
    }

    /**
     * Create an instance of {@link NonMovementAreaExtensionType }
     * 
     */
    public NonMovementAreaExtensionType createNonMovementAreaExtensionType() {
        return new NonMovementAreaExtensionType();
    }

    /**
     * Create an instance of {@link AirportHeliportProtectionAreaExtensionType }
     * 
     */
    public AirportHeliportProtectionAreaExtensionType createAirportHeliportProtectionAreaExtensionType() {
        return new AirportHeliportProtectionAreaExtensionType();
    }

    /**
     * Create an instance of {@link AirportHeliportCollocationExtensionType }
     * 
     */
    public AirportHeliportCollocationExtensionType createAirportHeliportCollocationExtensionType() {
        return new AirportHeliportCollocationExtensionType();
    }

    /**
     * Create an instance of {@link AirportHeliportExtensionType }
     * 
     */
    public AirportHeliportExtensionType createAirportHeliportExtensionType() {
        return new AirportHeliportExtensionType();
    }

    /**
     * Create an instance of {@link AltimeterSourceExtensionType }
     * 
     */
    public AltimeterSourceExtensionType createAltimeterSourceExtensionType() {
        return new AltimeterSourceExtensionType();
    }

    /**
     * Create an instance of {@link AirportHotSpotExtensionType }
     * 
     */
    public AirportHotSpotExtensionType createAirportHotSpotExtensionType() {
        return new AirportHotSpotExtensionType();
    }

    /**
     * Create an instance of {@link AuthorityForAirspaceExtensionType }
     * 
     */
    public AuthorityForAirspaceExtensionType createAuthorityForAirspaceExtensionType() {
        return new AuthorityForAirspaceExtensionType();
    }

    /**
     * Create an instance of {@link AirspaceExtensionType }
     * 
     */
    public AirspaceExtensionType createAirspaceExtensionType() {
        return new AirspaceExtensionType();
    }

    /**
     * Create an instance of {@link GeoBorderExtensionType }
     * 
     */
    public GeoBorderExtensionType createGeoBorderExtensionType() {
        return new GeoBorderExtensionType();
    }

    /**
     * Create an instance of {@link PrecisionApproachRadarExtensionType }
     * 
     */
    public PrecisionApproachRadarExtensionType createPrecisionApproachRadarExtensionType() {
        return new PrecisionApproachRadarExtensionType();
    }

    /**
     * Create an instance of {@link PrimarySurveillanceRadarExtensionType }
     * 
     */
    public PrimarySurveillanceRadarExtensionType createPrimarySurveillanceRadarExtensionType() {
        return new PrimarySurveillanceRadarExtensionType();
    }

    /**
     * Create an instance of {@link RadarEquipmentExtensionType }
     * 
     */
    public RadarEquipmentExtensionType createRadarEquipmentExtensionType() {
        return new RadarEquipmentExtensionType();
    }

    /**
     * Create an instance of {@link RadarSystemExtensionType }
     * 
     */
    public RadarSystemExtensionType createRadarSystemExtensionType() {
        return new RadarSystemExtensionType();
    }

    /**
     * Create an instance of {@link SecondarySurveillanceRadarExtensionType }
     * 
     */
    public SecondarySurveillanceRadarExtensionType createSecondarySurveillanceRadarExtensionType() {
        return new SecondarySurveillanceRadarExtensionType();
    }

    /**
     * Create an instance of {@link SurveillanceRadarExtensionType }
     * 
     */
    public SurveillanceRadarExtensionType createSurveillanceRadarExtensionType() {
        return new SurveillanceRadarExtensionType();
    }

    /**
     * Create an instance of {@link HoldingAssessmentExtensionType }
     * 
     */
    public HoldingAssessmentExtensionType createHoldingAssessmentExtensionType() {
        return new HoldingAssessmentExtensionType();
    }

    /**
     * Create an instance of {@link StandardLevelTableExtensionType }
     * 
     */
    public StandardLevelTableExtensionType createStandardLevelTableExtensionType() {
        return new StandardLevelTableExtensionType();
    }

    /**
     * Create an instance of {@link StandardLevelSectorExtensionType }
     * 
     */
    public StandardLevelSectorExtensionType createStandardLevelSectorExtensionType() {
        return new StandardLevelSectorExtensionType();
    }

    /**
     * Create an instance of {@link StandardLevelColumnExtensionType }
     * 
     */
    public StandardLevelColumnExtensionType createStandardLevelColumnExtensionType() {
        return new StandardLevelColumnExtensionType();
    }

    /**
     * Create an instance of {@link RadioFrequencyAreaExtensionType }
     * 
     */
    public RadioFrequencyAreaExtensionType createRadioFrequencyAreaExtensionType() {
        return new RadioFrequencyAreaExtensionType();
    }

    /**
     * Create an instance of {@link SpecialDateExtensionType }
     * 
     */
    public SpecialDateExtensionType createSpecialDateExtensionType() {
        return new SpecialDateExtensionType();
    }

    /**
     * Create an instance of {@link ServiceExtensionType }
     * 
     */
    public ServiceExtensionType createServiceExtensionType() {
        return new ServiceExtensionType();
    }

    /**
     * Create an instance of {@link RadioCommunicationChannelExtensionType }
     * 
     */
    public RadioCommunicationChannelExtensionType createRadioCommunicationChannelExtensionType() {
        return new RadioCommunicationChannelExtensionType();
    }

    /**
     * Create an instance of {@link PilotControlledLightingExtensionType }
     * 
     */
    public PilotControlledLightingExtensionType createPilotControlledLightingExtensionType() {
        return new PilotControlledLightingExtensionType();
    }

    /**
     * Create an instance of {@link InformationServiceExtensionType }
     * 
     */
    public InformationServiceExtensionType createInformationServiceExtensionType() {
        return new InformationServiceExtensionType();
    }

    /**
     * Create an instance of {@link TrafficSeparationServiceExtensionType }
     * 
     */
    public TrafficSeparationServiceExtensionType createTrafficSeparationServiceExtensionType() {
        return new TrafficSeparationServiceExtensionType();
    }

    /**
     * Create an instance of {@link GroundTrafficControlServiceExtensionType }
     * 
     */
    public GroundTrafficControlServiceExtensionType createGroundTrafficControlServiceExtensionType() {
        return new GroundTrafficControlServiceExtensionType();
    }

    /**
     * Create an instance of {@link AirTrafficControlServiceExtensionType }
     * 
     */
    public AirTrafficControlServiceExtensionType createAirTrafficControlServiceExtensionType() {
        return new AirTrafficControlServiceExtensionType();
    }

    /**
     * Create an instance of {@link AirTrafficManagementServiceExtensionType }
     * 
     */
    public AirTrafficManagementServiceExtensionType createAirTrafficManagementServiceExtensionType() {
        return new AirTrafficManagementServiceExtensionType();
    }

    /**
     * Create an instance of {@link SearchRescueServiceExtensionType }
     * 
     */
    public SearchRescueServiceExtensionType createSearchRescueServiceExtensionType() {
        return new SearchRescueServiceExtensionType();
    }

    /**
     * Create an instance of {@link AirportGroundServiceExtensionType }
     * 
     */
    public AirportGroundServiceExtensionType createAirportGroundServiceExtensionType() {
        return new AirportGroundServiceExtensionType();
    }

    /**
     * Create an instance of {@link PassengerServiceExtensionType }
     * 
     */
    public PassengerServiceExtensionType createPassengerServiceExtensionType() {
        return new PassengerServiceExtensionType();
    }

    /**
     * Create an instance of {@link AircraftGroundServiceExtensionType }
     * 
     */
    public AircraftGroundServiceExtensionType createAircraftGroundServiceExtensionType() {
        return new AircraftGroundServiceExtensionType();
    }

    /**
     * Create an instance of {@link FireFightingServiceExtensionType }
     * 
     */
    public FireFightingServiceExtensionType createFireFightingServiceExtensionType() {
        return new FireFightingServiceExtensionType();
    }

    /**
     * Create an instance of {@link AirportClearanceServiceExtensionType }
     * 
     */
    public AirportClearanceServiceExtensionType createAirportClearanceServiceExtensionType() {
        return new AirportClearanceServiceExtensionType();
    }

    /**
     * Create an instance of {@link AirportSuppliesServiceExtensionType }
     * 
     */
    public AirportSuppliesServiceExtensionType createAirportSuppliesServiceExtensionType() {
        return new AirportSuppliesServiceExtensionType();
    }

    /**
     * Create an instance of {@link AngleIndicationExtensionType }
     * 
     */
    public AngleIndicationExtensionType createAngleIndicationExtensionType() {
        return new AngleIndicationExtensionType();
    }

    /**
     * Create an instance of {@link DistanceIndicationExtensionType }
     * 
     */
    public DistanceIndicationExtensionType createDistanceIndicationExtensionType() {
        return new DistanceIndicationExtensionType();
    }

    /**
     * Create an instance of {@link AzimuthExtensionType }
     * 
     */
    public AzimuthExtensionType createAzimuthExtensionType() {
        return new AzimuthExtensionType();
    }

    /**
     * Create an instance of {@link CheckpointINSExtensionType }
     * 
     */
    public CheckpointINSExtensionType createCheckpointINSExtensionType() {
        return new CheckpointINSExtensionType();
    }

    /**
     * Create an instance of {@link CheckpointVORExtensionType }
     * 
     */
    public CheckpointVORExtensionType createCheckpointVORExtensionType() {
        return new CheckpointVORExtensionType();
    }

    /**
     * Create an instance of {@link DMEExtensionType }
     * 
     */
    public DMEExtensionType createDMEExtensionType() {
        return new DMEExtensionType();
    }

    /**
     * Create an instance of {@link ElevationExtensionType }
     * 
     */
    public ElevationExtensionType createElevationExtensionType() {
        return new ElevationExtensionType();
    }

    /**
     * Create an instance of {@link GlidepathExtensionType }
     * 
     */
    public GlidepathExtensionType createGlidepathExtensionType() {
        return new GlidepathExtensionType();
    }

    /**
     * Create an instance of {@link LocalizerExtensionType }
     * 
     */
    public LocalizerExtensionType createLocalizerExtensionType() {
        return new LocalizerExtensionType();
    }

    /**
     * Create an instance of {@link MarkerBeaconExtensionType }
     * 
     */
    public MarkerBeaconExtensionType createMarkerBeaconExtensionType() {
        return new MarkerBeaconExtensionType();
    }

    /**
     * Create an instance of {@link NavaidExtensionType }
     * 
     */
    public NavaidExtensionType createNavaidExtensionType() {
        return new NavaidExtensionType();
    }

    /**
     * Create an instance of {@link NavaidEquipmentExtensionType }
     * 
     */
    public NavaidEquipmentExtensionType createNavaidEquipmentExtensionType() {
        return new NavaidEquipmentExtensionType();
    }

    /**
     * Create an instance of {@link NavigationSystemCheckpointExtensionType }
     * 
     */
    public NavigationSystemCheckpointExtensionType createNavigationSystemCheckpointExtensionType() {
        return new NavigationSystemCheckpointExtensionType();
    }

    /**
     * Create an instance of {@link SDFExtensionType }
     * 
     */
    public SDFExtensionType createSDFExtensionType() {
        return new SDFExtensionType();
    }

    /**
     * Create an instance of {@link NDBExtensionType }
     * 
     */
    public NDBExtensionType createNDBExtensionType() {
        return new NDBExtensionType();
    }

    /**
     * Create an instance of {@link SpecialNavigationStationExtensionType }
     * 
     */
    public SpecialNavigationStationExtensionType createSpecialNavigationStationExtensionType() {
        return new SpecialNavigationStationExtensionType();
    }

    /**
     * Create an instance of {@link VORExtensionType }
     * 
     */
    public VORExtensionType createVORExtensionType() {
        return new VORExtensionType();
    }

    /**
     * Create an instance of {@link TACANExtensionType }
     * 
     */
    public TACANExtensionType createTACANExtensionType() {
        return new TACANExtensionType();
    }

    /**
     * Create an instance of {@link SpecialNavigationSystemExtensionType }
     * 
     */
    public SpecialNavigationSystemExtensionType createSpecialNavigationSystemExtensionType() {
        return new SpecialNavigationSystemExtensionType();
    }

    /**
     * Create an instance of {@link DirectionFinderExtensionType }
     * 
     */
    public DirectionFinderExtensionType createDirectionFinderExtensionType() {
        return new DirectionFinderExtensionType();
    }

    /**
     * Create an instance of {@link DesignatedPointExtensionType }
     * 
     */
    public DesignatedPointExtensionType createDesignatedPointExtensionType() {
        return new DesignatedPointExtensionType();
    }

    /**
     * Create an instance of {@link SignificantPointInAirspaceExtensionType }
     * 
     */
    public SignificantPointInAirspaceExtensionType createSignificantPointInAirspaceExtensionType() {
        return new SignificantPointInAirspaceExtensionType();
    }

    /**
     * Create an instance of {@link AeronauticalGroundLightExtensionType }
     * 
     */
    public AeronauticalGroundLightExtensionType createAeronauticalGroundLightExtensionType() {
        return new AeronauticalGroundLightExtensionType();
    }

    /**
     * Create an instance of {@link OrganisationAuthorityExtensionType }
     * 
     */
    public OrganisationAuthorityExtensionType createOrganisationAuthorityExtensionType() {
        return new OrganisationAuthorityExtensionType();
    }

    /**
     * Create an instance of {@link UnitExtensionType }
     * 
     */
    public UnitExtensionType createUnitExtensionType() {
        return new UnitExtensionType();
    }

    /**
     * Create an instance of {@link ObstacleAreaExtensionType }
     * 
     */
    public ObstacleAreaExtensionType createObstacleAreaExtensionType() {
        return new ObstacleAreaExtensionType();
    }

    /**
     * Create an instance of {@link VerticalStructureExtensionType }
     * 
     */
    public VerticalStructureExtensionType createVerticalStructureExtensionType() {
        return new VerticalStructureExtensionType();
    }

    /**
     * Create an instance of {@link CirclingAreaExtensionType }
     * 
     */
    public CirclingAreaExtensionType createCirclingAreaExtensionType() {
        return new CirclingAreaExtensionType();
    }

    /**
     * Create an instance of {@link TerminalArrivalAreaExtensionType }
     * 
     */
    public TerminalArrivalAreaExtensionType createTerminalArrivalAreaExtensionType() {
        return new TerminalArrivalAreaExtensionType();
    }

    /**
     * Create an instance of {@link InstrumentApproachProcedureExtensionType }
     * 
     */
    public InstrumentApproachProcedureExtensionType createInstrumentApproachProcedureExtensionType() {
        return new InstrumentApproachProcedureExtensionType();
    }

    /**
     * Create an instance of {@link StandardInstrumentDepartureExtensionType }
     * 
     */
    public StandardInstrumentDepartureExtensionType createStandardInstrumentDepartureExtensionType() {
        return new StandardInstrumentDepartureExtensionType();
    }

    /**
     * Create an instance of {@link NavigationAreaExtensionType }
     * 
     */
    public NavigationAreaExtensionType createNavigationAreaExtensionType() {
        return new NavigationAreaExtensionType();
    }

    /**
     * Create an instance of {@link StandardInstrumentArrivalExtensionType }
     * 
     */
    public StandardInstrumentArrivalExtensionType createStandardInstrumentArrivalExtensionType() {
        return new StandardInstrumentArrivalExtensionType();
    }

    /**
     * Create an instance of {@link ProcedureExtensionType }
     * 
     */
    public ProcedureExtensionType createProcedureExtensionType() {
        return new ProcedureExtensionType();
    }

    /**
     * Create an instance of {@link NavigationAreaRestrictionExtensionType }
     * 
     */
    public NavigationAreaRestrictionExtensionType createNavigationAreaRestrictionExtensionType() {
        return new NavigationAreaRestrictionExtensionType();
    }

    /**
     * Create an instance of {@link SegmentLegExtensionType }
     * 
     */
    public SegmentLegExtensionType createSegmentLegExtensionType() {
        return new SegmentLegExtensionType();
    }

    /**
     * Create an instance of {@link ApproachLegExtensionType }
     * 
     */
    public ApproachLegExtensionType createApproachLegExtensionType() {
        return new ApproachLegExtensionType();
    }

    /**
     * Create an instance of {@link ArrivalFeederLegExtensionType }
     * 
     */
    public ArrivalFeederLegExtensionType createArrivalFeederLegExtensionType() {
        return new ArrivalFeederLegExtensionType();
    }

    /**
     * Create an instance of {@link ArrivalLegExtensionType }
     * 
     */
    public ArrivalLegExtensionType createArrivalLegExtensionType() {
        return new ArrivalLegExtensionType();
    }

    /**
     * Create an instance of {@link DepartureLegExtensionType }
     * 
     */
    public DepartureLegExtensionType createDepartureLegExtensionType() {
        return new DepartureLegExtensionType();
    }

    /**
     * Create an instance of {@link FinalLegExtensionType }
     * 
     */
    public FinalLegExtensionType createFinalLegExtensionType() {
        return new FinalLegExtensionType();
    }

    /**
     * Create an instance of {@link InitialLegExtensionType }
     * 
     */
    public InitialLegExtensionType createInitialLegExtensionType() {
        return new InitialLegExtensionType();
    }

    /**
     * Create an instance of {@link IntermediateLegExtensionType }
     * 
     */
    public IntermediateLegExtensionType createIntermediateLegExtensionType() {
        return new IntermediateLegExtensionType();
    }

    /**
     * Create an instance of {@link MissedApproachLegExtensionType }
     * 
     */
    public MissedApproachLegExtensionType createMissedApproachLegExtensionType() {
        return new MissedApproachLegExtensionType();
    }

    /**
     * Create an instance of {@link ProcedureDMEExtensionType }
     * 
     */
    public ProcedureDMEExtensionType createProcedureDMEExtensionType() {
        return new ProcedureDMEExtensionType();
    }

    /**
     * Create an instance of {@link SafeAltitudeAreaExtensionType }
     * 
     */
    public SafeAltitudeAreaExtensionType createSafeAltitudeAreaExtensionType() {
        return new SafeAltitudeAreaExtensionType();
    }

    /**
     * Create an instance of {@link HoldingPatternExtensionType }
     * 
     */
    public HoldingPatternExtensionType createHoldingPatternExtensionType() {
        return new HoldingPatternExtensionType();
    }

    /**
     * Create an instance of {@link UnplannedHoldingExtensionType }
     * 
     */
    public UnplannedHoldingExtensionType createUnplannedHoldingExtensionType() {
        return new UnplannedHoldingExtensionType();
    }

    /**
     * Create an instance of {@link AirspaceBorderCrossingExtensionType }
     * 
     */
    public AirspaceBorderCrossingExtensionType createAirspaceBorderCrossingExtensionType() {
        return new AirspaceBorderCrossingExtensionType();
    }

    /**
     * Create an instance of {@link FlightRestrictionExtensionType }
     * 
     */
    public FlightRestrictionExtensionType createFlightRestrictionExtensionType() {
        return new FlightRestrictionExtensionType();
    }

    /**
     * Create an instance of {@link RouteSegmentExtensionType }
     * 
     */
    public RouteSegmentExtensionType createRouteSegmentExtensionType() {
        return new RouteSegmentExtensionType();
    }

    /**
     * Create an instance of {@link RouteDMEExtensionType }
     * 
     */
    public RouteDMEExtensionType createRouteDMEExtensionType() {
        return new RouteDMEExtensionType();
    }

    /**
     * Create an instance of {@link RouteExtensionType }
     * 
     */
    public RouteExtensionType createRouteExtensionType() {
        return new RouteExtensionType();
    }

    /**
     * Create an instance of {@link ChangeOverPointExtensionType }
     * 
     */
    public ChangeOverPointExtensionType createChangeOverPointExtensionType() {
        return new ChangeOverPointExtensionType();
    }

    /**
     * Create an instance of {@link AerialRefuellingExtensionType }
     * 
     */
    public AerialRefuellingExtensionType createAerialRefuellingExtensionType() {
        return new AerialRefuellingExtensionType();
    }

    /**
     * Create an instance of {@link RulesProceduresExtensionType }
     * 
     */
    public RulesProceduresExtensionType createRulesProceduresExtensionType() {
        return new RulesProceduresExtensionType();
    }

    /**
     * Create an instance of {@link CodeNOTAMType }
     * 
     */
    public CodeNOTAMType createCodeNOTAMType() {
        return new CodeNOTAMType();
    }

    /**
     * Create an instance of {@link CodeNOTAMTranslationType }
     * 
     */
    public CodeNOTAMTranslationType createCodeNOTAMTranslationType() {
        return new CodeNOTAMTranslationType();
    }

    /**
     * Create an instance of {@link CodeEventEncodingType }
     * 
     */
    public CodeEventEncodingType createCodeEventEncodingType() {
        return new CodeEventEncodingType();
    }

    /**
     * Create an instance of {@link CodeAISPublicationType }
     * 
     */
    public CodeAISPublicationType createCodeAISPublicationType() {
        return new CodeAISPublicationType();
    }

    /**
     * Create an instance of {@link TextNOTAMType }
     * 
     */
    public TextNOTAMType createTextNOTAMType() {
        return new TextNOTAMType();
    }

    /**
     * Create an instance of {@link NoVersionType }
     * 
     */
    public NoVersionType createNoVersionType() {
        return new NoVersionType();
    }

    /**
     * Create an instance of {@link EventPropertyType }
     * 
     */
    public EventPropertyType createEventPropertyType() {
        return new EventPropertyType();
    }

    /**
     * Create an instance of {@link EventTimeSlicePropertyType }
     * 
     */
    public EventTimeSlicePropertyType createEventTimeSlicePropertyType() {
        return new EventTimeSlicePropertyType();
    }

    /**
     * Create an instance of {@link NOTAMPropertyType }
     * 
     */
    public NOTAMPropertyType createNOTAMPropertyType() {
        return new NOTAMPropertyType();
    }

    /**
     * Create an instance of {@link AISPublicationPropertyType }
     * 
     */
    public AISPublicationPropertyType createAISPublicationPropertyType() {
        return new AISPublicationPropertyType();
    }

    /**
     * Create an instance of {@link NOTAMTranslationPropertyType }
     * 
     */
    public NOTAMTranslationPropertyType createNOTAMTranslationPropertyType() {
        return new NOTAMTranslationPropertyType();
    }

    /**
     * Create an instance of {@link NOTAMTranslationType.Extension }
     * 
     */
    public NOTAMTranslationType.Extension createNOTAMTranslationTypeExtension() {
        return new NOTAMTranslationType.Extension();
    }

    /**
     * Create an instance of {@link AISPublicationType.Extension }
     * 
     */
    public AISPublicationType.Extension createAISPublicationTypeExtension() {
        return new AISPublicationType.Extension();
    }

    /**
     * Create an instance of {@link NOTAMType.Extension }
     * 
     */
    public NOTAMType.Extension createNOTAMTypeExtension() {
        return new NOTAMType.Extension();
    }

    /**
     * Create an instance of {@link EventTimeSliceType.Extension }
     * 
     */
    public EventTimeSliceType.Extension createEventTimeSliceTypeExtension() {
        return new EventTimeSliceType.Extension();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "Event", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAIXMFeature")
    public JAXBElement<EventType> createEvent(EventType value) {
        return new JAXBElement<EventType>(_Event_QNAME, EventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventTimeSliceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "EventTimeSlice", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeSlice")
    public JAXBElement<EventTimeSliceType> createEventTimeSlice(EventTimeSliceType value) {
        return new JAXBElement<EventTimeSliceType>(_EventTimeSlice_QNAME, EventTimeSliceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AbstractEventExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractEventExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractEventExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "NOTAM")
    public JAXBElement<NOTAMType> createNOTAM(NOTAMType value) {
        return new JAXBElement<NOTAMType>(_NOTAM_QNAME, NOTAMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AbstractNOTAMExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractNOTAMExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractNOTAMExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AISPublicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AIS_Publication")
    public JAXBElement<AISPublicationType> createAISPublication(AISPublicationType value) {
        return new JAXBElement<AISPublicationType>(_AISPublication_QNAME, AISPublicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AbstractAIS_PublicationExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractAISPublicationExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractAISPublicationExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NOTAMTranslationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "NOTAMTranslation")
    public JAXBElement<NOTAMTranslationType> createNOTAMTranslation(NOTAMTranslationType value) {
        return new JAXBElement<NOTAMTranslationType>(_NOTAMTranslation_QNAME, NOTAMTranslationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AbstractNOTAMTranslationExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractNOTAMTranslationExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractNOTAMTranslationExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayProtectAreaExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RunwayProtectAreaExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRunwayProtectAreaExtension")
    public JAXBElement<RunwayProtectAreaExtensionType> createRunwayProtectAreaExtension(RunwayProtectAreaExtensionType value) {
        return new JAXBElement<RunwayProtectAreaExtensionType>(_RunwayProtectAreaExtension_QNAME, RunwayProtectAreaExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayDirectionExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RunwayDirectionExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRunwayDirectionExtension")
    public JAXBElement<RunwayDirectionExtensionType> createRunwayDirectionExtension(RunwayDirectionExtensionType value) {
        return new JAXBElement<RunwayDirectionExtensionType>(_RunwayDirectionExtension_QNAME, RunwayDirectionExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayCentrelinePointExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RunwayCentrelinePointExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRunwayCentrelinePointExtension")
    public JAXBElement<RunwayCentrelinePointExtensionType> createRunwayCentrelinePointExtension(RunwayCentrelinePointExtensionType value) {
        return new JAXBElement<RunwayCentrelinePointExtensionType>(_RunwayCentrelinePointExtension_QNAME, RunwayCentrelinePointExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RunwayExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRunwayExtension")
    public JAXBElement<RunwayExtensionType> createRunwayExtension(RunwayExtensionType value) {
        return new JAXBElement<RunwayExtensionType>(_RunwayExtension_QNAME, RunwayExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrestingGearExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ArrestingGearExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractArrestingGearExtension")
    public JAXBElement<ArrestingGearExtensionType> createArrestingGearExtension(ArrestingGearExtensionType value) {
        return new JAXBElement<ArrestingGearExtensionType>(_ArrestingGearExtension_QNAME, ArrestingGearExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayElementExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RunwayElementExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRunwayElementExtension")
    public JAXBElement<RunwayElementExtensionType> createRunwayElementExtension(RunwayElementExtensionType value) {
        return new JAXBElement<RunwayElementExtensionType>(_RunwayElementExtension_QNAME, RunwayElementExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "VisualGlideSlopeIndicatorExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractVisualGlideSlopeIndicatorExtension")
    public JAXBElement<VisualGlideSlopeIndicatorExtensionType> createVisualGlideSlopeIndicatorExtension(VisualGlideSlopeIndicatorExtensionType value) {
        return new JAXBElement<VisualGlideSlopeIndicatorExtensionType>(_VisualGlideSlopeIndicatorExtension_QNAME, VisualGlideSlopeIndicatorExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayVisualRangeExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RunwayVisualRangeExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRunwayVisualRangeExtension")
    public JAXBElement<RunwayVisualRangeExtensionType> createRunwayVisualRangeExtension(RunwayVisualRangeExtensionType value) {
        return new JAXBElement<RunwayVisualRangeExtensionType>(_RunwayVisualRangeExtension_QNAME, RunwayVisualRangeExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayBlastPadExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RunwayBlastPadExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRunwayBlastPadExtension")
    public JAXBElement<RunwayBlastPadExtensionType> createRunwayBlastPadExtension(RunwayBlastPadExtensionType value) {
        return new JAXBElement<RunwayBlastPadExtensionType>(_RunwayBlastPadExtension_QNAME, RunwayBlastPadExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxiHoldingPositionExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TaxiHoldingPositionExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTaxiHoldingPositionExtension")
    public JAXBElement<TaxiHoldingPositionExtensionType> createTaxiHoldingPositionExtension(TaxiHoldingPositionExtensionType value) {
        return new JAXBElement<TaxiHoldingPositionExtensionType>(_TaxiHoldingPositionExtension_QNAME, TaxiHoldingPositionExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxiwayExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TaxiwayExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTaxiwayExtension")
    public JAXBElement<TaxiwayExtensionType> createTaxiwayExtension(TaxiwayExtensionType value) {
        return new JAXBElement<TaxiwayExtensionType>(_TaxiwayExtension_QNAME, TaxiwayExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxiwayElementExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TaxiwayElementExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTaxiwayElementExtension")
    public JAXBElement<TaxiwayElementExtensionType> createTaxiwayElementExtension(TaxiwayElementExtensionType value) {
        return new JAXBElement<TaxiwayElementExtensionType>(_TaxiwayElementExtension_QNAME, TaxiwayElementExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuidanceLineExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "GuidanceLineExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractGuidanceLineExtension")
    public JAXBElement<GuidanceLineExtensionType> createGuidanceLineExtension(GuidanceLineExtensionType value) {
        return new JAXBElement<GuidanceLineExtensionType>(_GuidanceLineExtension_QNAME, GuidanceLineExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApronExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ApronExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractApronExtension")
    public JAXBElement<ApronExtensionType> createApronExtension(ApronExtensionType value) {
        return new JAXBElement<ApronExtensionType>(_ApronExtension_QNAME, ApronExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApronElementExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ApronElementExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractApronElementExtension")
    public JAXBElement<ApronElementExtensionType> createApronElementExtension(ApronElementExtensionType value) {
        return new JAXBElement<ApronElementExtensionType>(_ApronElementExtension_QNAME, ApronElementExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftStandExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AircraftStandExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAircraftStandExtension")
    public JAXBElement<AircraftStandExtensionType> createAircraftStandExtension(AircraftStandExtensionType value) {
        return new JAXBElement<AircraftStandExtensionType>(_AircraftStandExtension_QNAME, AircraftStandExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RoadExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRoadExtension")
    public JAXBElement<RoadExtensionType> createRoadExtension(RoadExtensionType value) {
        return new JAXBElement<RoadExtensionType>(_RoadExtension_QNAME, RoadExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeicingAreaExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "DeicingAreaExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractDeicingAreaExtension")
    public JAXBElement<DeicingAreaExtensionType> createDeicingAreaExtension(DeicingAreaExtensionType value) {
        return new JAXBElement<DeicingAreaExtensionType>(_DeicingAreaExtension_QNAME, DeicingAreaExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerLoadingBridgeExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "PassengerLoadingBridgeExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractPassengerLoadingBridgeExtension")
    public JAXBElement<PassengerLoadingBridgeExtensionType> createPassengerLoadingBridgeExtension(PassengerLoadingBridgeExtensionType value) {
        return new JAXBElement<PassengerLoadingBridgeExtensionType>(_PassengerLoadingBridgeExtension_QNAME, PassengerLoadingBridgeExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TouchDownLiftOffSafeAreaExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TouchDownLiftOffSafeAreaExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTouchDownLiftOffSafeAreaExtension")
    public JAXBElement<TouchDownLiftOffSafeAreaExtensionType> createTouchDownLiftOffSafeAreaExtension(TouchDownLiftOffSafeAreaExtensionType value) {
        return new JAXBElement<TouchDownLiftOffSafeAreaExtensionType>(_TouchDownLiftOffSafeAreaExtension_QNAME, TouchDownLiftOffSafeAreaExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TouchDownLiftOffExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TouchDownLiftOffExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTouchDownLiftOffExtension")
    public JAXBElement<TouchDownLiftOffExtensionType> createTouchDownLiftOffExtension(TouchDownLiftOffExtensionType value) {
        return new JAXBElement<TouchDownLiftOffExtensionType>(_TouchDownLiftOffExtension_QNAME, TouchDownLiftOffExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroundLightSystemExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "GroundLightSystemExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractGroundLightSystemExtension")
    public JAXBElement<GroundLightSystemExtensionType> createGroundLightSystemExtension(GroundLightSystemExtensionType value) {
        return new JAXBElement<GroundLightSystemExtensionType>(_GroundLightSystemExtension_QNAME, GroundLightSystemExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApronLightSystemExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ApronLightSystemExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractApronLightSystemExtension")
    public JAXBElement<ApronLightSystemExtensionType> createApronLightSystemExtension(ApronLightSystemExtensionType value) {
        return new JAXBElement<ApronLightSystemExtensionType>(_ApronLightSystemExtension_QNAME, ApronLightSystemExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxiwayLightSystemExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TaxiwayLightSystemExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTaxiwayLightSystemExtension")
    public JAXBElement<TaxiwayLightSystemExtensionType> createTaxiwayLightSystemExtension(TaxiwayLightSystemExtensionType value) {
        return new JAXBElement<TaxiwayLightSystemExtensionType>(_TaxiwayLightSystemExtension_QNAME, TaxiwayLightSystemExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayDirectionLightSystemExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RunwayDirectionLightSystemExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRunwayDirectionLightSystemExtension")
    public JAXBElement<RunwayDirectionLightSystemExtensionType> createRunwayDirectionLightSystemExtension(RunwayDirectionLightSystemExtensionType value) {
        return new JAXBElement<RunwayDirectionLightSystemExtensionType>(_RunwayDirectionLightSystemExtension_QNAME, RunwayDirectionLightSystemExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TouchDownLiftOffLightSystemExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TouchDownLiftOffLightSystemExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTouchDownLiftOffLightSystemExtension")
    public JAXBElement<TouchDownLiftOffLightSystemExtensionType> createTouchDownLiftOffLightSystemExtension(TouchDownLiftOffLightSystemExtensionType value) {
        return new JAXBElement<TouchDownLiftOffLightSystemExtensionType>(_TouchDownLiftOffLightSystemExtension_QNAME, TouchDownLiftOffLightSystemExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuidanceLineLightSystemExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "GuidanceLineLightSystemExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractGuidanceLineLightSystemExtension")
    public JAXBElement<GuidanceLineLightSystemExtensionType> createGuidanceLineLightSystemExtension(GuidanceLineLightSystemExtensionType value) {
        return new JAXBElement<GuidanceLineLightSystemExtensionType>(_GuidanceLineLightSystemExtension_QNAME, GuidanceLineLightSystemExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayProtectAreaLightSystemExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RunwayProtectAreaLightSystemExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRunwayProtectAreaLightSystemExtension")
    public JAXBElement<RunwayProtectAreaLightSystemExtensionType> createRunwayProtectAreaLightSystemExtension(RunwayProtectAreaLightSystemExtensionType value) {
        return new JAXBElement<RunwayProtectAreaLightSystemExtensionType>(_RunwayProtectAreaLightSystemExtension_QNAME, RunwayProtectAreaLightSystemExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxiHoldingPositionLightSystemExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TaxiHoldingPositionLightSystemExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTaxiHoldingPositionLightSystemExtension")
    public JAXBElement<TaxiHoldingPositionLightSystemExtensionType> createTaxiHoldingPositionLightSystemExtension(TaxiHoldingPositionLightSystemExtensionType value) {
        return new JAXBElement<TaxiHoldingPositionLightSystemExtensionType>(_TaxiHoldingPositionLightSystemExtension_QNAME, TaxiHoldingPositionLightSystemExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproachLightingSystemExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ApproachLightingSystemExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractApproachLightingSystemExtension")
    public JAXBElement<ApproachLightingSystemExtensionType> createApproachLightingSystemExtension(ApproachLightingSystemExtensionType value) {
        return new JAXBElement<ApproachLightingSystemExtensionType>(_ApproachLightingSystemExtension_QNAME, ApproachLightingSystemExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "MarkingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractMarkingExtension")
    public JAXBElement<MarkingExtensionType> createMarkingExtension(MarkingExtensionType value) {
        return new JAXBElement<MarkingExtensionType>(_MarkingExtension_QNAME, MarkingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxiwayMarkingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TaxiwayMarkingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTaxiwayMarkingExtension")
    public JAXBElement<TaxiwayMarkingExtensionType> createTaxiwayMarkingExtension(TaxiwayMarkingExtensionType value) {
        return new JAXBElement<TaxiwayMarkingExtensionType>(_TaxiwayMarkingExtension_QNAME, TaxiwayMarkingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApronMarkingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ApronMarkingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractApronMarkingExtension")
    public JAXBElement<ApronMarkingExtensionType> createApronMarkingExtension(ApronMarkingExtensionType value) {
        return new JAXBElement<ApronMarkingExtensionType>(_ApronMarkingExtension_QNAME, ApronMarkingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AirportProtectionAreaMarkingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAirportProtectionAreaMarkingExtension")
    public JAXBElement<AirportProtectionAreaMarkingExtensionType> createAirportProtectionAreaMarkingExtension(AirportProtectionAreaMarkingExtensionType value) {
        return new JAXBElement<AirportProtectionAreaMarkingExtensionType>(_AirportProtectionAreaMarkingExtension_QNAME, AirportProtectionAreaMarkingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TouchDownLiftOffMarkingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TouchDownLiftOffMarkingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTouchDownLiftOffMarkingExtension")
    public JAXBElement<TouchDownLiftOffMarkingExtensionType> createTouchDownLiftOffMarkingExtension(TouchDownLiftOffMarkingExtensionType value) {
        return new JAXBElement<TouchDownLiftOffMarkingExtensionType>(_TouchDownLiftOffMarkingExtension_QNAME, TouchDownLiftOffMarkingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayMarkingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RunwayMarkingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRunwayMarkingExtension")
    public JAXBElement<RunwayMarkingExtensionType> createRunwayMarkingExtension(RunwayMarkingExtensionType value) {
        return new JAXBElement<RunwayMarkingExtensionType>(_RunwayMarkingExtension_QNAME, RunwayMarkingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuidanceLineMarkingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "GuidanceLineMarkingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractGuidanceLineMarkingExtension")
    public JAXBElement<GuidanceLineMarkingExtensionType> createGuidanceLineMarkingExtension(GuidanceLineMarkingExtensionType value) {
        return new JAXBElement<GuidanceLineMarkingExtensionType>(_GuidanceLineMarkingExtension_QNAME, GuidanceLineMarkingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeicingAreaMarkingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "DeicingAreaMarkingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractDeicingAreaMarkingExtension")
    public JAXBElement<DeicingAreaMarkingExtensionType> createDeicingAreaMarkingExtension(DeicingAreaMarkingExtensionType value) {
        return new JAXBElement<DeicingAreaMarkingExtensionType>(_DeicingAreaMarkingExtension_QNAME, DeicingAreaMarkingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxiHoldingPositionMarkingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TaxiHoldingPositionMarkingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTaxiHoldingPositionMarkingExtension")
    public JAXBElement<TaxiHoldingPositionMarkingExtensionType> createTaxiHoldingPositionMarkingExtension(TaxiHoldingPositionMarkingExtensionType value) {
        return new JAXBElement<TaxiHoldingPositionMarkingExtensionType>(_TaxiHoldingPositionMarkingExtension_QNAME, TaxiHoldingPositionMarkingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandMarkingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "StandMarkingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractStandMarkingExtension")
    public JAXBElement<StandMarkingExtensionType> createStandMarkingExtension(StandMarkingExtensionType value) {
        return new JAXBElement<StandMarkingExtensionType>(_StandMarkingExtension_QNAME, StandMarkingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FloatingDockSiteExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "FloatingDockSiteExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractFloatingDockSiteExtension")
    public JAXBElement<FloatingDockSiteExtensionType> createFloatingDockSiteExtension(FloatingDockSiteExtensionType value) {
        return new JAXBElement<FloatingDockSiteExtensionType>(_FloatingDockSiteExtension_QNAME, FloatingDockSiteExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkingBuoyExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "MarkingBuoyExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractMarkingBuoyExtension")
    public JAXBElement<MarkingBuoyExtensionType> createMarkingBuoyExtension(MarkingBuoyExtensionType value) {
        return new JAXBElement<MarkingBuoyExtensionType>(_MarkingBuoyExtension_QNAME, MarkingBuoyExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "SeaplaneLandingAreaExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractSeaplaneLandingAreaExtension")
    public JAXBElement<SeaplaneLandingAreaExtensionType> createSeaplaneLandingAreaExtension(SeaplaneLandingAreaExtensionType value) {
        return new JAXBElement<SeaplaneLandingAreaExtensionType>(_SeaplaneLandingAreaExtension_QNAME, SeaplaneLandingAreaExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeaplaneRampSiteExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "SeaplaneRampSiteExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractSeaplaneRampSiteExtension")
    public JAXBElement<SeaplaneRampSiteExtensionType> createSeaplaneRampSiteExtension(SeaplaneRampSiteExtensionType value) {
        return new JAXBElement<SeaplaneRampSiteExtensionType>(_SeaplaneRampSiteExtension_QNAME, SeaplaneRampSiteExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkAreaExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "WorkAreaExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractWorkAreaExtension")
    public JAXBElement<WorkAreaExtensionType> createWorkAreaExtension(WorkAreaExtensionType value) {
        return new JAXBElement<WorkAreaExtensionType>(_WorkAreaExtension_QNAME, WorkAreaExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurveyControlPointExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "SurveyControlPointExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractSurveyControlPointExtension")
    public JAXBElement<SurveyControlPointExtensionType> createSurveyControlPointExtension(SurveyControlPointExtensionType value) {
        return new JAXBElement<SurveyControlPointExtensionType>(_SurveyControlPointExtension_QNAME, SurveyControlPointExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonMovementAreaExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "NonMovementAreaExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractNonMovementAreaExtension")
    public JAXBElement<NonMovementAreaExtensionType> createNonMovementAreaExtension(NonMovementAreaExtensionType value) {
        return new JAXBElement<NonMovementAreaExtensionType>(_NonMovementAreaExtension_QNAME, NonMovementAreaExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportHeliportProtectionAreaExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AirportHeliportProtectionAreaExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAirportHeliportProtectionAreaExtension")
    public JAXBElement<AirportHeliportProtectionAreaExtensionType> createAirportHeliportProtectionAreaExtension(AirportHeliportProtectionAreaExtensionType value) {
        return new JAXBElement<AirportHeliportProtectionAreaExtensionType>(_AirportHeliportProtectionAreaExtension_QNAME, AirportHeliportProtectionAreaExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportHeliportCollocationExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AirportHeliportCollocationExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAirportHeliportCollocationExtension")
    public JAXBElement<AirportHeliportCollocationExtensionType> createAirportHeliportCollocationExtension(AirportHeliportCollocationExtensionType value) {
        return new JAXBElement<AirportHeliportCollocationExtensionType>(_AirportHeliportCollocationExtension_QNAME, AirportHeliportCollocationExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportHeliportExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AirportHeliportExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAirportHeliportExtension")
    public JAXBElement<AirportHeliportExtensionType> createAirportHeliportExtension(AirportHeliportExtensionType value) {
        return new JAXBElement<AirportHeliportExtensionType>(_AirportHeliportExtension_QNAME, AirportHeliportExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltimeterSourceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AltimeterSourceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAltimeterSourceExtension")
    public JAXBElement<AltimeterSourceExtensionType> createAltimeterSourceExtension(AltimeterSourceExtensionType value) {
        return new JAXBElement<AltimeterSourceExtensionType>(_AltimeterSourceExtension_QNAME, AltimeterSourceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportHotSpotExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AirportHotSpotExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAirportHotSpotExtension")
    public JAXBElement<AirportHotSpotExtensionType> createAirportHotSpotExtension(AirportHotSpotExtensionType value) {
        return new JAXBElement<AirportHotSpotExtensionType>(_AirportHotSpotExtension_QNAME, AirportHotSpotExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorityForAirspaceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AuthorityForAirspaceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAuthorityForAirspaceExtension")
    public JAXBElement<AuthorityForAirspaceExtensionType> createAuthorityForAirspaceExtension(AuthorityForAirspaceExtensionType value) {
        return new JAXBElement<AuthorityForAirspaceExtensionType>(_AuthorityForAirspaceExtension_QNAME, AuthorityForAirspaceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirspaceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AirspaceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAirspaceExtension")
    public JAXBElement<AirspaceExtensionType> createAirspaceExtension(AirspaceExtensionType value) {
        return new JAXBElement<AirspaceExtensionType>(_AirspaceExtension_QNAME, AirspaceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoBorderExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "GeoBorderExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractGeoBorderExtension")
    public JAXBElement<GeoBorderExtensionType> createGeoBorderExtension(GeoBorderExtensionType value) {
        return new JAXBElement<GeoBorderExtensionType>(_GeoBorderExtension_QNAME, GeoBorderExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrecisionApproachRadarExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "PrecisionApproachRadarExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractPrecisionApproachRadarExtension")
    public JAXBElement<PrecisionApproachRadarExtensionType> createPrecisionApproachRadarExtension(PrecisionApproachRadarExtensionType value) {
        return new JAXBElement<PrecisionApproachRadarExtensionType>(_PrecisionApproachRadarExtension_QNAME, PrecisionApproachRadarExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimarySurveillanceRadarExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "PrimarySurveillanceRadarExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractPrimarySurveillanceRadarExtension")
    public JAXBElement<PrimarySurveillanceRadarExtensionType> createPrimarySurveillanceRadarExtension(PrimarySurveillanceRadarExtensionType value) {
        return new JAXBElement<PrimarySurveillanceRadarExtensionType>(_PrimarySurveillanceRadarExtension_QNAME, PrimarySurveillanceRadarExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RadarEquipmentExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RadarEquipmentExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRadarEquipmentExtension")
    public JAXBElement<RadarEquipmentExtensionType> createRadarEquipmentExtension(RadarEquipmentExtensionType value) {
        return new JAXBElement<RadarEquipmentExtensionType>(_RadarEquipmentExtension_QNAME, RadarEquipmentExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RadarSystemExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RadarSystemExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRadarSystemExtension")
    public JAXBElement<RadarSystemExtensionType> createRadarSystemExtension(RadarSystemExtensionType value) {
        return new JAXBElement<RadarSystemExtensionType>(_RadarSystemExtension_QNAME, RadarSystemExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "SecondarySurveillanceRadarExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractSecondarySurveillanceRadarExtension")
    public JAXBElement<SecondarySurveillanceRadarExtensionType> createSecondarySurveillanceRadarExtension(SecondarySurveillanceRadarExtensionType value) {
        return new JAXBElement<SecondarySurveillanceRadarExtensionType>(_SecondarySurveillanceRadarExtension_QNAME, SecondarySurveillanceRadarExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurveillanceRadarExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "SurveillanceRadarExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractSurveillanceRadarExtension")
    public JAXBElement<SurveillanceRadarExtensionType> createSurveillanceRadarExtension(SurveillanceRadarExtensionType value) {
        return new JAXBElement<SurveillanceRadarExtensionType>(_SurveillanceRadarExtension_QNAME, SurveillanceRadarExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoldingAssessmentExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "HoldingAssessmentExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractHoldingAssessmentExtension")
    public JAXBElement<HoldingAssessmentExtensionType> createHoldingAssessmentExtension(HoldingAssessmentExtensionType value) {
        return new JAXBElement<HoldingAssessmentExtensionType>(_HoldingAssessmentExtension_QNAME, HoldingAssessmentExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardLevelTableExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "StandardLevelTableExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractStandardLevelTableExtension")
    public JAXBElement<StandardLevelTableExtensionType> createStandardLevelTableExtension(StandardLevelTableExtensionType value) {
        return new JAXBElement<StandardLevelTableExtensionType>(_StandardLevelTableExtension_QNAME, StandardLevelTableExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardLevelSectorExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "StandardLevelSectorExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractStandardLevelSectorExtension")
    public JAXBElement<StandardLevelSectorExtensionType> createStandardLevelSectorExtension(StandardLevelSectorExtensionType value) {
        return new JAXBElement<StandardLevelSectorExtensionType>(_StandardLevelSectorExtension_QNAME, StandardLevelSectorExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardLevelColumnExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "StandardLevelColumnExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractStandardLevelColumnExtension")
    public JAXBElement<StandardLevelColumnExtensionType> createStandardLevelColumnExtension(StandardLevelColumnExtensionType value) {
        return new JAXBElement<StandardLevelColumnExtensionType>(_StandardLevelColumnExtension_QNAME, StandardLevelColumnExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RadioFrequencyAreaExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RadioFrequencyAreaExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRadioFrequencyAreaExtension")
    public JAXBElement<RadioFrequencyAreaExtensionType> createRadioFrequencyAreaExtension(RadioFrequencyAreaExtensionType value) {
        return new JAXBElement<RadioFrequencyAreaExtensionType>(_RadioFrequencyAreaExtension_QNAME, RadioFrequencyAreaExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialDateExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "SpecialDateExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractSpecialDateExtension")
    public JAXBElement<SpecialDateExtensionType> createSpecialDateExtension(SpecialDateExtensionType value) {
        return new JAXBElement<SpecialDateExtensionType>(_SpecialDateExtension_QNAME, SpecialDateExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ServiceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractServiceExtension")
    public JAXBElement<ServiceExtensionType> createServiceExtension(ServiceExtensionType value) {
        return new JAXBElement<ServiceExtensionType>(_ServiceExtension_QNAME, ServiceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RadioCommunicationChannelExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RadioCommunicationChannelExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRadioCommunicationChannelExtension")
    public JAXBElement<RadioCommunicationChannelExtensionType> createRadioCommunicationChannelExtension(RadioCommunicationChannelExtensionType value) {
        return new JAXBElement<RadioCommunicationChannelExtensionType>(_RadioCommunicationChannelExtension_QNAME, RadioCommunicationChannelExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PilotControlledLightingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "PilotControlledLightingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractPilotControlledLightingExtension")
    public JAXBElement<PilotControlledLightingExtensionType> createPilotControlledLightingExtension(PilotControlledLightingExtensionType value) {
        return new JAXBElement<PilotControlledLightingExtensionType>(_PilotControlledLightingExtension_QNAME, PilotControlledLightingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformationServiceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "InformationServiceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractInformationServiceExtension")
    public JAXBElement<InformationServiceExtensionType> createInformationServiceExtension(InformationServiceExtensionType value) {
        return new JAXBElement<InformationServiceExtensionType>(_InformationServiceExtension_QNAME, InformationServiceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficSeparationServiceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TrafficSeparationServiceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTrafficSeparationServiceExtension")
    public JAXBElement<TrafficSeparationServiceExtensionType> createTrafficSeparationServiceExtension(TrafficSeparationServiceExtensionType value) {
        return new JAXBElement<TrafficSeparationServiceExtensionType>(_TrafficSeparationServiceExtension_QNAME, TrafficSeparationServiceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroundTrafficControlServiceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "GroundTrafficControlServiceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractGroundTrafficControlServiceExtension")
    public JAXBElement<GroundTrafficControlServiceExtensionType> createGroundTrafficControlServiceExtension(GroundTrafficControlServiceExtensionType value) {
        return new JAXBElement<GroundTrafficControlServiceExtensionType>(_GroundTrafficControlServiceExtension_QNAME, GroundTrafficControlServiceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirTrafficControlServiceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AirTrafficControlServiceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAirTrafficControlServiceExtension")
    public JAXBElement<AirTrafficControlServiceExtensionType> createAirTrafficControlServiceExtension(AirTrafficControlServiceExtensionType value) {
        return new JAXBElement<AirTrafficControlServiceExtensionType>(_AirTrafficControlServiceExtension_QNAME, AirTrafficControlServiceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirTrafficManagementServiceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AirTrafficManagementServiceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAirTrafficManagementServiceExtension")
    public JAXBElement<AirTrafficManagementServiceExtensionType> createAirTrafficManagementServiceExtension(AirTrafficManagementServiceExtensionType value) {
        return new JAXBElement<AirTrafficManagementServiceExtensionType>(_AirTrafficManagementServiceExtension_QNAME, AirTrafficManagementServiceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRescueServiceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "SearchRescueServiceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractSearchRescueServiceExtension")
    public JAXBElement<SearchRescueServiceExtensionType> createSearchRescueServiceExtension(SearchRescueServiceExtensionType value) {
        return new JAXBElement<SearchRescueServiceExtensionType>(_SearchRescueServiceExtension_QNAME, SearchRescueServiceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportGroundServiceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AirportGroundServiceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAirportGroundServiceExtension")
    public JAXBElement<AirportGroundServiceExtensionType> createAirportGroundServiceExtension(AirportGroundServiceExtensionType value) {
        return new JAXBElement<AirportGroundServiceExtensionType>(_AirportGroundServiceExtension_QNAME, AirportGroundServiceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerServiceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "PassengerServiceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractPassengerServiceExtension")
    public JAXBElement<PassengerServiceExtensionType> createPassengerServiceExtension(PassengerServiceExtensionType value) {
        return new JAXBElement<PassengerServiceExtensionType>(_PassengerServiceExtension_QNAME, PassengerServiceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftGroundServiceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AircraftGroundServiceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAircraftGroundServiceExtension")
    public JAXBElement<AircraftGroundServiceExtensionType> createAircraftGroundServiceExtension(AircraftGroundServiceExtensionType value) {
        return new JAXBElement<AircraftGroundServiceExtensionType>(_AircraftGroundServiceExtension_QNAME, AircraftGroundServiceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FireFightingServiceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "FireFightingServiceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractFireFightingServiceExtension")
    public JAXBElement<FireFightingServiceExtensionType> createFireFightingServiceExtension(FireFightingServiceExtensionType value) {
        return new JAXBElement<FireFightingServiceExtensionType>(_FireFightingServiceExtension_QNAME, FireFightingServiceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportClearanceServiceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AirportClearanceServiceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAirportClearanceServiceExtension")
    public JAXBElement<AirportClearanceServiceExtensionType> createAirportClearanceServiceExtension(AirportClearanceServiceExtensionType value) {
        return new JAXBElement<AirportClearanceServiceExtensionType>(_AirportClearanceServiceExtension_QNAME, AirportClearanceServiceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportSuppliesServiceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AirportSuppliesServiceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAirportSuppliesServiceExtension")
    public JAXBElement<AirportSuppliesServiceExtensionType> createAirportSuppliesServiceExtension(AirportSuppliesServiceExtensionType value) {
        return new JAXBElement<AirportSuppliesServiceExtensionType>(_AirportSuppliesServiceExtension_QNAME, AirportSuppliesServiceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AngleIndicationExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AngleIndicationExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAngleIndicationExtension")
    public JAXBElement<AngleIndicationExtensionType> createAngleIndicationExtension(AngleIndicationExtensionType value) {
        return new JAXBElement<AngleIndicationExtensionType>(_AngleIndicationExtension_QNAME, AngleIndicationExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceIndicationExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "DistanceIndicationExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractDistanceIndicationExtension")
    public JAXBElement<DistanceIndicationExtensionType> createDistanceIndicationExtension(DistanceIndicationExtensionType value) {
        return new JAXBElement<DistanceIndicationExtensionType>(_DistanceIndicationExtension_QNAME, DistanceIndicationExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AzimuthExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AzimuthExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAzimuthExtension")
    public JAXBElement<AzimuthExtensionType> createAzimuthExtension(AzimuthExtensionType value) {
        return new JAXBElement<AzimuthExtensionType>(_AzimuthExtension_QNAME, AzimuthExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckpointINSExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "CheckpointINSExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractCheckpointINSExtension")
    public JAXBElement<CheckpointINSExtensionType> createCheckpointINSExtension(CheckpointINSExtensionType value) {
        return new JAXBElement<CheckpointINSExtensionType>(_CheckpointINSExtension_QNAME, CheckpointINSExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckpointVORExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "CheckpointVORExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractCheckpointVORExtension")
    public JAXBElement<CheckpointVORExtensionType> createCheckpointVORExtension(CheckpointVORExtensionType value) {
        return new JAXBElement<CheckpointVORExtensionType>(_CheckpointVORExtension_QNAME, CheckpointVORExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMEExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "DMEExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractDMEExtension")
    public JAXBElement<DMEExtensionType> createDMEExtension(DMEExtensionType value) {
        return new JAXBElement<DMEExtensionType>(_DMEExtension_QNAME, DMEExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElevationExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ElevationExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractElevationExtension")
    public JAXBElement<ElevationExtensionType> createElevationExtension(ElevationExtensionType value) {
        return new JAXBElement<ElevationExtensionType>(_ElevationExtension_QNAME, ElevationExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlidepathExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "GlidepathExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractGlidepathExtension")
    public JAXBElement<GlidepathExtensionType> createGlidepathExtension(GlidepathExtensionType value) {
        return new JAXBElement<GlidepathExtensionType>(_GlidepathExtension_QNAME, GlidepathExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizerExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "LocalizerExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractLocalizerExtension")
    public JAXBElement<LocalizerExtensionType> createLocalizerExtension(LocalizerExtensionType value) {
        return new JAXBElement<LocalizerExtensionType>(_LocalizerExtension_QNAME, LocalizerExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkerBeaconExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "MarkerBeaconExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractMarkerBeaconExtension")
    public JAXBElement<MarkerBeaconExtensionType> createMarkerBeaconExtension(MarkerBeaconExtensionType value) {
        return new JAXBElement<MarkerBeaconExtensionType>(_MarkerBeaconExtension_QNAME, MarkerBeaconExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavaidExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "NavaidExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractNavaidExtension")
    public JAXBElement<NavaidExtensionType> createNavaidExtension(NavaidExtensionType value) {
        return new JAXBElement<NavaidExtensionType>(_NavaidExtension_QNAME, NavaidExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavaidEquipmentExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "NavaidEquipmentExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractNavaidEquipmentExtension")
    public JAXBElement<NavaidEquipmentExtensionType> createNavaidEquipmentExtension(NavaidEquipmentExtensionType value) {
        return new JAXBElement<NavaidEquipmentExtensionType>(_NavaidEquipmentExtension_QNAME, NavaidEquipmentExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavigationSystemCheckpointExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "NavigationSystemCheckpointExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractNavigationSystemCheckpointExtension")
    public JAXBElement<NavigationSystemCheckpointExtensionType> createNavigationSystemCheckpointExtension(NavigationSystemCheckpointExtensionType value) {
        return new JAXBElement<NavigationSystemCheckpointExtensionType>(_NavigationSystemCheckpointExtension_QNAME, NavigationSystemCheckpointExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SDFExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "SDFExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractSDFExtension")
    public JAXBElement<SDFExtensionType> createSDFExtension(SDFExtensionType value) {
        return new JAXBElement<SDFExtensionType>(_SDFExtension_QNAME, SDFExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NDBExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "NDBExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractNDBExtension")
    public JAXBElement<NDBExtensionType> createNDBExtension(NDBExtensionType value) {
        return new JAXBElement<NDBExtensionType>(_NDBExtension_QNAME, NDBExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialNavigationStationExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "SpecialNavigationStationExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractSpecialNavigationStationExtension")
    public JAXBElement<SpecialNavigationStationExtensionType> createSpecialNavigationStationExtension(SpecialNavigationStationExtensionType value) {
        return new JAXBElement<SpecialNavigationStationExtensionType>(_SpecialNavigationStationExtension_QNAME, SpecialNavigationStationExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VORExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "VORExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractVORExtension")
    public JAXBElement<VORExtensionType> createVORExtension(VORExtensionType value) {
        return new JAXBElement<VORExtensionType>(_VORExtension_QNAME, VORExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TACANExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TACANExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTACANExtension")
    public JAXBElement<TACANExtensionType> createTACANExtension(TACANExtensionType value) {
        return new JAXBElement<TACANExtensionType>(_TACANExtension_QNAME, TACANExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialNavigationSystemExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "SpecialNavigationSystemExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractSpecialNavigationSystemExtension")
    public JAXBElement<SpecialNavigationSystemExtensionType> createSpecialNavigationSystemExtension(SpecialNavigationSystemExtensionType value) {
        return new JAXBElement<SpecialNavigationSystemExtensionType>(_SpecialNavigationSystemExtension_QNAME, SpecialNavigationSystemExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionFinderExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "DirectionFinderExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractDirectionFinderExtension")
    public JAXBElement<DirectionFinderExtensionType> createDirectionFinderExtension(DirectionFinderExtensionType value) {
        return new JAXBElement<DirectionFinderExtensionType>(_DirectionFinderExtension_QNAME, DirectionFinderExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesignatedPointExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "DesignatedPointExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractDesignatedPointExtension")
    public JAXBElement<DesignatedPointExtensionType> createDesignatedPointExtension(DesignatedPointExtensionType value) {
        return new JAXBElement<DesignatedPointExtensionType>(_DesignatedPointExtension_QNAME, DesignatedPointExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "SignificantPointInAirspaceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractSignificantPointInAirspaceExtension")
    public JAXBElement<SignificantPointInAirspaceExtensionType> createSignificantPointInAirspaceExtension(SignificantPointInAirspaceExtensionType value) {
        return new JAXBElement<SignificantPointInAirspaceExtensionType>(_SignificantPointInAirspaceExtension_QNAME, SignificantPointInAirspaceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AeronauticalGroundLightExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AeronauticalGroundLightExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAeronauticalGroundLightExtension")
    public JAXBElement<AeronauticalGroundLightExtensionType> createAeronauticalGroundLightExtension(AeronauticalGroundLightExtensionType value) {
        return new JAXBElement<AeronauticalGroundLightExtensionType>(_AeronauticalGroundLightExtension_QNAME, AeronauticalGroundLightExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationAuthorityExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "OrganisationAuthorityExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractOrganisationAuthorityExtension")
    public JAXBElement<OrganisationAuthorityExtensionType> createOrganisationAuthorityExtension(OrganisationAuthorityExtensionType value) {
        return new JAXBElement<OrganisationAuthorityExtensionType>(_OrganisationAuthorityExtension_QNAME, OrganisationAuthorityExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "UnitExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractUnitExtension")
    public JAXBElement<UnitExtensionType> createUnitExtension(UnitExtensionType value) {
        return new JAXBElement<UnitExtensionType>(_UnitExtension_QNAME, UnitExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObstacleAreaExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ObstacleAreaExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractObstacleAreaExtension")
    public JAXBElement<ObstacleAreaExtensionType> createObstacleAreaExtension(ObstacleAreaExtensionType value) {
        return new JAXBElement<ObstacleAreaExtensionType>(_ObstacleAreaExtension_QNAME, ObstacleAreaExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerticalStructureExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "VerticalStructureExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractVerticalStructureExtension")
    public JAXBElement<VerticalStructureExtensionType> createVerticalStructureExtension(VerticalStructureExtensionType value) {
        return new JAXBElement<VerticalStructureExtensionType>(_VerticalStructureExtension_QNAME, VerticalStructureExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CirclingAreaExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "CirclingAreaExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractCirclingAreaExtension")
    public JAXBElement<CirclingAreaExtensionType> createCirclingAreaExtension(CirclingAreaExtensionType value) {
        return new JAXBElement<CirclingAreaExtensionType>(_CirclingAreaExtension_QNAME, CirclingAreaExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalArrivalAreaExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "TerminalArrivalAreaExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractTerminalArrivalAreaExtension")
    public JAXBElement<TerminalArrivalAreaExtensionType> createTerminalArrivalAreaExtension(TerminalArrivalAreaExtensionType value) {
        return new JAXBElement<TerminalArrivalAreaExtensionType>(_TerminalArrivalAreaExtension_QNAME, TerminalArrivalAreaExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "InstrumentApproachProcedureExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractInstrumentApproachProcedureExtension")
    public JAXBElement<InstrumentApproachProcedureExtensionType> createInstrumentApproachProcedureExtension(InstrumentApproachProcedureExtensionType value) {
        return new JAXBElement<InstrumentApproachProcedureExtensionType>(_InstrumentApproachProcedureExtension_QNAME, InstrumentApproachProcedureExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardInstrumentDepartureExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "StandardInstrumentDepartureExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractStandardInstrumentDepartureExtension")
    public JAXBElement<StandardInstrumentDepartureExtensionType> createStandardInstrumentDepartureExtension(StandardInstrumentDepartureExtensionType value) {
        return new JAXBElement<StandardInstrumentDepartureExtensionType>(_StandardInstrumentDepartureExtension_QNAME, StandardInstrumentDepartureExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavigationAreaExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "NavigationAreaExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractNavigationAreaExtension")
    public JAXBElement<NavigationAreaExtensionType> createNavigationAreaExtension(NavigationAreaExtensionType value) {
        return new JAXBElement<NavigationAreaExtensionType>(_NavigationAreaExtension_QNAME, NavigationAreaExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "StandardInstrumentArrivalExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractStandardInstrumentArrivalExtension")
    public JAXBElement<StandardInstrumentArrivalExtensionType> createStandardInstrumentArrivalExtension(StandardInstrumentArrivalExtensionType value) {
        return new JAXBElement<StandardInstrumentArrivalExtensionType>(_StandardInstrumentArrivalExtension_QNAME, StandardInstrumentArrivalExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcedureExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ProcedureExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractProcedureExtension")
    public JAXBElement<ProcedureExtensionType> createProcedureExtension(ProcedureExtensionType value) {
        return new JAXBElement<ProcedureExtensionType>(_ProcedureExtension_QNAME, ProcedureExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "NavigationAreaRestrictionExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractNavigationAreaRestrictionExtension")
    public JAXBElement<NavigationAreaRestrictionExtensionType> createNavigationAreaRestrictionExtension(NavigationAreaRestrictionExtensionType value) {
        return new JAXBElement<NavigationAreaRestrictionExtensionType>(_NavigationAreaRestrictionExtension_QNAME, NavigationAreaRestrictionExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentLegExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "SegmentLegExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractSegmentLegExtension")
    public JAXBElement<SegmentLegExtensionType> createSegmentLegExtension(SegmentLegExtensionType value) {
        return new JAXBElement<SegmentLegExtensionType>(_SegmentLegExtension_QNAME, SegmentLegExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproachLegExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ApproachLegExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractApproachLegExtension")
    public JAXBElement<ApproachLegExtensionType> createApproachLegExtension(ApproachLegExtensionType value) {
        return new JAXBElement<ApproachLegExtensionType>(_ApproachLegExtension_QNAME, ApproachLegExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrivalFeederLegExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ArrivalFeederLegExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractArrivalFeederLegExtension")
    public JAXBElement<ArrivalFeederLegExtensionType> createArrivalFeederLegExtension(ArrivalFeederLegExtensionType value) {
        return new JAXBElement<ArrivalFeederLegExtensionType>(_ArrivalFeederLegExtension_QNAME, ArrivalFeederLegExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrivalLegExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ArrivalLegExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractArrivalLegExtension")
    public JAXBElement<ArrivalLegExtensionType> createArrivalLegExtension(ArrivalLegExtensionType value) {
        return new JAXBElement<ArrivalLegExtensionType>(_ArrivalLegExtension_QNAME, ArrivalLegExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartureLegExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "DepartureLegExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractDepartureLegExtension")
    public JAXBElement<DepartureLegExtensionType> createDepartureLegExtension(DepartureLegExtensionType value) {
        return new JAXBElement<DepartureLegExtensionType>(_DepartureLegExtension_QNAME, DepartureLegExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinalLegExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "FinalLegExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractFinalLegExtension")
    public JAXBElement<FinalLegExtensionType> createFinalLegExtension(FinalLegExtensionType value) {
        return new JAXBElement<FinalLegExtensionType>(_FinalLegExtension_QNAME, FinalLegExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitialLegExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "InitialLegExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractInitialLegExtension")
    public JAXBElement<InitialLegExtensionType> createInitialLegExtension(InitialLegExtensionType value) {
        return new JAXBElement<InitialLegExtensionType>(_InitialLegExtension_QNAME, InitialLegExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntermediateLegExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "IntermediateLegExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractIntermediateLegExtension")
    public JAXBElement<IntermediateLegExtensionType> createIntermediateLegExtension(IntermediateLegExtensionType value) {
        return new JAXBElement<IntermediateLegExtensionType>(_IntermediateLegExtension_QNAME, IntermediateLegExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MissedApproachLegExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "MissedApproachLegExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractMissedApproachLegExtension")
    public JAXBElement<MissedApproachLegExtensionType> createMissedApproachLegExtension(MissedApproachLegExtensionType value) {
        return new JAXBElement<MissedApproachLegExtensionType>(_MissedApproachLegExtension_QNAME, MissedApproachLegExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcedureDMEExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ProcedureDMEExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractProcedureDMEExtension")
    public JAXBElement<ProcedureDMEExtensionType> createProcedureDMEExtension(ProcedureDMEExtensionType value) {
        return new JAXBElement<ProcedureDMEExtensionType>(_ProcedureDMEExtension_QNAME, ProcedureDMEExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeAltitudeAreaExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "SafeAltitudeAreaExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractSafeAltitudeAreaExtension")
    public JAXBElement<SafeAltitudeAreaExtensionType> createSafeAltitudeAreaExtension(SafeAltitudeAreaExtensionType value) {
        return new JAXBElement<SafeAltitudeAreaExtensionType>(_SafeAltitudeAreaExtension_QNAME, SafeAltitudeAreaExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoldingPatternExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "HoldingPatternExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractHoldingPatternExtension")
    public JAXBElement<HoldingPatternExtensionType> createHoldingPatternExtension(HoldingPatternExtensionType value) {
        return new JAXBElement<HoldingPatternExtensionType>(_HoldingPatternExtension_QNAME, HoldingPatternExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnplannedHoldingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "UnplannedHoldingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractUnplannedHoldingExtension")
    public JAXBElement<UnplannedHoldingExtensionType> createUnplannedHoldingExtension(UnplannedHoldingExtensionType value) {
        return new JAXBElement<UnplannedHoldingExtensionType>(_UnplannedHoldingExtension_QNAME, UnplannedHoldingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AirspaceBorderCrossingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAirspaceBorderCrossingExtension")
    public JAXBElement<AirspaceBorderCrossingExtensionType> createAirspaceBorderCrossingExtension(AirspaceBorderCrossingExtensionType value) {
        return new JAXBElement<AirspaceBorderCrossingExtensionType>(_AirspaceBorderCrossingExtension_QNAME, AirspaceBorderCrossingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightRestrictionExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "FlightRestrictionExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractFlightRestrictionExtension")
    public JAXBElement<FlightRestrictionExtensionType> createFlightRestrictionExtension(FlightRestrictionExtensionType value) {
        return new JAXBElement<FlightRestrictionExtensionType>(_FlightRestrictionExtension_QNAME, FlightRestrictionExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteSegmentExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RouteSegmentExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRouteSegmentExtension")
    public JAXBElement<RouteSegmentExtensionType> createRouteSegmentExtension(RouteSegmentExtensionType value) {
        return new JAXBElement<RouteSegmentExtensionType>(_RouteSegmentExtension_QNAME, RouteSegmentExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteDMEExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RouteDMEExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRouteDMEExtension")
    public JAXBElement<RouteDMEExtensionType> createRouteDMEExtension(RouteDMEExtensionType value) {
        return new JAXBElement<RouteDMEExtensionType>(_RouteDMEExtension_QNAME, RouteDMEExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RouteExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRouteExtension")
    public JAXBElement<RouteExtensionType> createRouteExtension(RouteExtensionType value) {
        return new JAXBElement<RouteExtensionType>(_RouteExtension_QNAME, RouteExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeOverPointExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "ChangeOverPointExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractChangeOverPointExtension")
    public JAXBElement<ChangeOverPointExtensionType> createChangeOverPointExtension(ChangeOverPointExtensionType value) {
        return new JAXBElement<ChangeOverPointExtensionType>(_ChangeOverPointExtension_QNAME, ChangeOverPointExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AerialRefuellingExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "AerialRefuellingExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractAerialRefuellingExtension")
    public JAXBElement<AerialRefuellingExtensionType> createAerialRefuellingExtension(AerialRefuellingExtensionType value) {
        return new JAXBElement<AerialRefuellingExtensionType>(_AerialRefuellingExtension_QNAME, AerialRefuellingExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RulesProceduresExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "RulesProceduresExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1", substitutionHeadName = "AbstractRulesProceduresExtension")
    public JAXBElement<RulesProceduresExtensionType> createRulesProceduresExtension(RulesProceduresExtensionType value) {
        return new JAXBElement<RulesProceduresExtensionType>(_RulesProceduresExtension_QNAME, RulesProceduresExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeNOTAMTranslationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "type", scope = NOTAMTranslationType.class)
    public JAXBElement<CodeNOTAMTranslationType> createNOTAMTranslationTypeType(CodeNOTAMTranslationType value) {
        return new JAXBElement<CodeNOTAMTranslationType>(_NOTAMTranslationTypeType_QNAME, CodeNOTAMTranslationType.class, NOTAMTranslationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeLanguageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "language", scope = NOTAMTranslationType.class)
    public JAXBElement<CodeLanguageType> createNOTAMTranslationTypeLanguage(CodeLanguageType value) {
        return new JAXBElement<CodeLanguageType>(_NOTAMTranslationTypeLanguage_QNAME, CodeLanguageType.class, NOTAMTranslationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "simpleText", scope = NOTAMTranslationType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTranslationTypeSimpleText(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTranslationTypeSimpleText_QNAME, TextNOTAMType.class, NOTAMTranslationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XHTMLType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "formattedText", scope = NOTAMTranslationType.class)
    public JAXBElement<XHTMLType> createNOTAMTranslationTypeFormattedText(XHTMLType value) {
        return new JAXBElement<XHTMLType>(_NOTAMTranslationTypeFormattedText_QNAME, XHTMLType.class, NOTAMTranslationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeAISPublicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "type", scope = AISPublicationType.class)
    public JAXBElement<CodeAISPublicationType> createAISPublicationTypeType(CodeAISPublicationType value) {
        return new JAXBElement<CodeAISPublicationType>(_NOTAMTranslationTypeType_QNAME, CodeAISPublicationType.class, AISPublicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "series", scope = AISPublicationType.class)
    public JAXBElement<CodeUpperAlphaType> createAISPublicationTypeSeries(CodeUpperAlphaType value) {
        return new JAXBElement<CodeUpperAlphaType>(_AISPublicationTypeSeries_QNAME, CodeUpperAlphaType.class, AISPublicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "number", scope = AISPublicationType.class)
    public JAXBElement<NoNumberType> createAISPublicationTypeNumber(NoNumberType value) {
        return new JAXBElement<NoNumberType>(_AISPublicationTypeNumber_QNAME, NoNumberType.class, AISPublicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateYearType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "year", scope = AISPublicationType.class)
    public JAXBElement<DateYearType> createAISPublicationTypeYear(DateYearType value) {
        return new JAXBElement<DateYearType>(_AISPublicationTypeYear_QNAME, DateYearType.class, AISPublicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "issued", scope = AISPublicationType.class)
    public JAXBElement<DateTimeType> createAISPublicationTypeIssued(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_AISPublicationTypeIssued_QNAME, DateTimeType.class, AISPublicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "effectiveStart", scope = AISPublicationType.class)
    public JAXBElement<DateTimeType> createAISPublicationTypeEffectiveStart(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_AISPublicationTypeEffectiveStart_QNAME, DateTimeType.class, AISPublicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "effectiveEnd", scope = AISPublicationType.class)
    public JAXBElement<DateTimeType> createAISPublicationTypeEffectiveEnd(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_AISPublicationTypeEffectiveEnd_QNAME, DateTimeType.class, AISPublicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XHTMLType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "content", scope = AISPublicationType.class)
    public JAXBElement<XHTMLType> createAISPublicationTypeContent(XHTMLType value) {
        return new JAXBElement<XHTMLType>(_AISPublicationTypeContent_QNAME, XHTMLType.class, AISPublicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "publisher", scope = AISPublicationType.class)
    public JAXBElement<UnitPropertyType> createAISPublicationTypePublisher(UnitPropertyType value) {
        return new JAXBElement<UnitPropertyType>(_AISPublicationTypePublisher_QNAME, UnitPropertyType.class, AISPublicationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "series", scope = NOTAMType.class)
    public JAXBElement<CodeUpperAlphaType> createNOTAMTypeSeries(CodeUpperAlphaType value) {
        return new JAXBElement<CodeUpperAlphaType>(_AISPublicationTypeSeries_QNAME, CodeUpperAlphaType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "number", scope = NOTAMType.class)
    public JAXBElement<NoNumberType> createNOTAMTypeNumber(NoNumberType value) {
        return new JAXBElement<NoNumberType>(_AISPublicationTypeNumber_QNAME, NoNumberType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateYearType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "year", scope = NOTAMType.class)
    public JAXBElement<DateYearType> createNOTAMTypeYear(DateYearType value) {
        return new JAXBElement<DateYearType>(_AISPublicationTypeYear_QNAME, DateYearType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "type", scope = NOTAMType.class)
    public JAXBElement<CodeNOTAMType> createNOTAMTypeType(CodeNOTAMType value) {
        return new JAXBElement<CodeNOTAMType>(_NOTAMTranslationTypeType_QNAME, CodeNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "issued", scope = NOTAMType.class)
    public JAXBElement<DateTimeType> createNOTAMTypeIssued(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_AISPublicationTypeIssued_QNAME, DateTimeType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "referredSeries", scope = NOTAMType.class)
    public JAXBElement<CodeUpperAlphaType> createNOTAMTypeReferredSeries(CodeUpperAlphaType value) {
        return new JAXBElement<CodeUpperAlphaType>(_NOTAMTypeReferredSeries_QNAME, CodeUpperAlphaType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "referredNumber", scope = NOTAMType.class)
    public JAXBElement<NoNumberType> createNOTAMTypeReferredNumber(NoNumberType value) {
        return new JAXBElement<NoNumberType>(_NOTAMTypeReferredNumber_QNAME, NoNumberType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateYearType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "referredYear", scope = NOTAMType.class)
    public JAXBElement<DateYearType> createNOTAMTypeReferredYear(DateYearType value) {
        return new JAXBElement<DateYearType>(_NOTAMTypeReferredYear_QNAME, DateYearType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "affectedFIR", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeAffectedFIR(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypeAffectedFIR_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "selectionCode", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeSelectionCode(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypeSelectionCode_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "traffic", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeTraffic(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypeTraffic_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "purpose", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypePurpose(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypePurpose_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "scope", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeScope(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypeScope_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "minimumFL", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeMinimumFL(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypeMinimumFL_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "maximumFL", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeMaximumFL(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypeMaximumFL_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "coordinates", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeCoordinates(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypeCoordinates_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "radius", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeRadius(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypeRadius_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "location", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeLocation(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypeLocation_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "effectiveStart", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeEffectiveStart(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_AISPublicationTypeEffectiveStart_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "effectiveEnd", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeEffectiveEnd(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_AISPublicationTypeEffectiveEnd_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "schedule", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeSchedule(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypeSchedule_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "text", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeText(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypeText_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "lowerLimit", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeLowerLimit(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypeLowerLimit_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "upperLimit", scope = NOTAMType.class)
    public JAXBElement<TextNOTAMType> createNOTAMTypeUpperLimit(TextNOTAMType value) {
        return new JAXBElement<TextNOTAMType>(_NOTAMTypeUpperLimit_QNAME, TextNOTAMType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "publisherNOF", scope = NOTAMType.class)
    public JAXBElement<UnitPropertyType> createNOTAMTypePublisherNOF(UnitPropertyType value) {
        return new JAXBElement<UnitPropertyType>(_NOTAMTypePublisherNOF_QNAME, UnitPropertyType.class, NOTAMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "name", scope = EventTimeSliceType.class)
    public JAXBElement<TextNameType> createEventTimeSliceTypeName(TextNameType value) {
        return new JAXBElement<TextNameType>(_EventTimeSliceTypeName_QNAME, TextNameType.class, EventTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeEventEncodingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "encoding", scope = EventTimeSliceType.class)
    public JAXBElement<CodeEventEncodingType> createEventTimeSliceTypeEncoding(CodeEventEncodingType value) {
        return new JAXBElement<CodeEventEncodingType>(_EventTimeSliceTypeEncoding_QNAME, CodeEventEncodingType.class, EventTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "scenario", scope = EventTimeSliceType.class)
    public JAXBElement<TextDesignatorType> createEventTimeSliceTypeScenario(TextDesignatorType value) {
        return new JAXBElement<TextDesignatorType>(_EventTimeSliceTypeScenario_QNAME, TextDesignatorType.class, EventTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoVersionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "version", scope = EventTimeSliceType.class)
    public JAXBElement<NoVersionType> createEventTimeSliceTypeVersion(NoVersionType value) {
        return new JAXBElement<NoVersionType>(_EventTimeSliceTypeVersion_QNAME, NoVersionType.class, EventTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "revision", scope = EventTimeSliceType.class)
    public JAXBElement<DateTimeType> createEventTimeSliceTypeRevision(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_EventTimeSliceTypeRevision_QNAME, DateTimeType.class, EventTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/event", name = "causeEvent", scope = EventTimeSliceType.class)
    public JAXBElement<EventPropertyType> createEventTimeSliceTypeCauseEvent(EventPropertyType value) {
        return new JAXBElement<EventPropertyType>(_EventTimeSliceTypeCauseEvent_QNAME, EventPropertyType.class, EventTimeSliceType.class, value);
    }

}