package dk.easybooking.rest.model;

import java.util.Date;
import java.util.List;

public class EventWithDates {
	
	private Event event;
	private List<Date> eventDates;
	
	public EventWithDates(Event event, List<Date> eventDates) {
		this.event = event;
		this.eventDates = eventDates;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public List<Date> getEventDates() {
		return eventDates;
	}

	public void setEventDates(List<Date> eventDates) {
		this.eventDates = eventDates;
	}
	
	
}
