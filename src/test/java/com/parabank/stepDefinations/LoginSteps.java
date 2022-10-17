package com.parabank.stepDefinations;

import com.parabank.configuration.TestConfig;
import com.parabank.drivers.BaseTest;
import com.parabank.pages.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends TestConfig {

	LoginPage login ;
	
	@When("I entered username {string} & password {string}")
	public void i_entered_username_password(String username, String pass) throws Exception {
		login = new LoginPage(BaseTest.getDriver());
	    login.enterLoginDetails(username, pass);
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
	    login.clickOnLoginBtn();
	}

	@Then("Verify user is  {string} user of parabank")
	public void verify_user_is_user_of_parabank(String status) {
	     String actUrl = BaseTest.getDriver().getCurrentUrl();
	     String expUrl = "https://parabank.parasoft.com/parabank/register.htm;jsessionid";
	     if(actUrl.contains(expUrl))
			{
				System.out.println(actUrl);
			}else {
				System.out.println("Invalid username or password !");
			}
	}


}
