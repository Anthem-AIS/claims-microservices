package com.anthem.ais.pmb.claims.microservices.domain.service;

import java.util.List;

import com.anthem.ais.pmb.claims.microservices.domain.dao.ClaimsPaymentsDAO;
import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPayment;
import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPaymentPK;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicated;
import com.anthem.ais.pmb.claims.microservices.generic.service.GenericEntityService;

public interface ClaimsPaymentService extends GenericEntityService<ClaimsPayment, ClaimsPaymentPK>{

	public ClaimsPaymentsDAO getEntityDao();
	public ClaimsPayment savePostBackData(ClaimsPayment cp);	
	public List<ClaimsPayment> findByHcId(String hcid);
	public List<ClaimsPayment> findByClaimId(String claimId);

}
