package dk.easybooking.rest.model;

import java.util.Date;

public class EventOnDate {

	private Event event;
	private Date date;
	
	public EventOnDate(Event event, Date date) {
		this.event = event;
		this.date = date;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "EventOnDate [event=" + event + ", date=" + date + "]";
	}
	
	
}
