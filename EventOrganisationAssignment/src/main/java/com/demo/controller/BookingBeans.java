package com.demo.controller;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.demo.repos.Event;

public class BookingBeans {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookingId;
	private String pName;
	private String eName;
	public BookingBeans() {
	}
	public BookingBeans(String pName, String eName) {
		super();
		this.pName = pName;
		this.eName = eName;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String Display() {
		return "pName"+"eName";
	}
	
	
}
