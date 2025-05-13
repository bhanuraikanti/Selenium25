package robot;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import java.time.Duration;
import java.util.List;


public class wwritexl {

	public static void main(String[] args) {
	
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        try {
		            // Go to the Ulta foundation page
		            driver.get("https://www.ulta.com/shop/makeup/face/foundation");
		           
		            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    		Thread.sleep(3000);
		    		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
		    	

		            // Wait for page to load (simplified)
		            Thread.sleep(5000); // better with WebDriverWait in production

		            // Find product cards (adjust CSS selector based on actual HTML)
		            List<WebElement> productnames = driver.findElements(By.xpath("(//span[@class='ProductCard__product'])"));
		            List<WebElement> productPrices = driver.findElements(By.xpath("(//div[@class='ProductCard__price'])"));
		            

		            // Excel setup
		            Workbook workbook = new XSSFWorkbook();
		            Sheet sheet = workbook.createSheet("Products");

		           // String[] headers = {"Product Name", "Price"};
		            Row headerRow = sheet.createRow(0);
		            headerRow.createCell(0).setCellValue("S.No");
		            headerRow.createCell(1).setCellValue("Product Name");
		            headerRow.createCell(2).setCellValue("Price");
		            
		            for (int i = 0; i<10 && i < productnames.size(); i++) {
		            	Row row= sheet.createRow(i + 1);
		            	 row.createCell(0).setCellValue(i + 1);
		            	String name = productnames.get(i).getText();
		            	String price = productPrices.get(i).getText();
		            	 row.createCell(1).setCellValue(name);
	                row.createCell(2).setCellValue(price);
		            }
	                // Save Excel
	                FileOutputStream fileOut = new FileOutputStream("UltaProduct.xlsx");
	                workbook.write(fileOut);
	                fileOut.close();
	                workbook.close(); // <--- Close workbook last

	                driver.quit();
		            System.out.println("✅ Excel file created with product details!");
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		       
		            driver.quit();
		        }

}
}
