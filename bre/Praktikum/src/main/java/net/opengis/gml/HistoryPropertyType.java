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
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AerialRefuellingTimeSliceType;
import aero.aixm.AeronauticalGroundLightTimeSliceType;
import aero.aixm.AirTrafficControlServiceTimeSliceType;
import aero.aixm.AirTrafficManagementServiceTimeSliceType;
import aero.aixm.AircraftGroundServiceTimeSliceType;
import aero.aixm.AircraftStandTimeSliceType;
import aero.aixm.AirportClearanceServiceTimeSliceType;
import aero.aixm.AirportHeliportCollocationTimeSliceType;
import aero.aixm.AirportHeliportTimeSliceType;
import aero.aixm.AirportHotSpotTimeSliceType;
import aero.aixm.AirportProtectionAreaMarkingTimeSliceType;
import aero.aixm.AirportSuppliesServiceTimeSliceType;
import aero.aixm.AirspaceBorderCrossingTimeSliceType;
import aero.aixm.AirspaceTimeSliceType;
import aero.aixm.AltimeterSourceTimeSliceType;
import aero.aixm.AngleIndicationTimeSliceType;
import aero.aixm.ApproachLightingSystemTimeSliceType;
import aero.aixm.ApronElementTimeSliceType;
import aero.aixm.ApronLightSystemTimeSliceType;
import aero.aixm.ApronMarkingTimeSliceType;
import aero.aixm.ApronTimeSliceType;
import aero.aixm.ArrestingGearTimeSliceType;
import aero.aixm.ArrivalFeederLegTimeSliceType;
import aero.aixm.ArrivalLegTimeSliceType;
import aero.aixm.AuthorityForAirspaceTimeSliceType;
import aero.aixm.AzimuthTimeSliceType;
import aero.aixm.ChangeOverPointTimeSliceType;
import aero.aixm.CheckpointINSTimeSliceType;
import aero.aixm.CheckpointVORTimeSliceType;
import aero.aixm.CirclingAreaTimeSliceType;
import aero.aixm.DMETimeSliceType;
import aero.aixm.DeicingAreaMarkingTimeSliceType;
import aero.aixm.DeicingAreaTimeSliceType;
import aero.aixm.DepartureLegTimeSliceType;
import aero.aixm.DesignatedPointTimeSliceType;
import aero.aixm.DirectionFinderTimeSliceType;
import aero.aixm.DistanceIndicationTimeSliceType;
import aero.aixm.ElevationTimeSliceType;
import aero.aixm.FinalLegTimeSliceType;
import aero.aixm.FireFightingServiceTimeSliceType;
import aero.aixm.FlightRestrictionTimeSliceType;
import aero.aixm.FloatingDockSiteTimeSliceType;
import aero.aixm.GeoBorderTimeSliceType;
import aero.aixm.GlidepathTimeSliceType;
import aero.aixm.GroundTrafficControlServiceTimeSliceType;
import aero.aixm.GuidanceLineLightSystemTimeSliceType;
import aero.aixm.GuidanceLineMarkingTimeSliceType;
import aero.aixm.GuidanceLineTimeSliceType;
import aero.aixm.HoldingAssessmentTimeSliceType;
import aero.aixm.HoldingPatternTimeSliceType;
import aero.aixm.InformationServiceTimeSliceType;
import aero.aixm.InitialLegTimeSliceType;
import aero.aixm.InstrumentApproachProcedureTimeSliceType;
import aero.aixm.IntermediateLegTimeSliceType;
import aero.aixm.LocalizerTimeSliceType;
import aero.aixm.MarkerBeaconTimeSliceType;
import aero.aixm.MarkingBuoyTimeSliceType;
import aero.aixm.MissedApproachLegTimeSliceType;
import aero.aixm.NDBTimeSliceType;
import aero.aixm.NavaidTimeSliceType;
import aero.aixm.NavigationAreaRestrictionTimeSliceType;
import aero.aixm.NavigationAreaTimeSliceType;
import aero.aixm.NonMovementAreaTimeSliceType;
import aero.aixm.ObstacleAreaTimeSliceType;
import aero.aixm.OrganisationAuthorityTimeSliceType;
import aero.aixm.PassengerLoadingBridgeTimeSliceType;
import aero.aixm.PassengerServiceTimeSliceType;
import aero.aixm.PilotControlledLightingTimeSliceType;
import aero.aixm.PrecisionApproachRadarTimeSliceType;
import aero.aixm.PrimarySurveillanceRadarTimeSliceType;
import aero.aixm.ProcedureDMETimeSliceType;
import aero.aixm.RadarSystemTimeSliceType;
import aero.aixm.RadioCommunicationChannelTimeSliceType;
import aero.aixm.RadioFrequencyAreaTimeSliceType;
import aero.aixm.RoadTimeSliceType;
import aero.aixm.RouteDMETimeSliceType;
import aero.aixm.RouteSegmentTimeSliceType;
import aero.aixm.RouteTimeSliceType;
import aero.aixm.RulesProceduresTimeSliceType;
import aero.aixm.RunwayBlastPadTimeSliceType;
import aero.aixm.RunwayCentrelinePointTimeSliceType;
import aero.aixm.RunwayDirectionLightSystemTimeSliceType;
import aero.aixm.RunwayDirectionTimeSliceType;
import aero.aixm.RunwayElementTimeSliceType;
import aero.aixm.RunwayMarkingTimeSliceType;
import aero.aixm.RunwayProtectAreaLightSystemTimeSliceType;
import aero.aixm.RunwayProtectAreaTimeSliceType;
import aero.aixm.RunwayTimeSliceType;
import aero.aixm.RunwayVisualRangeTimeSliceType;
import aero.aixm.SDFTimeSliceType;
import aero.aixm.SafeAltitudeAreaTimeSliceType;
import aero.aixm.SeaplaneLandingAreaTimeSliceType;
import aero.aixm.SeaplaneRampSiteTimeSliceType;
import aero.aixm.SearchRescueServiceTimeSliceType;
import aero.aixm.SecondarySurveillanceRadarTimeSliceType;
import aero.aixm.SignificantPointInAirspaceTimeSliceType;
import aero.aixm.SpecialDateTimeSliceType;
import aero.aixm.SpecialNavigationStationTimeSliceType;
import aero.aixm.SpecialNavigationSystemTimeSliceType;
import aero.aixm.StandMarkingTimeSliceType;
import aero.aixm.StandardInstrumentArrivalTimeSliceType;
import aero.aixm.StandardInstrumentDepartureTimeSliceType;
import aero.aixm.StandardLevelColumnTimeSliceType;
import aero.aixm.StandardLevelSectorTimeSliceType;
import aero.aixm.StandardLevelTableTimeSliceType;
import aero.aixm.SurveyControlPointTimeSliceType;
import aero.aixm.TACANTimeSliceType;
import aero.aixm.TaxiHoldingPositionLightSystemTimeSliceType;
import aero.aixm.TaxiHoldingPositionMarkingTimeSliceType;
import aero.aixm.TaxiHoldingPositionTimeSliceType;
import aero.aixm.TaxiwayElementTimeSliceType;
import aero.aixm.TaxiwayLightSystemTimeSliceType;
import aero.aixm.TaxiwayMarkingTimeSliceType;
import aero.aixm.TaxiwayTimeSliceType;
import aero.aixm.TerminalArrivalAreaTimeSliceType;
import aero.aixm.TouchDownLiftOffLightSystemTimeSliceType;
import aero.aixm.TouchDownLiftOffMarkingTimeSliceType;
import aero.aixm.TouchDownLiftOffSafeAreaTimeSliceType;
import aero.aixm.TouchDownLiftOffTimeSliceType;
import aero.aixm.UnitTimeSliceType;
import aero.aixm.UnplannedHoldingTimeSliceType;
import aero.aixm.VORTimeSliceType;
import aero.aixm.VerticalStructureTimeSliceType;
import aero.aixm.VisualGlideSlopeIndicatorTimeSliceType;
import aero.aixm.WorkAreaTimeSliceType;
import aero.aixm.event.EventTimeSliceType;


