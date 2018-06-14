package com.cg.exception;

public class AuditMongoException extends Exception{

	private static final long serialVersionUID = 1L;

	public AuditMongoException(String msg)
	{
		super(msg);
	}
}
