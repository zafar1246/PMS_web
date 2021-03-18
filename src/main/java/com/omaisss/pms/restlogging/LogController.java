package com.omaisss.pms.restlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.omaisss.pms.PmsWebApplication;

@RestController
public class LogController {
	Logger logger = LoggerFactory.getLogger(PmsWebApplication.class);

	public ResponseEntity<String> getLog() {
		return new ResponseEntity<String>("Application Log", HttpStatus.OK);
	}
}
