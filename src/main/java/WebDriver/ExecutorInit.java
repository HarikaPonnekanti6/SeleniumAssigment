package WebDriver;

import java.io.IOException;
import java.util.NavigableMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ExecutorInit {
	public WebDriver webDriver = null;
	/*
	public void initalizer() throws IOException{
		if(webDriver == null)
		{
			webDriver = new FirefoxDriver();
			webDriver.get("https://www.amazon.ca/");
			webDriver.manage().window().maximize();

			if (System.getProperty("browser").equals("Firefox")) 
			{
				webDriver = new FirefoxDriver();
			}
			else if (System.getProperty("browser").equals("iexplore")) 
			{
				System.setProperty("webdriver.ie.driver", "C:\\selenium\\IEDriverServer.exe");
				webDriver = new InternetExplorerDriver();
			}
			else if (System.getProperty("brower").equals("Chrome"))
			{

			}
		}
	}*/

	@BeforeClass
	public void beforeClass() {
		webDriver = new FirefoxDriver();
		webDriver.get("https://www.amazon.ca/");
		webDriver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		webDriver.quit();
	}
}
