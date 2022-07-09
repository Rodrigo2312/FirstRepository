package testSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		//Obtener/Identificador los objetos/webelements de la pagina web
		WebElement userName = driver.findElement(By.id ("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		//Login
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		
		//Click en AssignLeave
		WebElement btnAssignLeave = driver.findElement(By.className("quickLinkText"));
		btnAssignLeave.click();
		
		//Enviar a text a employee name
		WebElement employeeName = driver.findElement(By.name("assignleave[txtEmployee][empName]"));
		employeeName.sendKeys("Rodrigo Lombardo");
		Thread.sleep(3000);
		employeeName.clear();
		
		//Obtener el texto
		
		String welcomeName = driver.findElement(By.id("welcome")).getText();
		boolean name = welcomeName.contains("kota");
		
		if(name) {
			System.out.println("El mensaje contiene el nombre de kathija");
		}else {
			System.out.println("ERROR: el Mensaje no tiene el nombre kathija");
		}
		
		//Dropdowns
		Select drpLeaveType = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		drpLeaveType.selectByVisibleText("US - FMLA");
	}

}
