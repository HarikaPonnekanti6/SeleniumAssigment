package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	private WebDriver driver;
	
	//a[@class='hucSprite s_checkout hlb-checkout-button']
	 @FindBy(xpath = "//a[@class='hucSprite s_checkout hlb-checkout-button']")
		public WebElement proceedToCheckout;
	 
    public CartPage(WebDriver driver) {
        this.driver = driver;
		PageFactory.initElements(driver, this);
    }
}
