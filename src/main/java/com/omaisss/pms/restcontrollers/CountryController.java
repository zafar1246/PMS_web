package com.omaisss.pms.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omaisss.pms.restentity.Country;
import com.omaisss.pms.restservices.CountryService;

@RestController
@RequestMapping("/api/pms/country") 
public class CountryController {
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/getallcountries") 
	public List<Country> getAllCountries(){
		return countryService.getAllCountries();
		
		
	}

}
