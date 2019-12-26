package page.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;
import obj.HomePage;
import obj.PetStoreMenu;
import utility.Waits;

public class HomeTestNg {
	@Test
	public void homeNav() {

		WebDriver dr = new ChromeDriver();
		SoftAssert sa = new SoftAssert();

		// entering the store
		HomePage.entStore(dr);

		// checking if expected page is open
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URL));

		// checking navigation
		dr.navigate().back();
		sa.assertTrue(Methods.UrlCheck(dr, HomePage.URL));

		dr.navigate().forward();
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URL));

		sa.assertAll();

		dr.quit();
	}
}
