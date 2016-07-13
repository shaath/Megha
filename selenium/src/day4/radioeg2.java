package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class radioeg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		Sleeper.sleepTight(5000);
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", block);
		List<WebElement> grp1=block.findElements(By.name("group1"));
		for (int i = 0; i < grp1.size(); i++)
		{
			System.out.println(grp1.get(i).getAttribute("value"));
			if (grp1.get(i).getAttribute("value").equalsIgnoreCase("cheese")) 
			{
				grp1.get(i).click();
				break;
			}
			
		}
		System.out.println("****************************************");
		List<WebElement> grp2=block.findElements(By.name("group2"));
		for (int j = 0; j < grp2.size(); j++)
		{
			System.out.println(grp2.get(j).getAttribute("value"));
			if (grp2.get(j).getAttribute("value").equalsIgnoreCase("beer"))
			{
				grp2.get(j).click();
				break;
			}
			
		}
	}

}
