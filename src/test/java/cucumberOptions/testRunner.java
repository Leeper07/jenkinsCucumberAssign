package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinations",
		plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
		monochrome = true)

public class testRunner {

}
