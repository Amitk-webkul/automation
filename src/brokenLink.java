import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		SoftAssert a = new SoftAssert();
		
		//Broken Links
		//Step -1. Is to get all URLs tied up to the links using Selenium
		// java method will call URLs and gets you the status code
		//if status code>400 than that url is not working-> link which tied to broken
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(WebElement link : links)
		{
			String url= link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
//			Hard Asseration
//			while(respCode>400)
//			{
//				System.out.println("The link with Text "+link.getText()+ " is broken code with "+respCode);
//				Assert.assertTrue(false);
//			}
			
//			SoftAsseration
			a.assertTrue(respCode<400, "The link with Text "+link.getText()+ " is broken code with "+respCode);
			
		}
		a.assertAll();
		
		
		
//		For Single link check
//
//		String url=  driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
//		
//		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int respCode = conn.getResponseCode();
//		System.out.println(respCode);

	}

}
