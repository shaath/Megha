package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttons {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		List<WebElement> radio=driver.findElements(By.xpath(".//*[@id='SearchForm']/nav/ul/li"));

		for (int i = 0; i < radio.size(); i++) 
		{
			String radiotext=radio.get(i).getText();
			if (radiotext.equalsIgnoreCase("multi-city"))
			{
				radio.get(i).click();
				break;
			}
			
		}
	}

}
