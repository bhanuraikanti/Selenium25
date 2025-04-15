package smoketest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.100percentpure.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(4000);
		String parentWindowHandle = driver.getWindowHandle();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg ot-close-icon\"]")).click();
		Thread.sleep(3000);
//	driver.findElement(By.cssSelector("path[stroke=\"#373F47\"]")).click();
//    Thread.sleep(3000);
//		driver.findElement(By.cssSelector("path[stroke='#FFFFFF']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class=\"our-mission\"])[2]")).click();
		Thread.sleep(7000);
		driver.navigate().back();
		Thread.sleep(5000);
//		driver.navigate().back();
//		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class=\"philanthropy\"])[2]")).click();
    	Thread.sleep(5000);
    	driver.navigate().back();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("(//a[@class=\"press\"])[2]")).click();
    	Thread.sleep(5000);
    	driver.navigate().back();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//a[@class=\"store-locations\"])[2]")).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//a[@class=\"wholesale-us\"])[2]")).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//a[@class=\"wholesale-ca\"])[2]")).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(4000);
		driver.switchTo().window(parentWindowHandle);
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//a[@class=\"faq\"])[2]")).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//a[@class=\"returns-exchanges\"])[2]")).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//a[@class=\"promotions-t-c\"])[2]")).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//a[@class=\"contact-us\"])[2]")).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//a[@class=\"support\"])[2]")).click();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//a[@class=\"nav-link \"])[2]")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.cssSelector("path[d=\"M30 7 L7  30\"]")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//a[@class=\"my-account\"])[2]")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//a[@class=\"purist-pro\"])[2]")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//a[@class=\"affiliate-program\"])[2]")).click();
	}

}
