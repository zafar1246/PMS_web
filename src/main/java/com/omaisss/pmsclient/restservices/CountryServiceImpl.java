package com.omaisss.pmsclient.restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omaisss.pmsclient.restentity.Country;
import com.omaisss.pmsclient.restrepository.CountryRepository;
 
@Service
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	private CountryRepository countryRepository;

	@Override
	public List<Country> getAllCountries() {
		System.out.println("inside service impl");
		return countryRepository.findAll();
		
	
	}

}
