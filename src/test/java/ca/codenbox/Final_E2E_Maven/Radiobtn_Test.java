package ca.codenbox.Final_E2E_Maven;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import Page_Object.Landing_Page;
import RESOURCES.Base;


public class Radiobtn_Test extends Base {
	@Test(groups= {"Smoke"} ,priority=0)
	public void radio_button() {
		Landing_Page home=new Landing_Page(driver);
		driver.findElement(By.name("radioButton")).click();

	}
	@Test
	
	public void verifyTitle() {
	String actualtitle=	driver.getTitle();
	System.out.println(actualtitle);
	SoftAssert a=new SoftAssert();
	Assert.assertEquals(actualtitle, "Automation Practice - CodenBox AutomationLab");
	System.out.println("this is an example of assertion");
	a.assertAll();
		
	}
	@Test(priority=1)
	public void checkBoxTest() {
            Landing_Page home=new Landing_Page(driver);
            home.getCheckbox1().click();
            home.getCheckbox3().click();
            home.getCheckbox3().isSelected();
            Assert.assertTrue( home.getCheckbox3().isSelected());
	}       
}