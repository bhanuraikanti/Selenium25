package Task;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class dropp {

		
		WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	    }

	    @Test(dataProvider = "countryData")
	    public void selectCountry(String country) throws InterruptedException {
	       

	       // Find dropdown element
	        WebElement countryDropdown = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
	        Select select = new Select(countryDropdown);

	        // Select country
	        select.selectByVisibleText(country);
	        System.out.println("Selected Country: " + country);

	        Thread.sleep(1000); // Just to see the change

	    }

	    @DataProvider(name = "countryData")
	    public Object[][] getCountryData() {
	        return new Object[][]{
	                {"India"},
	                {"Australia"},
	                {"United States"},
	                {"New Zealand"},
	                {"Japan"},
	                {"American Samoa"}
	        };
	    }
	        
	        @AfterClass
	        public void quit() {
	        	
	        	driver.quit();
		        
	    
  
	   
	    }
}
	

	


