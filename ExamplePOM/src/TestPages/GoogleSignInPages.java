package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSignInPages extends BasePage{

	public GoogleSignInPages(WebDriver driver) {
		super(driver);
		
		
	}
	
	
	@FindBy (xpath= "//*[@id='Email']")
	private WebElement userNameinputFiled;
	



      public WebElement getuserNameinputFiled(){
	     return userNameinputFiled;
       }
	

}
