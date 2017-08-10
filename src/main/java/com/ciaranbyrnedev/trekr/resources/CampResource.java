package com.ciaranbyrnedev.trekr.resources;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.ciaranbyrnedev.trekr.service.CampService;
import com.ciaranbyrnedev.trekr.model.Camp;
import com.ciaranbyrnedev.trekr.resources.beans.CampFilterBean;


@Path("/camps")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CampResource {
	
	CampService campService = new CampService();
	
	@GET
	public List<Camp> getCamps(@BeanParam CampFilterBean filterBean){
		try{
		if(filterBean.getLocation() != null ){
			return campService.getAllCampsForLocation(filterBean.getLocation());

		}
		if(filterBean.getStart() >= 0 && filterBean.getSize() > 0){
			return campService.getAllCampsPaginated(filterBean.getStart(), filterBean.getSize());
		}
		
		return campService.getAllCamps(); 
		}catch(NullPointerException e){
			throw new IllegalStateException("A camp has a null property", e);
		}

	}
	
	@POST
	public Camp addCamp(Camp camp){
		return campService.addCamp(camp);
		//return "Post works";
	}
	
	@PUT
	@Path("/{campId}")
	public Camp updateCamp(@PathParam("campId") long campId, Camp camp){
		camp.setId(campId);
		return campService.updateCamp(camp);
	}
	
	@DELETE
	@Path("/{campId}")
	public void deleteCamp(@PathParam("campId") long campId){
		campService.removeCamp(campId);
	}

	@GET
	@Path("/{campId}")
	public Camp getCamp(@PathParam("campId") long campId){
		return campService.getCamp(campId);
	}
	
	// When path matches it hands over to ReviewResource
	@Path("/{campId}/reviews")
	public ReviewResource getReviewResource(){
		return new ReviewResource();
	}
	
	
}
