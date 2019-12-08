package com.cerotid;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/fbsignup.feature", glue = { "src/test/java/com.cerotid" }
		 , plugin = {"pretty", "json:target/reports/json/SignUpfacebook.json"})
public class FbSignupTestRunner {

}
