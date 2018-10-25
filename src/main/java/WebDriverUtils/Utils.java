package WebDriverUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends ExecutorInit{

	public WebDriverWait wait;
	public int timeout = 60;
	
	
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
