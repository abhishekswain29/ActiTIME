package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class VerifyLoginLogout extends BaseTest {
@Test
public void testVerifyLoginLogout() throws InterruptedException{
	LoginPage l = new LoginPage(driver);
	
	//enter valid un
	String un = Excel.getCellValue(INPUT_PATH, "VerifyLoginLogout", 1, 0);
	String pw = Excel.getCellValue(INPUT_PATH, "VerifyLoginLogout", 1, 1);
	l.setUserName(un);
	//enter valid pw
	l.setPassword(pw);
	//click login
	l.clickLogin();
	//verify Home Page
	EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
	String eTitle = Excel.getCellValue(INPUT_PATH, "VerifyLoginLogout", 1, 2);
	e.verifyTitle(eTitle);
	e.clickLogout();
	Thread.sleep(2000);
}
}
