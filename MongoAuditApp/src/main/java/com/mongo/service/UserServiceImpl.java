 package com.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.mongo.exception.MongoAppException;
import com.mongo.model.User;
import com.mongo.repository.UserDAO;
import com.mongo.wrapper.WrapperUser;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO userDao;
	
	@Autowired
	Environment environment;
	
	@Override
	public User createUser(User user) throws MongoAppException {
		User newUser = null;
		System.out.println("in impl"+user);
		if(!user.equals(null))
		{
			newUser = userDao.save(user);
			return newUser;
		}
		else
		{
			throw new MongoAppException("User Not Created");
		}
		
	}

	@Override
	public List<User> viewAll() throws MongoAppException {
		
		return userDao.findAll();
	}

	@Override
	public User viewOne(String Id) throws MongoAppException {
		User user = (User) userDao.findByid(Id);
		return user;
	}

	@Override
	public List<User> deleteUser(String Id) throws MongoAppException {
		User user = (User) userDao.findByid(Id);
		userDao.deleteById(user.getId());
		return userDao.findAll();
	}

	@Override
	public User updateUser(WrapperUser user) throws MongoAppException {
	
		User newUser = (User) userDao.findByid(user.getUser().getId());
		newUser.setId(user.getUser().getId());
		newUser.setName(user.getUser().getName());
		newUser.setAge(user.getUser().getAge());
		newUser.setEmail(user.getUser().getEmail());
		return null;
	}

}
