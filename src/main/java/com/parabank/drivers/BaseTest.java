package com.parabank.drivers;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest 

{
	private static BaseTest instance = new BaseTest();
	
	private static WebDriver driver;
	
	private BaseTest() 
	{
		
	}
	public static BaseTest getInstance() {
		
		return instance;
	}
	
	private static void setDriver()
	{
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	}
	
	public static WebDriver getDriver()
	{
		if (driver == null)
		{
			setDriver();
		}
		return driver;
	}
	
    
}