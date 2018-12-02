package com.novell.cve.model;

import com.novell.cve.sync.Severity;

import java.math.BigDecimal;
import java.util.*;

public class CVE {
    private String cveId;
    private BigDecimal cvssScore = new BigDecimal(0);
    private Date lastModifiedDateTime;
    private Date publishedDateTime;
    private Severity severity;
    private String summary;
    private boolean isPresentInZone;
    private String vendorList;
    private Collection<CVEReference> cveReferences = new ArrayList();
    private Set<CVEProduct> cveProducts = new HashSet<>();
    private Set<CWE> cwes = new HashSet<>();

    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId;
    }

    public BigDecimal getCvssScore() {
        return cvssScore;
    }

    public void setCvssScore(BigDecimal cvssScore) {
        this.cvssScore = cvssScore;
    }

    public Date getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(Date lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    public Date getPublishedDateTime() {
        return publishedDateTime;
    }

    public void setPublishedDateTime(Date publishedDateTime) {
        this.publishedDateTime = publishedDateTime;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isPresentInZone() {
        return isPresentInZone;
    }

    public void setPresentInZone(boolean presentInZone) {
        isPresentInZone = presentInZone;
    }

    public String getVendorList() {
        return vendorList;
    }

    public void setVendorList(String vendorList) {
        this.vendorList = vendorList;
    }


    public Collection<CVEReference> getCveReferences() {
        return cveReferences;
    }

    public void setCveReferences(Collection<CVEReference> cveReferences) {
        this.cveReferences = cveReferences;
    }

    public Set<CVEProduct> getCveProducts() {
        return cveProducts;
    }

    public void setCveProducts(Set<CVEProduct> cveProducts) {
        this.cveProducts = cveProducts;
    }

    public Set<CWE> getCwes() {
        return cwes;
    }

    public void setCwes(Set<CWE> cwes) {
        this.cwes = cwes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CVE{");
        sb.append("cveId='").append(cveId).append('\'');
        sb.append(", cvssScore=").append(cvssScore);
        sb.append(", lastModifiedDateTime=").append(lastModifiedDateTime);
        sb.append(", publishedDateTime=").append(publishedDateTime);
        sb.append(", severity=").append(severity);
        sb.append(", summary='").append(summary).append('\'');
        sb.append(", isPresentInZone=").append(isPresentInZone);
        sb.append(", vendorList='").append(vendorList).append('\'');
        sb.append(", cveReferences=").append(cveReferences);
        sb.append(", cveProducts=").append(cveProducts);
        sb.append(", cwes=").append(cwes);
        sb.append('}');
        return sb.toString();
    }
}

