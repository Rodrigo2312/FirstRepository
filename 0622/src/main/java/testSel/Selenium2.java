package testSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

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
		
		//Metodos del navegador
		String title = driver.getTitle();
		System.out.println("El titulo es: " + title);
		
		//Validacion de URL
		String urlDashboard = driver.getCurrentUrl();
		System.out.println("La URL es: " + urlDashboard);
		urlDashboard.contains("/Dashboard");
		
		//Metodos de navegacion
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//Verificar elemento desplegado en la pagina
		boolean header = driver.findElement(By.xpath("//*[@class=\"head\"]/h1")).isDisplayed();
		if(header) {
			System.out.println("El header esta desplegado");
		}
		
		//Cerrar navegador web
		
		driver.close(); //Cierra ultima ventana, ventana/pestana actual que el WebDriver esta utilizando
		
		driver.quit(); //Cierra todas las ventanas/pestanas del navegador que el WebDriver ha abierto durante la ejecucion
		
		

	}

}
