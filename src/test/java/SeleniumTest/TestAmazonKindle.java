package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
/*
		//action.moveToElement(webDriver.findElement(By.xpath(".//*[@class='nav-text' and contains(text(),'All-new Kindle Paperwhite')]"))).perform();
		new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOf(webDriver.findElement(By.xpath(".//*[@aria-label='Kindle']/span"))));
		action.moveToElement(webDriver.findElement(By.xpath(".//*[@aria-label='Kindle']/span"))).perform();
		action.moveToElement(webDriver.findElement(By.xpath(".//*[@class='nav-text' and contains(text(),'All-new Kindle Paperwhite')]"))).click()
		.build().perform();
		String webele = webDriver.findElement(By.xpath(".//*[@id='title']")).getText();
		System.out.println("Web element is "+webele);
		Select dropQuantity = new Select(webDriver.findElement(By.id("quantity")));
		dropQuantity.selectByVisibleText("2");
		String winHandleBefore = webDriver.getWindowHandle();
		WebElement addToCart = webDriver.findElement(By.cssSelector("input#add-to-cart-button"));
		addToCart.click();*/
		Utils utils = new Utils();
		HomePage homePage = new HomePage();
		Actions action = new Actions(webDriver);
		ExecutorInit exinit = new ExecutorInit();
		
		//Alert alert = webDriver.switchTo().alert();
		//alert.dismiss();
		//webDriver.switchTo().frame(3);
		/*action.sendKeys(Keys.ESCAPE).build().perform();
		//webDriver.switchTo().window(winHandleBefore);
		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(By.xpath(".//*[@class='a-modal-scroller a-declarative']"))));
		action.moveToElement(webDriver.findElement(By.xpath(".//*[@class='a-modal-scroller a-declarative']"))).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='a-modal-scroller a-declarative']")));
		
		WebDriverWait wait = new WebDriverWait(webDriver, 60);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='a-modal-scroller a-declarative']")));
	webDriver.navigate().back();
	webDriver.navigate().forward();

	//WebDriverWait wait = new WebDriverWait(webDriver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath(".//*[@id='nav-cart'])]"))));
		
		WebElement proceedToCheckOut = webDriver.findElement(By.xpath(".//*[@id='nav-cart']"));
		proceedToCheckOut.click();
		WebElement formLabel = webDriver.findElement(By.xpath(".//*[@class='a-form-label' and @for='ap_email']"));
		String label = formLabel.getText();
		System.out.println("Form Label is "+label);
*/
	}
}
