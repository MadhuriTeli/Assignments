package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.UserHandlingException;
import com.app.dao.UserRepository;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	// dependency : dao layer i/f
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> getAllUsers() {
		// invoke dao's method
		return userRepo.findAll();
	}

	@Override
	public String deleteUser(int userId) {
		userRepo.deleteById(userId);
		return "User details deleted for Id =" + userId;
	}

	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}// when the method annotated with @Transactional returns : JPA provider
		// (currently hibernate will wnd the tx
		// it will auto commit the Tx: in case of no Runtime Exception or in caser of
		// exc: auto rollback occurs;

	@Override
	public User getDetails(int userId) {
		// Method of CrudRepository:
		/* findById optional<T> findById(Id id) rets optional with entiity in case of id
		 * found or rets empty optional */
		return userRepo.findById(userId).orElseThrow(() -> new UserHandlingException("Invalid User Id!"));
	}

	@Override
	public User updateUser(User existingUser, User DetachedUser) {
		return userRepo.save(DetachedUser);
	
	}

}
