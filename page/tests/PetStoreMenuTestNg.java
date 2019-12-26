package page.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import obj.HomePage;
import obj.PetStoreMenu;
import obj.SignIn;
import utility.Waits;

public class PetStoreMenuTestNg {
	public static WebDriver dr = new ChromeDriver();
	public static SoftAssert sa = new SoftAssert();

	@Test(priority = 1)
	public void leftMenu() throws InterruptedException {

		HomePage.entStore(dr);
		dr.manage().window().maximize();
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URL));

		PetStoreMenu.clickLfish(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLfish));

		PetStoreMenu.clickLdog(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLdog));

		PetStoreMenu.clickLcat(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLcat));

		PetStoreMenu.clickLRpt(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLrpt));

		PetStoreMenu.clickLBrd(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLbrd));

		sa.assertAll();
	}

	@Test(priority = 2)
	public void phMenu() {
//		dr.get(PetStoreMenu.URL);
//		dr.manage().window().maximize();

		PetStoreMenu.clickPfish(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLfish));

		PetStoreMenu.clickPdog(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLdog));

		PetStoreMenu.clickPRpt(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLrpt));

		PetStoreMenu.clickPcat(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLcat));

		PetStoreMenu.clickPBrd(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLbrd));

		sa.assertAll();

	}

	@Test(priority = 3)
	public void uMenu() {

		PetStoreMenu.clickUfish(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLfish));

		PetStoreMenu.clickUdog(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLdog));

		PetStoreMenu.clickURpt(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLrpt));

		PetStoreMenu.clickUcat(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLcat));

		PetStoreMenu.clickUBrd(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URLbrd));

		sa.assertAll();

	}

	@Test(priority = 4)
	public void logInBtn() {
		PetStoreMenu.clickSignInBtn(dr);
		sa.assertTrue(Methods.UrlCheck(dr, SignIn.URL));
		sa.assertAll();
	}

}
