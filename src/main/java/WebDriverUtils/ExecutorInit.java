package WebDriverUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
//Class for Initilization of web Driver and Quitting the driver instance
public class ExecutorInit {
	public WebDriver webDriver;
	//Executes before every Test run
	@BeforeTest
	@Parameters("browserName")
	public void initializer(String browserName) {
		Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"***START of BEFORETEST***", Logs.LogLevel.INFO);
		String URL = "https://www.amazon.ca/";
		try {
			//Compares the parameter from TestNG is firefox
			if(browserName.equalsIgnoreCase("firefox")){
				Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"Executing in FIREFOX Browser", Logs.LogLevel.INFO);
				webDriver = new FirefoxDriver();
				webDriver.get(URL);
				Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"URL Opened", Logs.LogLevel.INFO);
				webDriver.manage().window().maximize();
			}
			//Compares the parameter from TestNG is Chrome
			else if(browserName.equalsIgnoreCase("chrome")){
				Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"Executing in CHROME Browser", Logs.LogLevel.INFO);
				System.setProperty("webdriver.chrome.driver","./src/Resources/chromedriver");
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			    ChromeDriver d1 = new ChromeDriver(capabilities);
				webDriver = new ChromeDriver();
				webDriver.get(URL);
				Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"URL Opened", Logs.LogLevel.INFO);
				webDriver.manage().window().maximize();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"Exception Occured While Opening the browser "+e, Logs.LogLevel.ERROR);
		}
	}
	//Executes after every Test run
	@AfterTest
	public void afterTest() {
		webDriver.quit();
		Logs.getInstance().addlog(this.getClass().getSimpleName()+" | "+"DRIVER QUIT", Logs.LogLevel.INFO);
	}
}
