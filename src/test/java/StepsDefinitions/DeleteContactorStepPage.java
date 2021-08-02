package StepsDefinitions;

import com.Pages.ContractorPage;
import com.redsea.base.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteContactorStepPage  extends Base {
	
	ContractorPage contractor;
	
	
	@When("search  contractor will be delete it (.*)$")
	public void search_contractor_will_be_delete_it(String ContractorName) throws InterruptedException {
		contractor = new ContractorPage(driver);
		contractor.Searchcontractor(ContractorName);
		Thread.sleep(4000);
	}

	@Then("click to button delete Contractor")
	public void click_to_button_delete_contractor() {
		contractor = new ContractorPage(driver);
		contractor.clicktodelete();
	  
	}

}
