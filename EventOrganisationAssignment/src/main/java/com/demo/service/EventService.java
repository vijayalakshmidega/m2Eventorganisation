package com.demo.service;
import java.util.*;

import com.demo.repos.Event;
public interface EventService {

	
	public List<Event> getAllEvents();
	public void addEvent(Event event);
	public Event updateEventDetails(int eventId,Event event);
	public Event deleteEventDetails(int eventId);
	public Event getEventById(int eventId);
	public Event findByEventName(String eventName);
}
