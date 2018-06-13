package com.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.mongo.exception.MongoAppException;
import com.mongo.model.Audit;
import com.mongo.service.AuditServiceImpl;
import com.mongo.wrapper.WrapperAudit;

@Controller
public class AuditController {

	@Autowired
	AuditServiceImpl auditser;
	
	@PostMapping("/createAudit")
	public ResponseEntity<Audit> createAudit(@RequestBody Audit audit) throws MongoAppException
	{
		if(audit.equals(null))
		{
			throw new MongoAppException("Audit is null");
		}
		else
		{
			Audit newAudit = auditser.createAudit(audit);
			return new ResponseEntity<Audit>(newAudit,HttpStatus.OK);
		}	
	}
	
	@GetMapping("/viewAllAudit")
	public ResponseEntity<List<Audit>> viewAllAudit() throws MongoAppException
	{
		List<Audit> audits = auditser.viewAudit();
		return new ResponseEntity<List<Audit>>(audits,HttpStatus.OK);
	}
	
	@PostMapping("/updateAudit")
	public ResponseEntity<Audit> updateUser(@RequestBody WrapperAudit audit) throws MongoAppException
	{
		
		if(audit.equals(null))
		{
			throw new MongoAppException("Audit is null");
		}
		else
		{
			Audit audits = auditser.UpdateAudit(audit);
			return new ResponseEntity<Audit>(audits,HttpStatus.OK);
		}
		
	}
	
	public ResponseEntity<List<Audit>> deleteAudit(@RequestParam("Id") String Id) throws MongoAppException
	{
		if(Id.equals(null))
		{
			throw new MongoAppException("Id is Invalid");
		}
		else
		{
			List<Audit> audit = auditser.deleteAudit(Id);
			return new ResponseEntity<List<Audit>>(audit,HttpStatus.OK);
		}
	}
}
