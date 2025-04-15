package smoketest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ordersum {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
		
		options.setExperimentalOption("useAutomationExtension",false);
		
		options.addArguments("--disable-blink-features=AutomationControlled");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.100percentpure.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg ot-close-icon\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-email")).sendKeys("saidava@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login-password")).sendKeys("sai@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=\"button hover-animation leader\"]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='SHOP']")).click();
		driver.findElement(By.xpath("//a[@id='face']")).click();
		driver.findElement(By.xpath("//article[@class='whole-site product-item grid-item-33']//img[@alt='mattifying-primer']")).click();
		driver.findElement(By.xpath("//button[@id='button-add-cart']")).click();
		driver.findElement(By.xpath("//button[contains(@name,'checkout')]")).click();
        String Subtotal = driver.findElement(By.xpath("(//span[@class=\"_19gi7yt0 _19gi7yt19 _19gi7yt1t notranslate\"])[2]")).getText();
        System.out.println("Subtotal :"+Subtotal);
        String Shipping = driver.findElement(By.xpath("//span[@class=\"_19gi7yt0 _19gi7yt7 _19gi7yt19 _19gi7yt1t notranslate\"]")).getText();
        System.out.println("Shipping :"+Shipping);
        String Tax = driver.findElement(By.xpath("(//span[@class=\"_19gi7yt0 _19gi7yt19 _19gi7yt1t\"])[12]")).getText();
        System.out.println("Tax :"+Tax);
        double subtotal = Double.parseDouble(Subtotal.replace("$", ""));
        double shipping = Double.parseDouble(Shipping.replace("$", ""));
        double tax = Double.parseDouble(Tax.replace("$", ""));
        double taxrate = (tax * 100) / (subtotal + shipping);
        System.out.printf("Tax Rate: %.2f%%\n",taxrate);
        double CalculatedTax = ((subtotal + shipping) * taxrate) / 100;
        System.out.printf("Calculated Tax: $%.2f\n", CalculatedTax);
        if (Math.abs(tax - CalculatedTax) < 0.01) {
        	System.out.println("Tax matches");
        } else {
        	System.out.println("Tax doesn't matches");
        }

    
    }

}
