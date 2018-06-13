package com.mongo.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.model.Audit;

@Repository
public interface AuditDAO extends MongoRepository<Audit, Serializable>{

	Object findByauditId(String auditId);

	void deleteByauditId(String auditId);

}
