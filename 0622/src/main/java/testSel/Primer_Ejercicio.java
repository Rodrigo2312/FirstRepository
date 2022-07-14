package testSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Primer_Ejercicio {

	public static void main(String[] args) throws InterruptedException {
		
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id ("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		//Login
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		
		//Click en Directory
		WebElement btnDirectory = driver.findElement(By.id("menu_directory_viewDirectory"));
		btnDirectory.click();
		
		//Ingresar nombre Nathan
		WebElement directoryName = driver.findElement(By.id("searchDirectory_emp_name_empName"));
		directoryName.sendKeys("Nathan");
		Thread.sleep(2000);
		
		//Seleccionar Job Title
		Select drpJobTitle = new Select(driver.findElement(By.id("searchDirectory_job_title")));
		drpJobTitle.selectByVisibleText("Sales Representative");
		
		//Seleccionar Location
		Select drpLocation = new Select(driver.findElement(By.id("searchDirectory_location")));
		drpLocation.selectByVisibleText("United States");
		
		//Click en Search
		WebElement btnSearch = driver.findElement(By.id("searchBtn"));
		btnSearch.click();
		
		//Verificacion de Name completo
		String nameVerification = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")).getText();
		boolean name = nameVerification.contains("Nathan Elliot");
		
		if(name) {
		    System.out.println("Se encontro a Nathan");
		}else {
			System.out.println("ERROR: Nathan no fue encontrado");
		}
		
	}

}
