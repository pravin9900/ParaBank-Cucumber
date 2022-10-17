package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.parabank.Utility.SeleniumWebElements;
import com.parabank.configuration.PageConfiguration;

public class HomePage extends PageConfiguration {

	@FindBy(xpath = "//a[text()='Log Out']")
	private WebElement logoutBtn;

	public HomePage(WebDriver driver) {
		super(driver);
		pageFactoryInitialize(this);
	}

	public void clickOnLogoutBtn() {
		try {
			SeleniumWebElements.clickOnElement(logoutBtn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
