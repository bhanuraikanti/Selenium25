package smoketest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;



public class Foot {

	    public static void main(String[] args) throws InterruptedException {
	        // Set the path for your WebDriver (example for ChromeDriver)
//	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        
	        WebDriver driver = new ChromeDriver();
	       
	        driver.get("https://www.100percentpure.com");

			driver.manage().window().maximize();
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();

			By footerBlockProperty=By.xpath("//div[@class='main-footer']");

			WebElement FooterBlock=driver.findElement(footerBlockProperty);

			FooterBlock.click();

			By footerBlockLinksProperty=By.tagName("ul");
			List<WebElement>PageFooterBlockLinks=FooterBlock.findElements(footerBlockLinksProperty);
			

			int count=PageFooterBlockLinks.size();
			System.out.println(count);

			for (int arrayindex=0;arrayindex<count;arrayindex++)
			{
				FooterBlock=driver.findElement(footerBlockProperty);
				PageFooterBlockLinks=FooterBlock.findElements(footerBlockLinksProperty);

				String names=PageFooterBlockLinks.get(arrayindex).getText();
				System.out.println(arrayindex+"-"+names);
				String expectedLinksAddress=PageFooterBlockLinks.get(arrayindex).getAttribute("href");
				System.out.println(expectedLinksAddress);

				PageFooterBlockLinks.get(arrayindex).click();
 
	
				Thread.sleep(3000);
			}
			
		}

	}

	      
