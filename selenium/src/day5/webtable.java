package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println(cols.get(2).getText());
		}
	}

}
