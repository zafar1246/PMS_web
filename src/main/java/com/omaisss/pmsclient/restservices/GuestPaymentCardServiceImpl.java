package com.omaisss.pmsclient.restservices;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.omaisss.pmsclient.restentity.GuestPaymentCard;
import com.omaisss.pmsclient.restrepository.GuestPaymentCardRepository;



@Service
@Component
public class GuestPaymentCardServiceImpl implements GuestPaymentCardService {

	@Autowired
	private GuestPaymentCardRepository guestPaymentCardRepository;

	@Override
	@Transactional
	public void saveGuestPaymentCard(GuestPaymentCard guestPaymentCard) {
		guestPaymentCardRepository.save(guestPaymentCard);
	}

	@Override
	@Transactional
	public List<GuestPaymentCard> getGuestPaymentCard() {
		return (List<GuestPaymentCard>) guestPaymentCardRepository.findAll();
	}

	@Override
	@Transactional
	public GuestPaymentCard getGuestPaymentCard(String guestPaymentCardId) {
		Optional<GuestPaymentCard> guestPaymentCardOptional = guestPaymentCardRepository.findById(guestPaymentCardId);
		return guestPaymentCardOptional.get();
	}

	@Override
	@Transactional
	public void deleteGuestPaymentCard(String guestPaymentCardId) {
		guestPaymentCardRepository.deleteById(guestPaymentCardId);
	}

}
