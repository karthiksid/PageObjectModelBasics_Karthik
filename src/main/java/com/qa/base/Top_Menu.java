package com.qa.base;

import org.openqa.selenium.By;

import com.qa.pages.crm.accounts.CRM_Accounts;

public class Top_Menu  {

	public void gotoHome() {
		
	Page.click("gotoHome_XPATH ");

	}

	public void gotoLeads() {
		Page.click("gotoLeads_XPATH");
	}

	public void gotoContacts() {
		Page.click("gotoContacts_XPATH");
	}

	public CRM_Accounts gotoAccounts() {
		Page.click("gotoAccounts_XPATH");
		return new CRM_Accounts();
	}

	public void gotoDeals() {

	}

	public void gotoActivities() {

	}

	public void gotoAnalytics() {

	}
	
public void gotosignOut(){
	
		
	}
}
