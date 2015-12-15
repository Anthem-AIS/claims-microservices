package com.anthem.ais.pmb.claims.microservices.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPayment;
import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPaymentPK;
import com.anthem.ais.pmb.claims.microservices.domain.entity.HcidSequenceNumber2Uuid;
import com.anthem.ais.pmb.claims.microservices.domain.service.ClaimsPaymentService;
import com.anthem.ais.pmb.claims.microservices.domain.service.HcidSequenceNumber2UuidService;
import com.anthem.ais.pmb.claims.microservices.rest.model.HcIdUuIdModel;
import com.anthem.ais.pmb.claims.microservices.rest.model.PayNowRequest;
import com.anthem.ais.pmb.claims.microservices.rest.model.PostBackRequest;
import com.anthem.ais.pmb.claims.microservices.util.PMBDateUtil;
import com.anthem.ais.pmb.claims.microservices.util.PMBConstants;

@Component
public class InstaMedPostBackService {

	@Autowired
	private ClaimsPaymentService claimsPaymentService;
	
	@Autowired
	private HcidSequenceNumber2UuidService hcidSequenceNumber2UuidService;
	
	@Transactional
	public String payNow(PayNowRequest pnr){
		
		String status = PMBConstants.EMPTY_SPACE;
		
		return status;
	}
	
	@Transactional
	public String saveHcIdUuIdPair(HcIdUuIdModel hu){
		
		String status = PMBConstants.EMPTY_SPACE;
		
		HcidSequenceNumber2Uuid hsu = new  HcidSequenceNumber2Uuid();
		hsu.setHcid(hu.getHcId());
		hsu.setUuid(hu.getUuId());
		
		hsu = hcidSequenceNumber2UuidService.savehcId(hsu);
		
		if (hsu != null) {
			status = PMBConstants.RESPONSE_SUCCESS;
		} else {
			status = PMBConstants.RESPONSE_ERROR;
		}
		return status;
	}

	@Transactional
	public String savePostBackData(PostBackRequest pr) {
		String status = "";
		ClaimsPayment cp = convertRequestToEntity(pr);
		//Get HCID from UUID (EEID)
		List<HcidSequenceNumber2Uuid> ids = claimsPaymentService.getHcidByUuid(pr.geteEID());
		cp.setHcidSequenceNumber2Uuid(ids.get(0));
		cp = claimsPaymentService.savePostBackData(cp);
		if (cp != null) {
			status = PMBConstants.RESPONSE_SUCCESS;
		} else {
			status = PMBConstants.RESPONSE_ERROR;
		}
		return status;
	}

	@Transactional
	private ClaimsPayment convertRequestToEntity(PostBackRequest pr) {
		ClaimsPayment cp = new ClaimsPayment();
		ClaimsPaymentPK pk = new ClaimsPaymentPK();
		pk.setClaimId(pr.getClaimNumber());
		pk.setPaymentTransactionid(pr.getPaymentTransactionID());
		cp.setId(pk);
		cp.setAmountPaid((long)Float.parseFloat(pr.getAmount()));
		cp.setBusinessDate((int) System.currentTimeMillis());
		cp.setClaimReferenceNumber(pr.getClaimReferenceNumber());
		cp.setDisbursementType(pr.getDisbursementType());
		cp.setEeId(pr.geteEID());
		cp.setEmpGroupNumber(pr.getEmpGroupNumber());
		cp.setEmpSequenceNumber(pr.getEmpSequenceNumber());
		cp.setStatusCode(pr.getStatusCode());
		cp.setSequenceNumber(Long.parseLong(pr.getEmpSequenceNumber()));
		cp.setTemplateId("");
		cp.setTransactionAction(pr.getTransactionAction());
		cp.setTransactionDateTime(PMBDateUtil.getTimestampfromString(
				pr.getTransactionDateTime(), PMBConstants.MM_DD_YYYY));
		return cp;
	}

}
