package com.anthem.ais.pmb.claims.microservices.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.anthem.ais.pmb.claims.microservices.common.generated.ClaimsSummary;
import com.anthem.ais.pmb.claims.microservices.response.ClaimHistoryResponse;
import com.anthem.ais.pmb.claims.microservices.response.ClaimSummaryResponse;
import com.anthem.ais.pmb.claims.microservices.response.VirtualSummaryResponse;
import com.anthem.ais.pmb.claims.microservices.rest.model.ClaimsModel;
import com.anthem.ais.pmb.claims.microservices.rest.model.MembrIndcModel;
import com.anthem.ais.pmb.claims.microservices.rest.model.StatusModel;
import com.anthem.ais.pmb.claims.microservices.rest.service.ClaimHistoryService;
import com.anthem.ais.pmb.claims.microservices.rest.service.ClaimSummaryService;
import com.anthem.ais.pmb.claims.microservices.rest.service.OfflinePaymentService;
import com.anthem.ais.pmb.claims.microservices.util.PMBConstants;
import com.anthem.ais.pmb.claims.microservices.util.PMBPropertiesUtil;

@Controller
public class ClaimsController {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private OfflinePaymentService offilinePaymentService;
	@Autowired
	private ClaimSummaryService claimSummaryService;
	@Autowired
	private ClaimHistoryService claimHistoryService;

	@RequestMapping(value = "/summary", method = {RequestMethod.POST})
    public @ResponseBody ClaimSummaryResponse getIt(@RequestBody ClaimsModel cm) {
		
		//Lookup EdgeService /members/{token}/claims
		String edgeHost = PMBPropertiesUtil.getProperty(PMBConstants.EDGE_SERVICE_HOST_URL);
		String uri = new String(edgeHost+"/members/"+cm.getUserToken()+"/claims");
		ClaimsSummary cs = restTemplate.getForObject(uri, ClaimsSummary.class);
		
		//Lookup Virtual Service for remaining fields
		String virtualHost = PMBPropertiesUtil.getProperty(PMBConstants.VIRTUAL_HOST_URL);
		String vuri = new String(virtualHost+"/pmb/claims/virtual?claimId=2015280AS1000");
		VirtualSummaryResponse vs = restTemplate.getForObject(vuri, VirtualSummaryResponse.class);
		//Create response
		ClaimSummaryResponse csr = claimSummaryService.createClaimSummary(cs, vs);
		
		return csr;
    }
	
	@RequestMapping(value = "/history", method = {RequestMethod.POST})
    public @ResponseBody ClaimHistoryResponse getHistory(@RequestBody ClaimsModel cm) {
		
		//Create response
		ClaimHistoryResponse csr = claimHistoryService.createClaimHistory(cm);
		
		return csr;
    }
	
	@RequestMapping(value = "/vclaims", method = {RequestMethod.GET})
    public @ResponseBody String getClaimsVirtual() {
		String virtualHost = PMBPropertiesUtil.getProperty(PMBConstants.VIRTUAL_HOST_URL);
		String uri = new String(virtualHost+"/pmb/claims/virtual?claimId=2015280AS1000");
		String result = restTemplate.getForObject(uri, String.class);
		return result;
    }
	
	//Member Indicate Endpoint
	@RequestMapping(value = "/indicate", method = {RequestMethod.POST})
    public @ResponseBody StatusModel setIndicate(@RequestBody MembrIndcModel model) {
		String result = offilinePaymentService.saveMemberIndicated(model);
		StatusModel st = new StatusModel();
		st.setStatusCode(PMBConstants.SUCCESS_CODE);
		st.setStatusMessage((result.equals(PMBConstants.RESPONSE_SUCCESS))?PMBConstants.RESPONSE_SUCCESS:PMBConstants.RESPONSE_ERROR);
		return st;
    }
	
	
}
