package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autofillers {

	public static void main(String[] args) 
	{
		boolean flag=false;
		String expcity="hyderabad";
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("XXinput")).sendKeys("H");
		List<WebElement> list=driver.findElements(By.xpath(".//*[@id='Search']/div[1]/div[1]/ul/li"));
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++)
		{
//			System.out.println(list.get(i).getText());
			String cityname=list.get(i).getText();
			if (expcity.equalsIgnoreCase(cityname)) 
			{
				list.get(i).click();
				flag=true;
				break;
			}
		}
		if (flag)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
