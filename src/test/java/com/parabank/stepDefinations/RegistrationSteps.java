package com.parabank.stepDefinations;

import com.parabank.configuration.TestConfig;
import com.parabank.dataReader.ReadFile;
import com.parabank.drivers.BaseTest;
import com.parabank.pages.HomePage;
import com.parabank.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps extends TestConfig {

	RegistrationPage register;
	HomePage homePage ;
	

	@Given("open chrome driver browser and launch the parabank url")
	public void open_chrome_driver_browser_and_launch_the_parabank_url() {
		System.setProperty("webdriver.chrome.driver", "BrowserDrivers//chromedriver.exe");
		BaseTest.getDriver().get(ReadFile.readPropertiesFile("url"));
	}

	@When("I entered valid data in text field")
	public void i_entered_valid_data_in_text_field() throws Exception {
		register = new RegistrationPage(BaseTest.getDriver());
		register.fillRegistrationDetails();
	}

	@When("I clicked on Register button")
	public void i_clicked_on_register_button() {
		register.clickOnRegisterBtn();
	}

	@When("I Verified that the user is logged in parabank account")
	public void i_verified_that_the_user_is_logged_in_parabank_account() {
		String actUrl = BaseTest.getDriver().getCurrentUrl();
		String expUrl = "https://parabank.parasoft.com/parabank/register.htm;jsessionid";
		if(actUrl.contains(expUrl))
		{
			System.out.println(actUrl);
		}
		
	}

	@Then("I clicked on Log out button")
	public void i_clicked_on_log_out_button() {
		homePage = new HomePage(BaseTest.getDriver());
		homePage.clickOnLogoutBtn();
	}
}