/**
 * <p>Java-Klasse f�r HistoryPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HistoryPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractTimeSlice" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryPropertyType", propOrder = {
    "abstractTimeSlice"
})
public class HistoryPropertyType {

    @XmlElementRef(name = "AbstractTimeSlice", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractTimeSliceType>> abstractTimeSlice;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * Gets the value of the abstractTimeSlice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractTimeSlice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractTimeSlice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CirclingAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AzimuthTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SDFTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnplannedHoldingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrimarySurveillanceRadarTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link VORTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadarSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DesignatedPointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialDateTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerialRefuellingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneRampSiteTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkingBuoyTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeoBorderTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportClearanceServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleIndicationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NonMovementAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelTableTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlightRestrictionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MissedApproachLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcedureDMETimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelSectorTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelColumnTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObstacleAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointVORTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FloatingDockSiteTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavaidTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntermediateLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AeronauticalGroundLightTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficControlServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayElementTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayElementTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TACANTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectionFinderTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayVisualRangeTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurveyControlPointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftGroundServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link EventTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link InformationServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationAuthorityTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayCentrelinePointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkerBeaconTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrecisionApproachRadarTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteSegmentTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PilotControlledLightingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficManagementServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalStructureTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SafeAltitudeAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RulesProceduresTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TerminalArrivalAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioFrequencyAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceIndicationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentDepartureTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MovingObjectStatusType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationStationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHotSpotTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalizerTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FinalLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalFeederLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingPatternTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FireFightingServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepartureLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteDMETimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffSafeAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioCommunicationChannelTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DMETimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrestingGearTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApproachLightingSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GroundTrafficControlServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayBlastPadTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingAssessmentTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointINSTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeOverPointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GlidepathTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftStandTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportCollocationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerLoadingBridgeTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronElementTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SearchRescueServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportSuppliesServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link InitialLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NDBTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AltimeterSourceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityForAirspaceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaLightSystemTimeSliceType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractTimeSliceType>> getAbstractTimeSlice() {
        if (abstractTimeSlice == null) {
            abstractTimeSlice = new ArrayList<JAXBElement<? extends AbstractTimeSliceType>>();
        }
        return this.abstractTimeSlice;
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

}
