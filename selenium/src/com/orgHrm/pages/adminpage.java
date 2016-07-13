package com.orgHrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adminpage 
{
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement admin;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pim;
	
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement leave;
	
	@FindBy(id="menu_time_viewTimeModule")
	WebElement time;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement recruitment;
	
	@FindBy(id="menu__Performance")
	WebElement performance;
	
	@FindBy(id="menu_dashboard_index")
	WebElement dashboard;
	
	@FindBy(id="welcome")
	WebElement welcome;
	
	@FindBy(id="aboutDisplayLink")
	WebElement about;
	
	
	@FindBy(xpath=".//*[@id='welcome-menu']/ul/li[2]/a")
	WebElement logout;
	
	
	public void adminclick()
	{
		admin.click();
	}
	
	public void pimclick()
	{
		pim.click();
	}
	
	public void leaveclick()
	{
		leave.click();
	}
	
	public void timeclick()
	{
		time.click();
	}
	
	public void recruitmentclick()
	{
		recruitment.click();
	}
	public void perfoemanceclick()
	{
		performance.click();
	}
	public void dashboardclick()
	{
		dashboard.click();
	}
	
	public void welcomeclick()
	{
		welcome.click();
	}
	
	public void aboutclick()
	{
		about.click();
	}
	
	public void logoutclick()
	{
		logout.click();
	}
}
