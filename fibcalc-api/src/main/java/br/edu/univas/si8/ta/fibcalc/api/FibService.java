package br.edu.univas.si8.ta.fibcalc.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

public interface FibService {
	
	@GET
	@Path("/fib")
	@Produces(MediaType.APPLICATION_JSON)
	Result fib(@QueryParam("number") int a);
	
}
