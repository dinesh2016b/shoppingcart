package com.online;

import org.springframework.stereotype.Component;

//import com.netflix.zuul.ZuulFilter;

@Component
public class ZuulLoggingFilter {

	/*
	extends ZuulFilter 
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		logger.info("request -> {} request uri -> {}", request, request.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}*/
}
