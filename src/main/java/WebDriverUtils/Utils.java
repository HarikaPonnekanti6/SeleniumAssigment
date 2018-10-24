package WebDriverUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends ExecutorInit{

	public WebDriverWait wait;
	public int timeout = 60;
	
	public WebElement getWebElement(By locator) {
		try {
			return webDriver.findElement(locator);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getTextOfWebElement(By locator) {
		waitForElementToBeVisible(locator);
		try {
			return webDriver.findElement(locator).getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
    public void waitForElementToBeVisible(By locator) {
        try {
            wait = new WebDriverWait(webDriver, timeout);
            //wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }

    public void waitForElementToBeClickable(By locator) {
        try {
            wait = new WebDriverWait(webDriver, timeout);
            //wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}
