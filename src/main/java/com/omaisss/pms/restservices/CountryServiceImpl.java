package com.omaisss.pms.restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omaisss.pms.restentity.Country;
import com.omaisss.pms.restrepository.CountryRepository;
 
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
