package com.omaisss.pms.restservices;

import java.util.List;

import com.omaisss.pms.restentity.AppUser;


public interface AppUserService {

	public void saveAppUser(AppUser appUser);
	public List<AppUser> getAppUser();
	
	
}
