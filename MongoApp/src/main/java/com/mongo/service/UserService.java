package com.mongo.service;

import java.util.List;

import com.cg.exception.AuditMongoException;
import com.mongo.model.User;
import com.mongo.wrapper.WrapperUser;

public interface UserService {

	
	public User createUser(User user) throws AuditMongoException;
	
	public List<User> viewAll();
	
	public User viewOne(String Id);
	
	public List<User> deleteUser(String Id);

	public User updateUser(WrapperUser User);
}
