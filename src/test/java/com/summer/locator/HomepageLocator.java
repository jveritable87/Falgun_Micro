package com.summer.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.summer.utility.summer_baseparent;

public class HomepageLocator extends summer_baseparent{
	public HomepageLocator(){ //this is an constructor
		PageFactory.initElements(driver, this);

}
	
	@FindBy(how=How.XPATH ,using="//a[text()=\"Contact\"]") // locator is for finding the webelement and 
    public WebElement clickconta;
	
}

