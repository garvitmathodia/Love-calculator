package com.love.calculator.controller;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.love.calculator.api.UserInfoDTO;
import com.love.calculator.config.LoveCalculatorAppConfig;
import com.love.calculator.service.LCAppService;
import com.love.calculator.service.LCAppServiceImpl;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

//import jakarta.servlet.http.Cookie;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;


@Controller
@SessionAttributes("userInfo") //this name inside the session attributes should match modelattributes name and this will only work when we manually creating model object
public class LCAppController {
	
	@Autowired
	private LCAppServiceImpl lcAppService;
	
	Logger logger = Logger.getLogger(LCAppController.class.getName());

	@RequestMapping("/")
	public String showHomepage(Model model) { //@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO
		
		model.addAttribute("userInfo" , new UserInfoDTO());
		
//		Cookie[] cookies=request.getCookies();
//		 for(Cookie temp : cookies) {
//			 if("lcApp.userName".equals(temp.getName())) {
//				 String myUserName = temp.getValue();
//				 userInfoDTO.setUserName(myUserName);
//			 }
//		 }
		
		return "home-page";
	}
	
	
	@RequestMapping("/process-homepage") //this process homepage is comming from home page form action after button has been clicked!
	public String showResultPage (Model model , @Valid UserInfoDTO userInfoDTO , BindingResult result) { // @ModelAttribute("userInfo") 
		
		model.addAttribute("userInfo" , userInfoDTO);
		model.addAttribute(BindingResult.MODEL_KEY_PREFIX+"userInfo" ,  result);
		
		System.out.println(userInfoDTO.isTermAndConditions());
		if(result.hasErrors()) {
			System.out.println("error has occured");
			return "home-page";
		}
		
		System.out.println(userInfoDTO.getUserName());
		System.out.println(userInfoDTO.getCrushName());
		
//		Cookie theCookie = new Cookie("lcApp.userName", userInfoDTO.getUserName());
//		theCookie.setMaxAge(60*60*24);
//		response.addCookie(theCookie);
		
//		HttpSession session = request.getSession();
//		session.setAttribute("userName", userInfoDTO.getUserName());
		
		String appResult = lcAppService.calculateLove(userInfoDTO.getUserName(), userInfoDTO.getCrushName());
		
		userInfoDTO.setResult(appResult);
		
		logger.info(appResult);
		
		
		return "result-page";
   }
}
