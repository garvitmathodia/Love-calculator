package com.love.calculator.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
//	@Min(value = 3 , message = "your name should have at least 3 char")
	@NotBlank(message = "* Username connot be empty") 
	@Size(min = 3 , max = 15 , message = "your name should have at least 3 char")
	private String userName;
	
	@NotBlank(message = "* Crush name connot be empty") 
	@Size(min = 3 , max = 15 , message = "your name should have at least 3 char")
	private String crushName;
	
	@AssertTrue(message = "you have to agree our term and condition")
	private boolean termAndConditions;
	
	private String result;
	
	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getCrushName() {
		return crushName;
	}


	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	

	public boolean isTermAndConditions() {
		return termAndConditions;
	}


	public void setTermAndConditions(boolean termAndCondition) {
		this.termAndConditions = termAndCondition;
	}


	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + ", termAndCondition="
				+ termAndConditions + "]";
	}
}
