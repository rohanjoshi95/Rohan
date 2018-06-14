package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.model.Audit;

public interface AuditDAO extends MongoRepository<Audit, Object>{

}
