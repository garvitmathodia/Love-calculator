package com.love.calculator.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.love.calculator.api.UserRegistrationDTO;


@Component
public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "email.empty", "email can't be empty");
		String email = ((UserRegistrationDTO)(object)).getCommunicationDTO().getEmail();
		if(!email.endsWith("@garvitmathodia.com")) {
			errors.rejectValue("communicationDTO.email", "email.invalidString", "email must contain '@garvitmathodia.com'");
		}
		
	}

}
