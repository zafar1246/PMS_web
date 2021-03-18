package com.omaisss.pmsclient.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.omaisss.pmsclient.restentity.AppUser;
import com.omaisss.pmsclient.restservices.AppUserService;

@CrossOrigin
@RestController
@RequestMapping("/api/pms/appuser")
public class AppUserRestController {

	@Autowired
	private AppUserService appUserService;

	@PostMapping("/createappuser")
	public AppUser addAppUser(@RequestBody AppUser appUser) {
		System.out.println("inside addappuser method");
		appUserService.saveAppUser(appUser);
		return appUser;
	}

	@GetMapping("/getappuser")
	public List<AppUser> getAppUser() {

		System.out.println("getappuserrestcontroller getMapping Method");
		return appUserService.getAppUser();
	}

}
