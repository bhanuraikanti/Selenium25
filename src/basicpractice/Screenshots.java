package basicpractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//file
//		File Sourcefile = driver.getScreenshotAs(OutputType.FILE);
//		File destFile = new File("./screenshot/.jpg");
//		FileUtils.copyFile(Sourcefile, destFile);
//		System.out.println("Screenshot saved succesfully");
//		driver.quit();
		
		//Bytes
//		byte[] bytearr = driver.getScreenshotAs(OutputType.BYTES);
//		File destFile = new File("./screenshot/.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(bytearr);
//		fos.close();
//		System.out.println("Screenshot saved succesfully");
//		driver.quit();

//	Base64
		String base64code = driver.getScreenshotAs(OutputType.BASE64);
		byte[] bytearr = Base64.getDecoder().decode(base64code);
		File destFile = new File("./screenshot/m.jpg");
		FileOutputStream fos = new FileOutputStream(destFile);
		fos.write(bytearr);
		fos.close();
		System.out.println("Screenshot saved succesfully");
		driver.quit();
	
	
	
	}

}
