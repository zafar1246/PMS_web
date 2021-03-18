package com.omaisss.pmsclient.restrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omaisss.pmsclient.restentity.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
