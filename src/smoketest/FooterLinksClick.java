package smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class FooterLinksClick {
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver and launch browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.100percentpure.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        try {
            // List of footer links you want to click
            String[] footerLinksToClick = {
                "Our Mission", "Philanthropy", "Press", "Store Locations", 
                "Wholesale US", "Wholesale CA", "FAQ", "Returns & Exchanges",
                "Promotions T&C", "Contact Us", "Support", "Accessibility",
                "My Account", "Purist Perks", "Purist Pro", "Affiliate Program"
            };

            // Use the correct WebDriverWait constructor for Selenium 4
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Locate footer links initially
            WebElement footer = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("footer")));
            List<WebElement> links = footer.findElements(By.tagName("a"));

            // Create a Set for faster lookups
            Set<String> footerLinksSet = Set.of(footerLinksToClick);

            for (WebElement link : links) {
                try {
                    String linkText = link.getText().trim();
                    
                    // Check if the link has text and is in the list of links to click
                    if (!linkText.isEmpty() && footerLinksSet.contains(linkText)) {
                        String href = link.getAttribute("href");
                        
                        // Check if the href attribute is valid
                        if (href != null && !href.isEmpty()) {
                            System.out.println("Clicking link: " + linkText + " (" + href + ")");
                            link.click();

                            // Wait for the new tab to open
                            Thread.sleep(4000);  // Sleep just for the time being, ideally, wait for the element to load
                            String mainTab = driver.getWindowHandle();

                            // Switch to the newly opened tab
                            Set<String> allTabs = driver.getWindowHandles();
                            allTabs.remove(mainTab);
                            String newTab = allTabs.iterator().next(); // Get the new tab
                            driver.switchTo().window(newTab);

                            // Close the new tab and switch back to the main tab
                            driver.close();
                            driver.switchTo().window(mainTab);

                            // Re-locate the footer links after navigating back
                            footer = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("footer")));
                            links = footer.findElements(By.tagName("a"));
                        } else {
                            System.out.println("Link does not have a valid href: " + linkText);
                        }
                    } else if (linkText.isEmpty()) {
                        System.out.println("Link with no text found, skipping...");
                    }
                } catch (Exception e) {
                    System.out.println("Error clicking link: " + e.getMessage());
                }
            }
        } finally {
            // Close the browser
        }
    }
}
