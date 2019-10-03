package com.arex.mkillconsumer.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillconsumer.listener
 * 2019/9/23
 */
public class ProfileInitListener implements ServletContextListener {
	
	private static final String PROFILE_KEY="spring.profiles.active";

	private void initProfileUtil(ServletContext servletContext){
		String profileName=servletContext.getInitParameter(PROFILE_KEY);
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		initProfileUtil(sce.getServletContext());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

}
