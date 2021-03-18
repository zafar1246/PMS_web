package com.omaisss.pmsclient.restcontrollers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omaisss.pmsclient.restservices.JWTService;

@RestController
@RequestMapping("/api/pms/authentication")
public class AuthenticationController {

	@Autowired
	JWTService jwtService;

	@GetMapping("/authenticate")
	public Map<String, String> validate() {
		Map<String, String> map = new HashMap<>();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = (User) auth.getPrincipal();
		String userName = user.getUsername();
		String role = user.getAuthorities().toArray()[0].toString();
		String token = jwtService.generateToken(userName, role);
		map.put("result", token);

		return map;
	}

}
