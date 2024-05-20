//package com.spring.bean.scope.controller;
//
//import java.io.IOException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.spring.bean.scope.api.MyBean;
//
//import jakarta.servlet.http.HttpServletResponse;
//
//@Controller
//public class DemoController {
//	
//	@Autowired
//	MyBean myBean;
//
//	@RequestMapping("/testing")
//	public void test(HttpServletResponse response) throws IOException {
//		
//		response.getWriter().write("Old website name is : " + myBean.getWebsiteName() + "<br>");
//		
//		myBean.setWebsiteName("Naya StartupWala");
//		
//		response.getWriter().write("  Updated website name is : " +myBean.getWebsiteName()+ "<br>");
//		
//	}
//	@RequestMapping("/testing1")
//	public void test1(HttpServletResponse response) throws IOException {
//		
//		response.getWriter().write("My website name is : " +myBean.getWebsiteName()+ "<br>");
//		
//	}
//}
