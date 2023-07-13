package upskill.ebay.pageAction;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.IframeLocotors;
import upskill.utilities.SetupDrivers;

public class IframeActions {
	IframeLocotors IframeLocotorsobj;
	
	public IframeActions(){
		IframeLocotorsobj=new IframeLocotors();
		PageFactory.initElements(SetupDrivers.driver, IframeLocotorsobj);
		
	}
	/*Find Element
	- Find Element method Returns the first matching  element on the current webpage.
	-If the element is not found then it throws an exception-NoSuchException
	- It return a single element.
	-The WebElement , can access directly.
	  
	 *Find Elements
	-Find Elements more then one Elements.
	- Find Elements method returns all the matching elements on the current.
	-WebPage and it dosen't throw any exception if the element is not found
	-Istead it will return ZeroElement
	-Access each item using for each loop
	List<WebElement>framelist=SetupDrivers.driver.findElements(By.id("course-iframe")); 
	    
	 */
	public void shettyHomepage() throws Exception{
		SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
			
	}

	public void iframeHome(){
		
		List<WebElement>framelist=SetupDrivers.driver.findElements(By.name("iframe-name"));
		
		for(int i=0; i<framelist.size(); i++)
			SetupDrivers.driver.switchTo().frame(i);
		
		try{
			IframeLocotorsobj.clickHome.click();
		}catch(Exception e){
			System.out.println("Element not found in this iframe");
		}
			
	}
	
	public void verifyHomepage() throws Exception{
		Thread.sleep(2000);
		IframeLocotorsobj.clickHome.isDisplayed();
		
	}
}
