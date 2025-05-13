package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://enhancv.com/resources/resume-checker/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_7d9Ew3rdopoMTEUs4G1Anw== nh1o124RBbCY8z2D0sMLjg== nGpAi8-ak8xa9URpRfVrDQ== s6uaHA305IeoqI4xywTdvA== UploadResume_uploadBtn__qE6pI m-auto']")).click();
//		Thread.sleep(3000);
		
//		1) using sendkeys() method
//		driver.findElement(By.xpath("//button[@class='_7d9Ew3rdopoMTEUs4G1Anw== nh1o124RBbCY8z2D0sMLjg== nGpAi8-ak8xa9URpRfVrDQ== s6uaHA305IeoqI4xywTdvA== UploadResume_uploadBtn__qE6pI m-auto']")).sendKeys("Bhanu CV");
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//button[@class='_7d9Ew3rdopoMTEUs4G1Anw== nh1o124RBbCY8z2D0sMLjg== nGpAi8-ak8xa9URpRfVrDQ== s6uaHA305IeoqI4xywTdvA== UploadResume_uploadBtn__qE6pI m-auto']")));
	Thread.sleep(3000);
//	copy filepath into clip board (ctrl+c)
	StringSelection filePathSelection = new StringSelection("C:\\Users\\bhanu prasad\\OneDrive\\Documents\\Bhanu CV.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePathSelection, null);
	Thread.sleep(3000);
//ctrl+v
	Robot rr = new Robot();
	rr.keyPress(KeyEvent.VK_CONTROL);  //for mac : rr.keyPress(KEyEvent.Vk_META)
	rr.keyPress(KeyEvent.VK_V);
	rr.keyRelease(KeyEvent.VK_CONTROL);
	rr.keyRelease(KeyEvent.VK_V);
	Thread.sleep(3000);
	// click on return / enter key
	rr.keyPress(KeyEvent.VK_ENTER);
	rr.keyRelease(KeyEvent.VK_ENTER);
	
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//button[@class='_7d9Ew3rdopoMTEUs4G1Anw== nh1o124RBbCY8z2D0sMLjg== nGpAi8-ak8xa9URpRfVrDQ== s6uaHA305IeoqI4xywTdvA== UploadResume_uploadBtn__qE6pI m-auto']")));
	Thread.sleep(3000);
	
	StringSelection filePathSelection1 = new StringSelection("resume_vishwateja_t.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePathSelection1, null);
	
	rr.keyPress(KeyEvent.VK_CONTROL);  //for mac : rr.keyPress(KEyEvent.Vk_META)
	rr.keyPress(KeyEvent.VK_V);
	rr.keyRelease(KeyEvent.VK_CONTROL);
	rr.keyRelease(KeyEvent.VK_V);
	Thread.sleep(3000);
	// click on return / enter key
	rr.keyPress(KeyEvent.VK_ENTER);
	rr.keyRelease(KeyEvent.VK_ENTER);
	
		
	}

}
