package com.omaisss.pmsclient.restlogging;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.AbstractRequestLoggingFilter;

@Component
public class LogFilter extends AbstractRequestLoggingFilter {
	private static final String DEVICE_ID = "DEVICE_ID";
	private static final String DEVICE_TYPE = "DEVICE_TYPE";

	Logger logger = LoggerFactory.getLogger(LogFilter.class);

	@Override
	protected void beforeRequest(HttpServletRequest request, String message) {

		logger.info("Before Request");
		logger.info("Request URI : " + request.getRequestURI());
		logger.info("Request URL :" + request.getRequestURL().toString());
		logger.info("Remote Host :" + request.getRemoteHost());
		logger.info("Remote Address :" + request.getRemoteAddr());
		logger.info("QueryString :" + request.getQueryString());
		logger.info("Request Header for Device ID : " + request.getHeader(DEVICE_ID));
		logger.info("Request Header for Device Type : " + request.getHeader(DEVICE_TYPE));

	}

	@Override
	protected void afterRequest(HttpServletRequest request, String message) {

		logger.info("After Request");
		logger.info("Request URI : " + request.getRequestURI());
		logger.info("Request URL :" + request.getRequestURL().toString());
		logger.info("Remote Host :" + request.getRemoteHost());
		logger.info("Remote Address :" + request.getRemoteAddr());
		logger.info("QueryString :" + request.getQueryString());
		logger.info("Request Header for Device ID : " + request.getHeader(DEVICE_ID));
		logger.info("Request Header for Device Type : " + request.getHeader(DEVICE_TYPE));
	}
}
