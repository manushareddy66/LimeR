package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	WebDriver driver;

public AddToCart() {
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSelect_Size() {
	return Select_Size;
	}


	public WebElement getAdd_To_Cart_btn() {
	return Add_To_Cart_btn;
	}

	@FindBy(id="size_28446889")
	private WebElement Select_Size;
	

	@FindBy(xpath="//div[text()='ADD TO CART']")
	private WebElement Add_To_Cart_btn;
	
}
