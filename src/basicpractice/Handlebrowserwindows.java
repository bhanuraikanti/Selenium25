//package basicpractice;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.Set;
//
//import org.datanucleus.store.types.wrappers.backed.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Handlebrowserwindows {
//
//	public static void main(String[] args) {
//		WebDriver driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath(""));
//		Set<String> windowIDs=driver.getWindowHandles();
//		
//		List<String> windowList= new ArrayList(windowIDs);
//		String parentID = windowList.get(0);
//		String ChildID = windowList.get(1);
//		
//		driver.switchTo().window(ChildID);
//		System.out.println();
//		
//
//	}
//
//	private static void get(int i) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}



package basicpractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlebrowserwindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		// Example: clicking a link that opens a new window
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(windowIDs);

		if (windowList.size() > 1) {
			String parentID = windowList.get(0);
			String childID = windowList.get(1);

			driver.switchTo().window(childID);
			System.out.println("Switched to child window: " + childID);
		} else {
			System.out.println("Only one window open.");
		}
	}
}

