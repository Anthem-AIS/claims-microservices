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
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Root resource (exposed at "myresource" path)
 */
@Controller
public class MyResource {
	
	@Autowired
	RestTemplate restTemplate;
	

	@RequestMapping(value = "/test", method = {RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody String getIt() {
        return "Got it!";
    }
	
	@RequestMapping(value = "/virtual", method = {RequestMethod.GET})
    public @ResponseBody String getClaimsVertual() {
		String uri = new String("http://30.135.10.202:57000/AIS/pmb/claims/virtual");
		String result = restTemplate.getForObject(uri, String.class);
		return result;
    }
	
	@RequestMapping(value = "/refer", method = {RequestMethod.POST})
	public @ResponseBody String getSummary(@RequestBody String inputString) {
		String output = "Initialize";
		/*try {

			Client client = Client.create();			

			WebResource webResource = client
					.resource("http://va10duvwbs033.wellpoint.com:19080/pportmembersvc/getSummary");

			String input = inputString;
			System.out.println(input);
			ClientResponse response = webResource.type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(ClientResponse.class, input);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			System.out.println("Output from Server .... \n");
			output = response.getEntity(String.class);
			System.out.println(output);

		} catch (Exception e) {
			System.out.println("Timedout in claim service!!");
			e.printStackTrace();

		}*/

		return output;
	}
	
	@RequestMapping(value = "/RTSummary", method = {RequestMethod.POST})
	public @ResponseBody String getTempSummary(@RequestBody String request) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(request,headers);
		String uri = new String("http://va10duvwbs033.wellpoint.com:19080/pportmembersvc/getSummary");
		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);
		return result.toString();
	}
	@RequestMapping(value = "/payment", method = {RequestMethod.POST})
	public @ResponseBody String getPPayements(@RequestBody String inputString) throws Exception {
		
		String output = "Initialize";
		OutputStream outputStream = null;
		OutputStreamWriter out = null;
		InputStream inputStream =null;
		InputStreamReader inputStreamReader =null;
		HttpURLConnection conn = null;
		BufferedReader br = null;
		try {
			//URL url = new URL("http://va10duvwbs033.wellpoint.com:19080/pportmembersvc/getSummary");
			URL url = new URL("https://dev.api.anthem.com/v1/paymybills/1002");
			conn = (HttpsURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("apikey", "bQFM7EGQlNKqoYAmuTnGJBk1hDGZ6XvB");
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
	}
	
	@RequestMapping(value = "/msummary", method = {RequestMethod.POST})
	public @ResponseBody String getPSummary(@RequestBody String inputString) throws Exception {
		String output = "Initialize";
		OutputStream outputStream = null;
		OutputStreamWriter out = null;
		InputStream inputStream =null;
		InputStreamReader inputStreamReader =null;
		HttpURLConnection conn = null;
		BufferedReader br = null;
		try {
			URL url = new URL("http://va10duvwbs033.wellpoint.com:19080/pportmembersvc/getSummary");
			//URL url = new URL("https://dev.api.anthem.com/v1/paymybills/1002");
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept", "application/json");
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
	}


}
