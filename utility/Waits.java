package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static WebElement clickable (WebDriver dr, By userID, int sec) {
		WebDriverWait wait = new WebDriverWait(dr, sec);
		return wait.until(ExpectedConditions.elementToBeClickable(userID));
	}
	
	public static WebElement visibility (WebDriver dr, By selector, int sec) {
		WebDriverWait wait = new WebDriverWait(dr, sec);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
	}
	
	public static void wait (int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
