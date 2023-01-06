package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {
	
		WebDriver driver;
		
		public  AccountRegistrationPage(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(name="firstname")
		WebElement txtFirstName;
		
		@FindBy(name="lastname")
		WebElement txtLastName;
		
		@FindBy(name="email")
		WebElement txtEmail;
		
		@FindBy(name="password")
		WebElement txtPassword;
		

		//@FindBy(id="input-newsletter-yes")
		WebElement subYes;
		
		@FindBy(xpath="//*[@id=\"form-register\"]/div/div/div/input")
		WebElement chkdPolicy;
		
		@FindBy(xpath="//button[@class='btn btn-primary']")
		WebElement btnContinue;
		
		@FindBy(xpath="//h1[normalize-space()='your Account Has Been Created!']")
		
		WebElement msgConfirmation;
		
		public void setFirstName(String fname)
		{
			txtFirstName.sendKeys(fname);
		}

		public void setLastName(String lname)
		{
			txtLastName.sendKeys(lname);
		}
		public void setEmail(String email)
		{
			txtEmail.sendKeys(email);
		}
		public void setPassword(String password)
		{
			txtPassword.sendKeys(password);
		}
		public void setSubscribe()
		{
			subYes.click();
		}
		public void setPolicy()
		{
			chkdPolicy.click();;
		}
		public void clickContinue()
		{
			btnContinue.click();
		}




	}


