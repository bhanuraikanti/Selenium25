package basicpractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println("Total number of links :"+links.size());
			int Brokenlinks=0;
			int nonBrokenlinks=0;
			int href=0;
			
			for(WebElement linkElement:links)
			{
				String hrefvalue = linkElement.getAttribute("href");
				
				if(hrefvalue==null || hrefvalue.isEmpty())
				{
					System.out.println("href attribute is empty or null. so not possible to check");
					href++;
					continue;
					
				}
//				hit url to the server
				try 
				{
					URL linkurl = new URL(hrefvalue);//convert hreff value sting to URL format
					HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();// open connection to the server
					conn.connect();//conect to server and sent request
					if (conn.getResponseCode()>=400) {
						System.out.println(hrefvalue+"====>Broken link");
						Brokenlinks++;
					}
					else {
						System.out.println(hrefvalue+"======>Not a Broken Link");
						nonBrokenlinks++;
					}
					
				}
				catch(Exception e) {
					
				}
			}
			System.out.println("Number of Brokenlinks :"+Brokenlinks);
			System.out.println("Number of nonBrokenlinks :"+nonBrokenlinks);
			System.out.println("Number of href attribute values empty :"+href);
	
	}

}
