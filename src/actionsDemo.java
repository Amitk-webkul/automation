import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	WebDriver Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.amazon.com/ref=nav_logo");
	Actions a= new Actions(Driver);
	WebElement move =Driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
	
	a.moveToElement(Driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	
//	move to specific element
	a.moveToElement(move).contextClick().build().perform();	
	
	
	
	}

}
