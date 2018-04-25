package com.AllTests;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestingWorld  {
	    
	    FirefoxDriver driver;
	    
	    @BeforeMethod
		public void beforeMet(){
	    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell Laptop\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	    	driver = new FirefoxDriver();
	    	driver.get("http://shop.thetestingworld.com/");
		
		}
		
		@AfterMethod
		public void afterMet(){
		//	driver.close();
			
		}
		@Test
		public void testCase_01()  throws InterruptedException, IOException{
			
			driver.findElementByName("search").sendKeys("phone");
		//	driver.findElementByClassName("btn btn-default btn-lg").click();
		    driver.findElementByXPath("//div[@class='col-sm-5']/div/span/button").click();
		    
		    //taking the screenshot
		    
		    File f = driver.getScreenshotAs(OutputType.FILE);
		    File f1 = new File("c:/Users/Dell Laptop/Documents/workspace/ShopTestingWorldAutomation/Result.png");
		    FileUtils.copyFile(f, f1);
		  
		    Thread.sleep(3000);   
		    driver.findElementByXPath("//div[@class='row']/div/div[3]/div/div/div/a/img").click();
		
		    
	//	   driver.findElementByXPath("//div[@class='product-thumb']/div/a").click();	
		 //   driver.findElementByXPath("//div[@class='image']/a/img").click();
		   		    
		//    driver.findElementByXPath("//div[@class='row']/div/div/div/a").click();
					
		//	driver.findElementByXPath("//div[@class='product-thumb']/div/a").click();
		    
		    Thread.sleep(3000); 
     //		driver.findElementById("input-quantity").sendKeys("1");
		    
			driver.findElementById("button-cart").click();
			
			Thread.sleep(3000);
			driver.findElementByXPath("//div[@id='cart']/button").click();
			
			driver.findElementByXPath("//p[@class='text-right']/a[2]").click();
		
     		
				
			
		}


}
