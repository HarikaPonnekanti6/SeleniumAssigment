package SeleniumTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import WebDriver.ExecutorInit;

public class TestAmazonKindle extends ExecutorInit{
@Test(enabled = true)
public void TestKindleCheckout() throws InterruptedException
{
	
	Actions action = new Actions(webDriver);
	action.moveToElement(webDriver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[contains(text(),'Department')]"))).perform();
	//action.moveToElement(webDriver.findElement(By.xpath(".//*[@class='nav-text' and contains(text(),'All-new Kindle Paperwhite')]"))).perform();
	new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOf(webDriver.findElement(By.xpath(".//*[@aria-label='Kindle']/span"))));
	action.moveToElement(webDriver.findElement(By.xpath(".//*[@aria-label='Kindle']/span"))).perform();
	action.moveToElement(webDriver.findElement(By.xpath(".//*[@class='nav-text' and contains(text(),'All-new Kindle Paperwhite')]"))).click()
	.build().perform();
	String webele = webDriver.findElement(By.xpath(".//*[@id='title']")).getText();
	System.out.println("Web element is "+webele);
	Select dropQuantity = new Select(webDriver.findElement(By.id("quantity")));
	dropQuantity.selectByVisibleText("2");
	WebElement addToCart = webDriver.findElement(By.cssSelector("input#add-to-cart-button"));
	addToCart.click();
	//Alert alert = webDriver.switchTo().alert();
	//alert.dismiss();
	//webDriver.switchTo().frame(3);
	String MainWindow=webDriver.getWindowHandle();		
	
    // To handle all new opened window.				
        Set<String> s1=webDriver.getWindowHandles();		
    Iterator<String> i1=s1.iterator();		
    		
    while(i1.hasNext())			
    {		
        String ChildWindow=i1.next();		
           		
             
                // Switching to Child window
        	webDriver.switchTo().window(ChildWindow);	                                                                                                           
        	WebElement popupClose = webDriver.findElement(By.xpath(".//*[@id='a-popover-7']/div/header/button"));
        	popupClose.click();
                             
		// Closing the Child Window.
        	webDriver.close();		
        		
    }		
    // Switching to Parent window i.e Main Window.
    webDriver.switchTo().window(MainWindow);
	Thread.sleep(5000);
	new WebDriverWait(webDriver, 100);
	/*WebElement proceedToCheckOut = webDriver.findElement(By.xpath(".//*[@id='hlb-next-steps']/a"));
	proceedToCheckOut.click();
	WebElement formLabel = webDriver.findElement(By.xpath(".//*[@class='a-form-label' and @for='ap_email']"));
	String label = formLabel.getText();
	System.out.println("Form Label is "+label);
	*/
}
}
