package smoketest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Guestuser_addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
		
		options.setExperimentalOption("useAutomationExtension",false);
		
		options.addArguments("--disable-blink-features=AutomationControlled");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.100percentpure.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg ot-close-icon\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class=\"section-header__link\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[32]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("img[alt=\"cross\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[34]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("img[alt=\"cross\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[35]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("img[alt=\"cross\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[36]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("img[alt=\"cross\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[37]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("img[alt=\"cross\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[38]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("img[alt=\"cross\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[40]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("img[alt=\"cross\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[41]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("img[alt=\"cross\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[42]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("img[alt=\"cross\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[43]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[alt=\"cross\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[46]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[alt=\"cross\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("span[class=\"header-cart-count\"]")).click();
		Thread.sleep(9000);
		driver.findElement(By.cssSelector("button[name=\"checkout\"]")).click();
		

	}

}
