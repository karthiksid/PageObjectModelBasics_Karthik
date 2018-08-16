package com.qa.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.ZohoLandingPage;
import com.qa.base.Page;
import com.qa.pages.ZohoLandingPage;

import com.qa.pages.crm.accounts.CRM_Accounts;
import com.qa.pages.crm.accounts.CRM_Create_Account_Page;
import com.qa.utilities.Utilities;

public class createAccountTest {

	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data){
		
		ZohoLandingPage zp = new ZohoLandingPage();
		zp.clickOnCRM();
		CRM_Accounts  crm_acc= Page.menu.gotoAccounts();
		crm_acc.gotoCreateAccount();
		CRM_Create_Account_Page ccap = new CRM_Create_Account_Page();
		
		ccap.createAccount(data.get("accountname"));
		
		
		
		
		
		
	}

}
