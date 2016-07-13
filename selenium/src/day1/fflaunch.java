package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class fflaunch {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		//driver.get("url")
		driver.get("http://google.com");

	}

}
