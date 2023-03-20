import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locator1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver Driver = new ChromeDriver(chromeOptions);
		
		Driver.manage().window().maximize();
		
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Driver.findElement(By.id("inputUsername")).sendKeys("Smith");
		Driver.findElement(By.name("inputPassword")).sendKeys("demo");
		Driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(Driver.findElement(By.cssSelector("p.error")).getText());
		
		Driver.findElement(By.linkText("Forgot your password?")).click();
		Driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("Smith");
		Driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("demo@example.com");
		Driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("123456000");
		Thread.sleep(2000);
		Driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(Driver.findElement(By.cssSelector("form p")).getText());
		Driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[1]")).click();
		Thread.sleep(1000);
		Driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		Driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("rahulshettyacademy");
		Driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
		Thread.sleep(5000);
		System.out.println(Driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText());
		Driver.findElement(By.className("logout-btn")).click();
		
		Driver.quit();

	}

}
