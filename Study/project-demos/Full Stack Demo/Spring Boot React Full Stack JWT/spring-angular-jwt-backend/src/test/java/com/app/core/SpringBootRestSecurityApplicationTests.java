package com.app.core;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRestSecurityApplicationTests {
	@Autowired
	private PasswordEncoder encoder;

	@Test
	public void testEncryptPassword() {
		System.out.println("enc pass "+encoder);
		System.out.println(encoder.encode("abc#123"));
		System.out.println(encoder.encode("xyz#123"));
	}

}
