package com.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.mongo.exception.MongoAppException;
import com.mongo.model.Audit;
import com.mongo.repository.AuditDAO;
import com.mongo.wrapper.WrapperAudit;

@Service
public class AuditServiceImpl implements AuditService{

	@Autowired
	AuditDAO auditDao;
	
	@Autowired
	Environment environment;
	
	@Override
	public Audit createAudit(Audit audit) throws MongoAppException {
	
		Audit newAudit = null;
		if(audit.equals(null))
		{
			newAudit =  auditDao.save(audit);
			return newAudit;
		}
		else
		{
			throw new MongoAppException("Audit Not Created");
		}
		
	}

	@Override
	public List<Audit> viewAudit() throws MongoAppException {
		

		List<Audit> list = 	auditDao.findAll();
		
			if(list.size()==0)
			{
				throw new MongoAppException(environment.getProperty("101"));
			}
			else
			return list;
	}

	@Override
	public Audit UpdateAudit(WrapperAudit wrapperaudit) throws MongoAppException {
	
		Audit newAudit = (Audit) auditDao.findByauditId(wrapperaudit.getAudit().getAuditId());
		newAudit.setAuditId(wrapperaudit.getAudit().getAuditId());
		newAudit.setEventName(wrapperaudit.getAudit().getEventName());
		newAudit.setEventDate(wrapperaudit.getAudit().getEventDate());
		newAudit.setEventId(wrapperaudit.getAudit().getEventId());
		newAudit.setEventType(wrapperaudit.getAudit().getEventType());
		newAudit.setNewValue(wrapperaudit.getAudit().getNewValue());
		newAudit.setOldValue(wrapperaudit.getAudit().getOldValue());
		newAudit.setUserId(wrapperaudit.getAudit().getUserId());
		return newAudit;
	}

	@Override
	public List<Audit> deleteAudit(String Id) throws MongoAppException {
	
		Audit audit = (Audit) auditDao.findByauditId(Id);
		auditDao.deleteByauditId(audit.getAuditId());
		
		return auditDao.findAll();
	}

}
