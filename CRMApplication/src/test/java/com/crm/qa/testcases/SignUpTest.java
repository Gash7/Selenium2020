package com.crm.qa.testcases;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.SignUpPage;

public class SignUpTest extends TestBase{
	SignUpPage signUpPage;
	public SignUpTest() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		signUpPage=new SignUpPage();
	}
	
	@Test
	public void clickTest() throws InterruptedException
	{
		signUpPage.clickOnSignUpButton();
	}
	
	@Test(priority=1)
	public void userRegistrationTest() throws InterruptedException
	{
		signUpPage.clickOnSignUpButton();
		signUpPage.userRegistrationPage("ashishgore02@gmail.com", "India" ,"9890449707");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
