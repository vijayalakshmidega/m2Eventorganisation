package com.demo.exception;

public class EventNotFound extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public EventNotFound(String message) {
		super(message);
	}
	
}
