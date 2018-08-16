package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.base.Page;

public class LoginPage extends Page {

	
	public ZohoLandingPage doLogin(String userName, String password){

		writing("username_XPATH",userName);
		writing("password_XPATH",password);
		click("signbtn_XPATH");
		
		return new ZohoLandingPage();
	}
	
}
