package basicpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hydro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
		
//		options.setExperimentalOption("useAutomationExtension",false);
		
//		options.addArguments("--disable-blink-features=AutomationControlled");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hydroflask.com/");
//		driver.findElement(By.xpath("//button[@title='Close cookie consent banner']")).click();
		driver.findElement(By.xpath("//button[@aria-label='My Account']//span//span//*[name()='svg']")).click();
		driver.findElement(By.xpath("//a[@id='customer.header.sign.in.link']")).click();
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("Johnva@gmail.com");

	}

}
