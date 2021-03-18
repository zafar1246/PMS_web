package com.omaisss.pmsclient.restrepository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.omaisss.pmsclient.restentity.GuestAddress;


@Repository
public interface GuestAddressRepository extends CrudRepository<GuestAddress, String> {

}
