package smoketest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
		
		options.setExperimentalOption("useAutomationExtension",false);
		
		options.addArguments("--disable-blink-features=AutomationControlled");
		
			WebDriver driver = new ChromeDriver(options);
			
			driver.get("https://www.ulta.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--tertiary pal-c-Button--default PrimaryLinks__linkButton PrimaryLinks__linkButton__399969a2-bbcd-48c9-9e61-18fddcb1c88c\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//h3[@class=\"Text-ds Text-ds--title-6 Text-ds--left Text-ds--black\"])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--tertiary pal-c-Button--default PrimaryLinks__linkButton PrimaryLinks__linkButton__399969a2-bbcd-48c9-9e61-18fddcb1c88c\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"Text-ds Text-ds--body-3 Text-ds--left Text-ds--black\"])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--tertiary pal-c-Button--default PrimaryLinks__linkButton PrimaryLinks__linkButton__399969a2-bbcd-48c9-9e61-18fddcb1c88c\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"Text-ds Text-ds--body-3 Text-ds--left Text-ds--black\"])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--tertiary pal-c-Button--default PrimaryLinks__linkButton PrimaryLinks__linkButton__399969a2-bbcd-48c9-9e61-18fddcb1c88c\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"Text-ds Text-ds--body-3 Text-ds--left Text-ds--black\"])[3]")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--tertiary pal-c-Button--default PrimaryLinks__linkButton PrimaryLinks__linkButton__399969a2-bbcd-48c9-9e61-18fddcb1c88c\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"Text-ds Text-ds--body-3 Text-ds--left Text-ds--black\"])[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--tertiary pal-c-Button--default PrimaryLinks__linkButton PrimaryLinks__linkButton__399969a2-bbcd-48c9-9e61-18fddcb1c88c\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[5]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[6]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[7]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[16]")).click();
			Thread.sleep(2000);
			
			
			
	}

}
