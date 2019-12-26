package page.tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import obj.Account;
import obj.PetStoreMenu;
import obj.SignIn;

public class SignInTestNG {
	public static WebDriver dr = new ChromeDriver();
	public static SoftAssert sa = new SoftAssert();
	public static String userID= "Nevena3n", pass="123";
  @Test
  public void signedIn() {
	  PetStoreMenu.toMenu(dr);
	  SignIn.signin(dr, userID, pass);
	  
	  sa.assertTrue(Methods.isSignedIn(dr));
	  
	  Account.clickSignOut(dr);
	  sa.assertTrue(Methods.isSignedOut(dr));
	  
	  sa.assertAll();
  }
}
