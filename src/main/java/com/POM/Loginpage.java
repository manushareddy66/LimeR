package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Basemethods;

public class Loginpage extends Basemethods{
	
		public Loginpage() {
			
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getShopwomenclick() {
		return shopwomenclick;
		}
		
		 @FindBy(xpath="//span[text()='SHOP WOMEN']")
		 private WebElement shopwomenclick;
		 
		 
		}




