package obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Waits;

public class Cart {
	public static final String url = "https://petstore.octoperf.com/actions/Cart.action?addItemToCart=&workingItemId=EST-1";
	public static final By xCart = By.xpath("//img[@name='img_cart']");
	public static int sec=3;

	//entering the cart page via url
	public static void entPage (WebDriver dr) {
		dr.get(url);
	}
	
	//entering the cart page via cart photo
	public static void toCart (WebDriver dr) {
		Waits.clickable(dr, xCart, sec);
		
	}
	
	//checking if an item is in cart
	public static boolean inCart (WebDriver dr, WebElement e) {
		if(e.isDisplayed())
			return true;
		else 
		return false;
	}

}
