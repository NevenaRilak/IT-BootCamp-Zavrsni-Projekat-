package page.tests;

import javax.swing.text.StyleContext.SmallAttributeSet;

import org.openqa.selenium.By; // sve sto ne koristis nemapotrebe da importujes, eclipse ce ti to reci ovim zutim podvucenim
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import obj.Account;
import obj.Cart;
import obj.PetStoreMenu;
import obj.SignIn;
import obj.AddToCart;
import utility.Waits;

public class CartTestNg {
	public static WebDriver dr = new ChromeDriver();
	public static SoftAssert sa = new SoftAssert();
	public static int ms = 3000;

	@Test(priority = 1)
	public void addToCart() {
		PetStoreMenu.toMenu(dr);
		SignIn.signin(dr, "Nevena3n", "123");
		AddToCart.cartLarge(dr);
		AddToCart.cartSmall(dr);

		sa.assertTrue(Cart.inCart(dr, AddToCart.getLarge(dr)));
		sa.assertTrue(Cart.inCart(dr, AddToCart.getSmall(dr)));

		sa.assertAll();

	}

}
