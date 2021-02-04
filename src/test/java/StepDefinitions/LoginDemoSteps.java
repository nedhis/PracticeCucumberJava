package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class LoginDemoSteps {
	WebDriver driver = null;
	loginPage login;
	
	

	@Given("Browser opened")
	public void browser_opened() {
		System.out.println("Inside Step- Browser is open");
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath + "/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step- User is on the Login Page");
		driver .navigate().to("https://example.testproject.io/web/");

	}

	@When("^User enters the (.*) and (.*)$")
	public void user_enters_the_username_and_password(String Username, String Password) {
		System.out.println("Inside Step- User enters valid Username and password");
		/*driver.findElement(By.id("name")).sendKeys("Nidhi");
		driver.findElement(By.id("password")).sendKeys("12345");*/
		
		/*driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);*/
		login=new loginPage(driver);
		login.loginValidData(Username, Password);
		
		

	}

	@And("User clicks on Enter")
	public void user_clicks_on_enter() {
		System.out.println("Inside Step- User cilcs on Login");
		/*driver.findElement(By.id("login")).click();*/
		login=new loginPage(driver);
		login.clickLogin();
	}

	@Then("User is navigated to the next page")
	public void user_is_navigated_to_the_next_page() {
		System.out.println("Inside Step- User can see the logout button");
		/*driver.findElement(By.id("logout")).isDisplayed();*/
		login=new loginPage(driver);
		login.checklogoutisDisplayed();
		driver.close();
		driver.quit();

	}

}
