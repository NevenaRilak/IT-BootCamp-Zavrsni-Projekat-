package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import obj.Account;
import obj.PetStoreMenu;
import obj.Registration;
import obj.SignIn;
import utility.ExcelUtils;
import utility.Waits;

public class RegistrationExcelDataTestNg {

	// Testing Registration with generated data for 50 accounts

	public static WebDriver dr = new ChromeDriver();
	public static SoftAssert sa = new SoftAssert();

	// Registration data source
	public static final String dSrc = "RegData.xlsx";

	// setting excel table for data source
	@BeforeClass
	void setExcel() {
		ExcelUtils.setExcell(dSrc);
		ExcelUtils.setWorkSheet(0);
	}

	@Test
	public void Registration() {
		int users = (ExcelUtils.getRowNumber());
		int cntRegistred = 0;
		int cntFailed = 0;
		// creating 49 user accounts with generated data table
		for (int i = 1; i < users; i++) {

			String userID = ExcelUtils.getDataAt(i, 0);
			String pass = ExcelUtils.getDataAt(i, 1);

			// entering registration page
			Registration.entPage(dr);

			// inputing data
			Registration.inUserID(dr, userID);
			Registration.inPass(dr, pass);
			Registration.inCnfPass(dr, pass);
			Registration.inFName(dr, ExcelUtils.getDataAt(i, 2));
			Registration.inLName(dr, ExcelUtils.getDataAt(i, 3));
			Registration.inEmail(dr, ExcelUtils.getDataAt(i, 4));
			Registration.inPhone(dr, ExcelUtils.getDataAt(i, 5));
			Registration.inAdd1(dr, ExcelUtils.getDataAt(i, 6));
			Registration.inAdd2(dr, ExcelUtils.getDataAt(i, 7));
			Registration.inCity(dr, ExcelUtils.getDataAt(i, 8));
			Registration.inState(dr, ExcelUtils.getDataAt(i, 9));
			Registration.inZip(dr, ExcelUtils.getDataAt(i, 10));
			Registration.inCountry(dr, ExcelUtils.getDataAt(i, 11));

			Registration.sellangPref(dr, "japanese");
			Registration.selfavCtgry(dr, "DOGS");
			Registration.checkBoxEnableList(dr);
			Registration.checkBoxEnbBanner(dr);
			Registration.clickSave(dr);

			if (Methods.UrlCheck(dr, PetStoreMenu.URL)) {
				// sign in as a check if a user is registrated
				SignIn.signin(dr, userID, pass);
				sa.assertTrue(Methods.isSignedIn(dr));

				cntRegistred++;
				
				Account.clickSignOut(dr);
				sa.assertTrue(Methods.isSignedOut(dr));
			}

			else {
				cntFailed++;
				Registration.entPage(dr);
			}
		}
		sa.assertAll();
		System.out.println("Successfully registrated " + cntRegistred + "users.");
		System.out.println(cntFailed + "failed registrations - error 500. ");
	}
}
