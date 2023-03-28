import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
//		Driver.findElement(By.id("hrefIncAdt")).click();
//		click multiple times with while loop
//		int i = 1;
//		while(i<5)
//		{
//			Driver.findElement(By.id("hrefIncAdt")).click(); //4clicks
//			i++;
//		}
//		click multiple times with while loop
		for(int i = 1; i<5; i++)
		{
			Driver.findElement(By.id("hrefIncAdt")).click(); //4clicks
		}
		Driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(Driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}
