package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Incubyte 
{

	public static void main(String[] args) 
	{
		WebDriver d = new ChromeDriver();
		d.get("https://magento.softwaretestingboard.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.findElement(By.linkText("Create an Account")).click();
		
		d.findElement(By.id("firstname")).sendKeys("Manasi");
		d.findElement(By.id("lastname")).sendKeys("Naik");
		d.findElement(By.id("email_address")).sendKeys("Mansi91@gmail.com");
		d.findElement(By.id("password")).sendKeys("Start@tgt255");	
		d.findElement(By.id("password-confirmation")).sendKeys("Start@tgt255");
		
		d.findElement(By.linkText("Create an Account")).click();
		
		Assert.assertTrue(d.findElements(By.className("logo")).size()>0, "User is navigated to home page");
		System.out.println("Account created successfully");
		
		//d.close();
	}

}
