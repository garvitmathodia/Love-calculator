package com.love.calculator.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.love.calculator.api.Phone;



public class PhoneFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		System.out.println("inside parse fomatter");
		Phone phone = new Phone();
		String[] phoneNumberArray = completePhoneNumber.split("-");

		int index = completePhoneNumber.indexOf("-");
		if (index == -1 || completePhoneNumber.startsWith("-")) {

			phone.setCountryCode("91");
			if (completePhoneNumber.startsWith("-")) {
				phone.setUserNumber(phoneNumberArray[1]);
			} else {
				phone.setUserNumber(phoneNumberArray[0]);
			}
		}

		else {
			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);
		}

		return phone;
	}

}
