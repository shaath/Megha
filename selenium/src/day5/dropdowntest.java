package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowntest {

	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("fromCity"));
		Select s=new Select(drop);
		List<WebElement> fdrop=s.getOptions();
		
		System.out.println(fdrop.size());
		
		
		WebElement tdrop=driver.findElement(By.id("toCity"));
		Select s1=new Select(tdrop);
		
		
		for (int i = 0; i < fdrop.size(); i++)
		{
			s.selectByIndex(i);
			String fctext=fdrop.get(i).getText();
			System.out.println(fctext);
			
			List<WebElement> tlist=s1.getOptions();
			
			for (int j = 0; j < tlist.size(); j++) 
			{
				s1.selectByIndex(j);
				String tctext=tlist.get(j).getText();
				if (tctext.equalsIgnoreCase(fctext))
				{
					flag=true;
					break;
				}
			}
			if (flag)
			{
				System.out.println("from city availble in to city");
				break;
			}
			
		}
		

	}

}
