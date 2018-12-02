package com.novell.cve.sync;

import com.novell.cve.common.WellFormedName;
import com.novell.cve.model.CVEProduct;
import com.novell.cve.naming.CPENameUnbinder;

import java.text.ParseException;

public class CVEUtil {
    public static CVEProduct getCVEProduct(String product) {

        CVEProduct cveProduct = new CVEProduct();
        cveProduct.setCpeURL(product);
        CPENameUnbinder cpenu = new CPENameUnbinder();
        try {
            WellFormedName wfn = cpenu.unbindURI(product);
            if (wfn.get("vendor") instanceof String)
                cveProduct.setVendor((String) wfn.get("vendor"));
            if (wfn.get("product") instanceof String)
                cveProduct.setProduct((String) wfn.get("product"));
            if (wfn.get("version") instanceof String)
                cveProduct.setVersion((String) wfn.get("version"));
            if (wfn.get("update") instanceof String)
                cveProduct.setUpdate((String) wfn.get("update"));
            if (wfn.get("edition") instanceof String)
                cveProduct.setEdition((String) wfn.get("edition"));
            if (wfn.get("language") instanceof String)
                cveProduct.setLanguage((String) wfn.get("language"));
            if (wfn.get("sw_edition") instanceof String)
                cveProduct.setSwEdition((String) wfn.get("sw_edition"));
            if (wfn.get("target_sw") instanceof String)
                cveProduct.setTargetSw((String) wfn.get("target_sw"));
            if (wfn.get("target_hw") instanceof String)
                cveProduct.setTargetHw((String) wfn.get("target_hw"));
            if (wfn.get("other") instanceof String)
                cveProduct.setOther((String) wfn.get("other"));


        } catch (ParseException e) {
            e.printStackTrace();
        }

        return cveProduct;
    }

    public static Severity getSeverity(Float cvssScore) {
        Severity severity = Severity.None;
        if (cvssScore > 0 && cvssScore < 4) {
            severity = Severity.Low;
        } else if (cvssScore >= 4 & cvssScore < 7) {
            severity = Severity.Medium;
        } else if (cvssScore >= 7 && cvssScore < 9) {
            severity = Severity.High;
        } else if (cvssScore >= 9 && cvssScore <= 10) {
            severity = Severity.Critical;
        }
        return severity;
    }
}
