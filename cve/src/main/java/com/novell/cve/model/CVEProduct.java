package com.novell.cve.model;

import java.util.HashSet;
import java.util.Set;

public class CVEProduct {
    private String cpeURL;
    private String edition;
    private String language;
    private String product;
    private String productType;
    private String swEdition;
    private String targetHw;
    private String targetSw;
    private String update;
    private String vendor;
    private String version;
    private String other;
    Set<CVE> cves = new HashSet<>();

    public String getCpeURL() {
        return cpeURL;
    }

    public void setCpeURL(String cpeURL) {
        this.cpeURL = cpeURL;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSwEdition() {
        return swEdition;
    }

    public void setSwEdition(String swEdition) {
        this.swEdition = swEdition;
    }

    public String getTargetHw() {
        return targetHw;
    }

    public void setTargetHw(String targetHw) {
        this.targetHw = targetHw;
    }

    public String getTargetSw() {
        return targetSw;
    }

    public void setTargetSw(String targetSw) {
        this.targetSw = targetSw;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public Set<CVE> getCves() {
        return cves;
    }

    public void setCves(Set<CVE> cves) {
        this.cves = cves;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CVEProduct{");
        sb.append("cpeURL='").append(cpeURL).append('\'');
        sb.append(", edition='").append(edition).append('\'');
        sb.append(", language='").append(language).append('\'');
        sb.append(", product='").append(product).append('\'');
        sb.append(", productType='").append(productType).append('\'');
        sb.append(", swEdition='").append(swEdition).append('\'');
        sb.append(", targetHw='").append(targetHw).append('\'');
        sb.append(", targetSw='").append(targetSw).append('\'');
        sb.append(", update='").append(update).append('\'');
        sb.append(", vendor='").append(vendor).append('\'');
        sb.append(", version='").append(version).append('\'');
        sb.append(", other='").append(other).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
