package StepsDefinitions;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Pages.LoginPage;
import com.Pages.UserPage;
import com.redsea.base.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewUserStepsPage extends Base {

	LoginPage login;
	UserPage user;

	@Given("admin is on login page")
	public void admin_is_on_login_page() throws IOException {
		lunchdriver();

	}

	@When("admin enter username and password")
	public void admin_enter_username_and_password(DataTable whenData) throws InterruptedException {

		login = new LoginPage(driver);
		login.enterUsername(whenData.cell(0, 0));
		login.enterPassword(whenData.cell(0, 1));
		login.clickLogin();

		Thread.sleep(2000);

	}

	@When("go to workforcepage and verify if btn user is display")
	public void go_to_workforcepage_and_verify_if_btn_usur_is_display() {

		if (driver.findElement(By.xpath(
				"//body/tb-root[1]/tb-home[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/mat-toolbar[1]/tb-side-menu[1]/ul[1]/li[3]/tb-menu-toggle[1]/a[1]/span[1]/span[1]/div[1]"))
				.isDisplayed()) {

			System.out.println("Element is Visible");

		}

		else {

			System.out.println("Element is InVisible");

		}

	}

	@When("click to button settnigs")
	public void click_to_button_settnigs() {
		user = new UserPage(driver);
		user.clicktoSettings();

	}

	@When("click to user button and click  to icone add")
	public void click_to_user_button_and_click_to_icone_add() throws InterruptedException {
		user = new UserPage(driver);
		user.clicktobuttonUser();
//		
		Thread.sleep(2000);

	}

	@When("click to add user and send (.*) and (.*) and (.*) and (.*)$")
	public void click_to_add_user(String FirstName, String LastName, String Email, String Phone)
			throws InterruptedException {
		user = new UserPage(driver);
		user.clicktoaddUser();
		Thread.sleep(2000);
		user.clicktoaddUserindropdowen();
		Thread.sleep(2000);
		user.setNewUser(FirstName, LastName, Email, Phone);
		user.selectRoles();
		user.SaveUser();
		Thread.sleep(10000);
	
	}
	@When("i filtre the user will be edit FirstName")
	public void i_filtre_the_user_will_be_edit(DataTable whenData) throws InterruptedException {
		user = new UserPage(driver);
		 user.clicktofiltre();
		 user.setonfiltre(whenData.cell(0, 0));
		 Thread.sleep(2000);
		
	     	  
	}


	@Then("verify if user is add")
	public void verify_if_user_is_add() throws InterruptedException {

		Thread.sleep(2000);
		 user.getRowsNbruser();

	}

}
