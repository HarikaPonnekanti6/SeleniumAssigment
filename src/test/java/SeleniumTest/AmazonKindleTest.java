package SeleniumTest;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ItemDescriptionPage;
import Pages.LoginPage;
import WebDriverUtils.ExecutorInit;
import WebDriverUtils.Logs;
import WebDriverUtils.Utils;

public class AmazonKindleTest extends ExecutorInit{

	public int timeout = 60;
	@Test(enabled = true)
	public void TestKindleCheckout() throws InterruptedException
	{
		try{
			Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"********TESTCASE START**********", Logs.LogLevel.INFO);
			HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
			ItemDescriptionPage itemDescriptionPage = PageFactory.initElements(webDriver, ItemDescriptionPage.class);
			LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
			CartPage cartPage = PageFactory.initElements(webDriver, CartPage.class);
			Utils utils = new Utils(webDriver);
			Actions action = new Actions(webDriver);
			Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"In Home Page", Logs.LogLevel.INFO);
			action.moveToElement(homePage.departmentPath).perform();
			action.moveToElement(homePage.kindlePath).perform();
			action.moveToElement(homePage.kindlePaperWhitePath).click().build().perform();
			Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"In Item Description Page", Logs.LogLevel.INFO);
			utils.waitForElement(itemDescriptionPage.quantityID);
			Select dropQuantity = new Select(itemDescriptionPage.quantityID);
			dropQuantity.selectByVisibleText("2");
			itemDescriptionPage.addToCart.click();
			utils.waitForElementToBeClickable(By.xpath(itemDescriptionPage.continueLocator));
			itemDescriptionPage.continueButtonID.click();
			Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"In Cart Details Page", Logs.LogLevel.INFO);
			utils.waitForElement(cartPage.proceedToCheckout);
			cartPage.proceedToCheckout.click();
			Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"In Login Page", Logs.LogLevel.INFO);
			String labelText = loginPage.emailIdLabel.getText().toString().trim();
			Assert.assertEquals(labelText, "E-mail address or mobile phone number");
			Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"********TESTCASE END**********", Logs.LogLevel.INFO);
		}catch (NoSuchElementException e){
			System.out.println("Element not found exception");
			Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"Element Not Found Exception "+e, Logs.LogLevel.ERROR);
		}catch (Exception ex) {
			Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"An Exception Occured "+ex, Logs.LogLevel.ERROR);
		}

	}
}
