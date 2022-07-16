package testSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_ImplicitWait {

		public static void main(String[] args) {
			String exePath = "./driver/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			
			//Obtener/Identificar los objetos/webelements de la pagina web
			WebElement userName = driver.findElement(By.id("txtUsername2"));

	}

}
