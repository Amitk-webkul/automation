import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();
		Thread.sleep(1000);
		
		Driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		if(Driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Its Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		Driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i = 1; i<5; i++)
		{
			Driver.findElement(By.id("hrefIncAdt")).click(); //4clicks
		}
		Driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(Driver.findElement(By.id("divpaxinfo")).getText());
		WebElement staticDropdown = Driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);	
		
//		Driver.findElement(By.cssSelector("ctl00_mainContent_btn_FindFlights")).click();
//		Driver.findElement(By.cssSelector("input[value='search']")).click();
//		Driver.findElement(By.xpath("//input[value='search']")).click();
		Driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		Thread.sleep(5000);
		
		Driver.quit();
	}

}
