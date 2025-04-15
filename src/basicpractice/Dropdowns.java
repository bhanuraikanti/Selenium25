package basicpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
      	WebElement Element = driver.findElement(By.id("course"));
      	Select courseName = new Select(Element);
     java.util.List<WebElement> courseNameDropdownOptions =  courseName.getOptions();
    for (WebElement option : courseNameDropdownOptions)	 
     {	

  	System.out.println(option.getText());
      }
		courseName.selectByIndex(1);//java
	Thread.sleep(3000);
		courseName.selectByValue("python");//python
		Thread.sleep(3000);
		courseName.selectByVisibleText("Javascript");//javascript
		Thread.sleep(3000);
		courseName.selectByValue("select");
	 String selectedText = courseName.getFirstSelectedOption().getText();
		System.out.println("Selected visible text -" +selectedText);
	
		
		WebElement ide = driver.findElement(By.id("ide"));

		Select ideD = new Select(ide);

		ideD.selectByIndex(1);//intellj
		Thread.sleep(3000);
		ideD.selectByValue("vs");//visualstudio
		Thread.sleep(3000);
		ideD.selectByVisibleText("NetBeans");//netbeans
		Thread.sleep(3000);
		ideD.selectByIndex(0);//eclipse
		Thread.sleep(3000);
		ideD.deselectAll();
	

	}

}

