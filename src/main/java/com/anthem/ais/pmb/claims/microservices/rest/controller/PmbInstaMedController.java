package com.anthem.ais.pmb.claims.microservices.rest.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anthem.ais.pmb.claims.microservices.rest.model.HcIdUuIdModel;
import com.anthem.ais.pmb.claims.microservices.rest.model.PayNowRequest;
import com.anthem.ais.pmb.claims.microservices.rest.model.PostBackRequest;
import com.anthem.ais.pmb.claims.microservices.rest.service.InstaMedPostBackService;
import com.anthem.ais.pmb.claims.microservices.rest.service.PayNowService;
import com.anthem.ais.pmb.claims.microservices.util.PMBConstants;

@Controller
public class PmbInstaMedController {
	@Autowired
	private InstaMedPostBackService instaMedPostBackService;
	@Autowired
	private PayNowService payNowService;

	@RequestMapping(value = "/pmbinstamed", method = {RequestMethod.POST})
    public @ResponseBody String getIt(@RequestBody PostBackRequest postBackRequest) {
		
		System.out.println(postBackRequest.toString());
		
		String status;
		try {
			status = instaMedPostBackService.savePostBackData(postBackRequest);
		} catch (InvalidKeyException | NoSuchAlgorithmException
				| NoSuchPaddingException | IllegalBlockSizeException
				| BadPaddingException | InvalidAlgorithmParameterException
				| InvalidKeySpecException | IOException e) {
			status = PMBConstants.RESPONSE_ERROR;
			e.printStackTrace();
		}
		
        return status;
    }
	
	@RequestMapping(value = "/paynow", method = {RequestMethod.POST})
    public @ResponseBody String payNow(@RequestBody PayNowRequest pnr) {
		
		String status = PMBConstants.RESPONSE_ERROR;
		try {
			status = payNowService.payNow(pnr);
		} catch (InvalidKeyException | UnsupportedEncodingException
				| NoSuchAlgorithmException | NoSuchPaddingException
				| InvalidAlgorithmParameterException
				| IllegalBlockSizeException | BadPaddingException
				| InvalidKeySpecException e) {
			e.printStackTrace();
		}
		
        return status;
    }
	
}
