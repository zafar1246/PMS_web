package com.omaisss.pms.restservices;

import java.util.List;

import com.omaisss.pms.restentity.GuestMembership;



public interface GuestMembershipService {
	
	public void saveGuestMembership(GuestMembership guestMembership );
	public List<GuestMembership> getGuestMembership();
	public GuestMembership getGuestMembership(String guestMembershipId);
	public void deleteGuestMembership(String guestMembershipId);
}
