package com.anthem.ais.pmb.claims.microservices.domain.dao;

import java.util.List;

import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPayment;
import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPaymentPK;
import com.anthem.ais.pmb.claims.microservices.domain.entity.HcidSequenceNumber2Uuid;
import com.anthem.ais.pmb.claims.microservices.generic.dao.GenericPMBDAO;

public interface ClaimsPaymentsDAO extends GenericPMBDAO<ClaimsPayment,ClaimsPaymentPK>{
	
	public List<HcidSequenceNumber2Uuid> getHcidByUuid(String uuid);
	
}
