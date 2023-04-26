import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	driver.findElement(By.cssSelector(".blinkingText")).click();
	Set<String> windows = driver.getWindowHandles(); //[Parents, Child]
	Iterator<String>it = windows.iterator();
	String Parentit = it.next();
	String Childit = it.next();
	driver.switchTo().window(Childit);
	System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	driver.findElement(By.cssSelector(".im-para.red")).getText();
	String EmailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	driver.switchTo().window(Parentit);
	driver.findElement(By.id("username")).sendKeys(EmailId);
//	driver.findElement(By.cssSelector("")).sendKeys("");

	}

}
