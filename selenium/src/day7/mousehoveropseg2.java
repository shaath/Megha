package day7;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class mousehoveropseg2 
{
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement cat=driver.findElement(By.id("nav-link-shopall"));
		
		Actions act=new Actions(driver);
		act.moveToElement(cat).build().perform();
		Sleeper.sleepTightInSeconds(5);
		
		act.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[3]/span"))).build().perform();
		driver.findElement(By.linkText("Textbooks")).click();
		
		act.sendKeys(Keys.chord(Keys.CONTROL,"a")).build().perform();
	}
	

}
