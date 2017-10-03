package br.edu.univas.si8.ta.fibcalc.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/fibcalc")
public interface FibService {
	
	@GET
	@Path("/fib/{num}")
	@Produces(MediaType.APPLICATION_JSON)
	String fib(@QueryParam("num") String num);
	
	
	@GET
	@Path("/say/{name}")
	@Produces(MediaType.TEXT_HTML)
	String sayHello(@PathParam("name") String name);
	
}
