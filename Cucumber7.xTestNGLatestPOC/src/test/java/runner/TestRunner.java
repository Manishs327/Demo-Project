package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"com.qa.mystepdefs", "apphooks"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"
        		},
        dryRun=false,
        monochrome = true,
        publish = true)
public class TestRunner  {
    
}
