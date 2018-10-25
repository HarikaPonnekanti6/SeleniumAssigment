package WebDriverUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ExecutorInit {
	public WebDriver webDriver;
	@BeforeTest
	@Parameters("browserName")
	public void initializer(String browserName) {
		//Check if parameter passed from TestNG is 'firefox'
		try {
			if(browserName.equalsIgnoreCase("firefox")){
				//create firefox instance
				webDriver = new FirefoxDriver();
				webDriver.get("https://www.amazon.ca/");
				webDriver.manage().window().maximize();
			}
			//Check if parameter passed as 'chrome'
			else if(browserName.equalsIgnoreCase("chrome")){
				//set path to chromedriver.exe
				System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
				//create chrome instance
				webDriver = new ChromeDriver();
				webDriver.get("https://www.amazon.ca/");
				webDriver.manage().window().maximize();
			}
			//Check if parameter passed as 'Edge'
			else if(browserName.equalsIgnoreCase("safari")){
				//set path to Edge.exe
				System.setProperty("webdriver.edge.driver",".\\safari.exe");
				//create Edge instance
				webDriver = new SafariDriver();
				webDriver.get("https://www.amazon.ca/");
				webDriver.manage().window().maximize();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterTest
	public void afterClass() {
		webDriver.quit();
	}
}
