package com.anthem.ais.pmb.claims.microservices.rest.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.anthem.ais.pmb.claims.microservices.domain.entity.Hcid2Token;
import com.anthem.ais.pmb.claims.microservices.domain.service.Hcid2TokenService;
import com.anthem.ais.pmb.claims.microservices.rest.model.LogonToken;

/**
 * Root resource (exposed at "myresource" path)
 */
@Controller
public class LoginController {
	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private Hcid2TokenService hcid2TokenService =  null;
	

	public Hcid2TokenService getHcid2TokenService() {
		return hcid2TokenService;
	}


	public void setHcid2TokenService(Hcid2TokenService hcid2TokenService) {
		this.hcid2TokenService = hcid2TokenService;
	}

	@RequestMapping(value = "/getToken", method = {RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody Hcid2Token getGetUserDetails(@RequestBody LogonToken logonToken) {
		Hcid2Token response = hcid2TokenService.findById(logonToken.getLogonToken());
        return response;
    }
	
	@RequestMapping(value = "/saveToken", method = {RequestMethod.POST})
    public @ResponseBody LogonToken saveUserDetails(@RequestBody Hcid2Token hcid2Token) {
		Hcid2Token response = hcid2TokenService.saveOrUpdate(hcid2Token);
		LogonToken lt = new LogonToken();
		lt.setLogonToken(response.getToken());
		lt.setSaved(!StringUtils.isEmpty(response.getToken()));
        return lt;
    }

}
