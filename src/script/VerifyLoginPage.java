package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LoginPage;

public class VerifyLoginPage extends BaseTest {

	@Test
	public void testVerifyLoginPage(){
		// verify that login page is displayed 
		LoginPage l = new LoginPage(driver);
//		String v =driver.getTitle();
//		System.out.println(v);
		String eTitle = Excel.getCellValue(INPUT_PATH, "VerifyLoginPage", 1, 0);
		l.verifyTitle(eTitle);
	
	}

}
