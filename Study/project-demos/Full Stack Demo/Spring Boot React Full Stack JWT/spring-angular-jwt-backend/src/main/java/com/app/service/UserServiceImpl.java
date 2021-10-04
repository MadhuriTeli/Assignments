package com.app.service;

import java.util.HashSet;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import com.app.pojos.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.dao.RoleRepository;
import com.app.dao.UserRepository;
import com.app.pojos.Role;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepository userDao;
	@Autowired
	private RoleRepository roleDao;
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Override
	public void saveUser(User u) {
		u.setPassword(encoder.encode(u.getPassword()));
		HashSet<Role> roles=new HashSet<>();
		roleDao.findAll().forEach(r->roles.add(r));
		u.setRoles(roles);
		userDao.save(u);
	}

	@Override
	public User findByUserName(String name) {
		System.out.println("find by "+name);
		return userDao.findByName(name);
	}

}
