package StepsDefinitions;

import com.Pages.ContractorPage;
import com.redsea.base.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Edit_contractor extends Base {
	ContractorPage contractor;

	@When("click to edit  Contractor then set(.*)and (.*)$")
	public void click_to_edit_contractor_then_setismailand(String ContractorName,
			String ContractorCommercialRegistration) throws InterruptedException {
		contractor = new ContractorPage(driver);	
		contractor.clicktobuttonEitContractor();

	}

	@Then("verfy if contracor is updatedismail")
	public void verfy_if_contracor_is_updatedismail() {

	}

}
