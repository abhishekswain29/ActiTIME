package pom;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import generic.BasePage;

public class LoginPage extends BasePage {
	@FindBy(id ="username")
	private WebElement unTB;
	
	@FindBy(name ="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//nobr[contains(.,'actiTIME')]")
	private WebElement version;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	public void setUserName(String un){
		unTB.sendKeys(un);
	}
	public void setPassword(String pw){
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin(){
		loginBtn.click();
	}
	public void verifyVersion(String eVersion){
		String aVersion = version.getText();
		Assert.assertEquals(aVersion, eVersion);
	}
	
	public void verifyErrIsPresent(SoftAssert s){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try{
			wait.until(ExpectedConditions.visibilityOf(errMsg));
			Reporter.log("Error message is displayed ",true);
			String message = errMsg.getText();
			Reporter.log(message,true);
		}
		catch(TimeoutException e){
			Reporter.log("Error message is not displayed",true);
			s.fail();
		}
		}
	
	
	
	
	
	

}
