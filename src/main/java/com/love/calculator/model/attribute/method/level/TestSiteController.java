package com.love.calculator.model.attribute.method.level;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestSiteController {

	@RequestMapping("/testMySite")
	public String testInfo(@ModelAttribute("websiteinfo")WebsiteInfoDTO websiteInfoDTO) {
		System.out.println("Inside @RequestMapping(\"/testMySite\") "+"testInfo called");
		System.out.println(websiteInfoDTO.getWebSiteName());
		System.out.println(websiteInfoDTO.getWebSiteCategory());
		return "siteInfo";
	}
	
//	@ExceptionHandler(value = NullPointerException.class)
//	public String handleNullPointerException() {
//		
//		return "nullpointer";
//	}
}
