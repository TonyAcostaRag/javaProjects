package microsoft;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java/microsoft/"},
		glue = {"microsoft"},
		monochrome = true,
		tags = {"@TC1_SearchValidation"},
		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter: target/report.html"}
		)

public class Microsoft_runner {

}




