

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver Driver = new ChromeDriver(chromeOptions);
		
		Driver.manage().window().maximize();
//		Sibling -Child to parent traverse
//		//header/div/button/[1]/parent::div
		
//		parent to parent traverse
//		//header/div/button[1]/parent::div/parent::header
		
//		//header/div/button[1]/following-sibling::button[1]
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(Driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		System.out.println(Driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		
		
//		Driver.quit();
	}

}
