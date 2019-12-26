package obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.Waits;

public class Account {

	public static String url = "https://petstore.octoperf.com/actions/Account.action?editAccountForm=";
	public static By myAccountBtn = By.xpath("//a[contains(text(),'My Account')]");
	public static By signOut = By.xpath("//a[contains(text(),'Sign Out')]");
	public static By cart = By.xpath("//img[@name='img_cart']");
	public static int sec = 2;
	
	//xpaths for accesing fields to change data
	
	// konstante se po nekom pravilu pisu u upper case-u gde su reci odvojene donjom crtom
	// to naravno nije pod moranje, vec predstavlja ustaljenu praksu
	
	public static final By password = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]");
	public static final By cnfPassword = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]");

	public static final By fName = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[1]/td[2]/input[1]");
	public static final By lName = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[2]/td[2]/input[1]");
	public static final By eMail = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[3]/td[2]/input[1]");
	public static final By phone = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[4]/td[2]/input[1]");
	public static final By add1 = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[5]/td[2]/input[1]");
	public static final By add2 = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[6]/td[2]/input[1]");
	public static final By city = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[7]/td[2]/input[1]");
	public static final By state = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[8]/td[2]/input[1]");
	public static final By zip = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[9]/td[2]/input[1]");
	public static final By country = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[10]/td[2]/input[1]");

	public static final By langPref = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[3]/tbody[1]/tr[1]/td[2]/select[1]");
	public static final By favCtgry = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[3]/tbody[1]/tr[2]/td[2]/select[1]");
	public static final By enblist = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[3]/tbody[1]/tr[3]/td[2]/input[1]");
	public static final By enbBnn = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[3]/tbody[1]/tr[4]/td[2]/input[1]");
	
	//Save Account Information Button
	public static final By saveAccInfo = By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]");

	

	public static void entMyAcc(WebDriver dr) {
		Waits.clickable(dr, myAccountBtn, sec).click();
	}

	public static void clickSignOut(WebDriver dr) {
		Waits.clickable(dr, signOut, sec).click();
	}

	public static void clickCart(WebDriver dr) {
		Waits.clickable(dr, cart, sec).click();
	}
	
	//methods for changing account information
	public static WebElement getinPass(WebDriver dr) {
		return Waits.clickable(dr, password, sec);
	}
	public static void inPass(WebDriver dr, String s) {
		getinPass(dr).clear();
		getinPass(dr).sendKeys(s);
	}
	
	public static WebElement getInCnfPass(WebDriver dr) {
		return Waits.clickable(dr, cnfPassword, sec);
	}
	public static void inCnfPass(WebDriver dr, String s) {
		getInCnfPass(dr).clear();
		getInCnfPass(dr).sendKeys(s);
	}

	public static WebElement getinFName(WebDriver dr) {
		return Waits.clickable(dr, fName, sec);
	}
	public static void inFName(WebDriver dr, String s) {
		getinFName(dr).clear();
		getinFName(dr).sendKeys(s);
	}

	public static WebElement getinLName(WebDriver dr) {
		return Waits.clickable(dr, lName, sec);
	}
	public static void inLName(WebDriver dr, String s) {
		getinLName(dr).clear();
		getinLName(dr).sendKeys(s);
	}

	public static WebElement getinEmail(WebDriver dr) {
		return Waits.clickable(dr, eMail, sec);
	}
	public static void inEmail(WebDriver dr, String s) {
		getinEmail(dr).clear();
		getinEmail(dr).sendKeys(s);
	}

	public static WebElement getinPhone(WebDriver dr) {
		return Waits.clickable(dr, phone, sec);
	}
	public static void inPhone(WebDriver dr, String s) {
		getinPhone(dr).clear();
		getinPhone(dr).sendKeys(s);
	}

	public static WebElement getinAdd1(WebDriver dr) {
		return Waits.clickable(dr, add1, sec);
	}
	public static void inAdd1(WebDriver dr, String s) {
		getinAdd1(dr).clear();
		getinAdd1(dr).sendKeys(s);
	}

	public static WebElement getinAdd2(WebDriver dr) {
		return Waits.clickable(dr, add2, sec);
	}
	public static void inAdd2(WebDriver dr, String s) {
		getinAdd2(dr).clear();
		getinAdd2(dr).sendKeys(s);
	}

	public static WebElement getinCity(WebDriver dr) {
		return Waits.clickable(dr, city, sec);
	}
	public static void inCity(WebDriver dr, String s) {
		getinCity(dr).clear();
		getinCity(dr).sendKeys(s);
	}

	public static WebElement getinState(WebDriver dr) {
		return Waits.clickable(dr, state, sec);
	}
	public static void inState(WebDriver dr, String s) {
		getinState(dr).clear();
		getinState(dr).sendKeys(s);
	}

	
	public static WebElement getinZip(WebDriver dr) {
		return Waits.clickable(dr, zip, sec);
	}
	public static void inZip(WebDriver dr, String s) {
		getinZip(dr).clear();
		getinZip(dr).sendKeys(s);
	}

	public static WebElement getinCountry(WebDriver dr) {
		return Waits.clickable(dr, country, sec);
	}
	public static void inCountry(WebDriver dr, String s) {
		getinCountry(dr).clear();
		getinCountry(dr).sendKeys(s);
	}

	//dropdown menues
	public static Select langPref(WebDriver dr) {
		return new Select(dr.findElement(langPref));
	}
	
	public static boolean lPIsSelected (WebDriver dr, String s) {
		String sel = (langPref(dr).getFirstSelectedOption().getText());
		if (sel.equalsIgnoreCase(s))
		return true;
		else 
			return false;
	}
	

	public static void sellangPref(WebDriver dr, String lang) {
		langPref(dr).selectByVisibleText(lang);
	}

	public static boolean favCtgryIsSelected (WebDriver dr, String s) {
		String sel = (favCtgry(dr).getFirstSelectedOption().getText());
		if (sel.equalsIgnoreCase(s))
		return true;
		else 
			return false;
	}
	
	public static Select favCtgry(WebDriver dr) {
		return new Select(Waits.clickable(dr, favCtgry, sec));
	}

	public static void selfavCtgry(WebDriver dr, String lang) {
		favCtgry(dr).selectByVisibleText(lang);
	}

	//checkboxes
	public static WebElement getCheckBoxEnbList(WebDriver dr) {
		return Waits.clickable(dr, enblist, sec);
	}
	
	public static boolean enbListIsChecked (WebDriver dr) {
		if (getCheckBoxEnbList(dr).isSelected())
			return true;
		else
			return false;
	}

	public static void checkBoxEnblList(WebDriver dr) {
		if (!getCheckBoxEnbList(dr).isSelected())
		getCheckBoxEnbList(dr).click();
	}
	
	public static void unCheckBoxEnblList(WebDriver dr) {
		if (getCheckBoxEnbList(dr).isSelected())
		getCheckBoxEnbList(dr).click();
	}
	
	
	public static WebElement getCheckBoxEnbBanner(WebDriver dr) {
		return Waits.clickable(dr, enbBnn, sec);
	}

	public static boolean enbBannerIsChecked (WebDriver dr) {
		if (getCheckBoxEnbBanner(dr).isSelected())
			return true;
		else
			return false;
	}
	public static void checkBoxEnbBanner(WebDriver dr) {
		if(!getCheckBoxEnbBanner(dr).isSelected())
		getCheckBoxEnbBanner(dr).click();
	}
	
	public static void unCheckBoxEnbBanner(WebDriver dr) {
		if(getCheckBoxEnbBanner(dr).isSelected())
		getCheckBoxEnbBanner(dr).click();
	}
	
	
	//Saving changes button
	public static void clickSave (WebDriver dr) {
		Waits.clickable(dr, saveAccInfo, sec).click();
	}
	
}
