package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import obj.Account;
import obj.PetStoreMenu;
import obj.Registration;
import obj.SignIn;
import utility.Waits;

public class EditAccountTestNg {
	public static WebDriver dr = new ChromeDriver();
	public static SoftAssert sa = new SoftAssert();
	public static String userID = "Nevena3n", pass = "123";

	public static String testEdit = "test";
	public static String lngPref = "english", favCtgry = "CATS";
	public static int ms = 50000;
	public static int sec = 2;

	@Test(priority = 1)
	public void isEdited() {
		PetStoreMenu.toMenu(dr);
		SignIn.signin(dr, userID, pass);
		sa.assertTrue(Methods.isSignedIn(dr));
		Account.entMyAcc(dr);
		sa.assertTrue(Methods.UrlCheck(dr, Account.url));

		Account.inPass(dr, testEdit);
		Account.inCnfPass(dr, testEdit);
		Account.inFName(dr, testEdit);
		Account.inLName(dr, testEdit);
		Account.inEmail(dr, testEdit);
		Account.inPhone(dr, testEdit);
		Account.inAdd1(dr, testEdit);
		Account.inAdd2(dr, testEdit);
		Account.inCity(dr, testEdit);
		Account.inState(dr, testEdit);
		Account.inZip(dr, testEdit);
		Account.inCountry(dr, testEdit);
		Account.sellangPref(dr, lngPref);
		Account.selfavCtgry(dr, favCtgry);
		Account.unCheckBoxEnblList(dr);
		Account.unCheckBoxEnbBanner(dr);

		Account.clickSave(dr);
		PetStoreMenu.home(dr);
		Account.entMyAcc(dr);

		sa.assertEquals(Account.getinPass(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinFName(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinLName(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinEmail(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinPhone(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinAdd1(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinAdd2(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinCity(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinState(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinZip(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinCountry(dr).getAttribute("value"), testEdit);
		
		sa.assertTrue(Account.lPIsSelected(dr, lngPref));
		sa.assertTrue(Account.favCtgryIsSelected(dr, favCtgry));
		
		sa.assertTrue(!Account.enbListIsChecked(dr));
		sa.assertTrue(!Account.enbBannerIsChecked(dr));

		Account.clickSignOut(dr);
		sa.assertTrue(Methods.isSignedOut(dr));
		sa.assertAll();

	}

	@Test(priority = 2)
	public void staysEdited() {
		// testing if data stays changed after sign out
		SignIn.signin(dr, userID, pass);
		Account.entMyAcc(dr);
		sa.assertTrue(Methods.UrlCheck(dr, Account.url));

		sa.assertEquals(Account.getinPass(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinFName(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinLName(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinEmail(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinPhone(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinAdd1(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinAdd2(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinCity(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinState(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinZip(dr).getAttribute("value"), testEdit);
		sa.assertEquals(Account.getinCountry(dr).getAttribute("value"), testEdit);
		
		sa.assertTrue(Account.lPIsSelected(dr, lngPref));
		sa.assertTrue(Account.favCtgryIsSelected(dr, favCtgry));
		
		sa.assertTrue(!Account.enbListIsChecked(dr));
		sa.assertTrue(!Account.enbBannerIsChecked(dr));

		sa.assertAll();

	}
}
