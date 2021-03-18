package com.omaisss.pmsclient.restservices;

import java.util.List;

import com.omaisss.pmsclient.restentity.AppUser;


public interface AppUserService {

	public void saveAppUser(AppUser appUser);
	public List<AppUser> getAppUser();
	
	
}
