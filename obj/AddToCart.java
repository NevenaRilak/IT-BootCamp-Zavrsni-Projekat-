package obj;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Waits;

public class AddToCart {
	public static final String URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";

	// link to submenu Angel Fish xpath
	public static final By angelFish = By.xpath("//a[contains(text(),'FI-SW-01')]");

	// add to cart xpaths
	public static final By cartLargeAf = By.xpath("//td[contains(text(),'Large')]//following-sibling::td[2]/a");
	public static final By cartSmallAf = By.xpath("/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[5]/a[1]");

	// wait
	public static int sec = 4;

	// enter submenu Angel Fish
	public static void toAngelFish(WebDriver dr) {
		PetStoreMenu.clickLfish(dr);
		Waits.clickable(dr, angelFish, sec).click();
	}

	// add large Angel Fish to cart
	public static WebElement getLarge(WebDriver dr) {
		toAngelFish(dr);
		return Waits.clickable(dr, cartLargeAf, sec);
	}

	public static void cartLarge(WebDriver dr) {
		toAngelFish(dr);
		getLarge(dr).click();

	}

	// add large Angel Fish to cart
	public static WebElement getSmall(WebDriver dr) {
		toAngelFish(dr);
		return Waits.clickable(dr, cartSmallAf, sec);
	}

	public static void cartSmall(WebDriver dr) {
		// toAngelFish(dr);
		getSmall(dr).click();
	}

}
