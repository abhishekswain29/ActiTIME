package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.LoginPage;

public class VerifyVersion extends BaseTest {
@Test
public void testVerifyVersion(){
	//verify version is actitime 2016.1 version
	LoginPage l = new LoginPage(driver);
	l.verifyVersion("actiTIME 2016.1");
	
}
}
