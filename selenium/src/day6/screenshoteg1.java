package day6;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class screenshoteg1 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://192.168.1.100/primusbank1/sitemap.html");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul"));
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++)
		{
			String linktext=links.get(i).getText();
			links.get(i).click();
			Sleeper.sleepTightInSeconds(3);
			File srcfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("F:\\Megha\\selenium\\src\\screenshots\\"+linktext+".png"));
			
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(3);
			block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul"));
			links=block.findElements(By.tagName("a"));
		}

	}

}
