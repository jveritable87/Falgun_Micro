package com.summer.testrunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.summer.utility.summer_baseparent;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/summerFeature/contactsummer.feature"},
plugin= {"json:target/cucumber.json"},
glue="stepdefination")//tags= {""})// glue means step definition we need to put package name

public class summertestrunner extends AbstractTestNGCucumberTests { //this is an cucumber hook
	@BeforeTest
	public void  startURLsm() {
		summer_baseparent test1= new summer_baseparent();
		test1.initBrowser();
		
	}
	@AfterTest
	public void closeURLsm() {
		summer_baseparent test1= new summer_baseparent();
		test1.initBrowser();
		test1.driver.quit();
		
	}
	

}
