package day9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class robotclass {

	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("2.53.0")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);


		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
