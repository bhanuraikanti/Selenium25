package basicpractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturlandtitle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println("Current url : "+url);
		
		String title = driver.getTitle();
		System.out.println("Current title : "+title);
		
		String pagesource = driver.getPageSource();
		System.out.println("Current url : "+pagesource);
		
		driver.quit();

	}

}
