package com.anthem.ais.pmb.claims.microservices.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.anthem.ais.pmb.claims.microservices.common.generated.Claim;
import com.anthem.ais.pmb.claims.microservices.common.generated.ClaimsSummary;
import com.anthem.ais.pmb.claims.microservices.domain.entity.ClaimsPayment;
import com.anthem.ais.pmb.claims.microservices.domain.entity.MemberIndicated;
import com.anthem.ais.pmb.claims.microservices.domain.service.ClaimsPaymentService;
import com.anthem.ais.pmb.claims.microservices.domain.service.MemberIndicatedService;
import com.anthem.ais.pmb.claims.microservices.response.Address;
import com.anthem.ais.pmb.claims.microservices.response.ClaimHistory;
import com.anthem.ais.pmb.claims.microservices.response.ClaimHistoryResponse;
import com.anthem.ais.pmb.claims.microservices.response.FacilityDetails;
import com.anthem.ais.pmb.claims.microservices.response.VirtualSummaryResponse;
import com.anthem.ais.pmb.claims.microservices.rest.model.ClaimsModel;
import com.anthem.ais.pmb.claims.microservices.util.PMBConstants;
import com.anthem.ais.pmb.claims.microservices.util.PMBPropertiesUtil;

@Component
public class ClaimHistoryService {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private ClaimSummaryService claimSummaryService;
	@Autowired
	private ClaimsPaymentService claimsPaymentService;
	@Autowired
	private MemberIndicatedService memberIndicatedService;

	@Transactional
	public ClaimHistoryResponse createClaimHistory(ClaimsModel cm) {
		
		//Look for offline payments
		List<MemberIndicated> OfflineList = memberIndicatedService.findByHcId(cm.getHcid());
		List<ClaimHistory> chList =  new ArrayList<>();
		
		for (MemberIndicated memberIndicated : OfflineList) {
			
			// Lookup EdgeService /members/{token}/claims
			String edgeHost = PMBPropertiesUtil
					.getProperty(PMBConstants.EDGE_SERVICE_HOST_URL);
			String uri = new String(edgeHost + "/members/" + cm.getUserToken()
					+ "/claims/"+memberIndicated.getId().getClaimId());
			ClaimsSummary cs = restTemplate.getForObject(uri, ClaimsSummary.class);

			// Lookup Virtual Service for remaining fields
			String virtualHost = PMBPropertiesUtil
					.getProperty(PMBConstants.VIRTUAL_HOST_URL);
			String vuri = new String(virtualHost + "/pmb/claims/virtual?claimId=2015280AS1000");
			VirtualSummaryResponse vs = restTemplate.getForObject(vuri,
					VirtualSummaryResponse.class);
			chList.add(createClaimHistoryReponseOff(cs,vs,memberIndicated));
			
		}
		
		//Look for online payments
		List<ClaimsPayment> OnlineList = claimsPaymentService.findByHcId(cm.getHcid());
		
		for (ClaimsPayment claimsPayment : OnlineList) {
			
			// Lookup EdgeService /members/{token}/claims
			String edgeHost = PMBPropertiesUtil
					.getProperty(PMBConstants.EDGE_SERVICE_HOST_URL);
			String uri = new String(edgeHost + "/members/" + cm.getUserToken()
					+ "/claims/"+claimsPayment.getId().getClaimId());
			ClaimsSummary cs = restTemplate.getForObject(uri, ClaimsSummary.class);

			// Lookup Virtual Service for remaining fields
			String virtualHost = PMBPropertiesUtil
					.getProperty(PMBConstants.VIRTUAL_HOST_URL);
			String vuri = new String(virtualHost + "/pmb/claims/virtual?claimId=2015280AS1000");
			VirtualSummaryResponse vs = restTemplate.getForObject(vuri,
					VirtualSummaryResponse.class);
			chList.add(createClaimHistoryReponseOn(cs,vs,claimsPayment));
			
		}
		
		ClaimHistoryResponse chr = new ClaimHistoryResponse();
		chr.setClaimHistory(chList);
		return chr;

	}
	
	public ClaimHistory createClaimHistoryReponseOff(ClaimsSummary cs, VirtualSummaryResponse vs, MemberIndicated mi) {

		List<Claim> claimList = cs.getClaims();
		ClaimHistory item= new ClaimHistory();
		
		for (Claim claim : claimList) {
			item.setClaimId(claim.getClmId());
			item.setOffline(true);
			item.setAmountPaid(String.valueOf(mi.getAmountPaid()));
			item.setPaymentDate(mi.getTransactionDateTime().toString());
			item.setClaimType(claim.getClmTypeCd().getName());
			item.setProviderName(vs.getProvider().getLastNm()+", "+vs.getProvider().getFirstNm());
			item.setDateOfService(claim.getClmStartDt());
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
		}
				
		return item;

	}
	
	public ClaimHistory createClaimHistoryReponseOn(ClaimsSummary cs, VirtualSummaryResponse vs, ClaimsPayment mi ) {

		List<Claim> claimList = cs.getClaims();
		ClaimHistory item= new ClaimHistory();
		
		for (Claim claim : claimList) {
			item.setClaimId(claim.getClmId());
			item.setOffline(false);
			item.setAmountPaid(String.valueOf(mi.getAmountPaid()));
			item.setPaymentDate(mi.getTransactionDateTime().toString());
			item.setClaimType(claim.getClmTypeCd().getName());
			item.setProviderName(vs.getProvider().getLastNm()+", "+vs.getProvider().getFirstNm());
			item.setDateOfService(claim.getClmStartDt());
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
		}
				
		return item;

	}

}
