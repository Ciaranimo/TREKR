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

import com.ciaranbyrnedev.trekr.model.Review;
import com.ciaranbyrnedev.trekr.service.ReviewService;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class ReviewResource {

	private ReviewService reviewService = new ReviewService();
	
	@GET
	public List<Review> getAllReviews(@PathParam("campId") long campId) {
		return reviewService.getAllReviews(campId);
	}
	
	@POST
	public Review addReview(@PathParam("campId") long campId, Review review) {
		return reviewService.addReview(campId, review);
	}
	
	@PUT
	@Path("/{reviewId}")
	public Review updateReview(@PathParam("campId") long campId, @PathParam("reviewId") long id, Review review) {
		review.setId(id);
		return reviewService.updateReview(campId, review);
	}
	
	@DELETE
	@Path("/{reviewId}")
	public void deleteReview(@PathParam("campId") long campId, @PathParam("reviewId") long reviewId) {
		reviewService.removeReview(campId, reviewId);
	}
	
	
	@GET
	@Path("/{reviewId}")
	public Review getCamp(@PathParam("campId") long campId, @PathParam("reviewId") long reviewId) {
		return reviewService.getReview(campId, reviewId);
	}
	
}
