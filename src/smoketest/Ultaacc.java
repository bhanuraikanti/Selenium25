package smoketest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ultaacc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
		
		options.setExperimentalOption("useAutomationExtension",false);
		
		options.addArguments("--disable-blink-features=AutomationControlled");
		
	
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.ulta.com/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--iconOnly FavoritesUtilityLink__favoriteBtn\"]")).click();
		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--fullWidth\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("akshaykumar@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Akshay@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class=\"c374f5b8a c1085a438 ccdf87e4e cc02a3617 cbb792e2c\"]")).click();
				Thread.sleep(2000);
				WebElement ide = driver.findElement(By.id("search"));
				ide.click();
			  ide.sendKeys("Shape Tape Creamy Concealer");
			  ide.submit();
	}

}
