package obj;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Waits;

public class PetStoreMenu {

	// category pages urls
	public static final String URL = "https://petstore.octoperf.com/actions/Catalog.action";
	public static final String URLfish = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String URLdog = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String URLcat = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String URLrpt = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String URLbrd = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";

	//logo-link to Pet Store Menu page xpath
	public static final By xLogo = By.xpath("//div[@id='LogoContent']//a//img");
	// left menu xpaths
	public static final By xLfish = By.xpath("//div[@id='Content']//a[1]//img[1]");
	public static final By xLdog = By.xpath("//div[@id='Content']//a[2]//img[1]");
	public static final By xLcat = By.xpath("//div[@id='Content']//a[3]//img[1]");
	public static final By xLrpt = By.xpath("//div[@id='Content']//a[4]//img[1]");
	public static final By xLbrd = By.xpath("//div[@id='Content']//a[5]//img[1]");

	// upper menu xpaths
	public static final By xUfish = By.xpath("//div[@id='QuickLinks']//a[1]//img[1]");
	public static final By xUdog = By.xpath("//div[@id='Header']//a[2]//img[1]");
	public static final By xUcat = By.xpath("//div[@id='Header']//a[4]//img[1]");
	public static final By xUrpt = By.xpath("//div[@id='Header']//a[3]//img[1]");
	public static final By xUbrd = By.xpath("//div[@id='Header']//a[5]//img[1]");

	// photo menu xpaths
	public static final By xPfish = By.xpath("//area[@alt='Fish']");
	public static final By xPdog = By.xpath("//body//area[3]");
	public static final By xPcat = By.xpath("//body//area[5]");
	public static final By xPrpt = By.xpath("//body//area[4]");
	public static final By xPbrd = By.xpath("//body//area[6]");
	

	// sign in button xpath
	public static final By xSignIn = By.xpath("//a[contains(text(),'Sign In')]");

	// wait interval
	public static int sec = 5;

	
	//navigate to Menu method
	
	public static void home (WebDriver dr) {
		Waits.clickable(dr, xLogo, sec).click();;
	}
	public static void toMenu (WebDriver dr) {
		dr.get(URL);
		dr.manage().window().maximize();
	}
	
	
	// left menu click methods
	// fish
	public static void clickLfish(WebDriver dr) {
		toMenu(dr);
		Waits.clickable(dr, xLfish, sec).click();
	}
	
	// dog
	public static void clickLdog(WebDriver dr) {
		toMenu(dr);
		Waits.clickable(dr, xLdog, sec).click();
	}
	
	// cat
	public static void clickLcat(WebDriver dr) {
		toMenu(dr);
		Waits.clickable(dr, xLcat, sec).click();
	}
	
	// reptile
	public static void clickLRpt(WebDriver dr) {
		toMenu(dr);
		Waits.clickable(dr, xLrpt, sec).click();
	}
	
	// bird
	public static void clickLBrd(WebDriver dr) {
		toMenu(dr);
		Waits.clickable(dr, xLbrd, sec).click();
	}

	
	// upper menu methods
	// fish
	public static void clickUfish(WebDriver dr) {
		dr.findElement(xUfish).click();
	}
	
	// dog
	public static void clickUdog(WebDriver dr) {
		Waits.clickable(dr, xUdog, sec).click();
	}
	
	// cat
	public static void clickUcat(WebDriver dr) {
		Waits.clickable(dr, xUcat, sec).click();
	}
	
	// reptile
	public static void clickURpt(WebDriver dr) {
		Waits.clickable(dr, xUrpt, sec).click();
	}
	
	// bird
	public static void clickUBrd (WebDriver dr) {
		Waits.clickable(dr, xUbrd, sec).click();
	}
	
	
	//photo menu methods
	// fish
	public static void clickPfish(WebDriver dr) {
		toMenu(dr);
		Waits.clickable(dr, xPfish, sec).click();
	}
	
	// dog
	public static void clickPdog(WebDriver dr) {
		toMenu(dr);
		Waits.clickable(dr, xPdog, sec).click();
	}
	
	// cat
	public static void clickPcat(WebDriver dr) {
		toMenu(dr);
		Waits.clickable(dr, xPcat, sec).click();
	}
	
	// reptile
	public static void clickPRpt(WebDriver dr) {
		toMenu(dr);
		Waits.clickable(dr, xPrpt, sec).click();
	}
	
	// bird
	public static void clickPBrd(WebDriver dr) {
		toMenu(dr);
		Waits.clickable(dr, xPbrd, sec).click();
	}
	
	
	//SignIn button
	public static void clickSignInBtn (WebDriver dr) {
		Waits.clickable(dr, xSignIn, 10).click();
	}
}