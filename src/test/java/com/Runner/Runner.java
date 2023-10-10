package com.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.Basemethods;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\backup c\\eclipse\\eclipse-workspace\\ALimeRoad_Brand\\src\\test\\java\\com\\feature\\LimeRoad.feature",
	                 glue = {"com.Stepdefinition"},
	                 monochrome = true,
	                 dryRun = false,
	                 tags = "@SmokeTest",
	                 plugin = {"pretty",
	                          "json:Resources/lime.json",
	                          "html:Res/limeRoad.html",
	                          "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	                 )
	                 

public class Runner extends Basemethods{
	
	@BeforeClass
	
	public static void browserlaunch() {
		getDriver("chrome");
		
	}
	
		}
	





