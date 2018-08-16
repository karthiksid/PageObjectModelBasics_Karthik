package com.qa.pages;

import org.openqa.selenium.By;
import com.qa.base.Page;
import com.qa.crm.homepage.CRM_HomPage;

public class ZohoLandingPage extends Page {

	
	public CRM_HomPage clickOnCRM(){
		
		click("clickOnCRM_XPATH");
		
		return new CRM_HomPage();
	}
	
	public void clickOnCliq(){
		click("clickOnCliq_XPATH");
	}
	
	public void clickOnMeeting(){
		click("clickOnMeeting_XPATH");
	}
	
	
	
}
