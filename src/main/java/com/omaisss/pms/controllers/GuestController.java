package com.omaisss.pms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.omaisss.pms.constants.PMSClientConstants;

@Controller
@RequestMapping("/guestprofile")
public class GuestController {
	
	@GetMapping("/showpage")
	private ModelAndView showGuestProfilePage(ModelAndView modelView) {
		modelView.setViewName(PMSClientConstants.GUEST_PROFILE_PAGE);
		
		return modelView;
		
		
	}

}
