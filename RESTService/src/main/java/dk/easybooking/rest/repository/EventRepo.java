package dk.easybooking.rest.repository;


import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;

import dk.easybooking.rest.model.Event;
import dk.easybooking.rest.model.EventWithDates;

public class EventRepo {

	private Map<Long, EventWithDates> events;
	
	public EventRepo(){
		events = new HashMap<Long, EventWithDates>();
		Date date1 = new DateTime(2016, 7, 10, 16, 0).toDate();
		Date date2 = new DateTime(2016, 7, 10, 18, 0).toDate();
		Date date3 = new DateTime(2016, 7, 12, 14, 0).toDate();
		addEventWithDates(new Event(1L, "Bungee jump", "http:whatever.html"), Arrays.asList(date1,date2,date3));
	}

	public EventWithDates getEventWithDatesById(Long id){
		return events.get(id);
	}
	
	public Event getEventById(Long id){
		return events.get(id).getEvent();
	}
	
	public void addEventWithDates(Event event, List<Date> datesForEvent){
		events.put(event.getId(), new EventWithDates(event, datesForEvent));		
	}
}
