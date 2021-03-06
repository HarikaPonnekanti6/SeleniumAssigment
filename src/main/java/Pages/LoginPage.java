package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	//PageFactory Design Pattern Used for getting the webElement
	 @FindBy(xpath = "//div[@class='a-row a-spacing-base']/label")
		public WebElement emailIdLabel;
	 
    public LoginPage(WebDriver driver) {
        this.driver = driver;
		//Initializing PageFactory elements
		PageFactory.initElements(driver, this);
    }
}
