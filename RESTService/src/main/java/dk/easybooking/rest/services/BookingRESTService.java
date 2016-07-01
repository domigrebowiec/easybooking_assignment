package dk.easybooking.rest.services;



import java.text.SimpleDateFormat;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import dk.easybooking.rest.dto.BookingDto;
import dk.easybooking.rest.model.Booking;
import dk.easybooking.rest.model.EventOnDate;
import dk.easybooking.rest.repository.BookingRepo;
import dk.easybooking.rest.repository.EventRepo;

@Component
@Path("/v1/json/bookings")
public class BookingRESTService {

	private static final Logger logger = LogManager.getLogger(BookingRESTService.class);
	
	@Autowired
	private BookingRepo bookingRepo;
	
	@Autowired
	private EventRepo eventRepo;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response doBooking(@RequestBody BookingDto bookingDto){
		
		EventOnDate event = new EventOnDate(eventRepo.getEventById(bookingDto.getEventId()), bookingDto.getEventDate());
		Booking booking = new Booking(bookingDto.getName(), bookingDto.getAge(), bookingDto.getGender(),
				bookingDto.getWeight(), bookingDto.getChronicHealthProblems(), event);
		bookingRepo.addBooking(booking);
		
		logger.info("Booking saved::"+booking);
			
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
		try {
			String json = mapper.writeValueAsString(booking);
			return Response.ok(json).build();
		} catch (Exception e) {
			return Response.serverError().build();
		}		
		
	}

	public BookingRepo getBookingRepo() {
		return bookingRepo;
	}

	public void setBookingRepo(BookingRepo bookingRepo) {
		this.bookingRepo = bookingRepo;
	}

	public EventRepo getEventRepo() {
		return eventRepo;
	}

	public void setEventRepo(EventRepo eventRepo) {
		this.eventRepo = eventRepo;
	}
	
	
}
