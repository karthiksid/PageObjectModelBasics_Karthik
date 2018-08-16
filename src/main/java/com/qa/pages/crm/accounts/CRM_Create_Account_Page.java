package com.qa.pages.crm.accounts;

import org.openqa.selenium.By;

import com.qa.base.Page;

public class CRM_Create_Account_Page extends Page {
	
	public CRM_Create_Account_Page createAccount(String accName){
		
		writing("CRM-accountcreation_CSS", accName);
		return new CRM_Create_Account_Page();
		
	}

}
