package com.anthem.ais.pmb.claims.microservices.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.anthem.ais.pmb.claims.microservices.common.generated.ClaimsSummary;
import com.anthem.ais.pmb.claims.microservices.response.ClaimSummaryResponse;
import com.anthem.ais.pmb.claims.microservices.response.VirtualSummaryResponse;
import com.anthem.ais.pmb.claims.microservices.rest.model.ClaimsModel;
import com.anthem.ais.pmb.claims.microservices.rest.model.MembrIndcModel;
import com.anthem.ais.pmb.claims.microservices.rest.service.ClaimSummaryService;
import com.anthem.ais.pmb.claims.microservices.rest.service.OffilinePaymentService;

@Controller
public class ClaimsController {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private OffilinePaymentService offilinePaymentService;
	@Autowired
	private ClaimSummaryService claimSummaryService;

	@RequestMapping(value = "/summary", method = {RequestMethod.POST})
    public @ResponseBody ClaimSummaryResponse getIt(@RequestBody ClaimsModel cm) {
		String uri = new String("http://mom9n90067.wellpoint.com:9080/claimSummary/members/"+cm.getUserToken()+"/claims");
		ClaimsSummary cs = restTemplate.getForObject(uri, ClaimsSummary.class);
		String vuri = new String("http://30.135.10.202:57000/AIS/pmb/claims/virtual");
		VirtualSummaryResponse vs = restTemplate.getForObject(vuri, VirtualSummaryResponse.class);
		ClaimSummaryResponse csr = claimSummaryService.createClaimSummary(cs, vs);
		return csr;
    }
	
	@RequestMapping(value = "/vclaims", method = {RequestMethod.GET})
    public @ResponseBody String getClaimsVirtual() {
		String uri = new String("http://30.135.10.202:57000/AIS/pmb/claims/virtual");
		String result = restTemplate.getForObject(uri, String.class);
		return result;
    }
	
	@RequestMapping(value = "/indicate", method = {RequestMethod.POST})
    public @ResponseBody String setIndicate(@RequestBody MembrIndcModel model) {
		String result = offilinePaymentService.saveMemberIndicated(model);
		return result;
    }
	
	
}
