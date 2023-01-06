package testCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.AccountRegistrationPage;
import pageObject.HomePage;

public class TC_001_AccountRegistation {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
	@Test
	public void test_account_Registration()
	{
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		regpage.setFirstName("John");
		regpage.setLastName("Karu");
		regpage.setEmail(randomestring()+"@gmail.com");
		regpage.setPassword("abcxyz");
		//regpage.setSubscribe();
		regpage.setPolicy();
		regpage.clickContinue();
	}
		
		
	@AfterClass
	public void teardown()
	{
		//driver.close();
	}
	
	public String randomestring() {
		String generatedString= RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
	}
	public int randomeNumber() {
		String generatedString2= RandomStringUtils.randomNumeric(5);
		return (Integer.parseInt(generatedString2));
	}
	
	
	
	
	
	
	
}
