package com.sauce.testCases;

import org.testng.annotations.Test;

import com.sauce.pageObject.SauceLoginPage;

public class SauceLogin extends BaseClass{
	
	@Test
	public void login(){
		
		driver.get(url);
		logger.info("URL Opened");
		
		SauceLoginPage sauceLogin = new SauceLoginPage(driver);	
		sauceLogin.enterUsernae();
		logger.info("Username entered");
		sauceLogin.enterPassword();
		logger.info("Password entered");
		sauceLogin.clickOnLoginBtn();
		logger.info("Clicked on Login button.");
		
		
		
		logger.info("Browser Closed.");
	}

}