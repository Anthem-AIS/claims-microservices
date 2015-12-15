package com.anthem.ais.pmb.claims.microservices.util;

import java.io.File;
import java.io.IOException;

import com.anthem.ais.pmb.claims.microservices.rest.model.MembrIndcModel;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonValidator {
	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		try {

			// Convert JSON string from file to Object
			MembrIndcModel pbr = mapper.readValue(new File("C:\\Temp\\postback.txt"), MembrIndcModel.class);
			System.out.println(pbr.getAmountPaid());

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}