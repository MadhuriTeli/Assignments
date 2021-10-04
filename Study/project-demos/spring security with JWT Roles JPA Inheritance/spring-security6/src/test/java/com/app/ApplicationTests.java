package com.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class ApplicationTests {
@Autowired
private PasswordEncoder enc;
	@Test
	void contextLoads() {
		System.out.println(enc.encode("1234"));
		System.out.println(enc.encode("2345"));
	}

}
