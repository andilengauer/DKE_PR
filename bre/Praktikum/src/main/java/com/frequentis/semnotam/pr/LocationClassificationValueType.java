//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package com.frequentis.semnotam.pr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r LocationClassificationValueType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationClassificationValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEPARTUREAERODROME"/&gt;
 *     &lt;enumeration value="DESTINATIONAERODROME"/&gt;
 *     &lt;enumeration value="ALTERNATEAERODROME"/&gt;
 *     &lt;enumeration value="ENROUTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationClassificationValueType")
@XmlEnum
public enum LocationClassificationValueType {

    DEPARTUREAERODROME,
    DESTINATIONAERODROME,
    ALTERNATEAERODROME,
    ENROUTE;

    public String value() {
        return name();
    }

    public static LocationClassificationValueType fromValue(String v) {
        return valueOf(v);
    }

}
