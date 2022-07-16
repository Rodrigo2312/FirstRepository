package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationPages.LoginPage;

public class TC_01_Login {
	//Declaramos e inicializamos un objeto del tipo WebDriver para utilizarlo en este test case
	WebDriver driver = DriverSetup.setupDriver();
	
	//PageObjects
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}
	
  @Test
  public void TC_01() {
	  login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PWD_ADMIN);
  }
  
  @AfterTest
  public void closeDriver() {
	  driver.quit();
  }
}
