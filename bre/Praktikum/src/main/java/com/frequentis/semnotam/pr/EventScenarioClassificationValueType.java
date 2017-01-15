//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package com.frequentis.semnotam.pr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EventScenarioClassificationValueType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EventScenarioClassificationValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALS.UNS"/&gt;
 *     &lt;enumeration value="AD.CLS"/&gt;
 *     &lt;enumeration value="RWY.CLS"/&gt;
 *     &lt;enumeration value="TWY.CLS"/&gt;
 *     &lt;enumeration value="OBS.NEW"/&gt;
 *     &lt;enumeration value="ATSA.ACT"/&gt;
 *     &lt;enumeration value="ATSA.NEW"/&gt;
 *     &lt;enumeration value="SAA.ACT"/&gt;
 *     &lt;enumeration value="TWY.CLS"/&gt;
 *     &lt;enumeration value="SAA.NEW"/&gt;
 *     &lt;enumeration value="AERODROMESCENARIO"/&gt;
 *     &lt;enumeration value="ENROUTESCENARIO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventScenarioClassificationValueType")
@XmlEnum
public enum EventScenarioClassificationValueType {

    @XmlEnumValue("ALS.UNS")
    ALS_UNS("ALS.UNS"),
    @XmlEnumValue("AD.CLS")
    AD_CLS("AD.CLS"),
    @XmlEnumValue("RWY.CLS")
    RWY_CLS("RWY.CLS"),
    @XmlEnumValue("TWY.CLS")
    TWY_CLS("TWY.CLS"),
    @XmlEnumValue("OBS.NEW")
    OBS_NEW("OBS.NEW"),
    @XmlEnumValue("ATSA.ACT")
    ATSA_ACT("ATSA.ACT"),
    @XmlEnumValue("ATSA.NEW")
    ATSA_NEW("ATSA.NEW"),
    @XmlEnumValue("SAA.ACT")
    SAA_ACT("SAA.ACT"),
    @XmlEnumValue("SAA.NEW")
    SAA_NEW("SAA.NEW"),
    AERODROMESCENARIO("AERODROMESCENARIO"),
    ENROUTESCENARIO("ENROUTESCENARIO");
    private final String value;

    EventScenarioClassificationValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventScenarioClassificationValueType fromValue(String v) {
        for (EventScenarioClassificationValueType c: EventScenarioClassificationValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
