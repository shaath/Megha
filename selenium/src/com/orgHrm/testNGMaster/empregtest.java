package com.orgHrm.testNGMaster;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class empregtest extends master
{
	@Test
	public void org_Empreg()
	{
		expval=f+" "+l;
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("btnSave")).click();
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval,"Empreg Failed");
	}

}
