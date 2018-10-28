package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemDescriptionPage {
	  private WebDriver driver;
		//PageFactory Design Pattern Used for getting the webElement
	    @FindBy(id = "quantity")
		public WebElement quantityID;

	    @FindBy(css = "input#add-to-cart-button")
		public WebElement addToCart;
	    
	    @FindBy(xpath = "//*[@id='a-autoid-21']/span/input[@class='a-button-input']")
	    public WebElement continueButtonID;
	    
	    public static String continueLocator = "//*[@id='a-autoid-21']/span/input[@class='a-button-input']";
	    
	    public ItemDescriptionPage(WebDriver driver) {
	        this.driver = driver;
			//Initializing PageFactory elements
			PageFactory.initElements(driver, this);
	    }
}
