package smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	ChromeOptions options = new ChromeOptions();
		
//		options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
		
//		options.setExperimentalOption("useAutomationExtension",false);
		
		options.addArguments("--disable-blink-features=AutomationControlled");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.100percentpure.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg ot-close-icon\"]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.cssSelector("path[stroke=\"#373F47\"]")).click();
		//Thread.sleep(2000);
//		driver.findElement(By.cssSelector("path[stroke=\"#FFFFFF\"]")).click();
//		Thread.sleep(2000);
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-email")).sendKeys("saidava@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login-password")).sendKeys("sai@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=\"button hover-animation leader\"]")).click();
	}

}
