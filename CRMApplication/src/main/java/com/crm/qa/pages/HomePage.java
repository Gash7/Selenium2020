package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

import junit.framework.Assert;

public class HomePage extends TestBase {
	

	@FindBy(xpath="//span[@class='user-display']")
	WebElement userDisplay;
	
	@FindBy(xpath="	//span[contains(text(),'Calendar')]")
	WebElement calendarLink;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement companyLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement taskLink;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getValidateTitle()
	{
		String title =  driver.getTitle();
		Assert.assertEquals(title,"Cogmento CRM");
	}
	
	public String validateCalendarLink()
	{
		calendarLink.click();
		return "calendar Link  is Working";
	}
	
	public String validateCompanyLink()
	{
		companyLink.click();
		return "company Link  is Working";
	}
	
	public String validateDealsLink()
	{
		dealsLink.click();
		return "deals Link  is Working";
	}
	
	public String validateTaskLink()
	{
		taskLink.click();
		return "task Link  is Working";
	}
	
	
}
