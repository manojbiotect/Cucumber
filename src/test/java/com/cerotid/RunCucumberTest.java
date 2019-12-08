package com.cerotid;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(format = {"preety","html:report"})
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberTest {

}
