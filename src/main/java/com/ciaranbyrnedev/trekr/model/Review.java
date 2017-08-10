package com.ciaranbyrnedev.trekr.model;

import java.util.Date;

public class Review {

	private long id;
	private String camp;
	private Date created;
	private String author;
	
	public Review(){
		
	}

	public Review(long id, String camp, String author) {
		
		this.id = id;
		this.camp = camp;
		this.created = new Date();
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCamp() {
		return camp;
	}

	public void setCamp(String camp) {
		this.camp = camp;
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
	
	
	
	
}
