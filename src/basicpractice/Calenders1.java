package basicpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calenders1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.id("fourth_date_picker")).click();
		Thread.sleep(3000);
		//selecting month
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select month1 = new Select(month);
		month1.selectByIndex(9);
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select year1 = new Select(year);
		year1.selectByValue("2028");
		Thread.sleep(3000);
		
//		String date="11";
		
		//select date 
		
//		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
//	   for(WebElement dt:allDates)
//	   {
//		    if(dt.getText().equals(date))
//		    {
//		    	dt.click();
//		    	break;
//		    }
//		    	
//	   }
	
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month '))]//a[text()=25]")).click();
	}

}
