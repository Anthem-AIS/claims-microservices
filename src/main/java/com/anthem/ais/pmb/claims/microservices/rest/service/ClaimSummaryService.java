package com.anthem.ais.pmb.claims.microservices.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.anthem.ais.pmb.claims.microservices.common.generated.Claim;
import com.anthem.ais.pmb.claims.microservices.common.generated.ClaimsSummary;
import com.anthem.ais.pmb.claims.microservices.response.Address;
import com.anthem.ais.pmb.claims.microservices.response.ClaimSummary;
import com.anthem.ais.pmb.claims.microservices.response.ClaimSummaryResponse;
import com.anthem.ais.pmb.claims.microservices.response.FacilityDetails;
import com.anthem.ais.pmb.claims.microservices.response.VirtualSummaryResponse;

@Component 
public class ClaimSummaryService {
	
	public ClaimSummaryResponse createClaimSummary (ClaimsSummary cs, VirtualSummaryResponse vs){
		
		ClaimSummaryResponse csr = new ClaimSummaryResponse();
		
		List<Claim> claimList = cs.getClaims();
		List<ClaimSummary> csList = new ArrayList<ClaimSummary>();
		for (Claim claim : claimList) {
			ClaimSummary item = new ClaimSummary();
			item.setClaimId(claim.getClmId());
			item.setProviderName(claim.getServicingProvider().getProfessionalNm());
			item.setDateOfService(claim.getClmStartDt());
			item.setClaimAmount(claim.getAmount().getTotalChargeAmt().toString());
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
