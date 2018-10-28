package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver webDriver;
	//PageFactory Design Pattern Used for getting the webElement
	@FindBy(xpath = ".//*[@id='nav-link-shopall']/span[contains(text(),'Department')]")
	public WebElement departmentPath;

	@FindBy(xpath = ".//*[@aria-label='Kindle']/span")
	public WebElement kindlePath;

	@FindBy(xpath = ".//*[@class='nav-text' and contains(text(),'All-new Kindle Paperwhite')]")
	public WebElement kindlePaperWhitePath;
	
	public HomePage(WebDriver driver) {
		this.webDriver = driver;
		//Initializing PageFactory elements
		PageFactory.initElements(driver, this);
	}
	
}
