package com.omaisss.pmsclient.restservices;

import java.util.List;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.omaisss.pmsclient.restentity.GuestPreferences;
import com.omaisss.pmsclient.restrepository.GuestPreferencesRepository;


@Service
@Component
public class GuestPreferencesServiceImpl implements GuestPreferencesService {

	@Autowired
	private GuestPreferencesRepository guestPreferencesRepository;

	@Override
	@Transactional
	public void saveGuestPreferences(GuestPreferences guestPreferences) {
		guestPreferencesRepository.save(guestPreferences);
	}

	@Override
	@Transactional
	public List<GuestPreferences> getGuestPreferences() {
		return (List<GuestPreferences>) guestPreferencesRepository.findAll();
	}

	@Override
	@Transactional
	public GuestPreferences getGuestPreferences(String guestPreferencesId) {
		Optional<GuestPreferences> guestPreferencesOptional = guestPreferencesRepository.findById(guestPreferencesId);
		return guestPreferencesOptional.get();
	}

	@Override
	@Transactional
	public void deleteGuestPreferences(String guestPreferencesId) {
		guestPreferencesRepository.deleteById(guestPreferencesId);
	}

}
