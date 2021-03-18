package com.omaisss.pmsclient.restservices;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.omaisss.pmsclient.restentity.GuestAddress;
import com.omaisss.pmsclient.restrepository.GuestAddressRepository;



@Service
@Component
public class GuestAddressServiceImpl implements GuestAddressService {

	@Autowired
	private GuestAddressRepository guestAddressRepository; 
	
	@Override
	@Transactional
	public void saveGuestAddress(GuestAddress guestAddress) {
		guestAddressRepository.save(guestAddress);
	}

	@Override
	@Transactional
	public List<GuestAddress> getGuestAddress() {
		return (List<GuestAddress>) guestAddressRepository.findAll();
	}

	@Override
	@Transactional
	public GuestAddress getGuestAddress(String guestAddressId) {
		Optional<GuestAddress> guestAddressOptional =guestAddressRepository.findById(guestAddressId);
		return guestAddressOptional.get();
	}

	@Override
	@Transactional
	public void deleteGuestAddress(String guestAddressId) {
	guestAddressRepository.deleteById(guestAddressId);
	}

}
