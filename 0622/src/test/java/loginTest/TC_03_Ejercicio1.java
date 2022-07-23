package loginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationPages.DirectoryPage;
import navigationPages.LoginPage;

public class TC_03_Ejercicio1 {
	
	WebDriver driver = DriverSetup.setupDriver();
	// PageObjects
	LoginPage login = new LoginPage(driver);
	DirectoryPage directory = new DirectoryPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}
	
  @Test
  
  public void TC_03() throws InterruptedException {
		// Step 1
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PWD_ADMIN);
		// Step 2
		directory.directoryClick();
		// Step 3
		directory.directoryName("Nathan");
		// Step 4
		directory.selectJobTitle("Sales Representative");
		// Step 5
		directory.selectLocation("United States");
		// Step 6
		directory.directorySearch();
		// Step 7 verification
		Assert.assertTrue(directory.verifySearchNameResult("Nathan"));
  }
  @AfterTest
	public void closeDriver() {
		driver.quit();
}
}