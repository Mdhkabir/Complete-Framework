package TestPackage;


import org.testng.annotations.Test;
import TestPages.GoogleLandingPage;



public class Test3 extends BaseTest{

	
	
	@Test
	public void test3(){
		
		System.out.println("start test three");
		
		
	    
	    
	    GoogleLandingPage GL = new GoogleLandingPage(driver);
	    //GoogleLandingPage GL = PageFactory.initElements(driver,GoogleLandingPage.class);
	    GL.getimages().click(); 
	    
	    
	    
		
		/*WebElement images = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a"));
		images.click();*/
		
		
	
	}
	
	
	

}
