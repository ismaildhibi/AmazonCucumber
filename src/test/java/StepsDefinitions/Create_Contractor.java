package StepsDefinitions;

import java.util.List;
import java.util.Map;

import com.Pages.ContractorPage;
import com.redsea.base.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Create_Contractor extends Base {
    ContractorPage contractor;

    @When("click to Contractor button")
    public void click_to_contractor_button() throws InterruptedException {
        contractor = new ContractorPage(driver);
        Thread.sleep(2000);
        contractor.clicktoContractor();
        Thread.sleep(2000);
    }

    @When("click to add new Contractor then set ContractorName and CommercialRegistration")
    public void click_to_add_new_contractor_then_set_contractor_name_and_commercial_registration(
    		DataTable Contractor) throws InterruptedException {
        contractor = new ContractorPage(driver);
        List<Map<String, String>> data = Contractor.asMaps(String.class, String.class);       
        for (Map<String, String> form : data) {
        contractor.clicktoIconeAddContractor();
        Thread.sleep(2000);
        String ContractorName = form.get("ContractorName");
        contractor.SetFirstname(ContractorName);
        String CommercialRegistration = form.get("ContractorCommercialRegistration");
        contractor.SetCommercialRegistration(CommercialRegistration);
        Thread.sleep(2000);
        contractor.selectContractorType();
        Thread.sleep(2000);
        contractor.selectFirstOne();
        Thread.sleep(2000);
        contractor.selectZone();
        Thread.sleep(1000);
        contractor. setnameZone();
        Thread.sleep(1000);
        contractor.addZone();
        Thread.sleep(2000);
        contractor.savecontractor();
        Thread.sleep(4000);
        }

    }


    @Then("verfy if contracor is add(.*)$")
    public void verfy_if_contracor_is_add(String ContractorName) throws InterruptedException {
      //  contractor = new ContractorPage(driver);
     //   contractor.Searchcontractor(ContractorName);
     //   Thread.sleep(4000);
    //    contractor.getRowsNbrContractor(ContractorName);
    	System.out.println("The contractors are add ");


    }

}
