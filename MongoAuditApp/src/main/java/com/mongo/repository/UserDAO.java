package com.mongo.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.model.User;
@Repository
public interface UserDAO extends MongoRepository<User, Serializable>{

	Object findByid(String id);

	void deleteById(String id);

	

}
