package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.base.Page;

public class HomePage extends Page {

	public void gotoSignup() {
		click("gotoSignup_XPATH");
	}

	public LoginPage doLogin() {
	click("doLogin_XPATH");
		return new LoginPage();
	}

	public void gotoSupport() {
		click("gotoSupport_XPATH");
	}

	public void gotoCustomers() {
		click("gotoCustomers_XPATH");
	}

	public void validateFooterLinks() {
		click("validateFooterLinks_XPATH");
	}
}
