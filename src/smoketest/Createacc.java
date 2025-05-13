package smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Createacc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		int numberofAccounts = 50;
		
	//	for(int i=1;i<=numberofAccounts;i++) {
					
		try {
			
		driver.get("https://www.100percentpure.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg ot-close-icon\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("NOT A MEMBER? JOIN HERE")).click();
//		driver.findElement(By.id("FirstName")).sendKeys("sai");
//		driver.findElement(By.id("LastName")).sendKeys("dava");
		driver.findElement(By.id("FirstName")).sendKeys("test");
		driver.findElement(By.id("LastName")).sendKeys("user");
		
		driver.findElement(By.name("customer[email]")).sendKeys("useer@gmail.com");
		driver.findElement(By.id("CreatePassword")).sendKeys("sai@123");
		driver.findElement(By.cssSelector("button[class='button hover-animation leader']")).click();
		
    	Thread.sleep(3000);	
		}
			catch (Exception e ){
//				System.out.println("Error creating account:"+e.getMessage());

//			}
		}   driver.quit();
		}
}

