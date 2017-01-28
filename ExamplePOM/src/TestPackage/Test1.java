package TestPackage;


import org.testng.annotations.Test;

import Global.GlobalTestData;
import TestPages.GoogleLandingPage;
import TestPages.GoogleSignInPages;

public class Test1 extends BaseTest{
	
	
	
	@Test
	public void test1(){
		
		//System.out.println("Start testing ");
		
		
	    
	    GoogleLandingPage GL = new GoogleLandingPage(driver);
	    //GoogleLandingPage GL = PageFactory.initElements(driver,GoogleLandingPage.class);
	    GL.getsigin().click(); 
	    
	    GoogleSignInPages GL1 = new GoogleSignInPages(driver);
	    GL1.getuserNameinputFiled().sendKeys(GlobalTestData.userName);
	    
	    
	    
	    
	    /*
	    WebElement sigin = driver.findElement(By.xpath("//*[@id='gb_70']"));
	    sigin.click();*/
	    
	  
		
	}
	
	@Test
	public void test2(){
		
		System.out.println("Second test");
		
		
	}

	
}
