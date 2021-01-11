package com.demo.repos;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eventdetails_table")
public class Event {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eventId;
	private String eventName;
	private String location;
	private Date eventDate;
	private int discount;
	private int noOfTickets;
	public Event() {
	}
	public Event(String eventName, String location, Date eventDate, int discount, int noOfTickets) {

		this.eventName = eventName;
		this.location = location;
		this.eventDate = eventDate;
		this.discount = discount;
		this.noOfTickets = noOfTickets;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	
	

}
