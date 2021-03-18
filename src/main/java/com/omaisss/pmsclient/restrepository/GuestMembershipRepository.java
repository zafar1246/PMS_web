package com.omaisss.pmsclient.restrepository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.omaisss.pmsclient.restentity.GuestMembership;


@Repository
public interface GuestMembershipRepository extends CrudRepository<GuestMembership, String> {

}
