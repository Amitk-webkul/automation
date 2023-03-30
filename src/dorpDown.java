import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dorpDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
//		Driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
//		Parent to child travel xpath
		Driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		
		Thread.sleep(1000);
		
//		Driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
//		Parent to child travel xpath
		Driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
//		 css locator .ui-state-default.ui-state-highlight
		Driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
//		
		Driver.findElement(By.cssSelector(".ui-state-default")).click();
		
		
		
	}

}
