package com.omaisss.pms.restservices;

import java.util.List;

import com.omaisss.pms.restdomainobjects.GuestProfileVO;
import com.omaisss.pms.restentity.GuestProfile;

public interface GuestProfileService {

	public void saveGuestProfile(GuestProfileVO guestProfile);
	public List<GuestProfile>getGuestProfile();
	public GuestProfile getGuestProfile(int guestProfileId);
	public void deleteGuestProfile(int guestProfileId);
}
