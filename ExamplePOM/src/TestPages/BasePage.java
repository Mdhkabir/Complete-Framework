package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	
	public WebDriver driver;
	
	public BasePage (WebDriver driver){
		this.driver = driver;
		this.initPage();
	}
	
	
	
	public void initPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
