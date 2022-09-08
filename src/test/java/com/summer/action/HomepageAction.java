package com.summer.action;

import com.summer.locator.HomepageLocator;
import com.summer.utility.summer_baseparent;

public class HomepageAction extends summer_baseparent {
	
		HomepageLocator homepageLocatora =new HomepageLocator();
		
		public void Clickcontactlink() throws InterruptedException {
			
			homepageLocatora.clickconta.click();	
			Thread.sleep(3000);
			
			
		
		
	}

}

