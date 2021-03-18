package com.omaisss.pmsclient.restservices;

import java.util.List;

import com.omaisss.pmsclient.restentity.GuestMembership;



public interface GuestMembershipService {
	
	public void saveGuestMembership(GuestMembership guestMembership );
	public List<GuestMembership> getGuestMembership();
	public GuestMembership getGuestMembership(String guestMembershipId);
	public void deleteGuestMembership(String guestMembershipId);
}
