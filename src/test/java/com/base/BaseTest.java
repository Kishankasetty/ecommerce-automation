package com.base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BaseTest {

	    public WebDriver driver;

	    @BeforeMethod
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.saucedemo.com/");
	  
	    }

		@AfterMethod
	    public void tearDown() throws InterruptedException {
	    	Thread.sleep(10000); 
	        driver.quit();
	    }
		
		@Test
		public void testFlow() throws InterruptedException {
		    System.out.println("Test running");
		}
	}


