package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.dao.UserRepository;
import com.app.pojos.User;
import com.app.service.IUserService;

@SpringBootTest
class DemoDay16BackendApplicationTests {

	@Autowired
	private IUserService userService;
	
	@Autowired
	private UserRepository userRepo;
	
	
	@Test
	void contextLoads() {
		List<User> allUsers = userService.getAllUsers();
		System.out.println(allUsers);
		assertEquals(0, allUsers.size());
	}
	
	//add a test case to insert user data into table
//	@Test
//	public void testSaveUser() throws Exception
//	{
//		User user = new User("Mihir", "Singh", "mihir", 28 , 22345);
//		//user persistentUser = userRepo.save(user);
//		User persistentUser = userRepo.save(user);
//		assertEquals(2, persistentUser.getId());
//	}
}
