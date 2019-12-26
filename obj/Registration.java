package obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.Waits;

public class Registration {
	//registration page url
	public static final String url = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";

	//registration field xpaths
	public static final By userID = By.xpath("//input[@name='username']");
	public static final By password = By.xpath("//input[@name='password']");
	public static final By cnfPassword = By.xpath("//input[@name='repeatedPassword']");

	public static final By fName = By.xpath("//input[@name='account.firstName']");
	public static final By lName = By.xpath("//input[@name='account.lastName']");
	public static final By eMail = By.xpath("//input[@name='account.email']");
	public static final By phone = By.xpath("//input[@name='account.phone']");
	public static final By add1 = By.xpath("//input[@name='account.address1']");
	public static final By add2 = By.xpath("//input[@name='account.address2']");
	public static final By city = By.xpath("//input[@name='account.city']");
	public static final By state = By.xpath("//input[@name='account.state']");
	public static final By zip = By.xpath("//input[@name='account.zip']");
	public static final By country = By.xpath("//input[@name='account.country']");

	public static final By langPref = By
			.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[3]/tbody[1]/tr[1]/td[2]/select[1]");
	public static final By favCtgry = By.xpath("//select[@name='account.favouriteCategoryId']");
	public static final By enblist = By.xpath("//input[@name='account.listOption']");
	public static final By enbBnn = By.xpath("//input[@name='account.bannerOption']");
	public static final By saveAccInfo = By.xpath("//input[@name='newAccount']");
	public static int sec = 2;

	//entering registration page
	public static void entPage(WebDriver dr) {
		dr.get(url);
		dr.manage().window().maximize();
	}

	//input into fields methods
	public static void inUserID(WebDriver dr, String s) {
		Waits.clickable(dr, userID, sec).clear();
		Waits.clickable(dr, userID, sec).sendKeys(s);
	}

	public static void inPass(WebDriver dr, String s) {
		Waits.clickable(dr, password, sec).clear();
		Waits.clickable(dr, password, sec).sendKeys(s);
	}

	public static void inCnfPass(WebDriver dr, String s) {
		Waits.clickable(dr, cnfPassword, sec).clear();
		Waits.clickable(dr, cnfPassword, sec).sendKeys(s);
	}

	public static void inFName(WebDriver dr, String s) {
		Waits.clickable(dr, fName, sec).clear();
		Waits.clickable(dr, fName, sec).sendKeys(s);
	}

	public static void inLName(WebDriver dr, String s) {
		Waits.clickable(dr, lName, sec).clear();
		Waits.clickable(dr, lName, sec).sendKeys(s);
	}

	public static void inEmail(WebDriver dr, String s) {
		Waits.clickable(dr, eMail, sec).clear();
		Waits.clickable(dr, eMail, sec).sendKeys(s);
	}

	public static void inPhone(WebDriver dr, String s) {
		Waits.clickable(dr, phone, sec).clear();
		Waits.clickable(dr, phone, sec).sendKeys(s);
	}

	public static void inAdd1(WebDriver dr, String s) {
		Waits.clickable(dr, add1, sec).clear();
		Waits.clickable(dr, add1, sec).sendKeys(s);
	}

	public static void inAdd2(WebDriver dr, String s) {
		Waits.clickable(dr, add2, sec).clear();
		Waits.clickable(dr, add2, sec).sendKeys(s);
	}

	public static void inCity(WebDriver dr, String s) {
		Waits.clickable(dr, city, sec).clear();
		Waits.clickable(dr, city, sec).sendKeys(s);
	}

	public static void inState(WebDriver dr, String s) {
		Waits.clickable(dr, state, sec).clear();
		Waits.clickable(dr, state, sec).sendKeys(s);
	}

	public static void inZip(WebDriver dr, String s) {
		Waits.clickable(dr, zip, sec).clear();
		Waits.clickable(dr, zip, sec).sendKeys(s);
	}

	public static void inCountry(WebDriver dr, String s) {
		Waits.clickable(dr, country, sec).clear();
		Waits.clickable(dr, country, sec).sendKeys(s);
	}

	//selecting from dropdown menu methods
	public static Select langPref(WebDriver dr) {
		return new Select(dr.findElement(langPref));
	}

	public static void sellangPref(WebDriver dr, String lang) {
		langPref(dr).selectByVisibleText(lang);
	}

	public static Select favCtgry(WebDriver dr) {
		return new Select(Waits.clickable(dr, favCtgry, sec));
	}

	public static void selfavCtgry(WebDriver dr, String lang) {
		favCtgry(dr).selectByVisibleText(lang);
	}

	//checkbox methods
	public static WebElement getCheckBoxEnbList(WebDriver dr) {
		return Waits.clickable(dr, enblist, sec);
	}

	public static void checkBoxEnableList(WebDriver dr) {
		getCheckBoxEnbList(dr).click();
	}

	public static WebElement getCheckBoxEnbBanner(WebDriver dr) {
		return Waits.clickable(dr, enbBnn, sec);
	}

	public static void checkBoxEnbBanner(WebDriver dr) {
		getCheckBoxEnbBanner(dr).click();
	}

	// Creating Account Button
	public static void clickSave(WebDriver dr) {
		Waits.clickable(dr, saveAccInfo, sec).click();
	}

}
