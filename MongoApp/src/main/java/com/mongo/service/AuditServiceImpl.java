package com.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import com.cg.exception.AuditMongoException;
import com.mongo.model.Audit;
import com.mongo.model.User;
import com.mongo.repository.AuditDAO;
import com.mongo.repository.UserDAO;
import com.mongo.wrapper.WrapperAudit;

public class AuditServiceImpl implements AuditService{

	@Autowired
	AuditDAO auditDao;
	
	@Autowired
	Environment environment;
	
	@Override
	public Audit createAudit(Audit audit) throws AuditMongoException {
		
		if(audit.equals(null))
		{
			Audit newUser = auditDao.save(audit);
			return newUser;
		}
		else
		{
			throw new AuditMongoException(environment.getProperty("111"));
		}
	}

	@Override
	public List<Audit> viewAudit() throws AuditMongoException {
		
		return auditDao.findAll();
	}

	@Override
	public Audit UpdateAudit(WrapperAudit audit) throws AuditMongoException {
		
		Audit newAudit = auditDao.findById(audit.getAudit().getUserId()).get();
		newAudit.setAuditId(audit.getAudit().getAuditId());
		newAudit.setEventDate(audit.getAudit().getEventDate());
		newAudit.setEventId(audit.getAudit().getEventId());
		newAudit.setEventDate(audit.getAudit().getEventDate());
		newAudit.setEventName(audit.getAudit().getEventName());
		newAudit.setEventType(audit.getAudit().getEventType());
		newAudit.setNewValue(audit.getAudit().getNewValue());
		newAudit.setOldValue(audit.getAudit().getOldValue());
		newAudit.setUserId(audit.getAudit().getUserId());
		
		Audit updated = auditDao.save(newAudit);
		return updated;
	}

	@Override
	public List<Audit> deleteAudit(String Id) throws AuditMongoException {
	
		Audit audit = auditDao.findById(Id).get();
		auditDao.deleteById(audit.getAuditId());
		List<Audit> one = auditDao.findAll();
		
		return one;
	}

}
