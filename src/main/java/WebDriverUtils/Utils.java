package WebDriverUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils{

	public WebDriverWait wait;
	public int timeout = 60;
	private WebDriver driver;
	
	public Utils(WebDriver driver) {
		this.webDriver = driver;
		PageFactory.initElements(driver, this);
	}
    public void waitForElement(WebElement element) {
        try {
            wait = new WebDriverWait(webDriver, timeout);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }

    public void waitForElementToBeClickable(By locator) {
        try {
            wait = new WebDriverWait(webDriver, timeout);
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}
