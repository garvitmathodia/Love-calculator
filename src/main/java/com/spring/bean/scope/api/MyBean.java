//package com.spring.bean.scope.api;
//
//import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.ScopedProxyMode;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.annotation.RequestScope;
//import org.springframework.web.context.annotation.SessionScope;
//
//@Component
////@Scope(value = WebApplicationContext.SCOPE_REQUEST , proxyMode = ScopedProxyMode.TARGET_CLASS) //this indicates that for each request there will the new mybean object got created...and only when the new
////request will then only the object will be created
////write the above line or write this both ment to be same
////@RequestScope
////@Scope(value = WebApplicationContext.SCOPE_SESSION , proxyMode = ScopedProxyMode.TARGET_CLASS) //there will be only one object got created for one httpsession 
////information got stored in the session
////@SessionScope
//public class MyBean {
//
//	private String websiteName = "StartUpWala";
//	
//	public MyBean() {
//		System.out.println("Mybean object created");
//	}
//
//	public String getWebsiteName() {
//		return websiteName;
//	}
//
//	public void setWebsiteName(String websiteName) {
//		this.websiteName = websiteName;
//	}
//	
//	
//}
