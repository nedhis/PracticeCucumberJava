package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HooksDemo {
	WebDriver driver=null;
	
	@SuppressWarnings("deprecation")
	@Before
	public void setUp()
	{
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("Webdriver.ie.driver", "D:/Selenium/myworkspace/neon/CucumberJava/src/test/resources/Drivers/IEDriverServer.exe"); 
		driver = new InternetExplorerDriver();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	@After
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    
	}

	@And("some other precondition")
	public void some_other_precondition() {
	    
	}

	@When("I complete action")
	public void i_complete_action() {
	    
	}

	@And("some other action")
	public void some_other_action() {
	    }

	@And("yet another action")
	public void yet_another_action() {
	    
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	   
	}

	@And("check more outcomes")
	public void check_more_outcomes() {
	   
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	    
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	   
	}
	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	    
	}



}
