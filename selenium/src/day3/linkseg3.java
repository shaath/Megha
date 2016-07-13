package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class linkseg3 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://192.168.1.100/primusbank1/sitemap.html");
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul"));
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++)
		{
			links.get(i).click();
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			Sleeper.sleepTight(5000);
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(5);
			block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul"));
			links=block.findElements(By.tagName("a"));
			
		}
	}

}
