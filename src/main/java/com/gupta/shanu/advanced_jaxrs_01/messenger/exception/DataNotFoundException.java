package com.gupta.shanu.advanced_jaxrs_01.messenger.exception;


public class DataNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8581157853416912567L;
	
	public DataNotFoundException(String message){
		super(message);
	}
}
