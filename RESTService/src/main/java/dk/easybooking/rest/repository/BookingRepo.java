package dk.easybooking.rest.repository;

import java.util.HashMap;
import java.util.Map;

import dk.easybooking.rest.model.Booking;

public class BookingRepo {

	private Map<Long, Booking> bookings;
	
	public BookingRepo(){
		bookings = new HashMap<Long, Booking>();
	}
	
	public void addBooking(Booking booking){
		bookings.put(booking.getId(), booking);
	}
}
