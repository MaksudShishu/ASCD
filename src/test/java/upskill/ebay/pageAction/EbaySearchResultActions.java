package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	EbaySearchResultLocators EbaySearchResultLocatorsobj;
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsobj=new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsobj);
		}
									//For Senerio outline
	public void filterBrand(String brand){
		if(brand.equals("Gucci")){
			EbaySearchResultLocatorsobj.cbxBrandGucci.click();
		}else if(brand.equals("Rolex")){
			EbaySearchResultLocatorsobj.cbxBrandRolex.click();
		}else if(brand.equals("Chanel")){
			EbaySearchResultLocatorsobj.cbxBrandChanel.click();
		}else{
			System.out.println("Brand Not Found");
		}
	}
	
	public void verifyBrandItems(String brand){
		if(brand.equals("Gucci")){
			Assert.assertTrue(EbaySearchResultLocatorsobj.txtSunglasses.isDisplayed());
		}else if(brand.equals("Rolex")){
			Assert.assertTrue(EbaySearchResultLocatorsobj.txtWaches.isDisplayed());
		}else if(brand.equals("Chanel")){
			Assert.assertTrue(EbaySearchResultLocatorsobj.txtPerfumes.isDisplayed());
		}else{
			System.out.println("Brand Not Found");
		}
	}									//EbayCartDropDown	
		public void selectBigTallCottonTee() throws Exception{
			Thread.sleep(2000);
			EbaySearchResultLocatorsobj.linkShirtItems.click();
			Thread.sleep(2000);
		}
		}
		
	

