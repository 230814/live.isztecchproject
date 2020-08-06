package testPage;

import org.testng.annotations.Test;

import pages.gmailHome;
import pages.loginInput;

public class gmailTest {
	
	@Test
	public void testRun() {
		
	gmailHome browser=new gmailHome();
	
	browser.openBrowser();
	browser.pageTitle();
	browser.pageURL();
	browser.signIn();
	
	loginInput login=new loginInput();
	
	login.loginCredential();
	login.signInVerify();
	login.browserClose();
	}
	

}
