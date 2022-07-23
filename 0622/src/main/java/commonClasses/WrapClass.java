package commonClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WrapClass {

	private static final String String = null;

	public static void click(WebElement webElementToClick) {
		webElementToClick.click();
	}

	public static void sendKeys(WebElement webElementToSendText, String textToSend) {
		webElementToSendText.sendKeys(textToSend);
	}

	public static void drpDwnVisibleText(WebElement webElementSelect, String visibleTextToselect) {
		Select drpdwn = new Select(webElementSelect);
		drpdwn.selectByVisibleText(visibleTextToselect);
	}

	public static void takeScreenshot(WebDriver webdriver, String testCaseName) {
		// Tomando el screenshot de la pagina
		File scrFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
		// Establecer la ruta donde se guarda el screenshot
		String screenshotPath = "./test-output/ExecutionResults";

		// Creamos el folder usando la ruta especificada de la variable "screenshotPath"
		FileHandler.createDir(new File(screenshotPath));
		// Copiamos el screenshot de la ruta creada previamente
		try {
			FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getJSONValue(String jsonFileObj, String jsonkeey) {

		// JsonData
		try {
			// Usando la ruta obtenemos el archivo Json
			InputStream inputStream = new FileInputStream("./src/test/resources/jsonData/" + jsonFileObj + ".json");
			// Convertimos el archivo a un objeto Json de Java
			JSONObject jsonObj = new JSONObject(new JSONTokener(inputStream));

			// GetData
			String jsonValue = (String) jsonObj.getJSONObject(jsonFileObj).get(jsonkeey);
			return jsonValue;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public static String getCellData(String excelName, int row, int column) {

	
		
		try {
		// Leyendo data
		FileInputStream fis = new FileInputStream("./src/test/resources/excelData/" + excelName + ".xlsx");
		// Construir un objeto de excel
		@SuppressWarnings("resource")
		// Obteniendo el excel
		Workbook wb = new XSSFWorkbook(fis);
		// Leer la hoja 0
		Sheet sheet = wb.getSheetAt(0);
		Row rwoObj = sheet.getRow(row);
		Cell cell = rwoObj.getCell(column);
		String value = cell.getStringCellValue();
		return value;
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

