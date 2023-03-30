import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		input[id*='SeniorCitizenDiscount'] cssSelector for find attribute with regular expression
		System.out.println(Driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(Driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(Driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		Count the number of checkboxes
		System.out.println(Driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		System.out.println(Driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(Driver.findElement(By.id("Div1")).getAttribute("style"));
		Driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(Driver.findElement(By.id("Div1")).getAttribute("style"));
		if(Driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Its Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
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
