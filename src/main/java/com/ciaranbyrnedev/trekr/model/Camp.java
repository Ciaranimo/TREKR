package com.ciaranbyrnedev.trekr.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Camp {

	private long id;
	private String campName;
	private String campLocation;
	private Date created;
	private String author;
	private Map<Long, Review> reviews = new HashMap<>();
	
	public Camp(){
		
	}

	public Camp(long id, String campName, String campLocation, String author) {
		
		this.id = id;
		this.campName = campName;
		this.campLocation = campLocation;
		this.created = new Date();
		this.author = author;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCampName() {
		return campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
	}
	public String getCampLocation() {
		return campLocation;
	}
	public void setCampLocation(String campLocation) {
		this.campLocation = campLocation;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@XmlTransient
	public Map<Long, Review> getReviews(){
		return reviews;
	}
	public void setReviews( Map<Long, Review> reviews){
		this.reviews = reviews;
	}
	
}
