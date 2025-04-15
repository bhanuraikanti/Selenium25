package basicpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("ctext1");//main
		Thread.sleep(2000);
		driver.switchTo().frame("frm1");//frame1
		
		Select dropD = new Select(driver.findElement(By.id("course")));
		
		dropD.selectByContainsVisibleText("Java");
		
		driver.switchTo().defaultContent();//main
		Thread.sleep(2000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("ctext2");
		Thread.sleep(2000);
		driver.switchTo().frame("frm2");  //frame2
		driver.findElement(By.id("firstName")).sendKeys("slayer");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();//main
		Thread.sleep(2000);
		driver.findElement(By.id("name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("bhanu");
		Thread.sleep(2000);
		driver.switchTo().frame("frm1");//frame1
	
		dropD.selectByContainsVisibleText("Dot Net");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();//main
		Thread.sleep(2000);
		driver.switchTo().frame("frm3");//frame3
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("slayy");
		driver.switchTo().frame("frm1");//frame3-frame1
		Thread.sleep(2000);
		Select dropdD = new Select(driver.findElement(By.id("course")));
         dropdD.selectByContainsVisibleText("Java");
         Thread.sleep(2000);
         driver.switchTo().parentFrame();//frame3
         Thread.sleep(2000);
         driver.switchTo().frame("frm2"); //frame3-frame2
         Thread.sleep(2000);
         driver.findElement(By.id("firstName")).sendKeys("bhanuuu");
         Thread.sleep(2000);
         driver.switchTo().defaultContent();//main
         Thread.sleep(2000);
         driver.findElement(By.id("name")).clear();
		
		
	
	}

}
