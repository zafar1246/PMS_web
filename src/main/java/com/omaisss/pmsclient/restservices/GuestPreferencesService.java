package com.omaisss.pmsclient.restservices;

import java.util.List;

import com.omaisss.pmsclient.restentity.GuestPreferences;



public interface GuestPreferencesService {
	
	public void saveGuestPreferences(GuestPreferences guestPreferences);
	public List<GuestPreferences>getGuestPreferences();
	public GuestPreferences getGuestPreferences(String guestPreferencesId);
	public void deleteGuestPreferences(String guestPreferencesId);

}
