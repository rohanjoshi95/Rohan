package com.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import com.cg.exception.AuditMongoException;
import com.mongo.model.User;
import com.mongo.repository.UserDAO;
import com.mongo.wrapper.WrapperUser;

public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO userDao;
	
	@Autowired
	Environment environment;
	
	@Override
	public User createUser(User user) throws AuditMongoException {
		if(user.equals(null))
		{
			User newUser = userDao.save(user);
			return newUser;
		}
		else
		{
			throw new AuditMongoException(environment.getProperty("111"));
		}
	}

	@Override
	public List<User> viewAll() {
		
		return userDao.findAll();
	}

	@Override
	public User viewOne(String Id) {
	
		User user = userDao.findById(Id).get();
		return user;
	}

	@Override
	public List<User> deleteUser(String Id) {
	
		User user = userDao.findById(Id).get();
		userDao.deleteById(user.getId());
		return userDao.findAll();
	}

	@Override
	public User updateUser(WrapperUser user) {
		
		User newUser =userDao.findById(user.getUser().getId()).get();
		newUser.setAge(user.getUser().getAge());
		newUser.setEmail(user.getUser().getEmail());
		newUser.setName(user.getUser().getName());
		newUser.setId(user.getUser().getId());
		return userDao.save(newUser);
	}

}
