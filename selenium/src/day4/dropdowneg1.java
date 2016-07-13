package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class dropdowneg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("fromCity"));
		Select s=new Select(drop);
		
		s.selectByValue("12|Baroda");
		Sleeper.sleepTightInSeconds(5);
		s.selectByIndex(4);
		Sleeper.sleepTightInSeconds(5);
		s.selectByVisibleText("Amravati");
	}

}
