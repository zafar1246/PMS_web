package com.omaisss.pmsclient.restservices;

import java.util.List;

import com.omaisss.pmsclient.restdomainobjects.GuestProfileVO;
import com.omaisss.pmsclient.restentity.GuestProfile;

public interface GuestProfileService {

	public void saveGuestProfile(GuestProfileVO guestProfile);
	public List<GuestProfile>getGuestProfile();
	public GuestProfile getGuestProfile(int guestProfileId);
	public void deleteGuestProfile(int guestProfileId);
}
