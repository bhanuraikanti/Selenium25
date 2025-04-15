package basicpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[3]"))).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
//		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("pendrive").doubleClick().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("pendrive").perform();
		Thread.sleep(2000);
		a.doubleClick(driver.findElement(By.id("twotabsearchtextbox"))).perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[4]"))).contextClick().build().perform();
	}

}
