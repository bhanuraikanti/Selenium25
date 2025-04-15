package basicpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class navigationmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
    	Thread.sleep(3000);
    
	  WebElement name= driver.findElement(By.name("q"));
	  name.sendKeys("bhanu");
	  Thread.sleep(2000);
	  name.submit();
	  Thread.sleep(3000);     
//	  Thread.sleep(3000);
		//driver.findElement(By.name("q")).submit();
		//Thread.sleep(3000);
		driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(3000);
		//driver.findElement(By.name("username")).sendKeys("slayter");
	//	Thread.sleep(3000);
		driver.navigate().refresh();
	Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	//	driver.quit();
		
		}

}
