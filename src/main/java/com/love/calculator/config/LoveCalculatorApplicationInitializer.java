package com.love.calculator.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

//public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
//		webApplicationContext.register(LoveCalculatorAppConfig.class);
//		
//		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
//		
//		ServletRegistration.Dynamic myCustomDiapatcherServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
//
//		myCustomDiapatcherServlet.setLoadOnStartup(1);
//		myCustomDiapatcherServlet.addMapping("/mywebsite.com/*");
//		
//	}

//}
