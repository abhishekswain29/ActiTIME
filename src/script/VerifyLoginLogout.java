package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class VerifyLoginLogout extends BaseTest {
@Test
public void testVerifyLoginLogout(){
	LoginPage l = new LoginPage(driver);
	
	//enter valid un
	l.setUserName("admin");
	//enter valid pw
	l.setPassword("manager");
	//click login
	l.clickLogin();
	//verify Home Page
	EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
	e.verifyTitle("actiTIME - Enter Time-Track");
}
}
