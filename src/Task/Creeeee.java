package Task;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Creeeee {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        driver.manage().window().maximize();

       
            try {
                driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
                
                // Generate a random number
                Random random = new Random();
                int randomNumber = random.nextInt(10000);  // Generates a random number between 0 and 9999
                String uniqueEmail = "bp6172+" + randomNumber + "@gmail.com";  // Random email
                
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                driver.findElement(By.id("firstname")).sendKeys("qqquser");
                driver.findElement(By.id("lastname")).sendKeys("test");
                driver.findElement(By.id("email_address")).sendKeys(uniqueEmail);
                driver.findElement(By.id("password")).sendKeys("UUser@123");
                driver.findElement(By.id("password-confirmation")).sendKeys("UUser@123");
                driver.findElement(By.cssSelector("button[class='action submit primary']")).click();
                Thread.sleep(3000);
                System.out.println("Created account with: " + uniqueEmail);
                Thread.sleep(3000);
                driver.close();
                
            } catch (Exception e) {
            }
        }
    }

