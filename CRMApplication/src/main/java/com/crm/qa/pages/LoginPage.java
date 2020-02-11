package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory --Object Repository [OR]
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit' or @value='Login']")
	WebElement submitBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="(//img[contains(@class,'img-responsive')])[1]")
	WebElement crmLogo;

//Initializing the page objects 
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();

	}

	public HomePage login(String un, String pwd) throws InterruptedException {
		username.sendKeys(un);
		username.sendKeys(pwd);
		Thread.sleep(3000);
		submitBtn.click();

		return new HomePage();
	}
}
