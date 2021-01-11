package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.exception.EventNotFound;
import com.demo.repos.Event;
import com.demo.repos.EventRepo;
@Service
@Transactional
public class EventServiceImpl implements EventService{

	private EventRepo eventRepo;
	
	@Autowired
	public EventServiceImpl(EventRepo eventRepo) {
		this.eventRepo = eventRepo;
	}

	@Override
	public List<Event> getAllEvents() {
		return eventRepo.findAll();
	}

	@Override
	public void addEvent(Event event) {
		eventRepo.save(event);
		
	}

	@Override
	public Event updateEventDetails(int eventId, Event event) {
		Event eventUpdate=getEventById(eventId);
		eventUpdate.setNoOfTickets(event.getNoOfTickets());
		eventUpdate.setEventName(event.getEventName());
		eventRepo.save(eventUpdate);
		return eventUpdate;
	}

	@Override
	public Event deleteEventDetails(int eventId) {
		Event eventDelete=getEventById(eventId);
		eventRepo.delete(eventDelete);
		return eventDelete;
	}

	@Override
	public Event getEventById(int eventId) {
		Event eventById=eventRepo.findById(eventId).orElseThrow(()->new EventNotFound("Event Details are not there"));
		return eventById;
	}

	@Override
	public Event findByEventName(String eventName) {
		return eventRepo.findByEventName(eventName);
	}

}
