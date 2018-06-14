package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.model.User;

public interface UserDAO extends MongoRepository<User, Object>{

}
