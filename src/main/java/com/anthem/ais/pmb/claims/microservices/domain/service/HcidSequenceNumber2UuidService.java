package com.anthem.ais.pmb.claims.microservices.domain.service;

import com.anthem.ais.pmb.claims.microservices.domain.entity.HcidSequenceNumber2Uuid;
import com.anthem.ais.pmb.claims.microservices.generic.service.GenericEntityService;

public interface HcidSequenceNumber2UuidService extends
		GenericEntityService<HcidSequenceNumber2Uuid, String> {
	public HcidSequenceNumber2Uuid savehcId(HcidSequenceNumber2Uuid cp);
}
