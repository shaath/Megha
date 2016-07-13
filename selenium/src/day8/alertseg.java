package day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class alertseg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://192.168.1.100/primusbank1");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).click();
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		Sleeper.sleepTightInSeconds(5);
		alt.accept();

	}

}
