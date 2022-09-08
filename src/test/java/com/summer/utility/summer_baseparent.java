package com.summer.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class summer_baseparent {
	public static Properties prop; // we can make declare as a public static Properties. if we create static we don't need to create a object.
	public static WebDriver driver;
	public summer_baseparent() {
		prop=new Properties();
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\summer\\configure\\configuress.properties"); 
			prop.load(fls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
					
	}
	
	public void initBrowser() {  // browser setup 
		
		String browserset = prop.getProperty("Browser1"); // while it is String we can hold it to String 
		
		if(browserset.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\webdriver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.demoblaze.com/"); // lauch url
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(summer_testdata.pageLoadTimeout, TimeUnit.SECONDS);// for loading page
			driver.manage().timeouts().implicitlyWait(summer_testdata.implicitlyWait,TimeUnit.SECONDS);// for loading html/web elements
			System.out.println("Chrome Browser launch");
			
		}
		else if(browserset.equals("FF"));
			
		}
	public static void getURL(String URL) {
		driver.get(prop.getProperty("URL"));
	}

		
	}


