package com.omaisss.pmsclient.restservices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.omaisss.pmsclient.restdomainobjects.PMSUserDetails;
import com.omaisss.pmsclient.restentity.AppUser;
import com.omaisss.pmsclient.restrepository.AppUserRepository;
//import com.omaisss.pmsclient.restrepository.UserRepository;

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
