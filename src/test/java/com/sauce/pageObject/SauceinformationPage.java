package com.sauce.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceinformationPage {
	
	
	//create Obj. of webdriver
	WebDriver ldriver;
	
	//Create Constructor
	public SauceinformationPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "first-name")
	WebElement firstname;
	
	@FindBy(id = "last-name")
	WebElement lastname;
	

	@FindBy(id = "postal-code")
	WebElement postalcode;
	
	@FindBy(id = "continue")
	WebElement continueBtn;
	
	public void enterFirstname() {
		firstname.sendKeys("David");
	}
		
		public void enterlastname() {
			lastname.sendKeys("millor");
	}
		public void enterZipcode() {
			postalcode.sendKeys("000000");			
	}
		public void ClickOnContinueBtn() {
			continueBtn.click();		
	}
}
