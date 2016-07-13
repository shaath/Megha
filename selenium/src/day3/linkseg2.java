package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkseg2 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://192.168.1.100/primusbank1/sitemap.html");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			System.out.println(links.get(i).getText());
			
		}
		

	}

}
