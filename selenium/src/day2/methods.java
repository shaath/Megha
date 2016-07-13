package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class methods {

	public static void main(String[] args) 
	{
		String expval="gmail";
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());

		String actval=driver.getTitle();
		
		if (expval.equalsIgnoreCase(actval))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
