package com.omaisss.pms.restservices;

import java.util.List;

import com.omaisss.pms.restentity.GuestAddress;



public interface GuestAddressService {

	public void saveGuestAddress(GuestAddress guestAddress);
	public List<GuestAddress>getGuestAddress();
	public  GuestAddress getGuestAddress(String guestAddressId);
	public void deleteGuestAddress(String guestAddressId);
}
