package obj;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static final String URL = "https://petstore.octoperf.com/";
	private static final By xEnt = By.xpath("//a[contains(text(),'Enter the Store')]");

	
	//method for entering the store
	public static void entStore(WebDriver dr) {
		dr.get(HomePage.URL);
		dr.manage().window().maximize();
		clickEntBtn(dr);

	}

	
	public static WebElement getEntBtn(WebDriver dr) {
		return dr.findElement(xEnt);
	}
	
	//method for clicking the enter button
	public static void clickEntBtn(WebDriver dr) {
		getEntBtn(dr).click();
	}

}
