package com.anthem.ais.pmb.claims.microservices.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPayment;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicated;
import com.anthem.ais.pmb.claims.microservices.rest.model.PlanBClaimsRequest;
import com.anthem.ais.pmb.claims.microservices.rest.model.VirtualClaimsRequest;
import com.anthem.ais.pmb.claims.microservices.rest.model.resp.Address;
import com.anthem.ais.pmb.claims.microservices.rest.model.resp.ClaimHistoryResponse;
import com.anthem.ais.pmb.claims.microservices.rest.model.resp.FacilityDetails;


@Component
public class ClaimHistoryResponseService {

	
	public ClaimHistoryResponse createClaimHistory(PlanBClaimsRequest pbcr, VirtualClaimsRequest vcr, String hcid){
		
		ClaimHistoryResponse chr = new ClaimHistoryResponse();
		
		List<com.anthem.ais.pmb.claims.microservices.rest.model.Claim> claimList = pbcr.getClaims();//Claim of this List in from rest.model (PlanBClaimsRequest coming from json)
		List<com.anthem.ais.pmb.claims.microservices.rest.model.resp.Claim> clms = new ArrayList<com.anthem.ais.pmb.claims.microservices.rest.model.resp.Claim>();//Claim of this List is from rest.model.resp (ClaimHistoryResponse going as json)

		for (com.anthem.ais.pmb.claims.microservices.rest.model.Claim claim : claimList) {

			com.anthem.ais.pmb.claims.microservices.rest.model.resp.Claim clm = new com.anthem.ais.pmb.claims.microservices.rest.model.resp.Claim();
			
			doGetOffline(clm, hcid);
			doGetOnline(clm, hcid);
			
			clm.setClaimType(claim.getClmTypeCd().getName());
			
			FacilityDetails fd = new FacilityDetails();
			fd.setName(claim.getServicingProvider().getOrganizationNm());
			Address ad = new Address();
			ad.setAddressLine1(vcr.getProvider().getFacilityAddress().getStreetAddress1());
			ad.setAddressLine2(vcr.getProvider().getFacilityAddress().getStreetAddress2());
			ad.setCity(vcr.getProvider().getFacilityAddress().getCity());
			ad.setState(vcr.getProvider().getFacilityAddress().getState());
			ad.setPostalCode(vcr.getProvider().getFacilityAddress().getZip());
			fd.setAddress(ad);

			clm.setFacilityDetails(fd);
			clms.add(clm);
		}

		chr.setClaims(clms);
		return chr;
	}
	
	void doGetOffline(com.anthem.ais.pmb.claims.microservices.rest.model.resp.Claim clm, String hcid){
		
		clm.setIsoffline(false);

		MemberIndicated mbri = new MemberIndicated();
		if (mbri.getHcid() == hcid) {
			clm.setClaimId(mbri.getId().getClaimId());// from MEMBER_INDICATED table
			clm.setAmountPaid(Double.toString(mbri.getAmountPaid()));
			clm.setPaymentDate(mbri.getTransactionDateTime().toString());
		}
	}


	void doGetOnline(com.anthem.ais.pmb.claims.microservices.rest.model.resp.Claim clm, String hcid){
		
		clm.setIsoffline(false);
		
		ClaimsPayment cpay = new ClaimsPayment();
		if(cpay.getHcidSequenceNumber2Uuid().getHcid()==hcid){
		clm.setClaimId(cpay.getId().getClaimId());//from CLAIMS_PAYMENT table
		clm.setAmountPaid(Double.toString(cpay.getAmountPaid()));
		clm.setPaymentDate(cpay.getTransactionDateTime().toString());
		}
		
	}

		
}
