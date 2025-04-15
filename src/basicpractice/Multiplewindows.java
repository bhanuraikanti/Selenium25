package basicpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		
		
		//single window
		String parentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.id("newWindowBtn")).click();
        Set<String> windowHandles = driver.getWindowHandles();
  	for(String windowHandle :windowHandles){
   		if(!windowHandle.equals(parentWindowHandle)) {
    			driver.switchTo().window(windowHandle);
 			}

   	}
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("bhanu");
		Thread.sleep(3000);
		WebElement check=driver.findElement(By.id("hindichbx"));
		check.click();
		Thread.sleep(3000);
		check.click();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);

		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("bhnauuuuuu");
		Thread.sleep(3000);
		
	
     }   
}


