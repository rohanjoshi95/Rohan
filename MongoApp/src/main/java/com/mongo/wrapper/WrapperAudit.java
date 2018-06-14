package com.mongo.wrapper;

import com.mongo.model.Audit;

public class WrapperAudit {

	private String auditId;
	private Audit audit;
	/**
	 * @param auditId
	 * @param audit
	 */
	public WrapperAudit(String auditId, Audit audit) {
		this.auditId = auditId;
		this.audit = audit;
	}
	
	public WrapperAudit() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the auditId
	 */
	public String getAuditId() {
		return auditId;
	}
	/**
	 * @param auditId the auditId to set
	 */
	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}
	/**
	 * @return the audit
	 */
	public Audit getAudit() {
		return audit;
	}
	/**
	 * @param audit the audit to set
	 */
	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	@Override
	public String toString() {
		return "WrapperAudit [auditId=" + auditId + ", audit=" + audit + "]";
	}
	
	
	
}
