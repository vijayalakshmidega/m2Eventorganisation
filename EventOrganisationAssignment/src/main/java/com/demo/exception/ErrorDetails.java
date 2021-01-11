package com.demo.exception;

import java.util.Date;

public class ErrorDetails {

	
	private Date timestamp;
	  private String message;
	  private String details;
	private String contact;
	  
	  public ErrorDetails() {
		
	}

	public ErrorDetails(Date timestamp, String message, String details, String contact) {
		
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.contact = contact;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}





	@Override
	public String toString() {
		return "ErrorDetails [timestamp=" + timestamp + ", message=" + message + ", details=" + details + ", contact="
				+ contact + "]";
	}


	  
	  

}
