package basicpractice;

 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders {
	
	static void selectDate(WebDriver driver,String Year,String Month,String Date)
	{ //select year and month
		while(true)
		{
			String currentMonth = driver.findElement(By.cssSelector("span[class=\"ui-datepicker-month\"]")).getText();//month
			String currentYear = driver.findElement(By.cssSelector("span[class=\"ui-datepicker-year\"]")).getText();//actual year
			
			if(currentMonth.equals(Month) && currentYear.equals(Year))
			{
				break;
			}
//			driver.findElement(By.cssSelector("span[class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();  //next
			driver.findElement(By.cssSelector("span[class=\"ui-icon ui-icon-circle-triangle-w\"")).click();   //previous
		}
		
		//select date 
		
				List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
			   for(WebElement dt:allDates)
			   {
				    if(dt.getText().equals(Date))
				    {
				    	dt.click();
				    	break;
				    }
				    	
			   }
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
//		sendkeys
//		driver.findElement(By.id("datepicker")).sendKeys("");
		Thread.sleep(3000);
		String Year = "2010";
		String Month = "January";
		String Date = "11";
		
		driver.findElement(By.id("datepicker")).click();  //Open date picker
		
		selectDate(driver,Year,Month,Date);
	
		
	}

}
