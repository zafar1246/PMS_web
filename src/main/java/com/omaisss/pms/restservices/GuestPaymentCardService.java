package com.omaisss.pms.restservices;

import java.util.List;

import com.omaisss.pms.restentity.GuestPaymentCard;



public interface GuestPaymentCardService {

	
	public void saveGuestPaymentCard(GuestPaymentCard guestPaymentCard);
	public List<GuestPaymentCard>getGuestPaymentCard();
	public GuestPaymentCard getGuestPaymentCard(String guestPaymentCardId);
	public void deleteGuestPaymentCard(String guestPaymentCardId);
}
