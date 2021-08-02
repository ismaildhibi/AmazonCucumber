package StepsDefinitions;

import com.redsea.base.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	
	@Before
	public void runsBeforeanyScenario() {
		System.out.println("run before any scenario");
		
	}
	
	@After
public void runsAfteranyScenario() {
		System.out.println("run after any scenario");
		
		driver.quit();
	}

}
