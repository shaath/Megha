package com.orgHrm.testNGMaster;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class userregtest extends master
{
	@Test
	public void userreg()
	{
		boolean expv=true;
		boolean flag=false;
		expval=uname;
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(upwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpwd);
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			actval=cols.get(1).getText();
			
			if (expval.equalsIgnoreCase(actval))
			{
				flag=true;
				break;
			}
			
			
		}
		
		Assert.assertEquals(flag, expv,"User reg failed");
	}

}
