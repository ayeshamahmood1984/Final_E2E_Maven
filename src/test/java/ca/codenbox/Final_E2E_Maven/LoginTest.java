package ca.codenbox.Final_E2E_Maven;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Object.Landing_Page;
import Page_Object.Login_Page;
import RESOURCES.Base;

public class LoginTest extends Base {
	
	@Test
	public void dologin(Object errormessage) {
		Landing_Page l=new Landing_Page(driver);
		l.getloginBtn().click();
		Login_Page lp=new Login_Page(driver);
		lp.getEmail().sendKeys("test123@test.com");
		lp.getpass().sendKeys("12345");
		lp.getlogin().click();
		String eroormessage=lp.geterror().getText();
		Assert.assertEquals(eroormessage, " is not registered on this site. If you are unsure of your username, try your email address instead.");

}
}