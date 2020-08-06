//package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/",
		//glue= {"src/test/java/"},
		//plugin = { "pretty", "html:target/cucumber-reports" },
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
				
		monochrome = true
	)
 
public class TestRunner {

}