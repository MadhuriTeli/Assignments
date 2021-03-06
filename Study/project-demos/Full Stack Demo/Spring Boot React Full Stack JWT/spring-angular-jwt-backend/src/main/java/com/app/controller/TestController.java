package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AuthenticationRequest;
import com.app.dto.AuthenticationResponse;
import com.app.util.JwtUtil;

@RestController
@CrossOrigin
public class TestController {
	@Autowired
	private AuthenticationManager mgr;
	@Autowired
	private UserDetailsService service;
	@Autowired
	private JwtUtil utils;

	@GetMapping("/hello")
	public String test1() {
		return "Hello World!!!!";
	}

	@PostMapping("/authenticate")
	public ResponseEntity<?> createJwtToken(@RequestBody AuthenticationRequest req) {
		try {
			mgr.authenticate(new UsernamePasswordAuthenticationToken
					(req.getUserName(), req.getPassword()));
		} catch (BadCredentialsException e) {
			throw new RuntimeException("Invalid Email or password");
		}
		// authentication successful : return JWT token to the client
		UserDetails details = service.loadUserByUsername(req.getUserName());
		return ResponseEntity.ok(new AuthenticationResponse(utils.generateToken(details)));

	}
}
