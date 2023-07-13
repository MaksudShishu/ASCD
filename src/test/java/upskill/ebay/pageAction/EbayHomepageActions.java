package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayHomepageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomepageActions {
	EbayHomepageLocators  EbayHomepageLocatorsobj;
	
	public EbayHomepageActions(){						//Constractor
		EbayHomepageLocatorsobj=new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsobj);
	}
						//For EbayBrandOutline			//EbayCartDropDown
	public void searchItems(String items) throws Exception{				
		EbayHomepageLocatorsobj.txbxSearch.sendKeys(items);
		//EbayHomepageLocatorsobj.btnSearch.click(); 
		EbayHomepageLocatorsobj.btnSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
								//EbaySummery MouseHover
	public void mouseHoverMyEbay() throws Exception{
		
		Actions actions=new Actions(SetupDrivers.driver);
		actions.moveToElement(EbayHomepageLocatorsobj.linkMyEbay);
		actions.perform();
		Thread.sleep(2000);		
	}
	public void clickSummery() throws Exception{
		EbayHomepageLocatorsobj.linkSummary.isEnabled();
		EbayHomepageLocatorsobj.linkSummary.click();
		Thread.sleep(2000);	
	}
	
	public void mouseHovermyEbayWatchlist() throws Exception{
		Actions actionsobj=new Actions(SetupDrivers.driver);
		actionsobj.moveToElement(EbayHomepageLocatorsobj.linkWatchlist);
		actionsobj.perform();
		Thread.sleep(2000);
		//WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 5);
		//explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsobj.linkWatchlist));
	}
	
	public void clickWatchlist() throws Exception{
		EbayHomepageLocatorsobj.linkWatchlist.isEnabled();
		EbayHomepageLocatorsobj.linkWatchlist.click();
		//EbayHomepageLocatorsobj.linkWatchlist.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	//	WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 5);
	//	explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsobj.linkWatchlist));
	}
	
	
	
	
	
	//Selenium Wait
	public void synchronization(){
/*	Selenium Wait : 
		1. Implicit wait(Global), 
		2. Explicit wait(Conditional), 
		3. Fluent wait(intermittent) */
	
		//Implicit Wait
		SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Result-NoSuchElemente

		//Explicit Wait
		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsobj.btnSearch));
		//Result-ElementNotVisiable

		//Fluent Wait
		FluentWait fluentWait = new FluentWait(SetupDrivers.driver);								
		fluentWait.withTimeout(10, TimeUnit.SECONDS);
		fluentWait.pollingEvery(2, TimeUnit.SECONDS);
		//Result-ElementNotVisible
}

	public void keyboardKeys(){
		EbayHomepageLocatorsobj.btnSearch.sendKeys(Keys.ENTER);
		EbayHomepageLocatorsobj.btnSearch.sendKeys(Keys.UP);
		EbayHomepageLocatorsobj.btnSearch.sendKeys(Keys.DOWN);
		EbayHomepageLocatorsobj.btnSearch.sendKeys(Keys.CLEAR);
		EbayHomepageLocatorsobj.btnSearch.sendKeys(Keys.DELETE);
}
//To handle pop up window/Allert
	public void handleAlert(){
		SetupDrivers.driver.switchTo().alert().accept();
		SetupDrivers.driver.switchTo().alert().dismiss();
		SetupDrivers.driver.switchTo().alert().getText();
		SetupDrivers.driver.switchTo().alert().sendKeys("awesome");
}
	public void javaScriptExecutor(){

		JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;	//Creating JS object

		js.executeScript("");

		js.executeScript("EbayHomePageLocatorsObj.btnSearch.click();"); //Clicking on element

		js.executeScript("EbayHomePageLocatorsObj.txtbxSearch.value ='shirt';"); //Writing something

		js.executeScript("EbaySearchResultLocatorsObj.cbxBrandNike.checked=true;"); //Interect Checkbox

		js.executeScript("window.location = 'http://upskill.com';"); // initializing location

		js.executeScript("location.reload()"); 						//Refresh browser

		js.executeScript("arguments[0].scrollIntoView();", EbayHomepageLocatorsobj.btnSearch);  //Scroll to a object

		js.executeScript("alert('Confirmation');");					//Alert

		js.executeScript("window.scrollBy(0,500)", ""); 			//Scroll down to specific pixel

		js.executeScript("window.scrollBy(0,-500)", ""); 			//Scroll up to specific pixel

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //Scroll down to bottom of website


}
}




