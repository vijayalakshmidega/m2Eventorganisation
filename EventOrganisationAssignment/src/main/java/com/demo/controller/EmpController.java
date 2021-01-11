package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.repos.Event;
import com.demo.service.EventService;

@RestController
@RequestMapping("emp")
public class EmpController {

	private BookingBeans bBeans;
	private EventService eService;
	@GetMapping("booking")
	public String getBookingDetails() {
		//Event events=eService.updateEventDetails(bBeans.getBookingId(), bBeans.seteName(bBeans.geteName());
		String details=bBeans.Display();
		return "Successfully Booked";
	}
	
}
