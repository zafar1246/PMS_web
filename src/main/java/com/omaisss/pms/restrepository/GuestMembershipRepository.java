package com.omaisss.pms.restrepository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.omaisss.pms.restentity.GuestMembership;


@Repository
public interface GuestMembershipRepository extends CrudRepository<GuestMembership, String> {

}
