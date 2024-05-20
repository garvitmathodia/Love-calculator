package com.love.calculator.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.love.calculator.api.UserRegistrationDTO;
import com.love.calculator.propertryeditor.NamePropertyEditor;
import com.love.calculator.validator.EmailValidator;
import com.love.calculator.validator.UserNameValidator;


@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg")UserRegistrationDTO userRegistrationDTO) {
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-Success")
	public String processUserReg(@Valid @ModelAttribute("userReg")UserRegistrationDTO userRegistrationDTO , BindingResult result) {
		
//		EmailValidator validator = new EmailValidator();
//		validator.validate(userRegistrationDTO, result);
		//we can also call our validation inside our main controller instead of binder method
		
		if(result.hasErrors()) {
			
			System.out.println("My page has errors");
			List<ObjectError> allError = result.getAllErrors();
			
			for(ObjectError error : allError) {
				System.out.println(error);
			}
			return "user-registration-page";
		}
		System.out.println(userRegistrationDTO.getName());		
		System.out.println(userRegistrationDTO.getUsername());		
		System.out.println(userRegistrationDTO.getPassword());	
		System.out.println(userRegistrationDTO.getCountryName());		
		System.out.println(userRegistrationDTO.getHobbies());		
		System.out.println(userRegistrationDTO.getGender());		
		System.out.println(userRegistrationDTO.getAge());		
		System.out.println(userRegistrationDTO.getCommunicationDTO().getEmail());	
		
		return "registration-success";

	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
			System.out.println("inside the init binder. First the flow of program will come here");
			
//			binder.setDisallowedFields("name");
			
			StringTrimmerEditor editor = new StringTrimmerEditor(true); //this is property editor 
			//here the true will convert the white spaces into null ans return the null to field
			//if it is false then it will trim the whitespaces but not return null to it 
			//property editor helps the to convert the one data type into another.basically it helps in conversion of one obj to another obj
			binder.registerCustomEditor(String.class, "name", editor);
			
			//We have another method i.e. binder.registerCustomEditor(type, yourEditorObj) 
			//which is taking two parameters i.e. type and your editor obj. Not only name, 
			//it is also converting other fields values like userName in to uppercase. So if we don't want to change other 
			//field value to uppercase then we must 
			//define the another method which takes 3 parameter i.e. binder.registerCustomEditor(type, "yourVariableName", yourEditorObj);
			
			NamePropertyEditor nameEditor = new NamePropertyEditor();
			binder.registerCustomEditor(String.class, "name", nameEditor);
			
//			UserNameValidator validator = new UserNameValidator();
			binder.addValidators(new UserNameValidator());
			
//			binder.addValidators(new EmailValidator());
	}
}
