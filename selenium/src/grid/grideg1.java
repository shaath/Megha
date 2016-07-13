package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class grideg1 
{
	@Parameters("browser")
	@Test
	public void grid(String br) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		if (br.equalsIgnoreCase("firefox")) 
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (br.equalsIgnoreCase("chrome")) 
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (br.equalsIgnoreCase("ie")) 
		{
			cap=DesiredCapabilities.internetExplorer();
			cap.setBrowserName("internet explorer");
			cap.setPlatform(Platform.WINDOWS);
		}
				
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.80:4444/wd/hub"), cap);
		
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		List<WebElement> check=driver.findElements(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
		for (int i = 0; i < check.size(); i++) 
		{
			System.out.println(check.get(i).getAttribute("value"));
			if (!check.get(i).isSelected())
			{
				check.get(i).click();
			}
		}
		
	}

}
