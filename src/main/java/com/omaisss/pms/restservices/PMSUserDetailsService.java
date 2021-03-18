package com.omaisss.pms.restservices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.omaisss.pms.restdomainobjects.PMSUserDetails;
import com.omaisss.pms.restentity.AppUser;
import com.omaisss.pms.restrepository.AppUserRepository;

@Service
public class PMSUserDetailsService implements UserDetailsService {

	@Autowired
	private AppUserRepository appUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<AppUser> user = appUserRepository.findByUserName(username);
		user.orElseThrow(() -> new UsernameNotFoundException("User not found :  " + username));

		return user.map(PMSUserDetails::new).get();

	}

}
