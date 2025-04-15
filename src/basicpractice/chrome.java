package basicpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	System.setProperty("WebDriver.Chrome.driver","C:\\Users\\bhanu prasad\\Downloads\\chromedriver-win64");
       WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
     driver.get("https://github.com/login");
	 Thread.sleep(3000);
	  highlight(driver,driver.findElement(By.cssSelector("svg[class=\"octicon octicon-mark-github\"]")));
	  Thread.sleep(3000);
	  highlight(driver,driver.findElement(By.tagName("h1")));
	  Thread.sleep(3000);
	  highlight(driver,driver.findElement(By.xpath("//label[@for=\"login_field\"]")));
	  Thread.sleep(3000);
	  highlight(driver,driver.findElement(By.id("login_field")));
	  Thread.sleep(3000);
	  highlight(driver,driver.findElement(By.cssSelector("label[for=\"password\"]")));
	  Thread.sleep(3000);
	WebElement name = highlight(driver,driver.findElement(By.name("password")));
	name.sendKeys("bbbb");
	  Thread.sleep(3000);
	  highlight(driver,driver.findElement(By.xpath("//input[@class=\"btn btn-primary btn-block js-sign-in-button\"]")));
	  
	  highlight(driver,driver.findElement(By.partialLinkText("Create an account")));
	
	  
	  //	highlight(driver,driver.findElement(By.name("email")));
//  Thread.sleep(3000);
 // 	driver.findElement(By.id("pass")).sendKeys("0000000000");
 // 	Thread.sleep(3000);
  //	highlight(driver,driver.findElement(By.linkText("Forgotten account?")));
  //	Thread.sleep(3000);
//  	highlight(driver,driver.findElement(By.partialLinkText("Sign up")));
  //	Thread.sleep(3000);
  //	highlight(driver,driver.findElement(By.linkText("loginbutton")));
    
 
	
	}
	


	private static WebElement highlight(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:red')", element);
		return element;
	}
	}	





