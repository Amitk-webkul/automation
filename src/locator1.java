import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class locator1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver Driver = new ChromeDriver(chromeOptions);
		
//		System.setProperty("webdriver.geckod.driver", "/home/users/amit.opencart/Downloads/geckodriver-v0.32.2-linux64");
//		WebDriver Driver = new FirefoxDriver();
		
		Driver.manage().window().maximize();
		
		String password =  getpassword(Driver);
		
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
		Driver.findElement(By.cssSelector("input[type*='password']")).sendKeys(password);
		Driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
		Thread.sleep(5000);
		System.out.println(Driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText());
		Assert.assertEquals(Driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText(),"You are successfully logged in.");
		Driver.findElement(By.tagName("h2")).getText();
		
		Driver.findElement(By.className("logout-btn")).click();
		
//		Driver.quit();

	}
	
	public static String getpassword(WebDriver Driver) throws InterruptedException
	{
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		Driver.findElement(By.className("reset-pwd-btn")).click();
		String passwordText =Driver.findElement(By.cssSelector("form p")).getText();
//		Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
		String Password = passwordArray[1].split("'")[0];
		return Password;
//		0th index - Please user temporary password
//		1st index - rahulshettyacademy to Login.
		
//		0th index - rahulshettyacademy
//		1st index - to Login.
	}

	private static Object password() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
