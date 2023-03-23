import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver Driver = new ChromeDriver(chromeOptions);
		
		Driver.manage().window().maximize();
		Driver.get("http://google.com");
		Driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");
		Driver.navigate().back();
		Driver.navigate().forward();
		Thread.sleep(5000);
		
		Driver.quit();
	}

}
