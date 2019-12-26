package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;
import obj.Account;
import obj.PetStoreMenu;
import obj.Registration;
import obj.SignIn;

public class Registration1UserTestNg {

	public static WebDriver dr = new ChromeDriver();
	public static SoftAssert sa = new SoftAssert();
	public static String userID = "568483", pass = "123";

	@Test
	public void Registracija() {
		//testiranje registracije jednog korisnika
		String cnfPass = "123", fName = "Nevena", lName = "Rilak", eMail = "nevena.rilak@gmail.com";
		String phone = "064123654", add1 = "jna 1", add2 = "/", city = "Belgrade", state = "/";
		String zip = "11000", country = "Serbia", lngPref = "japanese", favCtgry = "DOGS";

		Registration.entPage(dr);
		Registration.inUserID(dr, userID);
		Registration.inPass(dr, pass);
		Registration.inCnfPass(dr, cnfPass);
		Registration.inFName(dr, fName);
		Registration.inLName(dr, lName);
		Registration.inEmail(dr, eMail);
		Registration.inPhone(dr, phone);
		Registration.inAdd1(dr, add1);
		Registration.inAdd2(dr, add2);
		Registration.inCity(dr, city);
		Registration.inState(dr, state);
		Registration.inZip(dr, zip);
		Registration.inCountry(dr, country);
		Registration.sellangPref(dr, lngPref);
		Registration.selfavCtgry(dr, favCtgry);
		Registration.checkBoxEnableList(dr);
		Registration.checkBoxEnbBanner(dr);

		Registration.clickSave(dr);
		sa.assertTrue(Methods.UrlCheck(dr, PetStoreMenu.URL));

		//sign in to check if an account was created
		SignIn.signin(dr, userID, pass);
		sa.assertTrue(Methods.isSignedIn(dr));
		
		Account.clickSignOut(dr);
		sa.assertTrue(Methods.isSignedOut(dr));
		

		sa.assertAll();

	}

}
