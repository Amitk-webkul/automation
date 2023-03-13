import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Firsttestclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		invoked browser
		WebDriver driver = new ChromeDriver();
		
//		geckoddriver
//		System.setProperty("webdriver.geckod.driver", "/home/users/amit.opencart/Downloads/geckodriver-v0.32.2-linux64");
//		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://localhost/preorder/public/");
		
		//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 access token
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
//		driver.close();
		driver.quit();
	}

}
