import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver Driver = new ChromeDriver();
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		Driver.manage().window().maximize();
		Driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		additems(Driver,itemsNeeded);
	}

	public static void additems(WebDriver Driver, String[] itemsNeeded) {
		// TODO Auto-generated method stub
		
		int j = 0;
//		//button[text()='ADD TO CART'] add to cart xpath

		List<WebElement> products = Driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
//			Brocolli - 1 kg
//			brocolli, 1 kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

//		Format it to get actual name
//		check weather name you extracted is present in array or not-
//		convert array into arrayList for easy search

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {
				j++;
//			Click on the Add to Cart button
				Driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length)
					break;
			}
		}

	}
}

