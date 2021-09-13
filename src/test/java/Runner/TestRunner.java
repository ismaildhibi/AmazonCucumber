package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features/T01-login.feature",
		
		  "src/test/resources/Features/T02-roles.feature",
		  "src/test/resources/Features/T03-Contactor.feature",
		  "src/test/resources/Features/T04-createUser.feature",
		"src/test/resources/Features/T05-LoginCo.feature","src/test/resources/Features/T09-Workforce.feature" ,
															  "src/test/resources/Features/T06-Visitor.feature",
															  "src/test/resources/Features/T09-Workforce.feature",
															  "src/test/resources/Features/T07-Vehicle.feature",
															  "src/test/resources/Features/T08-Team.feature",
															  }, glue = { "StepsDefinitions" }, monochrome = true
/* , plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"} */
)

public class TestRunner {

}
