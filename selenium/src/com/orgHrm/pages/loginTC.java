package com.orgHrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginTC
{
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		
		loginPage lp=PageFactory.initElements(driver, loginPage.class);
		lp.org_Login(lp.u, lp.p);
		
		adminpage ap=PageFactory.initElements(driver, adminpage.class);
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}

}
