package robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class fluentwait {

//	public static void main(String[] args) {
		


//	     Custom wait method using FluentWait
	    public static WebElement waitForElement(WebDriver driver, final By locator, int timeoutInSeconds, int pollingInMillis) {
	        FluentWait<WebDriver> wait = new FluentWait<>(driver)
	            .withTimeout(Duration.ofSeconds(timeoutInSeconds))
	            .pollingEvery(Duration.ofMillis(pollingInMillis))
	            .ignoring(NoSuchElementException.class);

	        return wait.until(new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                WebElement element = driver.findElement(locator);
	                if (element.isDisplayed()) {
	                    return element;
	                }
	                return null;
	            }
	        });
	    }

	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	        try {
	            // Go to the test website
	            driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

	            // Click the "Start" button to trigger loading
	            driver.findElement(By.cssSelector("#start button")).click();

	            // Wait for the "Hello World!" text to be visible
	            WebElement element = waitForElement(driver, By.cssSelector("#finish h4"), 20, 500);
	            System.out.println("Text is: " + element.getText());

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	

		    }
		

	


