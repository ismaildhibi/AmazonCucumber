package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "StepsDefinitions" }, monochrome = true, 
plugin = {"pretty", "html:target/reports/report.html","json:target/reports/report.json" }/*, tags = ("@SanityTest1")*/
)

public class TestRunner {

}
