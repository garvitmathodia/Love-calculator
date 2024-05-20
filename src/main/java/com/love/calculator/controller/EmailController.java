package com.love.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.love.calculator.api.EmailDTO;
import com.love.calculator.api.UserInfoDTO;
import com.love.calculator.service.LCAppEmailService;
import com.love.calculator.service.LCAppEmailServiceImpl;

@Controller
public class EmailController {
	
	@Autowired
	private LCAppEmailServiceImpl lcAppEmailService;

	@RequestMapping("/sendEmail")
	public String sendEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO) {
		
		return "send-email-page";
	}
	
	
	@RequestMapping("/process-email")
	public String processEmail(@SessionAttribute("userInfo")UserInfoDTO userInfoDTO ,@ModelAttribute("emailDTO") EmailDTO emailDTO) {
		
		lcAppEmailService.sendEmail(userInfoDTO.getUserName(),emailDTO.getUserEmail() , userInfoDTO.getResult());
		
		return "process-email-page";
	}
}
