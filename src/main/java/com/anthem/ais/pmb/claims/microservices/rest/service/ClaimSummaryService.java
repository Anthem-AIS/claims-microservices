package com.anthem.ais.pmb.claims.microservices.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anthem.ais.pmb.claims.microservices.common.generated.Claim;
import com.anthem.ais.pmb.claims.microservices.common.generated.ClaimsSummary;
import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPayment;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicated;
import com.anthem.ais.pmb.claims.microservices.domain.service.ClaimsPaymentService;
import com.anthem.ais.pmb.claims.microservices.domain.service.MemberIndicatedService;
import com.anthem.ais.pmb.claims.microservices.response.Address;
import com.anthem.ais.pmb.claims.microservices.response.ClaimSummary;
import com.anthem.ais.pmb.claims.microservices.response.ClaimSummaryResponse;
import com.anthem.ais.pmb.claims.microservices.response.FacilityDetails;
import com.anthem.ais.pmb.claims.microservices.response.VirtualSummaryResponse;

@Component 
public class ClaimSummaryService {
	
	@Autowired
	private ClaimsPaymentService claimsPaymentService;
	@Autowired
	private MemberIndicatedService memberIndicatedService;
	
	public ClaimSummaryResponse createClaimSummary (ClaimsSummary cs, VirtualSummaryResponse vs){
		
		ClaimSummaryResponse csr = new ClaimSummaryResponse();
		Double offPaid = new Double("0");
		Double onPaid = new Double("0");;
		List<Claim> claimList = cs.getClaims();
		List<ClaimSummary> csList = new ArrayList<>();
		for (Claim claim : claimList) {
			ClaimSummary item = new ClaimSummary();
			List<MemberIndicated> mi = memberIndicatedService.findByClaimId(claim.getClmId().toString());
			List<ClaimsPayment> cp = claimsPaymentService.findByClaimId(claim.getClmId().toString());
			if(mi.size()>0)
				offPaid = mi.get(0).getAmountPaid();
			if(cp.size()>0)
				onPaid = (double)cp.get(0).getAmountPaid();
			Double totalPaid = offPaid+onPaid;
			item.setClaimId(claim.getClmId());
			item.setProviderName(vs.getProvider().getLastNm()+", "+vs.getProvider().getFirstNm());
			item.setDateOfService(claim.getClmStartDt());
			item.setClaimAmount(new Double((claim.getAmount().getTotalChargeAmt().doubleValue()-totalPaid)).toString());
			FacilityDetails fd = new FacilityDetails();
			fd.setName(claim.getServicingProvider().getOrganizationNm());
			Address ad = new Address();
			ad.setAddressLine1(vs.getProvider().getFacilityAddress().getStreetAddress1());
			ad.setAddressLine2(vs.getProvider().getFacilityAddress().getStreetAddress2());
			ad.setCity(vs.getProvider().getFacilityAddress().getCity());
			ad.setState(vs.getProvider().getFacilityAddress().getState());
			ad.setPostalCode(vs.getProvider().getFacilityAddress().getZip());
			fd.setAddress(ad);
			item.setFacilityDetails(fd);
			csList.add(item);
		}
		csr.setClaimSummary(csList);
		return csr;
	}

}
