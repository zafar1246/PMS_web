package com.omaisss.pmsclient.restrepository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.omaisss.pmsclient.restentity.GuestPreferences;


@Repository
public interface GuestPreferencesRepository extends CrudRepository<GuestPreferences, String> {

}
