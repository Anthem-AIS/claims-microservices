package com.anthem.ais.pmb.claims.microservices.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anthem.ais.pmb.claims.microservices.rest.model.HcIdUuIdModel;
import com.anthem.ais.pmb.claims.microservices.rest.model.PostBackRequest;
import com.anthem.ais.pmb.claims.microservices.rest.service.InstaMedPostBackService;
import com.anthem.ais.pmb.claims.microservices.util.PMBConstants;

@Controller
public class PmbInstaMedController {
	@Autowired
	private InstaMedPostBackService instaMedPostBackService;

	@RequestMapping(value = "/pmbinstamed", method = {RequestMethod.POST})
    public @ResponseBody String getIt(@RequestBody PostBackRequest postBackRequest) {
		
		System.out.println(postBackRequest.toString());
		
		String status = instaMedPostBackService.savePostBackData(postBackRequest);
		
        return status;
    }
	
	@RequestMapping(value = "/initinstamed", method = {RequestMethod.POST})
    public @ResponseBody String setHcIdUuId(@RequestBody HcIdUuIdModel hum) {
		
		System.out.println(hum.toString());
		
		String status = instaMedPostBackService.saveHcIdUuIdPair(hum);
		
        return status;
    }
	
}
