//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 10:20:45 PM IST 
//


package gov.nist.scap.schema.cvss_v2._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for confidenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="confidenceType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://scap.nist.gov/schema/cvss-v2/0.2>confidenceEnumType">
 *       &lt;attGroup ref="{http://scap.nist.gov/schema/cvss-v2/0.2}vectorAttributeGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confidenceType", propOrder = {
    "value"
})
public class ConfidenceType {

    @XmlValue
    protected ConfidenceEnumType value;
    @XmlAttribute(name = "approximated")
    protected Boolean approximated;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidenceEnumType }
     *     
     */
    public ConfidenceEnumType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidenceEnumType }
     *     
     */
    public void setValue(ConfidenceEnumType value) {
        this.value = value;
    }

    /**
     * Gets the value of the approximated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isApproximated() {
        if (approximated == null) {
            return false;
        } else {
            return approximated;
        }
    }

    /**
     * Sets the value of the approximated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximated(Boolean value) {
        this.approximated = value;
    }

}
