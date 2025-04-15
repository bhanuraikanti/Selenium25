package basicpractice;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JJsexecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		
		JavascriptExecutor jsexc = (JavascriptExecutor) driver;
		
		///////////finding elements
		
//		WebElement L = (WebElement) jsexc.executeScript("return document.evaluate(\"//input[@name='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;");
//		L.sendKeys("id");
		
		////////////textboxes
	
//		jsexc.executeScript("document.querySelector('#email').value='CSSS';");
//		Thread.sleep(3000);
//		jsexc.executeScript("document.evaluate(\"//input[@name='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='XPath';");
//		Thread.sleep(3000);
//		jsexc.executeScript("document.getElementById('email').value='id';");
//		Thread.sleep(3000);
//		jsexc.executeScript("document.getElementsByName('pass')[0].value='namei';");
//		Thread.sleep(3000);
//		jsexc.executeScript("document.getElementsByName('email')[0].value='email address'");
		
		/////click
		
//		jsexc.executeScript("document.getElementsByName('login')[0].click()");
		
		/////highlight     

	
//		jsexc.executeScript("document.getElementById('pass').style.border='2px red solid';");
//		Thread.sleep(3000);
//		jsexc.executeScript("document.getElementById('pass').style.background='yellow';");
//		Thread.sleep(3000);
//		jsexc.executeScript("document.getElementById('email').setAttribute('style','border:2px red solid;background:yellow');");
		
		
		//--------scroll to//--scroll by//----scrollintoview//---------//
	  
//		jsexc.executeScript("window.scrollTo(0,700)");
//		Thread.sleep(3000);
//		jsexc.executeScript("window.scrollBy(0,400)");
//		Thread.sleep(3000);
//		jsexc.executeScript("document.getElementById(\"ty_footer\").scrollIntoView();");  //to take screenshots we use scrollintoview
		
		WebElement user = driver.findElement(By.id("email"));
		jsexc.executeScript("arguments[0].setAttribute('style','border:2px red solid;background:yellow');",user);
	
	}

}
