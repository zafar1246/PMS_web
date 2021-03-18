package com.omaisss.pmsclient.restrepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omaisss.pmsclient.restentity.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long> {
	Optional<AppUser> findByUserName(String userName);

}
