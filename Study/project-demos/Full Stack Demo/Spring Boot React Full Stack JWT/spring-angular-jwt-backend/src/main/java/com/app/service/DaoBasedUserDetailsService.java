package com.app.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.dao.UserRepository;
import com.app.pojos.User;

@Service
@Transactional
public class DaoBasedUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository dao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = dao.findByName(username);

		if (user == null)
			throw new UsernameNotFoundException("User by name " + username + " not found!");
		//to avoid lazy init exc
		System.out.println(user.getRoles().size());
		return new CustomUserDetails(user);
	}

}
