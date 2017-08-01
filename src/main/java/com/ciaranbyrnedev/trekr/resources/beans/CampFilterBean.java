package com.ciaranbyrnedev.trekr.resources.beans;

import javax.ws.rs.QueryParam;

public class CampFilterBean {
	
	private @QueryParam("location") String location;
	private @QueryParam("start") int start;
	private @QueryParam("size") int size;
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
