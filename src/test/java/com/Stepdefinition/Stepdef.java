package com.Stepdefinition;

import com.Base.Basemethods;
import com.POM.AddToCart;
import com.POM.Loginpage;
import com.POM.ProductChoose;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdef extends Basemethods {
	
	Loginpage  hp = new Loginpage();
	ProductChoose pc = new ProductChoose();
	AddToCart atc = new AddToCart();
	
	
	@Given("User launch the URL {string}")
	public void user_launch_the_url(String url) throws InterruptedException {
    launchUrl(url);
	}

	@When("User clicks on shop women")
	public void user_clicks_on_shop_women() {
	 hp.getShopwomenclick().click();
	}
	@When("User click on women products")
	public void user_click_on_women_products() throws InterruptedException {
	Basemethods.mouseHover(pc.getWomen_category());
	  
	}

	@When("User click on Clothing Karigari")
	public void user_click_on_clothing_karigari()  throws InterruptedException  {
	Thread.sleep(3000);
	Basemethods.mouseHover(pc.getClothingKarigari());
	pc.getClothingKarigari().click();
	}
	
	@When("User click on Green Cotton Straight Kurta")
	public void user_click_on_green_cotton_straight_kurta() throws InterruptedException {
	Thread.sleep(20000);	
	pc.getCotton_Straight_Kurta().click();
	   
	}
	@When("User select size")
	public void user_select_size() throws InterruptedException {
	Thread.sleep(20000);	
	atc.getSelect_Size().click();
	
	}

	@When("User click on add to cart")
	public void user_click_on_add_to_cart() {
	atc.getAdd_To_Cart_btn().click();
	    
	}

}
