package com.parabank.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageConfiguration {

	public WebDriver driver;

	public PageConfiguration(WebDriver driver) {
		this.driver = driver;
	}

	public void pageFactoryInitialize(Object obj) {
		PageFactory.initElements(driver, obj);
	}
}
