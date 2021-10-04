package com.app;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.app.dto.AuthenticationRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class JsonArrayTest {
	@Autowired
	private ObjectMapper mapper;

	@Test
	void testConvertListToJsonArray() throws Exception{
		List<AuthenticationRequest> requests = Arrays.asList(new AuthenticationRequest("a", "b"),
				new AuthenticationRequest("c", "d"), new AuthenticationRequest("e", "f"));
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(requests);
		System.out.println(json);
		//de-serial
		// convert JSON array to list of AuthenticationRequest
	    
		List<AuthenticationRequest>resp=Arrays.asList(mapper.readValue(json, AuthenticationRequest[].class));
		resp.forEach(System.out::println);
	}

}
