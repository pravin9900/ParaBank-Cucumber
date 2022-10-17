package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.parabank.Utility.SeleniumWebElements;
import com.parabank.configuration.PageConfiguration;

public class LoginPage extends PageConfiguration {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		super(driver);
		pageFactoryInitialize(this);
	}

	public void clickOnLoginBtn() {
		try {
			SeleniumWebElements.clickOnElement(loginBtn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterLoginDetails(String username , String pass) throws Exception {
		SeleniumWebElements.enterInputIntoElement(userName,  username);
		SeleniumWebElements.enterInputIntoElement(password,  pass);
	}
}
