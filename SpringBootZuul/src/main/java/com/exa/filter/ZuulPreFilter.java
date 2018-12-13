package com.exa.filter;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * @author 43313
 *
 */
@Component
public class ZuulPreFilter extends ZuulFilter {
	private static final Logger LOGGER = LoggerFactory.getLogger(ZuulPreFilter.class);

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {		
		return RequestContext.getCurrentContext().getRouteHost() != null
				&& RequestContext.getCurrentContext().sendZuulResponse();		/*}
		return true;*/
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();		
		LOGGER.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

		return null;
	}
}
