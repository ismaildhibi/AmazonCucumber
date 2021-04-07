package StepsDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.HomePageAmazon;

public class Homepage_step {
	WebDriver driver ;
	@Before
	public void setUp() {
		
		
		WebDriverManager.chromedriver().setup();
		System.out.println("i'm a Given method: amazone page");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		HomePageAmazon  home = new  HomePageAmazon(driver);
		   home.clicktosearch("iphone 12");
		   home.clicktoopenproduct();
		   home.clicktoAddtocard();
		  String nbrOfProduct= home.compteurcart(); 
		  int valuefProd=Integer.parseInt(nbrOfProduct);  
		  assertEquals(nbrOfProduct, "1", "product is not selected");
		  System.out.println(valuefProd+"--------");
	}
	
	@Given("go to serach Product in input")
	public void go_to_serach_product_in_input() {
		 
	}

	@And("verify the name of product will be searched")
	public void verify_the_name_of_product_will_be_searched() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select the button of the product")
	public void select_the_button_of_the_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("clicks on product button to buy")
	public void clicks_on_product_button_to_buy() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("add product selected in the cart")
	public void add_product_selected_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the number of product in cart incremented by {int}")
	public void verify_the_number_of_product_in_cart_incremented_by(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
