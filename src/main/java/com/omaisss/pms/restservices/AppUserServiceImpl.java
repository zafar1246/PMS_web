package com.omaisss.pms.restservices;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omaisss.pms.restentity.AppUser;
import com.omaisss.pms.restrepository.AppUserRepository;

@Service
public class AppUserServiceImpl implements AppUserService{

	
	@Autowired
	private AppUserRepository appUserRepository;
	
	
	@Override
	@Transactional
	public void saveAppUser(AppUser appUser) {
		appUserRepository.save(appUser);
	}

	@Override
	@Transactional
	public List<AppUser> getAppUser() {
		return (List<AppUser>) appUserRepository.findAll();
	}
}
