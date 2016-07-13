package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class methodseg2 {

	public static void main(String[] args) 
	{
		String expval="gmail";
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getPageSource());
		

	}

}
