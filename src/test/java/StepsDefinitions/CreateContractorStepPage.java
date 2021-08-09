package StepsDefinitions;

import com.Pages.ContractorPage;
import com.Pages.UserPage;
import com.redsea.base.Base;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateContractorStepPage extends Base {
	ContractorPage contractor;

	@When("click to Contractor button")
	public void click_to_contractor_button() throws InterruptedException {
		contractor = new ContractorPage(driver);
		Thread.sleep(2000);
		contractor.clicktoContractor();
		Thread.sleep(2000);
	}

	@When("click to add new Contractor then set(.*)and (.*)$")
	public void click_to_add_new_contractor_then_set_contractor_name_and_contractor_commercial_registration(
			String ContractorName, String ContractorCommercialRegistration) throws InterruptedException {
		contractor = new ContractorPage(driver);
		contractor.clicktoIconeAddContractor();
		Thread.sleep(2000);
		contractor.SetFirstname(ContractorName);
		contractor.SetCommercialRegistration(ContractorCommercialRegistration);
		Thread.sleep(2000);
		
	}

	@When("select  ContractorType and Zone")
	public void select_contractor_type_and_zone() throws InterruptedException {
		contractor = new ContractorPage(driver);
		contractor.selectContractorType();
		Thread.sleep(2000);
		contractor.selectFirstOne();
		Thread.sleep(2000);
		contractor.selectZone();
		Thread.sleep(2000);
		contractor.savecontractor() ;
		Thread.sleep(4000);

		 
	}

	@Then("verfy if contracor is add(.*)$")
	public void verfy_if_contracor_is_add(String ContractorName) throws InterruptedException {
		contractor = new ContractorPage(driver);
		contractor.Searchcontractor(ContractorName);
		Thread.sleep(4000);
		contractor.getRowsNbrContractor(ContractorName);
		
		 
	}

}
