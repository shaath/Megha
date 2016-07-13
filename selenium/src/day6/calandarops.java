package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calandarops {

	public static void main(String[] args)
	{
		String date="3/march/2017";
		String[] split=date.split("/");
		String day=split[0];
		String month=split[1];
		String year=split[2];
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("DepartDate")).click();
		
		//year selection
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!calyear.equals(year))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		} 
		
		//MONTH SELECTION
		
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while (!calmonth.equalsIgnoreCase(month)) 
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		//day selection
		
		List<WebElement> cells=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		
		
		for (int i = 0; i < cells.size(); i++)
		{
			String calday=cells.get(i).getText();
			if (day.equals(calday))
			{
				cells.get(i).click();
				break;
			}
		}
		

	}

}
