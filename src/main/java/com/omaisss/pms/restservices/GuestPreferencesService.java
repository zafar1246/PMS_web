package com.omaisss.pms.restservices;

import java.util.List;

import com.omaisss.pms.restentity.GuestPreferences;



public interface GuestPreferencesService {
	
	public void saveGuestPreferences(GuestPreferences guestPreferences);
	public List<GuestPreferences>getGuestPreferences();
	public GuestPreferences getGuestPreferences(String guestPreferencesId);
	public void deleteGuestPreferences(String guestPreferencesId);

}
