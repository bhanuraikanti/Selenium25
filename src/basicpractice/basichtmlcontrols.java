package basicpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basichtmlcontrols {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.name("fName")).sendKeys("slayer");
		Thread.sleep(5000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("spanishchbx")).click();
		Thread.sleep(3000);
		WebElement latinChk = driver.findElement(By.id("latinchbx"));
		latinChk.click();//check
		Thread.sleep(3000);
		System.out.println(latinChk.isSelected());
		latinChk.click();//uncheck
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("number");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("elementry");
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		//  driver.findElement(By.id("msg")).getText();
		Thread.sleep(4000);
		// driver.findElement(By.partialLinkText("Click here to navigate to the home page")).click();
	}

}
