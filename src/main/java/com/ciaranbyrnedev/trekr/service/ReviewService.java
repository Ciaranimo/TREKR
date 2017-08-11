package com.ciaranbyrnedev.trekr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ciaranbyrnedev.trekr.model.Camp;
import com.ciaranbyrnedev.trekr.model.Review;
import com.ciaranbyrnedev.trekr.database.DatabaseClass;


public class ReviewService {
	
	private Map<Long, Camp> camps = DatabaseClass.getCamps();
	
	public List<Review> getAllReviews(long campId){
		Map<Long, Review> reviews = camps.get(campId).getReviews();
		return new ArrayList<Review>(reviews.values());
	}
	

	
	public Review getReview(long campId, long reviewId){
		Map<Long, Review> reviews = camps.get(campId).getReviews();
		return reviews.get(reviewId);
	}
	
	public Review addReview(long campId, Review review){
		Map<Long, Review> reviews = camps.get(campId).getReviews();
		review.setId(reviews.size() +1);
		reviews.put(review.getId(), review);
		return review;
	}
	
	public Review updateReview(long campId, Review review){
		Map<Long, Review> reviews = camps.get(campId).getReviews();
		if(review.getId() <= 0){
			return null;
		}
		reviews.put(review.getId(), review);
		return review;
	}
	
	public Review removeReview(long campId, long reviewId){
		Map<Long, Review> reviews = camps.get(campId).getReviews();
		return reviews.remove(reviewId);

	}

}
