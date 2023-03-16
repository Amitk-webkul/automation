import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Firsttestclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		invoked browser
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver Driver = new ChromeDriver(chromeOptions);
		
//		geckoddriver
//		System.setProperty("webdriver.geckod.driver", "/home/users/amit.opencart/Downloads/geckodriver-v0.32.2-linux64");
//		WebDriver driver = new FirefoxDriver();
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Driver.get("http://localhost/preorder/public/");
		
		System.out.println(Driver.getTitle());
		
		System.out.println(Driver.getCurrentUrl());
		
//		driver.close();
		Driver.quit();
	}

}
