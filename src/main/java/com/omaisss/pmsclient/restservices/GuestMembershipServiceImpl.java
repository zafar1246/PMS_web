package com.omaisss.pmsclient.restservices;

import java.util.List;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.omaisss.pmsclient.restentity.GuestMembership;
import com.omaisss.pmsclient.restrepository.GuestMembershipRepository;


@Service
@Component
public class GuestMembershipServiceImpl implements GuestMembershipService {

	@Autowired
	private GuestMembershipRepository guestMembershipRepository;

	@Override
	@Transactional
	public void saveGuestMembership(GuestMembership guestMembership) {
		guestMembershipRepository.save(guestMembership);
	}

	@Override
	@Transactional
	public List<GuestMembership> getGuestMembership() {
		return (List<GuestMembership>) guestMembershipRepository.findAll();
	}

	@Override
	public GuestMembership getGuestMembership(String guestMembershipId) {
		Optional<GuestMembership> guestMembershipOptional = guestMembershipRepository.findById(guestMembershipId);
		return guestMembershipOptional.get();
	}

	@Override
	@Transactional
	public void deleteGuestMembership(String guestMembershipId) {
		guestMembershipRepository.deleteById(guestMembershipId);
	}

}
