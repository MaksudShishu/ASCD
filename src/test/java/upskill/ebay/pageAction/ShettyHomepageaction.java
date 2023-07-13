package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.ShettyHomepageLocators;
import upskill.utilities.SetupDrivers;

public class ShettyHomepageaction {

	ShettyHomepageLocators ShettyHomepageLocatorsobj;
	
	public ShettyHomepageaction(){
		ShettyHomepageLocatorsobj=new ShettyHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver,ShettyHomepageLocatorsobj);
		}
		
	public void rahulSheety(){
		ShettyHomepageLocatorsobj.enamecallert.sendKeys("Maksud");
		ShettyHomepageLocatorsobj.clkAllert.click();
		
	}
	public void handleAlert() throws Exception{
		Thread.sleep(2000);
		SetupDrivers.driver.switchTo().alert().accept();
		
	}
	public void rahulSheety2() throws Exception{
		ShettyHomepageLocatorsobj.enamecallert.sendKeys("Maksud");
		ShettyHomepageLocatorsobj.clkConfirm.click();
		Thread.sleep(2000);
	}
	public void handleAlert2() throws Exception{
		Thread.sleep(2000);
		SetupDrivers.driver.switchTo().alert().dismiss();;
		
	}
	}

