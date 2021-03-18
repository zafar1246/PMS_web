package com.omaisss.pmsclient.restrepository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.omaisss.pmsclient.restentity.GuestProfile;

@Repository
public interface GuestProfileRepository extends CrudRepository<GuestProfile, Integer> {

}
