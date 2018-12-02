//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 10:20:45 PM IST 
//


package gov.nist.scap.schema.cvss_v2._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * "This nvd.nist.gov.schema was intentionally designed to avoid mixing classes and attributes between CVSS version 1, CVSS version 2, and future versions. Scores in the CVSS system are interdependent.  The temporal score is a multiplier of the base score.  The environmental score, in turn, is a multiplier of the temporal score.  The ability to transfer these scores independently is provided on the assumption that the user understands the business logic. For any given metric, it is preferred that the score, as a minimum is provided, however the score can be re-created from the metrics or the multiplier and any scores they are dependent on."
 * 
 * <p>Java class for cvssType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cvssType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base_metrics" type="{http://scap.nist.gov/schema/cvss-v2/0.2}baseMetricsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="environmental_metrics" type="{http://scap.nist.gov/schema/cvss-v2/0.2}environmentalMetricsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="temporal_metrics" type="{http://scap.nist.gov/schema/cvss-v2/0.2}temporalMetricsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cvssType", propOrder = {
    "baseMetrics",
    "environmentalMetrics",
    "temporalMetrics"
})
@XmlSeeAlso({
    CvssImpactType.class
})
public class CvssType {

    @XmlElement(name = "base_metrics")
    protected List<BaseMetricsType> baseMetrics;
    @XmlElement(name = "environmental_metrics")
    protected List<EnvironmentalMetricsType> environmentalMetrics;
    @XmlElement(name = "temporal_metrics")
    protected List<TemporalMetricsType> temporalMetrics;

    /**
     * Gets the value of the baseMetrics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseMetrics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseMetrics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseMetricsType }
     * 
     * 
     */
    public List<BaseMetricsType> getBaseMetrics() {
        if (baseMetrics == null) {
            baseMetrics = new ArrayList<BaseMetricsType>();
        }
        return this.baseMetrics;
    }

    /**
     * Gets the value of the environmentalMetrics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentalMetrics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentalMetrics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentalMetricsType }
     * 
     * 
     */
    public List<EnvironmentalMetricsType> getEnvironmentalMetrics() {
        if (environmentalMetrics == null) {
            environmentalMetrics = new ArrayList<EnvironmentalMetricsType>();
        }
        return this.environmentalMetrics;
    }

    /**
     * Gets the value of the temporalMetrics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temporalMetrics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemporalMetrics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemporalMetricsType }
     * 
     * 
     */
    public List<TemporalMetricsType> getTemporalMetrics() {
        if (temporalMetrics == null) {
            temporalMetrics = new ArrayList<TemporalMetricsType>();
        }
        return this.temporalMetrics;
    }

}
