import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleChildToParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String Parentit = it.next();
		String Childit = it.next();
		driver.switchTo().window(Childit);
		System.out.println(driver.findElement(By.cssSelector("div.example")).getText());
		driver.switchTo().window(Parentit);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText());

	}

}
