package com.anthem.ais.pmb.claims.microservices.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.anthem.ais.pmb.claims.microservices.domain.dao.ClaimsPaymentsDAO;
import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPayment;
import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPaymentPK;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicated;
import com.anthem.ais.pmb.claims.microservices.generic.service.GenericEntityServiceImpl;

public class ClaimsPaymentServiceImpl extends
		GenericEntityServiceImpl<ClaimsPayment, ClaimsPaymentPK> implements
		ClaimsPaymentService {
	
	@Autowired
	private ClaimsPaymentsDAO claimsPaymentsDAO = null;

	public ClaimsPaymentsDAO getClaimsPaymentsDAO() {
		return claimsPaymentsDAO;
	}

	public void setClaimsPaymentsDAO(ClaimsPaymentsDAO claimsPaymentsDAO) {
		this.claimsPaymentsDAO = claimsPaymentsDAO;
	}

	@Override
	public ClaimsPaymentsDAO getEntityDao() {
		return getClaimsPaymentsDAO();
	}

	@Transactional
	public ClaimsPayment savePostBackData(ClaimsPayment cp) {
		return claimsPaymentsDAO.saveOrUpdate(cp);
	}

	@Transactional
	public List<ClaimsPayment> findByHcId(String hcid){
		return claimsPaymentsDAO.findByHcId(hcid);
		
	}
	
	@Override
	@Transactional
	public List<ClaimsPayment> findByClaimId(String claimId){
		return claimsPaymentsDAO.findByHcId(claimId);
	}
}
