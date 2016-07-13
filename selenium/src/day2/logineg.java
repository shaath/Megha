package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logineg {

	public static void main(String[] args)
	{
//		FirefoxDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.100/primusbank1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		

	}

}
