package com.sauce.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCartPage {
	
	
	//create Obj. of webdriver
	WebDriver ldriver;
	
	//Create Constructor
	public SauceCartPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement CartIcon;
	
	@FindBy(id = "checkout")
	WebElement CheckoutBtn;
	
	public void clickOnCartBtn() {
		CartIcon.click();
	}
		
		public void clickOnCheckoutBtn() {
			CheckoutBtn.click();	
	}
		
}
