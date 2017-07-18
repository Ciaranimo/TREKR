package com.ciaranbyrnedev.trekr.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Camp {

	private long id;
	private String campName;
	private String campDetails;
	private Date created;
	private String author;
	
	public Camp(){
		
	}

	public Camp(long id, String campName, String campDetails, String author) {
		
		this.id = id;
		this.campName = campName;
		this.campDetails = campDetails;
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
	public String getCampDetails() {
		return campDetails;
	}
	public void setCampDetails(String campDetails) {
		this.campDetails = campDetails;
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
