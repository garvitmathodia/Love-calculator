package com.love.calculator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int lower;
	private int upper;

	@Override
	public void initialize(Age age) {
		System.out.println("inside the initialize method");
		this.lower = age.lower();
		this.upper = age.upper();
	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		
		System.out.println("inside the isValid method");

		if (age == null) {
			return false;
		}

		if (age < lower || age > upper) {
			return false;
		}
		return true;
	}

}
