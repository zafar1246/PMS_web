package com.omaisss.pmsclient.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.omaisss.pmsclient.constants.PMSClientConstants;

@Controller
@RequestMapping("/reservations")
public class ReservationController {

	@GetMapping("/showpage")
	private ModelAndView showGuestProfilePage(ModelAndView modelView) {
		modelView.setViewName(PMSClientConstants.RESERVATION_PAGE);
		return modelView;

	}
	
	
	@PostMapping("/makereservation")
	private ModelAndView makeGuestBooking(ModelAndView modelView, HttpServletRequest request) {
		String firstName = request.getParameter("firstName");
		System.out.println("firstName----"+firstName);
		System.out.println("I'm in make reservation controller.. about to book a room have patience");
		
		modelView.setViewName("guest-reservation-report");
		
		return modelView;
		
	}

}
