package dk.easybooking.rest.services;


import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
@Path("/v1/json/chronichealth")
public class ChronicHealthRESTService {

	@GET
	@Path("/problems")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getChronicHealthProblemsList(){
		
		Collection<String> chronicHealthProblems = new ArrayList<String>();
		chronicHealthProblems.add("Asthma");
		chronicHealthProblems.add("Cancer");
		chronicHealthProblems.add("Diabetes");
		chronicHealthProblems.add("Osteoporosis");
		ObjectMapper mapper = new ObjectMapper();
		String json;
		try {
			json = mapper.writeValueAsString(chronicHealthProblems);
		} catch (Exception e) {
			return Response.serverError().build();
		}
		
		return Response.ok(json).build();
	}
	
}
