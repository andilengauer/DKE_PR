//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.11 um 03:55:18 PM CET 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r SuccessionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SuccessionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="substitution"/&gt;
 *     &lt;enumeration value="division"/&gt;
 *     &lt;enumeration value="fusion"/&gt;
 *     &lt;enumeration value="initiation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SuccessionType")
@XmlEnum
public enum SuccessionType {

    @XmlEnumValue("substitution")
    SUBSTITUTION("substitution"),
    @XmlEnumValue("division")
    DIVISION("division"),
    @XmlEnumValue("fusion")
    FUSION("fusion"),
    @XmlEnumValue("initiation")
    INITIATION("initiation");
    private final String value;

    SuccessionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuccessionType fromValue(String v) {
        for (SuccessionType c: SuccessionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
