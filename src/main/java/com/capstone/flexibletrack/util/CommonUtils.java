package com.capstone.flexibletrack.util;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class CommonUtils {

	public static ObjectMapper getObjectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.findAndRegisterModules();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		return objectMapper;
	}
	
	public static String convertToString(Object o) {
		String result = "";
		final ObjectMapper objectMapper = getObjectMapper();
		try {
			result = objectMapper.writeValueAsString(o);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
}
