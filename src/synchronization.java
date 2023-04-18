import java.sql.Driver;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver Driver = new ChromeDriver();
		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5));
		// Implicit Wait
//		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		Driver.manage().window().maximize();
		Driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		additems(Driver, itemsNeeded);
		Driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		Driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		Driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		Driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(Driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		Driver.quit();

	}

	public static void additems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.cssSelector("div.product-action button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}
}