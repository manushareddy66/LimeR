@SmokeTest
Feature: Limeroad Order

Scenario: To click on women
Given     User launch the URL "https://www.limeroad.com/"
When      User clicks on shop women

Scenario: To select women Brands
When      User click on women products
And       User click on Clothing Karigari
And       User click on  Cotton Straight Kurta


Scenario: User to select  Add to cart product
When      User select size
And       User click on add to cart

