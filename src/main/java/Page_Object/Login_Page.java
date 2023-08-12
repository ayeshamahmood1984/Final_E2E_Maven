package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {


	public WebDriver driver;

	public Login_Page (WebDriver driver) {
		this.driver=driver;
	}
	By email=By.xpath("//input[@id='user_login']");
	By password=By.id("user_pass");
	By loginbtn=By.xpath("//input[@id='wp-submit']");
	By error=By.id("login_error");


	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getpass() {
		return driver.findElement(password);
	}

	public WebElement getlogin() {
		return driver.findElement(loginbtn);
	}
	public WebElement geterror() {
		return driver.findElement(error);
	}
}
