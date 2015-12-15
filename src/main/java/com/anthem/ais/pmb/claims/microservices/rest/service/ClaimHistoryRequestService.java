package com.anthem.ais.pmb.claims.microservices.rest.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.anthem.ais.pmb.claims.microservices.rest.model.ClaimsModel;
import com.anthem.ais.pmb.claims.microservices.rest.model.PlanBClaimsRequest;
import com.anthem.ais.pmb.claims.microservices.rest.model.VirtualClaimsRequest;

@Component
public class ClaimHistoryRequestService {

	@Autowired
	private RestTemplate restTemplate;
	
	
	
	ClaimsModel cm = new ClaimsModel();
	//String uri = new String("http://mom9n90067.wellpoint.com:9080/claimSummary/members/"+cm.getUserToken()+"/claims");
	
	String pburi = new String ("https://sit.api.anthem.com/v0/members/5e430478-d01e-4318-a0be-e865ca2026ec/claims?apikey=9nie1hHvyruNHoyfWzLQEtnq8KPvXSuD");
	PlanBClaimsRequest pbcr = restTemplate.getForObject(pburi, PlanBClaimsRequest.class);
	
	String vuri = new String("http://30.135.10.202:57000/AIS/pmb/claims/virtual");
	VirtualClaimsRequest vcr = restTemplate.getForObject(vuri, VirtualClaimsRequest.class);
	
	
	
	
	/*public String getFromPlanBApi(String inputString) throws Exception {
		
		String output = "Initialize";
		OutputStream outputStream = null;
		OutputStreamWriter out = null;
		InputStream inputStream =null;
		InputStreamReader inputStreamReader =null;
		HttpURLConnection conn = null;
		BufferedReader br = null;
		try {
			URL url = new URL("https://sit.api.anthem.com/v0/members/5e430478-d01e-4318-a0be-e865ca2026ec/claims");
			conn = (HttpsURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("apikey", "9nie1hHvyruNHoyfWzLQEtnq8KPvXSuD");
			conn.setRequestProperty("Content-Type",
					"application/json; charset=utf-8");
			conn.setDoInput(true);
			conn.setDoOutput(true);
			String body = inputString;

			int len = body.length();
			conn.setRequestProperty("Content-Length", Integer.toString(len));
			conn.connect();
			outputStream = conn.getOutputStream();
			out = new OutputStreamWriter(outputStream);
			out.write(body, 0, len);
			out.flush();
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			inputStream = conn.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream);
			br = new BufferedReader(inputStreamReader);
			
			 output = br.readLine();
			
		} catch (Exception e) {
			throw e;
		}finally{
			if(conn != null)conn.disconnect();
		}
	
		return  output;
	}*/
	
		
}
	
	

