package com.qa.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ZohoLandingPage;
import com.qa.utilities.Utilities;

public class LoginTest extends BaseTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String, String> data)

	{
		HomePage hp = new HomePage();
		LoginPage Lp = hp.doLogin();
		Lp.doLogin(data.get("username"), data.get("password"));

	}
}
