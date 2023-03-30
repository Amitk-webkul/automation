import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//		Get Alert 
		String text="John Doe";
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Driver.findElement(By.id("name")).sendKeys(text);
		Driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(5000);
		System.out.println(Driver.switchTo().alert().getText());
		Driver.switchTo().alert().accept();
		Driver.findElement(By.id("confirmbtn")).click();
		System.out.println(Driver.switchTo().alert().getText());
		Driver.switchTo().alert().dismiss();
		
		Driver.quit();

	}

}
