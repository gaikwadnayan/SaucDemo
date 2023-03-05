package com.sauce.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SauceCompletePage {
	
	
	//create Obj. of webdriver
	WebDriver ldriver;
	
	//Create Constructor
	public SauceCompletePage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath ="//h2[text()='Thank you for your order!']")
	WebElement SuccessMsge;
	
	public void getSuccessMsge() {
		String msge = SuccessMsge.getText();
		
		if(msge.equals("Thank you for your order!"))
		{ 
			Assert.assertTrue(true);
		}
		else
		{
		 Assert.assertTrue(false);	
		 System.out.println("Success message not displaying.");
		}
}
}