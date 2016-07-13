package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class gmaillogin {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		//findElement()
		driver.findElement(By.id("Email")).sendKeys("sharathqedge449");
//		Sleeper.sleepTightInSeconds(5);
//		driver.findElement(By.id("Email")).clear();
		
		driver.findElement(By.name("signIn")).click();
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector("#signIn")).click();

	}

}
