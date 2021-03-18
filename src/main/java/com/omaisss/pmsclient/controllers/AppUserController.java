package com.omaisss.pmsclient.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.omaisss.pmsclient.beans.AppUser;

@Controller
@RequestMapping("/appuser")
public class AppUserController {

	@RequestMapping("/showpage")
	public ModelAndView showForm(ModelAndView mv) {

		System.out.println("inside showform method");
		AppUser appUser = new AppUser();
		mv.addObject("appuser", appUser);
		mv.setViewName("app-user");
		return mv;

	}

	@RequestMapping("/processappuser")
	public String processForm(@ModelAttribute("appuser") AppUser theAppUser) {
		System.out.println(theAppUser);
		return "create-app-report";

	}

}
