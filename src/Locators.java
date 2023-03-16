import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver Driver = new ChromeDriver(chromeOptions);
		
		Driver.manage().window().maximize();
		
		Driver.get("http://localhost/preorder/public/customer/login");
		Driver.findElement(By.name("email")).sendKeys("amitkumar.qa532@webkul.in");
		Driver.findElement(By.name("password")).sendKeys("demo1236");
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		Driver.findElement(By.xpath("//*[@id=\"home-right-bar-container\"]/div/div/div/div/div[2]/form/input[2]")).click();
		
//		Driver.findElement(By.xpath("/html/body/script[5]/text()")).getText();
		
		
		
		
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getCurrentUrl());
		
		Driver.quit();
		
	}

}
