package com.qa.pages.crm.accounts;

import org.openqa.selenium.By;

import com.qa.base.Page;

public class CRM_Accounts extends Page {
	
	public CRM_Create_Account_Page gotoCreateAccount(){
		
		click("CRM-CreateAccount_CSS");
		
		return new CRM_Create_Account_Page();
	}
	
	public void gotoImportAccounts(){
		
	}
	

}
