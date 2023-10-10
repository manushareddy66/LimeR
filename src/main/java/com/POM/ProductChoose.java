package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductChoose {
	
	WebDriver driver;

public ProductChoose() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="women_category")
	private WebElement Women_category;
	

	@FindBy(xpath="//a[text()='Karigari']")
	private WebElement ClothingKarigari;
	
	@FindBy(css ="div#zero_result>div:nth-of-type(3)")
	private WebElement Cotton_Straight_Kurta;

	

	public WebElement getWomen_category() {
		return Women_category;
	}

	public WebElement getClothingKarigari() {
		return ClothingKarigari;
	}

	public WebElement getCotton_Straight_Kurta() {
		return Cotton_Straight_Kurta;
	}

	
	}
	
	
	





	