package basicpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("email"))).sendKeys("bhanu").doubleClick().build().perform();
		Thread.sleep(3000);
		a.dragAndDrop(driver.findElement(By.id("email")), driver.findElement(By.id("pass"))).build().perform();
		
		
	}

}
