package com.anthem.ais.pmb.claims.microservices.rest.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.anthem.ais.pmb.claims.microservices.domain.service.ClaimsPaymentService;
import com.anthem.ais.pmb.claims.microservices.domain.service.MemberIndicatedService;
import com.anthem.ais.pmb.claims.microservices.rest.model.ApigeeRequest;
import com.anthem.ais.pmb.claims.microservices.rest.model.ClaimsModel;
import com.anthem.ais.pmb.claims.microservices.rest.model.PlanBClaimsRequest;
import com.anthem.ais.pmb.claims.microservices.rest.model.VirtualClaimsRequest;
import com.anthem.ais.pmb.claims.microservices.rest.model.resp.ClaimHistoryResponse;
import com.anthem.ais.pmb.claims.microservices.rest.service.ClaimHistoryResponseService;

@Controller
public class ClaimsPaymentHistoryController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	ClaimHistoryResponseService clmHistResponseService;
	
	/*@Autowired
	private MemberIndicatedService memberIndicatedService;
	
	@Autowired
	private ClaimsPaymentService claimsPaymentService;*/
	
	
	@RequestMapping(value = "/pmbClaimsHistory", method = {RequestMethod.GET})
	public @ResponseBody ClaimHistoryResponse getClaimHistory(@RequestBody ApigeeRequest apgReq) throws Exception {
		
		String hcid = apgReq.getHCID();
		
		//ClaimsModel cm = new ClaimsModel();
		//String pburi = new String("http://mom9n90067.wellpoint.com:9080/claimSummary/members/"+cm.getUserToken()+"/claims");
		String pburi = new String ("https://sit.api.anthem.com/v0/members/5e430478-d01e-4318-a0be-e865ca2026ec/claims?apikey=9nie1hHvyruNHoyfWzLQEtnq8KPvXSuD");
		
		PlanBClaimsRequest pbcr = restTemplate.getForObject(pburi, PlanBClaimsRequest.class);
		
		String vuri = new String("http://30.135.10.202:57000/AIS/pmb/claims/virtual");
		VirtualClaimsRequest vcr = restTemplate.getForObject(vuri, VirtualClaimsRequest.class);
		
		
		ClaimHistoryResponse chr = clmHistResponseService.createClaimHistory(pbcr, vcr, hcid);
		return chr;
	}

	
}
