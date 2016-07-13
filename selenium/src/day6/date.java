package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class date {

	public static void main(String[] args) 
	{
		boolean flag=false;
		String dt="april/12/2017";
		String[] split =dt.split("/");
		String mnt = split[0];
		String day = split[1];
		String yr= split[2];
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd=new FirefoxDriver();
		cd.get("http://www.priceline.com/flights");
		cd.manage().window().maximize();
		cd.findElement(By.id("departure-from")).click();
	
	//for year
		String bookyr = cd.findElement(By.className("ui-datepicker-year")).getText();
		System.out.println(bookyr);
		while(!bookyr.equals(yr)){
		cd.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
		bookyr = cd.findElement(By.className("ui-datepicker-year")).getText();
		}
		//for month
		String bookmnt=cd.findElement(By.className("ui-datepicker-month")).getText();
		while(!bookmnt.equalsIgnoreCase(mnt)){
			System.out.println(bookmnt);
		cd.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
		Sleeper.sleepTightInSeconds(5);
		 bookmnt=cd.findElement(By.className("ui-datepicker-month")).getText();	
		 }
	//for date
		Sleeper.sleepTightInSeconds(5);
	List<WebElement> rows=cd.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr"));
	System.out.println(rows.size());
	for (int i = 0; i < rows.size(); i++) {
		List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
		//String d1= cols.get(i)
		for (int j = 0; j < cols.size(); j++) {
			String d1=cols.get(j).getText();
			System.out.println(d1);
		if (day.equals(d1)) {
			cols.get(j).click();
			flag=true;
			break;
		}	
		
		}
	if (flag) {
	break;	
	}
	}


	}

}
