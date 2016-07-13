package day8;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplewindowops {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Terms")).click();
		
//		driver.findElement(By.linkText("Terms of Service")).click();
		
		Set<String> windowid=driver.getWindowHandles();
		
		System.out.println(windowid.size());
		
		Iterator<String> it=windowid.iterator();
		while (it.hasNext()) 
		{
			String wind = it.next();
			driver.switchTo().window(wind);
			System.out.println(driver.getTitle()+"---"+wind);
			
			//exception handling
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				System.out.println(driver.getTitle());
				
				break;
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("Terms of service link not available in this page");
			}
			
		}
		
	}

}
