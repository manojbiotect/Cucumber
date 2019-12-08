package com.cerotid;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = {"classpath:features/calculator.feature"}
  , plugin = {"pretty", "json:target/reports/json/calculator.json"}
)
public class CalculatorIntegrationTest {
	
}