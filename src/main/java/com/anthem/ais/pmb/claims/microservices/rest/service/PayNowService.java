package com.anthem.ais.pmb.claims.microservices.rest.service;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.anthem.ais.pmb.claims.microservices.common.generated.Claim;
import com.anthem.ais.pmb.claims.microservices.common.generated.ClaimsSummary;
import com.anthem.ais.pmb.claims.microservices.request.PayNowInstaMedRequest;
import com.anthem.ais.pmb.claims.microservices.response.VirtualSummaryResponse;
import com.anthem.ais.pmb.claims.microservices.rest.model.PayNowRequest;
import com.anthem.ais.pmb.claims.microservices.util.Encryption;
import com.anthem.ais.pmb.claims.microservices.util.PMBConstants;
import com.anthem.ais.pmb.claims.microservices.util.PMBPropertiesUtil;

@Component
public class PayNowService {
	@Autowired
	private RestTemplate restTemplate;

	public String payNow(PayNowRequest pnr) throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, InvalidKeySpecException {

		String status = PMBConstants.EMPTY_SPACE;

		// Lookup EdgeService /members/{token}/claims
		String edgeHost = PMBPropertiesUtil
				.getProperty(PMBConstants.EDGE_SERVICE_HOST_URL);
		String uri = new String(edgeHost + "/members/" + pnr.getUserToken()
				+ "/claims/" + pnr.getClaimId());
		ClaimsSummary cs = restTemplate.getForObject(uri, ClaimsSummary.class);

		// Lookup Virtual Service for remaining fields
		String virtualHost = PMBPropertiesUtil
				.getProperty(PMBConstants.VIRTUAL_HOST_URL);
		String vuri = new String(virtualHost
				+ "/pmb/claims/virtual?claimId=2015280AS1000");
		VirtualSummaryResponse vs = restTemplate.getForObject(vuri,
				VirtualSummaryResponse.class);
		PayNowInstaMedRequest postReq = constructRequest(pnr, vs, cs);
		String instamedRes = postToInstamed(postReq);

		return status;
	}

	private String postToInstamed( PayNowInstaMedRequest req) {
		 HttpHeaders headers = new HttpHeaders();
	     headers.setContentType(MediaType.APPLICATION_JSON);
	     headers.set("apikey", PMBConstants.API_KEY);
	     HttpEntity request= new HttpEntity(req, headers);
	     String result = restTemplate.postForObject(PMBPropertiesUtil.getProperty(PMBConstants.INSTAMED_URL), request, String.class);
	     return result;		
	}

	public PayNowInstaMedRequest constructRequest(PayNowRequest pnr,
			VirtualSummaryResponse vs, ClaimsSummary cs)
			throws InvalidKeyException, UnsupportedEncodingException,
			NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException,
			BadPaddingException, InvalidKeySpecException {
		PayNowInstaMedRequest req = new PayNowInstaMedRequest();
		Claim claim = cs.getClaims().get(0);
		Encryption encryption = Encryption.getInstance();
		req.setClaimNumber(encryption.encrypt(pnr.getClaimId(),PMBConstants.AES_ALGO));
		req.setClaimReferenceNumber(encryption.encrypt(pnr.getClaimId(),PMBConstants.AES_ALGO));
		req.setUserID(encryption.encrypt(pnr.getHcId(),PMBConstants.AES_ALGO));
		req.setUserEmail(encryption.encrypt(pnr.getUserEmailId(),PMBConstants.AES_ALGO));
		req.setServiceStartDate(encryption.encrypt(claim.getClmStartDt(),PMBConstants.AES_ALGO));
		req.setServiceEndDate(encryption.encrypt(claim.getClmEndDt(),PMBConstants.AES_ALGO));
		req.setAmountDue(encryption.encrypt(pnr.getAmountPaid(),PMBConstants.AES_ALGO));
		req.setPatientID(encryption.encrypt(pnr.getHcId(),PMBConstants.AES_ALGO));
		req.setPatientFirstName(encryption.encrypt(claim.getPatient().getFirstNm(),PMBConstants.AES_ALGO));
		req.setPatientLastName(encryption.encrypt(claim.getPatient().getFirstNm(),PMBConstants.AES_ALGO));
		req.setProviderBillingTIN(encryption.encrypt(vs.getProvider().getBillingTIN(),PMBConstants.AES_ALGO));
		req.setProviderPhoneNumber(encryption.encrypt(vs.getProvider().getPhoneNumber(),PMBConstants.AES_ALGO));
		req.setPayToProviderName(encryption.encrypt(vs.getProvider().getFirstNm() + ","+ vs.getProvider().getLastNm(),PMBConstants.AES_ALGO));
		req.setPaytoproviderAddress1(encryption.encrypt(vs.getProvider().getRemittanceAddress().getStreetAddress1(),PMBConstants.AES_ALGO));
		req.setPaytoproviderAddress2(encryption.encrypt(vs.getProvider().getRemittanceAddress().getStreetAddress2(),PMBConstants.AES_ALGO));
		req.setPaytoproviderCity(encryption.encrypt(vs.getProvider().getRemittanceAddress().getCity(),PMBConstants.AES_ALGO));
		req.setPaytoproviderState(encryption.encrypt(vs.getProvider().getRemittanceAddress().getState(),PMBConstants.AES_ALGO));
		req.setPaytoproviderZip(encryption.encrypt(vs.getProvider().getRemittanceAddress().getZip(),PMBConstants.AES_ALGO));
		req.setRenderingProviderName(encryption.encrypt(vs.getProvider().getFirstNm() + ","+ vs.getProvider().getLastNm(),PMBConstants.AES_ALGO));
		return req;
	}
}
