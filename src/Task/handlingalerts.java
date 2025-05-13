package Task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class handlingalerts {
  WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        // Setup WebDriver
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test(dataProvider = "alertData")
	    public void handleAlerts(String alertType, String inputText) throws InterruptedException {
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	        
	        switch (alertType.toLowerCase()) {
	            case "alert":
	                driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	                Alert simpleAlert = driver.switchTo().alert();
	                System.out.println("Alert text: " + simpleAlert.getText());
	                simpleAlert.accept(); // Click OK
	                break;

	            case "confirm":
	                driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	                Alert confirmAlert = driver.switchTo().alert();
	                System.out.println("Confirm text: " + confirmAlert.getText());
	                confirmAlert.dismiss(); // Click Cancel
	                break;

	            case "prompt":
	               
	                driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	                Alert promptAlert = driver.switchTo().alert();
	                System.out.println("Prompt says: " + promptAlert.getText());
	                Thread.sleep(500);
	                promptAlert.sendKeys("Hello from TestNG!"+inputText);
	                Thread.sleep(500);
	                promptAlert.accept();
	                break;


	            default:
	                System.out.println("Invalid alert type");
	        }

	        Thread.sleep(2000); // Just for demonstration
	    }

	    @DataProvider(name = "alertData")
	    public Object[][] getData() {
	        return new Object[][]{
	            {"alert"},
	            {"confirm"},
	            {"prompt"}
	        };
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    
	}

	

}
