package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.LoginPage;

public class VerifyLoginPage extends BaseTest {

	@Test
	public void testVerifyLoginPage(){
		// verify that login page is displayed 
		LoginPage l = new LoginPage(driver);
//		String v =driver.getTitle();
//		System.out.println(v);
		l.verifyTitle("actiTIME - Login");
	
	}

}
