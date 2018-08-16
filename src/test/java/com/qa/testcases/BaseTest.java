package com.qa.testcases;

import org.testng.annotations.AfterSuite;

import com.qa.base.Page;

public class BaseTest {
	
	@AfterSuite
	public void tearDown(){
		Page.quit();
	}

}
