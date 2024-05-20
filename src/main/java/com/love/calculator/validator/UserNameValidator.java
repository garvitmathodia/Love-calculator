package com.love.calculator.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.love.calculator.api.UserRegistrationDTO;



public class UserNameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		//for which object we are defining the validator
		//checks if it can be applied on given object
		
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		//we need to write the custom logic for our validator
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "username.empty", "Username can't be empty");
		
		String username = ((UserRegistrationDTO)(object)).getUsername();
		
		if(!username.contains("_")) {
			errors.rejectValue("username", "username.invalidString", "string must contain '_'");
		}
	}

}
