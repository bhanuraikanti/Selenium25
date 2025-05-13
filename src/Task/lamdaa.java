package Task;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

public class lamdaa {

	    @FunctionalInterface
	    interface ElementValidator {
	        boolean validate(WebElement element);
	    }

	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/");

	        // 1. Lambda with WebDriverWait to wait for login button to be enabled
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement loginBtn = wait.until(d -> {
	            WebElement btn = d.findElement(By.cssSelector("button[type='submit']"));
	            return btn.isEnabled() ? btn : null;
	        });

	        // 2. Enter credentials and click login
	        driver.findElement(By.name("username")).sendKeys("Admin");
	        driver.findElement(By.name("password")).sendKeys("admin123");
	        loginBtn.click();

	        // 3. Wait for dashboard to load using lambda
	        wait.until(d -> d.findElement(By.xpath("//h6[text()='Dashboard']")));

	        // 4. Predicate to filter visible menu items
	        List<WebElement> menuItems = driver.findElements(By.cssSelector("ul.oxd-main-menu li"));
	        Predicate<WebElement> isVisible = el -> el.isDisplayed();

	        // 5. Consumer to print text of visible menu items
	        Consumer<WebElement> printText = el -> System.out.println("Menu: " + el.getText());

	        menuItems.stream()
	                 .filter(isVisible)
	                 .forEach(printText);

	        // 6. Custom Functional Interface to validate element
	        ElementValidator isDisplayed = WebElement::isDisplayed;
	        WebElement profileIcon = driver.findElement(By.className("oxd-userdropdown-img"));
	        System.out.println("Is profile icon visible? " + isDisplayed.validate(profileIcon));

	        driver.quit();
	    }
	}



