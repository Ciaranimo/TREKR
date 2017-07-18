package com.ciaranbyrnedev.trekr.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ciaranbyrnedev.trekr.service.CampService;
import com.ciaranbyrnedev.trekr.model.Camp;


@Path("/camps")
public class CampResource {
	
	CampService campService = new CampService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Camp> getCamps(){
		return campService.getAllCamps();
	}
	
	@GET
	@Path("/{campId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Camp getCamp(@PathParam("campId") long campId){
		return campService.getCamp(campId);
	}
	
}
