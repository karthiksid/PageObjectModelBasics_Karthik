package com.qa.rough;

import org.openqa.selenium.WebDriver;

import com.qa.base.Page;
import com.qa.crm.homepage.CRM_HomPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ZohoLandingPage;
import com.qa.pages.crm.accounts.CRM_Accounts;
import com.qa.pages.crm.accounts.CRM_Create_Account_Page;

public class RoughLoginTest {

	WebDriver driver;

	public static void main(String[] args) {
		{
			HomePage hp = new HomePage();
			LoginPage Lp = hp.doLogin();
			ZohoLandingPage zlp = Lp.doLogin("karthiksiddharth7@gmail.com", "karthikray");
			zlp.clickOnCRM();
			CRM_Accounts crm_account = Page.menu.gotoAccounts();
			CRM_Create_Account_Page ccap=crm_account.gotoCreateAccount();
			ccap.createAccount("karthik");

		}
	}
}