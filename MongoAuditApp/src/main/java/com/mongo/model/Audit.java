package com.mongo.model;

import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Audit {
	
	
	@Id
	public String auditId;
	public UUID EventId;
	public String eventName;
	public String eventType;
	public Timestamp eventDate;
	public String userId;
	public Object oldValue;
	public Object newValue;
	/**
	 * @param auditId
	 * @param eventId
	 * @param eventName
	 * @param eventType
	 * @param eventDate
	 * @param userId
	 * @param oldValue
	 * @param newValue
	 */
	public Audit(String auditId, UUID eventId, String eventName, String eventType, Timestamp eventDate, String userId,
			Object oldValue, Object newValue) {
		this.auditId = auditId;
		EventId = eventId;
		this.eventName = eventName;
		this.eventType = eventType;
		this.eventDate = eventDate;
		this.userId = userId;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}
	
	public Audit() {
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
	 * @return the eventId
	 */
	public UUID getEventId() {
		return EventId;
	}
	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(UUID eventId) {
		EventId = eventId;
	}
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/**
	 * @return the eventType
	 */
	public String getEventType() {
		return eventType;
	}
	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	/**
	 * @return the eventDate
	 */
	public Timestamp getEventDate() {
		return eventDate;
	}
	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(Timestamp eventDate) {
		this.eventDate = eventDate;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the oldValue
	 */
	public Object getOldValue() {
		return oldValue;
	}
	/**
	 * @param oldValue the oldValue to set
	 */
	public void setOldValue(Object oldValue) {
		this.oldValue = oldValue;
	}
	/**
	 * @return the newValue
	 */
	public Object getNewValue() {
		return newValue;
	}
	/**
	 * @param newValue the newValue to set
	 */
	public void setNewValue(Object newValue) {
		this.newValue = newValue;
	}

	@Override
	public String toString() {
		return "Audit [auditId=" + auditId + ", EventId=" + EventId + ", eventName=" + eventName + ", eventType="
				+ eventType + ", eventDate=" + eventDate + ", userId=" + userId + ", oldValue=" + oldValue
				+ ", newValue=" + newValue + "]";
	}
	
	
}
