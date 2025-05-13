	package Task;

	    	import org.openqa.selenium.By;
	    	import org.openqa.selenium.WebDriver;
	    	import org.openqa.selenium.WebElement;
	    	import org.openqa.selenium.chrome.ChromeDriver;
	    	import org.openqa.selenium.support.ui.ExpectedConditions;
	    	import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
public class Pagination {
	

	    public static void main(String[] args) throws InterruptedException {
	    

	    	
	    	        WebDriver driver = new ChromeDriver();
	    	        driver.manage().window().maximize();
	    	        driver.get("https://testautomationpractice.blogspot.com/");

	    	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    	        try {
	    	            // Locate total pagination links (1 to 4)
	    	            List<WebElement> totalPages = driver.findElements(By.xpath("//ul[@id='pagination']//a"));
	    	            int pageCount = totalPages.size();

	    	            // Loop through each page
	    	            for (int i = 1; i <= pageCount; i++) {

	    	                // Click the page number
	    	                WebElement pageLink = driver.findElement(By.xpath("//ul[@id='pagination']//a[text()='" + i + "']"));
	    	                pageLink.click();

	    	                // Wait until the table is visible and the page is loaded
	    	                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='productTable']/tbody")));

	    	                System.out.println("=== Page " + i + " ===");

	    	                // Locate all rows in the current page table
	    	                List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));

	    	                for (WebElement row : rows) {
	    	                    List<WebElement> cells = row.findElements(By.tagName("td"));
	    	                    for (WebElement cell : cells) {
	    	                        System.out.print(cell.getText() + " | ");
	    	                    }
	    	                    System.out.println();
	    	                }
	    	                System.out.println();
	    	            }

	    	        } catch (Exception e) {
	    	            System.out.println("Error: " + e.getMessage());
	    	        } finally {
	    	            driver.quit();
	    	        }
	    	    }
	    	}


