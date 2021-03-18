package com.omaisss.pms.restrepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omaisss.pms.restentity.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	Optional<AppUser> findByUserName(String userName);

}
