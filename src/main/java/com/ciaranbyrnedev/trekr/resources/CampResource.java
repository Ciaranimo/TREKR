package com.ciaranbyrnedev.trekr.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/camps")
public class CampResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCamps(){
		return "Hello dude";
	}
	
}
