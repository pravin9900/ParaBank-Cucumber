package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.parabank.Utility.SeleniumWebElements;
import com.parabank.configuration.PageConfiguration;
import com.parabank.dataReader.ReadFile;

public class RegistrationPage extends PageConfiguration {

	@FindBy(id = "customer.firstName")
	private WebElement firstName;

	@FindBy(id = "customer.lastName")
	private WebElement lastName;

	@FindBy(id = "customer.address.street")
	private WebElement address;

	@FindBy(id = "customer.address.city")
	private WebElement city;

	@FindBy(id = "customer.address.zipCode")
	private WebElement zipCode;

	@FindBy(id = "customer.address.state")
	private WebElement state;

	@FindBy(id = "customer.phoneNumber")
	private WebElement phoneNumber;

	@FindBy(id = "customer.ssn")
	private WebElement ssn;

	@FindBy(id = "customer.username")
	private WebElement userName;

	@FindBy(id = "customer.password")
	private WebElement password;

	@FindBy(id = "repeatedPassword")
	private WebElement confirmPass;

	@FindBy(xpath = "//input[@value='Register']")
	private WebElement registerBtn;

	public RegistrationPage(WebDriver driver) {
		super(driver);
		pageFactoryInitialize(this);
	}

	public void clickOnRegisterBtn() {
		try {
			SeleniumWebElements.clickOnElement(registerBtn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fillRegistrationDetails() throws Exception {
		SeleniumWebElements.enterInputIntoElement(firstName, ReadFile.readPropertiesFile("firstName"));
		SeleniumWebElements.enterInputIntoElement(lastName, ReadFile.readPropertiesFile("lastName"));
		SeleniumWebElements.enterInputIntoElement(address, ReadFile.readPropertiesFile("address"));
		SeleniumWebElements.enterInputIntoElement(city, ReadFile.readPropertiesFile("city"));
		SeleniumWebElements.enterInputIntoElement(state, ReadFile.readPropertiesFile("state"));
		SeleniumWebElements.enterInputIntoElement(zipCode, ReadFile.readPropertiesFile("zipCode"));
		SeleniumWebElements.enterInputIntoElement(phoneNumber, ReadFile.readPropertiesFile("phone"));
		SeleniumWebElements.enterInputIntoElement(ssn, ReadFile.readPropertiesFile("ssn"));
		SeleniumWebElements.enterInputIntoElement(userName, ReadFile.readPropertiesFile("userName"));
		SeleniumWebElements.enterInputIntoElement(password, ReadFile.readPropertiesFile("password"));
		SeleniumWebElements.enterInputIntoElement(confirmPass, ReadFile.readPropertiesFile("confirmPass"));
	}

}
