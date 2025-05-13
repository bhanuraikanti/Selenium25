package basicpractice;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Instant startime = Instant.now();
		System.out.println(startime.toString());
//		driver.get("https://testautomationpractice.blogspot.com/");
		driver.get("http://www.royalmansour.com/en/");

		Instant endtime=Instant.now();
		System.out.println(endtime.toString());
		Duration duration = Duration.between(startime, endtime);
		System.out.println("Pageload time: "+duration.toSeconds());
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
