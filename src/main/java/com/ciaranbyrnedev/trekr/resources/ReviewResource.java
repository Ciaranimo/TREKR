package com.ciaranbyrnedev.trekr.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ciaranbyrnedev.trekr.model.Camp;
import com.ciaranbyrnedev.trekr.model.Review;
import com.ciaranbyrnedev.trekr.service.ReviewService;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ReviewResource {

	private ReviewService reviewService = new ReviewService();
	
	@GET
	public List<Review> getAllReviews(@PathParam("reviewId") long reviewId){
		return reviewService.getAllReviews(reviewId);	
	}
	
	
	@POST
	public Review addReview(@PathParam("reviewId") long reviewId, Review review){
		return reviewService.addReview(reviewId, review);
	}
	

	@PUT
	@Path("/{reviewId}")
	public Review updateReview(@PathParam("campId")long campId, @PathParam("reviewId") long reviewId, Review review){
		review.setId(reviewId);
		return reviewService.updateReview(campId, review);
	}
	
	@DELETE
	@Path("/{reviewId}")
	public void deleteReview(@PathParam("campId")long campId, @PathParam("reviewId") long reviewId){
		reviewService.removeReview(campId, reviewId);
	}

	@GET
	@Path("/{reviewId}")
	public Review getReview(@PathParam("campId")long campId, @PathParam("reviewId") long reviewId){
		return reviewService.getReview(campId, reviewId);
	}
	


}
