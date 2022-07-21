package commonClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WrapClass {
	
	public static void click(WebElement webElementToClick) {
		webElementToClick.click();
	}
	
	public static void sendKeys(WebElement webElementToSendText, String textToSend) {
		webElementToSendText.sendKeys(textToSend);
	}

	public static void drpDwnVisibleText(WebElement webElementSelect, String visibleTextToselect){
		Select drpdwn = new Select(webElementSelect);
		drpdwn.selectByVisibleText(visibleTextToselect);
	}
	

}
