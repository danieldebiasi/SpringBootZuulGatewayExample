package com.example.zuul.gateway.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ErrorFilter extends ZuulFilter {
	
	private static final Logger log = LoggerFactory.getLogger(ErrorFilter.class);
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		log.info("Running ErrorFilter...");
		return null;
	}

	@Override
	public String filterType() {
		return "error";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
