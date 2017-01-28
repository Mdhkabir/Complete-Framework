package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleLandingPage extends BasePage{

	public GoogleLandingPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy (xpath= "//*[@id='gb_70']")
	private WebElement sigin;
	
	
	@FindBy (xpath= "//*[@id='gbw']/div/div/div[1]/div[1]/a")
	private WebElement gmail;
	
	
	@FindBy (xpath= "//*[@id='gbw']/div/div/div[1]/div[2]/a")
	private WebElement images;
	



      public WebElement getsigin(){
	     return sigin;
       }

	
	public WebElement getgmail(){
		return gmail;
	}
	
	public WebElement getimages(){
		return images;
	

	}
}
