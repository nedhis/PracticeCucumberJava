package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
WebDriver driver=null;
@Given("Browser is open")
public void browser_is_open() {
    System.out.println("Inside Step- Browser is open");
    String projectpath=System.getProperty("user.dir");
	   System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/Drivers/chromedriver.exe");
	   driver=new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
}

@And("user is on the Google Search Page")
public void user_is_on_the_google_search_page() {
	System.out.println("Inside Step- User is on Google Search");
	driver.navigate().to("http://www.google.com/");
}

@When("user enter the text in the search box")
public void user_enter_the_text_in_the_search_box() {
	System.out.println("Inside Step- enter text in the Search Box");
	driver.findElement(By.name("q")).sendKeys("Automation step by step");
}

@And("user clicks on Enter")
public void user_clicks_on_enter() {
	System.out.println("Inside Step- Hit on Enter");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}

@Then("user is navigated to the Search results.")
public void user_is_navigated_to_the_search_results() {
	System.out.println("Inside Step- Usser is navigated to the Search Result");
	System.out.println(driver.findElement(By.xpath("//a[text()='Online Courses']")).getText());
	
	driver.close();
	driver.quit();
}



}
