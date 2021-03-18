package com.omaisss.pms.restrepository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.omaisss.pms.restentity.GuestProfile;

@Repository
public interface GuestProfileRepository extends CrudRepository<GuestProfile, Integer> {

}
