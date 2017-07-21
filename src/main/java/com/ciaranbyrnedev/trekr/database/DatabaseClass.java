package com.ciaranbyrnedev.trekr.database;

import java.util.HashMap;
import java.util.Map;

import com.ciaranbyrnedev.trekr.model.Camp;
import com.ciaranbyrnedev.trekr.model.Profile;

public class DatabaseClass {
	
	public static Map <Long, Camp> camps = new HashMap<>();
	public static Map <String, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Camp> getCamps() {
		return camps;
	}
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}


	
}
