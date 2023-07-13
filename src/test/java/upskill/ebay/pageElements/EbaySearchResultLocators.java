package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	//For Senerio outline			
	//Search Sunglasses
	@FindBy(xpath="//span[text()='Sunglasses']")
	public WebElement txtSunglasses;
	
	//Checkbox BrandGucci
	@FindBy(xpath="//input[@aria-label='Gucci']")
	public WebElement cbxBrandGucci;
	
	
	//Search Waches
	@FindBy(xpath="//span[text()='watches']")
	public WebElement txtWaches;
	
	//Checkbox BrandRolex
	@FindBy(xpath="//input[@aria-label='Rolex']")
	public WebElement cbxBrandRolex;
	
	
	//Search Perfumes
	@FindBy(xpath="//span[text()='Perfumes']")
	public WebElement txtPerfumes;
	
	//Checkbox BrandChanel
	@FindBy(xpath="//input[@aria-label='CHANEL']")
	public WebElement cbxBrandChanel;
	
	//EbayCartShirt
	@FindBy(xpath="//span[contains(text(),'Big & Tall Cotton Tee.')]")
	public WebElement linkShirtItems;
	
}
