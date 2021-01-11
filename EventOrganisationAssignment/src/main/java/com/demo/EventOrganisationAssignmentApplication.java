package com.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.repos.Event;
import com.demo.service.EventService;
@SpringBootApplication
public class EventOrganisationAssignmentApplication implements CommandLineRunner {
	@Autowired
	private EventService eventService;
	public static void main(String[] args) {
		SpringApplication.run(EventOrganisationAssignmentApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
     SimpleDateFormat fmt=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=fmt.parse("14/01/2021");
		Date d2=fmt.parse("26/01/2021");
		Date d3=fmt.parse("3/02/2021");
		
		Event e1=new Event("Singing", "Hyderabad", d1, 10, 20);
		Event e2=new Event("Dancing", "Nellore", d2, 8, 10);
		Event e3=new Event("Drawing", "Ongole", d3, 11, 15);
		
		eventService.addEvent(e1);
		eventService.addEvent(e2);
		eventService.addEvent(e3);
		
	}
}
