package page.tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;
import obj.Account;
import obj.HomePage;
import obj.PetStoreMenu;
import obj.Registration;
import obj.SignIn;
import utility.Waits;

public class Methods {
	//methods used in page.tests
	public static boolean UrlCheck(WebDriver dr, String URL) {
		String cUrl = dr.getCurrentUrl();
		cUrl = cUrl.replaceAll(";jsessionid=[^?]*", "");
		if (cUrl.equals(URL))
			return true;

		else {
			System.out.println("URLs do not match:");
			System.out.println("EXPECTED " + cUrl);
			System.out.println("BUT FOUND: " + URL);
			return false;
		}
	}

	public static boolean isSignedIn(WebDriver dr) {
		if (dr.findElement(Account.myAccountBtn).isDisplayed() && dr.findElement(Account.signOut).isDisplayed())
			return true;
		else
			return false;
	}

	public static boolean isSignedOut(WebDriver dr) {
		if (dr.findElement(PetStoreMenu.xSignIn).isDisplayed())
			return true;
		else
			return false;
	}

	public static boolean isInCart(WebDriver dr, By by) {
		if (dr.findElement(by).isDisplayed())
			return true;
		else
			return false;
	}

	public static void registration(WebDriver dr, String userID, String pass) {
		String cnfPass = "123", fName = "Nevena", lName = "Rilak", eMail = "nevena.rilak@gmail.com";
		String phone = "064123654", add1 = "jna 1", add2 = "/", city = "Belgrade", state = "/";
		String zip = "11000", country = "Serbia", lngPref = "japanese", favCtgry = "DOGS";

		SignIn.clickRegisterNow(dr);
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
	}
	
	public static void throughMenu (WebDriver dr) {
		int ms = 2000;
		PetStoreMenu.clickLBrd(dr);
		Waits.wait(ms);
		
		PetStoreMenu.clickPdog(dr);
		Waits.wait(ms);
		
		PetStoreMenu.clickUcat(dr);
		Waits.wait(ms);
		
		PetStoreMenu.clickLRpt(dr);
		Waits.wait(ms);
	}
}
