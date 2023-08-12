package ca.codenbox.Final_E2E_Maven;



import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page_Object.Landing_Page;
import RESOURCES.Base;

public class DropDownTest extends Base {
@Test
	public void dropdowntest() {
		
		Landing_Page home=new Landing_Page(driver);
		WebElement staticdropdown=	home.getStaticDropDown();
		
		
		Select s=new Select(staticdropdown);
		s.selectByValue("option2");
		s.selectByIndex(3);
		System.out.println(staticdropdown.isDisplayed());
		boolean displayResult=staticdropdown.isDisplayed();
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(displayResult);
		
		//dynamic drop down
		WebElement dynamicdropdown=home.getdynamicdropdown();
		dynamicdropdown.sendKeys("can");
		List<WebElement> dynamicdlist=home.getdynamicDlist(); 
		int count=dynamicdlist.size();
		for (int i=0;i<count;i++) {
			String countryname=dynamicdlist.get(i).getText();
			if(countryname.equalsIgnoreCase("Canada")) {
				dynamicdlist.get(i).click();
				break;
				
}
}
		for(int i=0;i<2;i++) {
			dynamicdropdown.sendKeys(Keys.ARROW_DOWN);
			dynamicdropdown.sendKeys(Keys.ENTER);
			soft.assertAll();
		}
}
}