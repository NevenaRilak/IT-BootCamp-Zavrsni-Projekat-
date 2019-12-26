package obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Waits;

public class SignIn {
	public static final String URL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	public static final By SignInBtn = By.xpath("//a[contains(text(),'Sign In')]");
	public static final By xRl = By.linkText("Register Now!");
	public static final By xUn = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]");
	public static final By xPass = By.xpath("//input[@name='password']");
	public static final By xLiB = By.xpath("//input[@name='signon']");
	public static int sec = 2;

	// Entering the sign in page
	public static void entPage(WebDriver dr) {
		dr.get(URL);
		dr.manage().window().maximize();
	}

	// clicking register button
	public static void clickRegisterNow(WebDriver dr) {
		Waits.clickable(dr, xRl, sec).click();
	}

	// Username input
	public static WebElement getUn(WebDriver dr) {
		return dr.findElement(xUn);
	}

	public static void inputUn(WebDriver dr, String s) {
		getUn(dr).clear();
		getUn(dr).sendKeys(s);
	}

	// Password input
	public static WebElement getPass(WebDriver dr) {
		return dr.findElement(xPass);
	}

	public static void inputPass(WebDriver dr, String s) {
		getPass(dr).clear();
		getPass(dr).sendKeys(s);
	}

	// Login button click
	public static void clickSignIn(WebDriver dr) {
		Waits.clickable(dr, xLiB, sec).click();
	}

	// sign in
	public static void signin(WebDriver dr, String userID, String pass) {
		PetStoreMenu.clickSignInBtn(dr);
		inputUn(dr, userID);
		inputPass(dr, pass);
		clickSignIn(dr);
	}
}
