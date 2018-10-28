package WebDriverUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Contains Common Methods used for all the pages
public class Utils{

	public WebDriverWait wait;
	public int timeout = 60;
	private WebDriver webDriver;
	
	public Utils(WebDriver driver) {
		this.webDriver = driver;
		PageFactory.initElements(driver, this);
	}
	//Waits for visibiliy of webelements passed as arguments
    public void waitForElement(WebElement element) {
        try {
            wait = new WebDriverWait(webDriver, timeout);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
    //Waits for the element to be clickable
    public void waitForElementToBeClickable(By locator) {
        try {
            wait = new WebDriverWait(webDriver, timeout);
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}
