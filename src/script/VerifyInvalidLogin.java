package script;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseTest;
import generic.Excel;
import pom.LoginPage;

public class VerifyInvalidLogin extends BaseTest {
	@Test
	public void testVerifyInvalidLogin() throws InterruptedException{
		SoftAssert s = new SoftAssert();
		LoginPage l = new LoginPage(driver);
		int rc = Excel.getRowCount(INPUT_PATH, "VerifyInvalidLogin");
		for (int i = 1; i <=rc; i++) {
		String un = Excel.getCellValue(INPUT_PATH, "VerifyInvalidLogin", i, 0);
		String pw = Excel.getCellValue(INPUT_PATH, "VerifyInvalidLogin", i, 1);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
		l.verifyErrIsPresent(s);
		Thread.sleep(2000);
		}
		s.assertAll();
	}
	
}
