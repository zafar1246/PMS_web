package com.omaisss.pms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.omaisss.pms.constants.PMSClientConstants;

@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping
	public ModelAndView showLoginPage(ModelAndView modelView) {
		modelView.setViewName(PMSClientConstants.LOG_IN);
		return modelView;
	}

	@PostMapping("/validate")
	public ModelAndView validate(ModelAndView modelView, @RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		if (userName.equals("admin") && password.equals("password")) {

			modelView.setViewName("dashboard");
			System.out.println(userName);
			System.out.println(password);
			return modelView;

		}

		modelView.setViewName("login");
		return modelView;
	}

}