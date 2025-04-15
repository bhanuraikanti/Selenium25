package basicpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class testboxes {


	private static WebElement usernameTxt;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement id= driver.findElement(By.id("login_field"));
//		
//		if(usernameTxt.isDisplayed())  {
//			if(usernameTxt.isEnabled())  {
				id.sendKeys("b12345678");
				
	//String enteredText = usernameTxt.getAttribute("value");

//	System.out.println(enteredText);
    Thread.sleep(3000);
    id.clear();
//			}
	//		else
		//		System.err.println("username textbox is not enabled");
		
		//else
	//	System.err.println("username testbox is not displayed");
	
	Thread.sleep(3000);
	 WebElement word = driver.findElement(By.name("password"));
	//if(password.isDisplayed())  {
//			if(passwordTxt.isEnabled())  {
				word.sendKeys("7790i50utgk");

		    Thread.sleep(3000);
     word.clear();
     driver.quit();
			}
		
}
	
	

	
	
	

