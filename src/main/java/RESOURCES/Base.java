package RESOURCES;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	@BeforeMethod(alwaysRun=true)
	public void initialization_driver()throws IOException{

		prop=new Properties();
		FileInputStream fs	=new FileInputStream("C:\\Users\\ayesh\\eclipse-workspace\\Final_E2E_Maven\\src\\main\\java\\RESOURCES\\data.propeeties");
		prop.load(fs);
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
	 
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
	}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		
}
	@AfterMethod(alwaysRun=true)
	public void tear_down() {
		driver.quit();
	}
	//reusable method to screenshot
		public void getScreenshot(String result) throws IOException {
			// web driver take the screenshot as a file and save in virtual memory in a variable srcfile
			//copy the file from src file and put in your local machine with the name of failed test match
		File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("C:\\Users\\ayesh\\eclipse-workspace\\Final_E2E_Maven\\Screenshot_FailedCases\\"+result+"screenshot.png"));
	}
	}
