package smoketest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wishlist2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ulta.com/");
		Actions a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--iconOnly FavoritesUtilityLink__favoriteBtn\"]")).click();
		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--fullWidth\"]")).click();
//		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("akshaykumar@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Akshay@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class=\"c374f5b8a c1085a438 ccdf87e4e cc02a3617 cbb792e2c\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--tertiary pal-c-Button--default pal-c-Button--iconOnly SearchL--button\"]")).click();
		Thread.sleep(2000);
		WebElement ide = driver.findElement(By.id("search"));
		ide.click();
	  ide.sendKeys("Shape Tape Creamy Concealer");
	  ide.submit();
	  driver.findElement(By.cssSelector("img[alt=\"Tarte Shape Tape Creamy Concealer\"]")).click();
		Thread.sleep(3000);
	  driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--secondary pal-c-Button--default ProductBookmark\"]")).click();
	  Thread.sleep(3000);
	  driver.navigate().back();
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("img[alt=\"Tarte Travel-Size Shape Tape Creamy Concealer\"]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--secondary pal-c-Button--default ProductBookmark\"]")).click();
	  Thread.sleep(3000);
	  driver.navigate().back();
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("img[alt=\"Tarte Shape Tape All Star Squad Complexion Trio\"]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--secondary pal-c-Button--default ProductBookmark\"]")).click();
	  Thread.sleep(3000);
	  driver.navigate().back();
	  Thread.sleep(3000);
	  driver.navigate().back();

	  Thread.sleep(3000);

	  a.moveToElement(driver.findElement(By.cssSelector("svg[class=\"pal-c-Icon pal-c-Icon--size-xl pal-c-Button__icon pal-c-Button__icon--before\"]"))).click().sendKeys("fusion intense repair conditioner").build().perform();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div[class=\"InputFieldUnderline__ArrowForward\"]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[@class=\"Image\"][1]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--secondary pal-c-Button--default ProductBookmark\"]")).click();
	 Thread.sleep(3000);
	 driver.navigate().back();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//div[@class=\"Image\"])[4]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--secondary pal-c-Button--default ProductBookmark\"]")).click();
	 Thread.sleep(3000);
	 driver.navigate().back();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//div[@class=\"Image\"])[5]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--secondary pal-c-Button--default ProductBookmark\"]")).click();
	 Thread.sleep(3000);
      driver.navigate().back();
	 Thread.sleep(5000);
	 driver.navigate().back();
	 Thread.sleep(3000);
	a.moveToElement(driver.findElement(By.cssSelector("span[class='pal-c-Link__icon-before']"))).click().build().perform();
	  Thread.sleep(6000);
//	  driver.quit();
	 
	 
	}
}
