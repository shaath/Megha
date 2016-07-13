package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkseg4
{
	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		
		for (int i = 0; i < links.size(); i++)
		{
			String linktext=links.get(i).getText();
			if (linktext.equalsIgnoreCase("videos"))
			{
//				System.out.println("Rajinikanth Link Available");
				links.get(i).click();
				System.out.println(driver.getCurrentUrl()+"--"+driver.getTitle());
				driver.navigate().back();
				driver.close();
				flag=true;
				break;
			}
			
		}
		
		if (flag==true) 
		{
			System.out.println("Vedios Link Available");
		}
		else
		{
			System.out.println("vedios Link Not avaialble in Bing Page");
		}
		
		
		
	}

}
