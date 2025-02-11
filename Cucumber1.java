package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber1 
{WebDriver driver;
	@Given("^Browser must be open$")
	public void browser_must_be_open()
	{

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\setup\\ChromeDriverFile\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		
		driver.get("https://www.facebook.com/");
		
	}
	

	@When("^Valid credentials in username and password$")
	public void valid_credentials_in_username_and_password() 
	{
		// using Name Weblocators
		
	 driver.findElement(By.name ("email") ).sendKeys("vishal");

		// using Name Weblocators
		
	driver.findElement(By.name("pass")) .sendKeys("vss.2411");		
		

	}

	@Then("^Application navigated to home page$")
	public void application_navigated_to_home_page()
	{
		  driver.findElement(By.name("login")).click( );

	}



}
