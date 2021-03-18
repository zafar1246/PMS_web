package com.omaisss.pms.restrepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omaisss.pms.restentity.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long> {
	Optional<AppUser> findByUserName(String userName);

}
