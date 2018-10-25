package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver webDriver;
	
	@FindBy(xpath = ".//*[@id='nav-link-shopall']/span[contains(text(),'Department')]")
	public WebElement departmentPath;

	@FindBy(xpath = ".//*[@aria-label='Kindle']/span")
	public WebElement kindlePath;

	@FindBy(xpath = ".//*[@class='nav-text' and contains(text(),'All-new Kindle Paperwhite')]")
	public WebElement kindlePaperWhitePath;
	public HomePage(WebDriver driver) {
		this.webDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
