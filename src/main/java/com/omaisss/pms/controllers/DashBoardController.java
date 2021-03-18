package com.omaisss.pms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.omaisss.pms.constants.PMSClientConstants;

@Controller
@RequestMapping("/dashboard")
public class DashBoardController {

	@GetMapping("/showdashboard")
	public ModelAndView welcome(ModelAndView modelView) {
		
		
		
		modelView.addObject("name", "asim");
		modelView.setViewName(PMSClientConstants.DASH_BOARD);
		return modelView;
	}
}
