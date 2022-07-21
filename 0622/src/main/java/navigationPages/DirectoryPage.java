package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class DirectoryPage {
	
	public DirectoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Directory WebEelements
	@FindBy (id = "menu_directory_viewDirectory")
	private WebElement btnDirectory;
	@FindBy (id = "searchDirectory_emp_name_empName")
	private WebElement directoryName;
	@FindBy (id = "searchDirectory_job_title")
	private WebElement drpJobTitle;
	@FindBy (id = "searchDirectory_location")
	private WebElement drpLocation;
	@FindBy (id = "searchBtn")
	private WebElement btnSearch;
	@FindBy (xpath = "//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")
	private WebElement resultTable;
	
	
	
	public void directoryClick() {
		WrapClass.click(btnDirectory);
	}
	public void directoryName(String name) throws InterruptedException {
		WrapClass.sendKeys(directoryName, name);
		Thread.sleep(2000);
	}
	public void selectJobTitle(String visibleText) throws InterruptedException {
		WrapClass.drpDwnVisibleText(drpJobTitle,visibleText);
		Thread.sleep(2000);
	} 
		
	public void selectLocation(String visibleText) throws InterruptedException {
		WrapClass.drpDwnVisibleText(drpLocation, visibleText);
		Thread.sleep(2000);
	}
	public void directorySearch() throws InterruptedException {
		WrapClass.click(btnSearch);
		Thread.sleep(2000);
	}
	
	public boolean verifySerachNameResult(String expectedName) {
		boolean isdisplayed = resultTable.getText().contains(expectedName);
		return isdisplayed;
	}

	
	

	 

}
