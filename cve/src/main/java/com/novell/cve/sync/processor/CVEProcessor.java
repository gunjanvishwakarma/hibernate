package com.novell.cve.sync.processor;

import gov.nist.scap.schema.vulnerability._0.VulnerabilityType;
import org.springframework.batch.item.ItemProcessor;

//run before writing
public class CVEProcessor implements ItemProcessor<VulnerabilityType, VulnerabilityType> {

	@Override
	public VulnerabilityType process(VulnerabilityType item) throws Exception {

		return item;
	}

}