package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// it has now step defination. it takes FbLogin and FbSignup Step defination file
// ignore test scenarios of a particular type, we can use “~” before a tag,
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/1fbRegreSani.feature",
                 glue = {"steps" },
                 plugin = { "pretty","json:target/reports/json/Finalfacebook.json" }
                ,tags = { "@SanityTest", "@RegressionTest" }
)

public class FbRegreSaniTestRunner {

}
