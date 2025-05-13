package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;


public class Data_validation {

	 // Simulated backend data (usually fetched from DB/API)
	    public static Map<String, String> getBackendData() {
	        Map<String, String> backend = new HashMap<>();
	        backend.put("Bookname", "Learn JS");
	        backend.put("Auther", "Animesh");
	        backend.put("Subject", "Javascript");
	        backend.put("Price", "300");
	        return backend;
	    }

	    // Fetch UI data from a webpage using Selenium
	    public static Map<String, String> getUIData(WebDriver driver) {
	        Map<String, String> uiData = new HashMap<>();
	        
	        // Example locators - you must adjust according to your website
	        uiData.put("Bookname", driver.findElement(By.xpath("//td[normalize-space()='Learn JS']")).getText());
	        uiData.put("Auther", driver.findElement(By.xpath("//td[normalize-space()='Animesh']")).getText());
	        uiData.put("Subject", driver.findElement(By.xpath("(//td[contains(text(),'Javascript')])[1]")).getText());
	        uiData.put("Price", driver.findElement(By.xpath("(//td[contains(text(),'300')])[2]")).getText());
	        
	        return uiData;
	    }

	    // Validation logic
	    public static void validateData(Map<String, String> uiData, Map<String, String> backend) {
	        System.out.println("=== Data Validation Report ===");
	        for (String key : backend.keySet()) {
	            String back = backend.get(key);
	            String ui = uiData.get(key);

	            if (ui == null) {
	                System.out.println("[MISSING] UI is missing value for key: " + key);
	            } else if (back.equals(ui)) {
	                System.out.println("[MATCH] Key: " + key + " | Backend: " + back + " | UI: " + ui);
	            } 
	        }
	    
//	        if (backend.equals(uiData)) {
//	        	System.out.println("[MATCH]"+backend+ "=" +uiData);
//	        }
	    }

	    public static void main(String[] args) {
	       
	        WebDriver driver = new ChromeDriver();

	        try {
	            driver.get("https://testautomationpractice.blogspot.com/"); // Use your actual test page
	            
	            // Get UI and Backend data
	            Map<String, String> uiData = getUIData(driver);
	            Map<String, String> backendData = getBackendData();

	            // Validate
	            validateData(uiData, backendData);

	        } catch (Exception e) {
	            System.out.println("Exception: " + e.getMessage());
	        } finally {
	            driver.quit();
	        }
	    }
	}

