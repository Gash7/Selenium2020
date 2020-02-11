package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homePage = new HomePage();

	}
	
	@Test
	public void getValidateTitleTest() throws InterruptedException
	{
		loginPage.login("ashishgore02@gmail.com","Ashu@022");
		homePage.getValidateTitle();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();

	}
}
