package robot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class speed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	driver.get("https://pagespeed.web.dev/");
	driver.findElement(By.xpath("//input[@id='i2']")).sendKeys("https://www.ulta.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	driver.findElement(By.xpath("//span[normalize-space()='Analyze']")).click();
	
	String mobile = driver.findElement(By.xpath("(//*[name()='text'])[1]")).getText();
	System.out.println("Mobile Score: " + mobile);
	
	 // Switch to Desktop tab
    WebElement desktopTab = driver.findElement(By.xpath("//button[@id='desktop_tab']//span[@class='VfPpkd-YVzG2b']"));
    desktopTab.click();
	
	String desktop = driver.findElement(By.xpath("(//*[name()='text'])[13]")).getText();
    System.out.println("Desktop Score: " + desktop);

	}
}