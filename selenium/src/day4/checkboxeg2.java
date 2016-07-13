package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxeg2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		List<WebElement> check=driver.findElements(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
		for (int i = 0; i < check.size(); i++) 
		{
			System.out.println(check.get(i).getAttribute("value"));
			if (!check.get(i).isSelected())
			{
				check.get(i).click();
			}
		}
		
	}

}
