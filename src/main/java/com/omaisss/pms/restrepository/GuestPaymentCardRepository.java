package com.omaisss.pms.restrepository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.omaisss.pms.restentity.GuestPaymentCard;


@Repository
public interface GuestPaymentCardRepository extends CrudRepository<GuestPaymentCard, String> {

}
