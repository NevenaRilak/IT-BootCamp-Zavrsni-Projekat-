package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import obj.Account;
import obj.AddToCart;
import obj.HomePage;
import obj.PetStoreMenu;
import obj.SignIn;
import utility.Waits;

public class Main {
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		String userID = "76111", pass = "pass", ime = "promena imena test";
		int ms = 2000;

		HomePage.entStore(dr);
		Waits.wait(ms);

		PetStoreMenu.clickSignInBtn(dr);
		Methods.registration(dr, userID, pass);
		Waits.wait(ms);

		SignIn.signin(dr, userID, pass);
		Waits.wait(ms);

		Methods.throughMenu(dr);

		AddToCart.cartLarge(dr);
		Waits.wait(ms);

		PetStoreMenu.home(dr);
		Waits.wait(ms);

		Account.entMyAcc(dr);
		Waits.wait(ms);

		Account.inFName(dr, ime);
		Waits.wait(ms);
		Account.clickSave(dr);

		PetStoreMenu.home(dr);
		Waits.wait(ms);
		Account.clickSignOut(dr);

		dr.close();

	}

}
