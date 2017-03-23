package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements AutoConst{
	public WebDriver driver;
	@Parameters({"browser"})
	@BeforeMethod
	public void precondition(String browser){
		if(browser.equals("chrome")){
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		}
		else{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
	}
	@AfterMethod
	public void postcondition(){
		driver.quit();
		
	}
	

}
