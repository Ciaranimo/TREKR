package com.ciaranbyrnedev.trekr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ciaranbyrnedev.trekr.database.DatabaseClass;
import com.ciaranbyrnedev.trekr.model.Camp;

public class CampService {
	
	private Map<Long, Camp> camps = DatabaseClass.getCamps();

	public CampService(){
		camps.put(1L, new Camp(1, "Kamp Krusty ", "Wicklow", "Krusty"));
		camps.put(2L, new Camp(2, "Kamp jsjsj ", "Cork", "Jim"));
		camps.put(3L, new Camp(2, "Camp Byrne ", "Wicklow", "Ciaran"));


	}
	public List<Camp> getAllCamps(){
		return new ArrayList<Camp> (camps.values());
	}
	
	public List<Camp> getAllCampsForLocation(String location){
		List <Camp> campsByLocation = new ArrayList<>();
		for(Camp camp : camps.values()){
			String loc = camp.getCampLocation();
			if(loc.toLowerCase().equals(location.toLowerCase())){
				campsByLocation.add(camp);
			}
		}
		return campsByLocation;
	}
	
	public List<Camp> getAllCampsPaginated(int start, int size){
		ArrayList<Camp> list = new ArrayList<Camp>(camps.values());
		
		return list.subList(start, start + size);
	}
	
	public Camp getCamp(long id){
		return camps.get(id);
	}
	
	public Camp addCamp(Camp camp){
		camp.setId(camps.size() +1);
		camps.put(camp.getId(), camp);
		return camp;
	}
	
	public Camp updateCamp(Camp camp){
		if(camp.getId() <= 0){
			return null;
		}
		camps.put(camp.getId(), camp);
		return camp;
	}
	
	public Camp removeCamp(long id){
		return camps.remove(id);
	}
}
