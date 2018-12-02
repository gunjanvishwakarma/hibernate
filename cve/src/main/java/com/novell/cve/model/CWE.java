package com.novell.cve.model;

import java.util.HashSet;
import java.util.Set;

public class CWE{
    private String cweId;
    private String name;
    private String description;
    Set<CVE> cves = new HashSet<>();

    public String getCweId() {
        return cweId;
    }

    public void setCweId(String cweId) {
        this.cweId = cweId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<CVE> getCves() {
        return cves;
    }

    public void setCves(Set<CVE> cves) {
        this.cves = cves;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CWE{");
        sb.append("id=").append(cweId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
