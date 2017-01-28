package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Global.GlobalTestData;

public class BaseTest {
	public WebDriver driver;
	

	
	@BeforeSuite
	  public void beforeSuite() {
		
		System.out.println("before suite executed");
	  }

	
	 @BeforeClass
	  public void beforeClass() {
	
	String BaseDirPath = System.getProperty("user.dir");
	String BrowserServerPath = BaseDirPath + "\\lib\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", BrowserServerPath);
	driver = new ChromeDriver();
	 }
	
	 @BeforeMethod
	  public void beforeMethod(){
	
    driver.navigate().to(GlobalTestData.url);
    }
	

	@AfterMethod
	public void afterMethod(){
    driver.quit();
	}
	@AfterClass
	public void afterClass(){
		
		System.out.println("after class executed");
	
	}
	
	@AfterSuite
	public void afterSuite(){
		
		System.out.println("after suite executed");
		
		
	}
	
}
