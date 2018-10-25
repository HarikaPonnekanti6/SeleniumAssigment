package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemDescriptionPage {
	  private WebDriver driver;

	    @FindBy(id = "quantity")
		public WebElement quantityID;

	    @FindBy(css = "input#add-to-cart-button")
		public WebElement addToCart;
	     //a-autoid-21-announce
	    @FindBy(xpath = "//*[@id='a-autoid-21']/span[@class='a-button-inner']")
	    public WebElement continueButtonID;
	    
	    public static String continueLocator = "//*[@id='a-autoid-21']/span[@class='a-button-inner']";
	    
	    public ItemDescriptionPage(WebDriver driver) {
	        this.driver = driver;
			PageFactory.initElements(driver, this);
	    }
}
