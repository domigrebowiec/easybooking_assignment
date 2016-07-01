package dk.easybooking.rest.services;

	
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dk.easybooking.rest.model.EventWithDates;
import dk.easybooking.rest.repository.EventRepo;

@Component
@Path("/v1/json/event")
public class EventRESTService {

	private static final Logger logger = LogManager.getLogger(EventRESTService.class);
	
	@Autowired
	private EventRepo eventRepo;
		
	@GET
	@Path("/dates/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAvailableEventDates(@PathParam("param")long eventId){
		
		logger.info("eventId::"+eventId);
		
		List<Date> dates = new ArrayList<Date>();
		
		EventWithDates eventWithDates = eventRepo.getEventWithDatesById(eventId);
		if (eventWithDates != null){
			dates = eventWithDates.getEventDates();
		}
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
		String json;
		
		try {
			json = mapper.writeValueAsString(dates);
			logger.info(json);
			
		} catch (Exception e) {
			return Response.serverError().build();
		}
		
		return Response.ok(json).build();
	}

	public EventRepo getEventRepo() {
		return eventRepo;
	}

	public void setEventRepo(EventRepo eventRepo) {
		this.eventRepo = eventRepo;
	}

	
}
