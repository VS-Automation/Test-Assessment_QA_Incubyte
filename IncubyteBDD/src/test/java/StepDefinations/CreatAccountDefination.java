package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatAccountDefination 
{
	static WebDriver d = new ChromeDriver();
	@Given("User is on account creation page")
	public void user_is_on_account_creation_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJAY\\Desktop\\Automation Files\\All Driver\\07-11-2024\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://magento.softwaretestingboard.com/");
		d.manage().window().maximize();
		d.findElement(By.linkText("Create an Account")).click();
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User enters firstname, lastname, email_address, password and password-confirmation")
	public void user_enters_valid_personal_inforamtion_and_sign_in_information() 
	{
		d.findElement(By.id("firstname")).sendKeys("Vijay");
		d.findElement(By.id("lastname")).sendKeys("Surve");
		
		d.findElement(By.id("email_address")).sendKeys("vrs91@gmail.com");
		d.findElement(By.id("password")).sendKeys("Start@tgt255");	
		d.findElement(By.id("password-confirmation")).sendKeys("Start@tgt255");
	}

	@And("Clciks on Create an Account")
	public void clciks_on_create_an_account() 
	{
	   d.findElement(By.className("action submit primary")).click();
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() 
	{
	  
		Assert.assertTrue(d.findElements(By.className("logo")).size()>0, "User is navigated to home page");
	}

	@And("Closed the browser")
	public void closed_the_browser() 
	{
	    d.close();
	}

}
