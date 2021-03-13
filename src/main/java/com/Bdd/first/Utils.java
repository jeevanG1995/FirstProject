package com.Bdd.first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {

	public  WebDriver driver;
	    
	         public  Utils() {
	        	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir").toString()+"\\chromedriver.exe");
	        	 getDriver();
	         }
	         public  Utils(Boolean webDriverManager) {
	        	 if(webDriverManager) {
	        		 WebDriverManager.chromedriver().setup();
	        		 getDriver();
	        	
	        	 }
	        	 else {
	        		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir").toString()+"\\chromedriver.exe");
		        	 getDriver();
	        	 }
	        	 
	         }
	    
	public void  getDriver() {
		
		this.driver=new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	public  void  switchWindow()
	{
		for(String handle:this.driver.getWindowHandles()){
			
			this.driver.switchTo().window(handle);
		}
	}
	
	
}
