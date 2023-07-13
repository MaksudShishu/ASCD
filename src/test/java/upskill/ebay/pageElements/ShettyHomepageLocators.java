package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShettyHomepageLocators {
	
	//Enter Name Click Allert
	@FindBy(xpath="//input[@placeholder='Enter Your Name']")
	public WebElement enamecallert;

	//Allert
	@FindBy(xpath="//input[@value='Alert']")
	public WebElement clkAllert;
	
	//Confirm
		@FindBy(xpath="//input[@value='Confirm']")
		public WebElement clkConfirm;
		

}
