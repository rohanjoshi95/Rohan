package com.mongo.service;

import java.util.List;

import com.mongo.exception.MongoAppException;
import com.mongo.model.User;
import com.mongo.wrapper.WrapperUser;

public interface UserService {

	public User createUser(User user) throws MongoAppException;
	
	public List<User> viewAll() throws MongoAppException;
	
	public User viewOne(String Id) throws MongoAppException;
	
	public List<User> deleteUser(String Id) throws MongoAppException;

	public User updateUser(WrapperUser user) throws MongoAppException;
}
