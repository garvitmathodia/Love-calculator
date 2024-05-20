package com.love.calculator.model.attribute.method.level;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
//@ControllerAdvice(assignableTypes = TestSiteController.class) //this annotation helps to provide the model attributes info globally
//@SessionAttributes("websiteinfo")
public class MyWebSiteController {

	@ModelAttribute("websiteinfo")
	public WebsiteInfoDTO getWebsiteInfoDTO(WebsiteInfoDTO websiteInfoDTO) {
		System.out.println("****************************");
		
		System.out.println("MyWebSiteController getWebsiteInfoDTO called");
		
		System.out.println("****************************");

		
		websiteInfoDTO.setWebSiteName("google.com");
		websiteInfoDTO.setWebSiteCategory("search");
		
		
		return websiteInfoDTO;
	}
	
	@RequestMapping("/showInfo")
	public String showInfo(@ModelAttribute("websiteinfo")WebsiteInfoDTO websiteInfoDTO) {
		System.out.println("Inside @RequestMapping(\"/showInfo\") "+"showInfo called");
		
		System.out.println(websiteInfoDTO.getWebSiteName());
		System.out.println(websiteInfoDTO.getWebSiteCategory());
		return "siteInfo";
	}
	
	
	@RequestMapping("/showCompanyInfo")
	public String showCompanyInfo(@ModelAttribute("websiteinfo")WebsiteInfoDTO websiteInfoDTO) {
		System.out.println("Inside @RequestMapping(\"/showCompanyInfo\") "+"showCompanayInfo called");
		
		System.out.println(websiteInfoDTO.getWebSiteName());
		System.out.println(websiteInfoDTO.getWebSiteCategory());
		return "siteInfo";
	}
}
