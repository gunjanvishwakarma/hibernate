//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 10:20:45 PM IST 
//


package gov.nist.scap.schema.cvss_v2._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ciaEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ciaEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="PARTIAL"/>
 *     &lt;enumeration value="COMPLETE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ciaEnumType")
@XmlEnum
public enum CiaEnumType {

    NONE,
    PARTIAL,
    COMPLETE;

    public String value() {
        return name();
    }

    public static CiaEnumType fromValue(String v) {
        return valueOf(v);
    }

}