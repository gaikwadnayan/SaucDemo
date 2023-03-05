package com.sauce.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauce.pageObject.SauceCartPage;
import com.sauce.pageObject.SauceCompletePage;
import com.sauce.pageObject.SauceLoginPage;
import com.sauce.pageObject.SauceOverviewPage;
import com.sauce.pageObject.SauceProductPage;
import com.sauce.pageObject.SauceinformationPage;

public class Sauce_Final_Test extends BaseClass{
	
	@Test
	public void login() throws IOException, InterruptedException{
		
		driver.get(url);
		logger.info("URL Opened");
		
		SauceLoginPage sauceLogin = new SauceLoginPage(driver);	
		sauceLogin.enterUsernae();
		logger.info("Username entered");
		sauceLogin.enterPassword();
		logger.info("Password entered");
		sauceLogin.clickOnLoginBtn();
		logger.info("Clicked on Login button.");
		
		String title = driver.getTitle();
		System.out.println("Product page title is :" + title);
		
		if(title.equals("Swag Labs"))
		{
			logger.info("VerifyLogin - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("VerifyLogin - Failed");
			captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);

		}
		
		SauceProductPage productPage =  new SauceProductPage(driver);
		
		productPage.clickOnProductName();
		productPage.clickOnAddToCartBtn();
		
		String produrl = driver.getCurrentUrl();
		System.out.println("Product page url is :" + produrl);
		
		if(produrl.equals("https://www.saucedemo.com/inventory-item.html?id=4"))
		{
			logger.info("VerifyProductP - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("VerifyProductF - Failed");
			captureScreenShot(driver,"VerifyProduct");
			Assert.assertTrue(false);

		}
		
		SauceCartPage CartPage = new SauceCartPage(driver);
		CartPage.clickOnCartBtn();
		CartPage.clickOnCheckoutBtn();
		
		String checkOuturl = driver.getCurrentUrl();
		System.out.println("Product page url is :" + checkOuturl);
		
		if(checkOuturl.equals("https://www.saucedemo.com/checkout-step-one.html"))
		{
			logger.info("VerifyLogin - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("VerifyLogin - Failed");
			captureScreenShot(driver,"VerifyLogine");
			Assert.assertTrue(false);
			
		}
						
			SauceinformationPage infoPage = new SauceinformationPage(driver);
		    infoPage.enterFirstname();
		    infoPage.enterlastname();
		    infoPage.enterZipcode();
		    
		    Thread.sleep(5000);
		    infoPage.ClickOnContinueBtn();
		    

			String title1 = driver.getTitle();
			System.out.println("Product page url is :" + title1);
			
			if(title1.equals("Swag Labs"))
			{
				logger.info("VerifyLogin - Passed");
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("VerifyLogin - Failed");
				captureScreenShot(driver,"VerifyLogine");
				Assert.assertTrue(false);
			}
			
			SauceOverviewPage overview = new SauceOverviewPage(driver);
			overview.clickOnFinishBtn();
			
			Thread.sleep(5000);
			
			SauceCompletePage complete = new SauceCompletePage(driver);
			complete.getSuccessMsge();
			
			
		logger.info("Browser Closed.");
	}
	}
	


