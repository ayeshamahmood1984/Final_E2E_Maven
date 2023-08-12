package Page_Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landing_Page {
public WebDriver driver;
	
	public Landing_Page (WebDriver driver) {
		this.driver=driver;
	}
	
	//driver.findElement(By.id("checkBoxOption1")).click();
	//driver.findElement(By.id("checkBoxOption3")).click();
	//driver.findElement(By.id("drop down-class-example")
	By checkbox1=By.id("checkBoxOption1");
	By checkbox3=By.id("checkBoxOption3");
	By staticdropdown=By.id("dropdown-class-example");
	By dynamicdropdown=By.xpath("//*[@id='autocomplete']");
	By dynamiclist=By.xpath("//div[@class='ui-menu-item-wrapper']");
	By login=By.xpath("//*[@id=\"meta-4\"]/ul/li[1]/a");
	public WebElement getCheckbox1() {
		return driver.findElement(checkbox1);
	}
	public WebElement getCheckbox3() {
		return driver.findElement(checkbox3); 
	}
	public WebElement getStaticDropDown() {
		return driver.findElement(staticdropdown);
}
	public WebElement getdynamicdropdown() {
		return driver.findElement(dynamicdropdown);
}
	public List<WebElement> getdynamicDlist() {
		return driver.findElements(dynamiclist);
}
	public WebElement getloginBtn() {
		return driver.findElement(login);
	}
}

