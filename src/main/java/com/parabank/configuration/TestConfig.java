package com.parabank.configuration;

import org.openqa.selenium.WebDriver;

import com.parabank.drivers.BaseTest;

public class TestConfig {

	public WebDriver selenium() {
		return BaseTest.getDriver();
	}

}
