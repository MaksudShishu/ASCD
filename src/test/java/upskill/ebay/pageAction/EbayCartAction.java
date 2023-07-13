package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocotors;
import upskill.utilities.SetupDrivers;

public class EbayCartAction {
	
	EbayCartLocotors EbayCartLocotorsobj;
	
	public EbayCartAction(){
		EbayCartLocotorsobj=new EbayCartLocotors();
		PageFactory.initElements(SetupDrivers.driver, EbayCartLocotorsobj);
		
	}
	public void switchNewWindow(){
		for(String winhandle: SetupDrivers.driver.getWindowHandles()){
			SetupDrivers.driver.switchTo().window(winhandle);
		}
	}
	public void selectSizeType() throws Exception{
		Thread.sleep(2000);
		Select dropdownobj=new Select(EbayCartLocotorsobj.ddsizeType);
		dropdownobj.selectByVisibleText("Big & Tall");
		Thread.sleep(2000);
	}
	public void selectMenSize() throws Exception{
		Thread.sleep(2000);
		Select dropdownobj=new Select(EbayCartLocotorsobj.ddMenSize);
		dropdownobj.selectByVisibleText("8XLT");
		Thread.sleep(2000);
	}
	public void selectShade() throws Exception{
		Thread.sleep(2000);
		Select dropdownobj=new Select(EbayCartLocotorsobj.ddShade);
		dropdownobj.selectByVisibleText("White");
		Thread.sleep(2000);
	}
	public void enterQuantity() throws Exception{
		EbayCartLocotorsobj.ddtxbxQty.clear();
		EbayCartLocotorsobj.ddtxbxQty.sendKeys("2");
		Thread.sleep(2000);
	}
	public void addToCart() throws Exception{
		Thread.sleep(2000);
		EbayCartLocotorsobj.ddAddCart.click();
	}
}
