package com.omaisss.pmsclient.restservices;

import java.util.List;

import com.omaisss.pmsclient.restentity.GuestPaymentCard;



public interface GuestPaymentCardService {

	
	public void saveGuestPaymentCard(GuestPaymentCard guestPaymentCard);
	public List<GuestPaymentCard>getGuestPaymentCard();
	public GuestPaymentCard getGuestPaymentCard(String guestPaymentCardId);
	public void deleteGuestPaymentCard(String guestPaymentCardId);
}
