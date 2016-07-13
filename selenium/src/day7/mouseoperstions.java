package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class mouseoperstions {

	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(gmail).build().perform();
		Sleeper.sleepTightInSeconds(5);
		act.contextClick().build().perform();
		Sleeper.sleepTightInSeconds(5);
		
//		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		
		act.sendKeys(Keys.chord("P")).build().perform();
		Sleeper.sleepTightInSeconds(5);
		act.sendKeys(Keys.ENTER).build().perform();
		

	}

}
