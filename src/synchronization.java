import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Driver.findElement(By.cssSelector("#root > div > div.products-wrapper > div > div:nth-child(1) > div.product-action > button")).click();
		
		
		Driver.quit();
	}

}
