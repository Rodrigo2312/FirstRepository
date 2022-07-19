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
	//@FindBy (xpath = "//*[@id=\\\"resultTable\\\"]/tbody/tr[2]/td[2]/ul/li[1]/b")
	//private WebElement nameVerification;
	
	public void search(String name) {
		WrapClass.click(btnDirectory);
		WrapClass.sendKeys(directoryName, name);
		WrapClass.selectByVisibleText(("Sales Representative"),drpJobTitle);
		WrapClass.selectByVisibleText(("United States"),drpLocation);
		WrapClass.click(btnDirectory);
	}
	
	

	 

}
