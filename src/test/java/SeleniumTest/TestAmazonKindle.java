package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Pages.HomePage;
import WebDriverUtils.ExecutorInit;
import WebDriverUtils.Utils;

public class TestAmazonKindle extends ExecutorInit{
	@Test(enabled = true)
	public void TestKindleCheckout() throws InterruptedException
	{

		Actions action = new Actions(webDriver);
		action.moveToElement(webDriver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[contains(text(),'Department')]"))).perform();
		new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOf(webDriver.findElement(By.xpath(".//*[@aria-label='Kindle']/span"))));
		action.moveToElement(webDriver.findElement(By.xpath(".//*[@aria-label='Kindle']/span"))).perform();
		action.moveToElement(webDriver.findElement(By.xpath(".//*[@class='nav-text' and contains(text(),'All-new Kindle Paperwhite')]"))).click().build().perform();
		
		String webele = webDriver.findElement(By.xpath(".//*[@id='title']")).getText();
		System.out.println("Web element is "+webele);
		Select dropQuantity = new Select(webDriver.findElement(By.id("quantity")));
		dropQuantity.selectByVisibleText("2");
		WebElement addToCart = webDriver.findElement(By.cssSelector("input#add-to-cart-button"));
		addToCart.click();
		//action.sendKeys(Keys.ENTER).build().perform(); //DAsis
		Thread.sleep(3000);
		//webDriver.switchTo().frame("DAsis");
		//webDriver.switchTo().frame("ape_Detail_customer-reviews-top_Glance_iframe");
		//
		WebDriverWait wait = new WebDriverWait(webDriver, 60);
		//webDriver.close();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='a-autoid-21']/span/input")));
		webDriver.findElement(By.xpath(".//*[@id='a-autoid-21']/span/input")).click();
		Thread.sleep(3000);
		//webDriver.switchTo().defaultContent();
		wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath(".//*[@id='hlb-next-steps']/a[@class='hucSprite s_checkout hlb-checkout-button']"))));
		
		WebElement proceedToCheckOut = webDriver.findElement(By.xpath(".//*[@id='hlb-next-steps']/a[@class='hucSprite s_checkout hlb-checkout-button']"));
		Thread.sleep(3000);
		proceedToCheckOut.click();
		Thread.sleep(3000);
		WebElement formLabel = webDriver.findElement(By.xpath(".//*[@class='a-form-label' and @for='ap_email']"));
		String label = formLabel.getText();
		System.out.println("Form Label is "+label);

	}
}
