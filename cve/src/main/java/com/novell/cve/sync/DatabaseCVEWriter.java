package com.novell.cve.sync;

import com.novell.cve.HibernateUtil;
import com.novell.cve.model.CVE;
import com.novell.cve.model.CVEProduct;
import com.novell.cve.model.CVEReference;
import com.novell.cve.model.CWE;
import gov.nist.scap.schema.vulnerability._0.CweReferenceType;
import gov.nist.scap.schema.vulnerability._0.VulnerabilityReferenceType;
import gov.nist.scap.schema.vulnerability._0.VulnerabilityType;
import org.apache.tomcat.util.buf.StringUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.batch.item.ItemWriter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DatabaseCVEWriter implements ItemWriter<VulnerabilityType> {

    @Override
    public void write(List<? extends VulnerabilityType> items) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        for (VulnerabilityType vulnerabilityType : items) {
            CVE cve = new CVE();
            cve.setCveId(vulnerabilityType.getCveId());
            cve.setLastModifiedDateTime(vulnerabilityType.getLastModifiedDatetime().toGregorianCalendar().getTime());
            cve.setPublishedDateTime(vulnerabilityType.getPublishedDatetime().toGregorianCalendar().getTime());
            cve.setSummary(vulnerabilityType.getSummary());


            if (vulnerabilityType.getCvss() != null) {
                cve.setCvssScore(vulnerabilityType.getCvss().getBaseMetrics().get(0).getScore());
            }

            cve.setSeverity(CVEUtil.getSeverity(cve.getCvssScore().floatValue()));

            List<CVEReference> cveReferences = new ArrayList<>();

            for (VulnerabilityReferenceType vulnerabilityReferenceType : vulnerabilityType.getReferences()) {
                CVEReference cveReference = new CVEReference();
                cveReference.setReference(vulnerabilityReferenceType.getReference().toString());
                cveReference.setSource(vulnerabilityReferenceType.getSource());
                cveReferences.add(cveReference);
            }

            cve.setCveReferences(cveReferences);

            Set<String> vendors = new HashSet<>();

            Set<CVEProduct> cveProducts = new HashSet<>();
            if (vulnerabilityType.getVulnerableSoftwareList() != null) {
                for (String product : vulnerabilityType.getVulnerableSoftwareList().getProduct()) {
                    CVEProduct cveProduct = CVEUtil.getCVEProduct(product);
                    cveProducts.add(cveProduct);
                    vendors.add(cveProduct.getVendor());
                }
            }

            cve.setVendorList(StringUtils.join(vendors, ','));


            cve.setCveProducts(cveProducts);

            Set<CWE> cwes = new HashSet<>();
            for (CweReferenceType cweReferenceType : vulnerabilityType.getCwe()) {
                CWE cwe = new CWE();
                cwe.setCweId(cweReferenceType.getId());
                cwes.add(cwe);
            }

            cve.setCwes(cwes);
            session.merge(cve);
            session.flush();
            session.clear();

            //System.out.println(cve);
        }

        transaction.commit();
        session.close();
    }

}
