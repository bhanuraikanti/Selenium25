package basicpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	     driver.get("https://github.com/login");
		 Thread.sleep(3000);
//		  highlight(driver,driver.findElement(By.cssSelector("svg[class=\"octicon octicon-mark-github\"]")));
//		  Thread.sleep(3000);
//		  highlight(driver,driver.findElement(By.tagName("h1")));
//		  Thread.sleep(3000);
//		  highlight(driver,driver.findElement(By.xpath("//label[@for=\"login_field\"]")));
//		  Thread.sleep(3000);
//		 WebElement user = highlight(driver,driver.findElement(By.id("login_field")));
//		 Thread.sleep(3000);
//		 user.sendKeys("bhanu");
//		 Thread.sleep(3000);
//		 user.clear();
//		  Thread.sleep(3000);
//		  highlight(driver,driver.findElement(By.cssSelector("label[for=\"password\"]")));
//		  Thread.sleep(3000);
//		WebElement name = highlight(driver,driver.findElement(By.name("password")));
		//name.sendKeys("bbbb");
		  Thread.sleep(3000);
		  highlight(driver,driver.findElement(By.xpath("//input[@class=\"btn btn-primary btn-block js-sign-in-button\"]")));
		  
		  highlight(driver,driver.findElement(By.partialLinkText("Create an account")));
		  Thread.sleep(3000);
		  driver.close();
	}

	private static WebElement highlight(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:red')", element);
		return element;
	}

}
