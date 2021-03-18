package com.omaisss.pms.restrepository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.omaisss.pms.restentity.GuestAddress;


@Repository
public interface GuestAddressRepository extends CrudRepository<GuestAddress, String> {

}
