package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class DashboardPage {

	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this); // Inicializamos los PageObjects con PageFactory
		// THIS es un keyword de Java con el que indicamos que es esta misma clase donde
		// se va a utilizar

	}

	// Dhasboard WebElements
	@FindBy(id = "welcome")
	private WebElement welcomeDrpDwn;
	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement logoutLink;

	public void logout() {
		WrapClass.click(welcomeDrpDwn);
		WrapClass.click(logoutLink);
	}
}
