package pomPages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePageAmazon {
	WebDriver driver;
	@FindBy (xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement inputsearch;
	
	@FindBy (xpath="//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")
	WebElement gettext;
	@FindBy (xpath="//*[@id=\"p_89/PlayStation\"]/span/a/span")
	WebElement clicktobuttonplaystation;
	private By openproduct = By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div/h2/a/span");
//	WebElement openproduct;
	@FindBy (id="add-to-cart-button")
	WebElement addtothecard;
	@FindBy (xpath="//*[@id=\"nav-cart-count\"]")
	WebElement compteur;
	
	public HomePageAmazon(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);
	}
	
	public void clicktosearch(String search) {
		inputsearch.sendKeys(search,Keys.ENTER);
	}
	public void clicktoopenproduct() {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(openproduct));
				element.click();
	}
	public void clicktoAddtocard() {
		addtothecard.click();
	}
	public String compteurcart() {
		return compteur.getText();
	}

}
