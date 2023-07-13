package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbaySignInLocators;
import upskill.utilities.SetupDrivers;

public class EbaySignInActions {
	EbaySignInLocators EbaySignInLocatorsobj;
	
	public EbaySignInActions(){
		EbaySignInLocatorsobj=new EbaySignInLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySignInLocatorsobj);
		
		}
	public void clicksignIn() throws InterruptedException{
		EbaySignInLocatorsobj.btnSearch.click();
		Thread.sleep(2000);
	}
	public void sendUser() throws InterruptedException{
		EbaySignInLocatorsobj.txtbxSearch.sendKeys("shishusyl@gmail.com");
		Thread.sleep(2000);
	}
	public void clickButton() throws InterruptedException{
		EbaySignInLocatorsobj.btnSearch2.click();
		Thread.sleep(2000);
	}
	public void sendPassword() throws InterruptedException{
		EbaySignInLocatorsobj.txtbxSearch2.sendKeys("abcd4321");
		Thread.sleep(2000);
	}
	public void click() throws InterruptedException{
		EbaySignInLocatorsobj.btnSearch3.click();
		Thread.sleep(2000);
	
	}
}

