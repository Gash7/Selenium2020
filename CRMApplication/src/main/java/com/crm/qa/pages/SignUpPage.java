package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase {

	// Page Factory --Object Repository [OR]
	@FindBy(xpath ="//a[contains(text(),'Sign Up')]")
	WebElement submitBtn;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailAddress;
	
	@FindBy(xpath="//div[@class='item active selected'][contains(text(),'India (+91)')]")
	WebElement countryOfCode;
	
	@FindBy(xpath="//input[@id='phone_number']")
	WebElement number;
	
	@FindBy(xpath="//input[@id='terms']")
	WebElement termsAndCondition;
	
	@FindBy(xpath="//div[@role='presentation']")
	WebElement automateCaptcha;
	
	@FindBy(xpath="//button[@name='action']")
	WebElement loginButton;
	

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions 
	
	public String clickOnSignUpButton() throws InterruptedException
	{	
		Thread.sleep(2000);
		submitBtn.click();	
		return "Successful";
	}
	
	public String userRegistrationPage(String email,String countryCode,String mobileNumber) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		emailAddress.sendKeys(email);
		//countryOfCode.sendKeys(countryCode);
		number.sendKeys(mobileNumber);
		termsAndCondition.click();
		//automateCaptcha.click();
		Thread.sleep(9000);
		loginButton.click();
		return "User Registerd Sucessfully ";
		
		
	}

}
