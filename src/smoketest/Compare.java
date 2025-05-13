package smoketest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Compare {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.100percentpure.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg ot-close-icon']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='section-header__link'])[1]")).click();
		Thread.sleep(3000);
		String X = driver.findElement(By.xpath("//article[@class='whole-site product-item grid-item-33']//span[@class='original_price']//span[@class='money'][normalize-space()='$7.00']")).getText();
		System.out.println(X);
		driver.findElement(By.xpath("(//img[@style='z-index: 1; aspect-ratio: auto ;'])[2]")).click();
		Thread.sleep(4000);
		 
		String Y =driver.findElement(By.id("product-price")).getText();
		 System.out.println(Y);
		
		if(X.equals(Y)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		driver.quit();
	}

}
