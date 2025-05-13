package robot;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileOutputStream;
import java.time.Duration;
import java.util.*;

public class writeeee {

	public static void main(String[] args) {
		
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        try {
		            // Open the Ulta foundation page
		            driver.get("https://www.ulta.com/shop/makeup/face/foundation");
		            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		            Thread.sleep(3000);

		            // Try to close the cookie popup (optional presence)
		            List<WebElement> closeButtons = driver.findElements(By.cssSelector("button.onetrust-close-btn-handler"));
		            if (!closeButtons.isEmpty()) {
		                closeButtons.get(0).click();
		            }

		            Thread.sleep(5000); // Wait for page to load

		            // Set to store unique product names
		            Set<String> seenProducts = new HashSet<>();
		            List<String[]> productList = new ArrayList<>();

		            while (true) {
		                List<WebElement> productNames = driver.findElements(By.xpath("//span[@class='ProductCard__product']"));
		                List<WebElement> productPrices = driver.findElements(By.xpath("//div[@class='ProductCard__price']"));

		                for (int i = 0; i<10 && i < productNames.size(); i++) {
		                    String name = productNames.get(i).getText().trim();
		                    String price = (i < productPrices.size()) ? productPrices.get(i).getText().trim() : "N/A";

		                    if (!name.isEmpty() && !seenProducts.contains(name)) {
		                        seenProducts.add(name);
		                        productList.add(new String[]{name, price});
		                    }
		                }

		                // Try to click the "Next" arrow to go to more products
		                List<WebElement> nextArrows = driver.findElements(By.cssSelector("button[aria-label='Next']"));
		                if (!nextArrows.isEmpty() && nextArrows.get(0).isEnabled()) {
		                    nextArrows.get(0).click();
		                    Thread.sleep(3000); // Wait for UI update
		                } else {
		                    break; // No more next arrows
		                }
		            }

		            // Write to Excel
		            Workbook workbook = new XSSFWorkbook();
		            Sheet sheet = workbook.createSheet("Products");

		            // Header
		            Row header = sheet.createRow(0);
		            header.createCell(0).setCellValue("S.No");
		            header.createCell(1).setCellValue("Product Name");
		            header.createCell(2).setCellValue("Price");

		            for (int i = 0; i < productList.size(); i++) {
		                Row row = sheet.createRow(i + 1);
		                row.createCell(0).setCellValue(i + 1);
		                row.createCell(1).setCellValue(productList.get(i)[0]);
		                row.createCell(2).setCellValue(productList.get(i)[1]);
		            }

		            // Auto-size columns
		            for (int i = 0; i < 3; i++) {
		                sheet.autoSizeColumn(i);
		            }

		            // Save file
		            FileOutputStream fileOut = new FileOutputStream("UltaProduct1.xlsx");
		            workbook.write(fileOut);
		            fileOut.close();
		            workbook.close();

		            System.out.println("✅ Excel file 'UltaProduct.xlsx' created with " + productList.size() + " products!");

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            driver.quit();
		        }
		    }
		}


	


