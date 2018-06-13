package com.mongo.service;

import java.util.List;

import com.mongo.exception.MongoAppException;
import com.mongo.model.Audit;
import com.mongo.wrapper.WrapperAudit;


public interface AuditService {


	public Audit createAudit(Audit audit) throws MongoAppException;
	
	public List<Audit> viewAudit() throws MongoAppException;
	
	public Audit UpdateAudit(WrapperAudit wrapperaudit) throws MongoAppException;
	
	public List<Audit> deleteAudit(String Id) throws MongoAppException;
}
