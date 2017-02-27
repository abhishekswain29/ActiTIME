package script;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseTest;
import pom.LoginPage;

public class VerifyInvalidLogin extends BaseTest {
	@Test
	public void testVerifyInvalidLogin(){
		SoftAssert s = new SoftAssert();
		LoginPage l = new LoginPage(driver);
		l.setUserName("abc");
		l.setPassword("xyz");
		l.clickLogin();
		l.verifyErrIsPresent(s);
		s.assertAll();
	}
	
}
