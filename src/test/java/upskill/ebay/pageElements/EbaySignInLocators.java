package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySignInLocators {
	
	//Sign in
		@FindBy(xpath="//a[text()='Sign in']")
		public WebElement btnSearch;
		
	//Enter email 
		@FindBy(xpath="//input[@id='userid']")
		public WebElement txtbxSearch ;
			
	//Continue Button 
		@FindBy(xpath="//button[@id='signin-continue-btn']")
		public WebElement btnSearch2;
			
	//Enter password 
		@FindBy(xpath="//input[@id='pass']")
		public WebElement txtbxSearch2;
			
		//Continue Button 
			@FindBy(xpath="//button[@id='sgnBt']")
			public WebElement btnSearch3;
			
								
}
