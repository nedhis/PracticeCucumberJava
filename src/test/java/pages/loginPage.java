package pages;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	//By txt_username = By.id("name");
	@FindBy(id="name")
	@CacheLookup//to instruct the initElement to store this element for next time
	WebElement txt_username;
	@FindBy(id = "password")
	WebElement txt_password;
	@FindBy(id = "login")
	WebElement loginbtn;
	@FindBy(id = "logout")
	WebElement logout;
	//if list is needed
	@FindBy(partialLinkText="xx")
	List<WebElement> alllinks;

	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		if(!driver.getTitle().equals("TestProject Demo"))
		{
			throw new IllegalStateException("This is not login page the current page is" +driver.getCurrentUrl());
		}
		
		
	}

	public void loginValidData(String Uname, String Pass)

	{
        txt_username.sendKeys(Uname);
		txt_password.sendKeys(Pass);

	}

	public void clickLogin() {
		loginbtn.click();
	}

	public void checklogoutisDisplayed() {
		logout.isDisplayed();
	}

}
;