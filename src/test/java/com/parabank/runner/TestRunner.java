package com.parabank.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Features", glue = { "com.parabank.stepDefinations" },
plugin = {"html:target/cucumber-reports1/cucumber-html-reports.html",
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json",
		"junit:target/cucumber-reports/cucumber.xml", },
        monochrome = true,
        tags = "@Bank")

public class TestRunner {

}
