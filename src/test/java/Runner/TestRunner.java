package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "StepsDefinitions" }, monochrome = true, 
plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}

//, tags = ("@SanityTest1")
)

public class TestRunner {

}
