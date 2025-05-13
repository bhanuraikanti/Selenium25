package robot;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class language {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		 try {	
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 // Click to open the language selector
		driver.findElement(By.xpath("(//img[@role='presentation'])[1]")).click();
		Thread.sleep(3000);
		
		 //Select French language
		WebElement nethar = driver.findElement(By.xpath("//span[normalize-space()='Français']"));
		nethar.click();
		Thread.sleep(3000);
		//Click on the calendar (check-in field)
		WebElement cal = driver.findElement(By.xpath("//button[@class='a83ed08757 ebbedaf8ac dbaff8df6f ab26a5d2bd fe92c97e3c']"));
	    cal.click();
	    Thread.sleep(3000); 
	 //  Capture the displayed month text from the calendar
	    WebElement displayM = driver.findElement(By.xpath("//h3[normalize-space()='avril 2025']"));
	    String actualMonth = displayM.getText().toLowerCase();
	    System.out.println("actualMonth :"+actualMonth);

        // Get expected month in French using Java Locale
        String expectedMonth = LocalDate.now()
                .getMonth()
                .getDisplayName(TextStyle.FULL, Locale.FRENCH)
                .toLowerCase();
        System.out.println("expectedMonth :"+expectedMonth);
        if (actualMonth.contains(expectedMonth)) {
            System.out.println("Calendar month is correctly translated to French: " + actualMonth);
        } else {
            System.out.println("Translation failed! Expected: " + expectedMonth + ", Found: " + actualMonth);
        }

//	 } catch (Exception e) {
//         e.printStackTrace();
//     } finally {
//         // Close the browser
//         driver.quit();
//     }
}}
