package com.cerotid;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// it has now step defination. it takes FbLogin and FbSignup Step defination file
// ignore test scenarios of a particular type, we can use “~” before a tag,
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/fbRegreSani.feature", glue = {
		"src/test/java/com.cerotid" }, plugin = { "pretty",
				"json:target/reports/json/SaniRegrefacebook.json" }, tags = { "@SanityTest", "@RegressionTest" })

public class FbRegreSaniTestRunner {

}
