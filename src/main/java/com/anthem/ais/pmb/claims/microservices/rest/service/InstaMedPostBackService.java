package com.anthem.ais.pmb.claims.microservices.rest.service;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.anthem.ais.pmb.claims.microservices.common.generated.ClaimsSummary;
import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPayment;
import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPaymentPK;
import com.anthem.ais.pmb.claims.microservices.domain.service.ClaimsPaymentService;
import com.anthem.ais.pmb.claims.microservices.response.VirtualSummaryResponse;
import com.anthem.ais.pmb.claims.microservices.rest.model.PayNowRequest;
import com.anthem.ais.pmb.claims.microservices.rest.model.PostBackRequest;
import com.anthem.ais.pmb.claims.microservices.util.Encryption;
import com.anthem.ais.pmb.claims.microservices.util.PMBConstants;
import com.anthem.ais.pmb.claims.microservices.util.PMBDateUtil;
import com.anthem.ais.pmb.claims.microservices.util.PMBPropertiesUtil;

@Component
public class InstaMedPostBackService {

	@Autowired
	private ClaimsPaymentService claimsPaymentService;
	@Autowired
	private RestTemplate restTemplate;

	@Transactional
	public String savePostBackData(PostBackRequest pr) throws IOException,
			InvalidKeyException, NoSuchAlgorithmException,
			NoSuchPaddingException, IllegalBlockSizeException,
			BadPaddingException, InvalidAlgorithmParameterException,
			InvalidKeySpecException {
		String status = "";
		ClaimsPayment cp = convertRequestToEntity(pr);
		cp.setHcid(Encryption.getInstance().decrypt(pr.getUserId(), "aes"));
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
		cp.setAmountPaid((long) Float.parseFloat(pr.getAmount()));
		cp.setBusinessDate((int) System.currentTimeMillis());
		cp.setClaimReferenceNumber(pr.getClaimReferenceNumber());
		cp.setDisbursementType(pr.getDisbursementType());
		cp.setEeId((pr.geteEID() == null) ? PMBConstants.EMPTY_SPACE : pr
				.geteEID());
		cp.setEmpGroupNumber((pr.getEmpGroupNumber() == null) ? PMBConstants.EMPTY_SPACE
				: pr.getEmpGroupNumber());
		cp.setEmpSequenceNumber((pr.getEmpSequenceNumber() == null) ? PMBConstants.EMPTY_SPACE
				: pr.getEmpSequenceNumber());
		cp.setStatusCode(pr.getStatusCode());
		cp.setSequenceNumber(Long.parseLong((pr.getEmpSequenceNumber() == null || PMBConstants.EMPTY_SPACE
				.equals(pr.getEmpSequenceNumber())) ? "0" : pr
				.getEmpSequenceNumber()));
		cp.setTemplateId("");
		cp.setTransactionAction(pr.getTransactionAction());
		cp.setTransactionDateTime(PMBDateUtil.getTimestampfromString(
				pr.getTransactionDateTime(), PMBConstants.MM_DD_YYYY));
		return cp;
	}

}
