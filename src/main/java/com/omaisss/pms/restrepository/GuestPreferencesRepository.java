package com.omaisss.pms.restrepository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.omaisss.pms.restentity.GuestPreferences;


@Repository
public interface GuestPreferencesRepository extends CrudRepository<GuestPreferences, String> {

}
