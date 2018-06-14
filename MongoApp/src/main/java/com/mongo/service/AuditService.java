package com.mongo.service;

import java.util.List;

import com.cg.exception.AuditMongoException;
import com.mongo.model.Audit;
import com.mongo.wrapper.WrapperAudit;



public interface AuditService {

	/**Audit created.
	 * @param object
	 * @return
	 */
	public Audit createAudit(Audit object) throws AuditMongoException;
	
	
	/**read Audit.
	 * @return
	 */
	public List<Audit> viewAudit() throws AuditMongoException;
	
	/**update Audit.
	 *
	 * @param Id
	 * @return
	 */
	public Audit UpdateAudit(WrapperAudit object) throws AuditMongoException;
	
	
	/**Delete Update.
	 * @param Id
	 * @return
	 */
	public List<Audit> deleteAudit(String Id) throws AuditMongoException	;
	
}
