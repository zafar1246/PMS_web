package com.omaisss.pms.restrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omaisss.pms.restentity.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
