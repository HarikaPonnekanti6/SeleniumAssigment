package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ItemDescriptionPage;
import Pages.LoginPage;
import WebDriverUtils.ExecutorInit;
import WebDriverUtils.Utils;

public class AmazonKindleTest extends ExecutorInit{

	public int timeout = 60;
	@Test(enabled = true)
	public void TestKindleCheckout() throws InterruptedException
	{
		HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
		ItemDescriptionPage itemDescriptionPage = PageFactory.initElements(webDriver, ItemDescriptionPage.class);
		LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
		CartPage cartPage = PageFactory.initElements(webDriver, CartPage.class);
		Utils utils = new Utils();
		Actions action = new Actions(webDriver);
		action.moveToElement(homePage.departmentPath).perform();
		action.moveToElement(homePage.kindlePath).perform();
		action.moveToElement(homePage.kindlePaperWhitePath).click().build().perform();
		utils.waitForElement(itemDescriptionPage.quantityID);
		Select dropQuantity = new Select(itemDescriptionPage.quantityID);
		dropQuantity.selectByVisibleText("2");
		itemDescriptionPage.addToCart.click();
		utils.waitForElementToBeClickable(By.xpath(itemDescriptionPage.continueLocator));
		itemDescriptionPage.continueButtonID.click();
		utils.waitForElement(cartPage.proceedToCheckout);
		cartPage.proceedToCheckout.click();
		String labelText = loginPage.emailIdLabel.getText().toString().trim();
		Assert.assertEquals(labelText, "E-mail address or mobile phone number");
	}

}
