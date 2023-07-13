package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocotors {

	//Shirt Size Type
	@FindBy(xpath="//select[@id='x-msku__select-box-1000']")
	public WebElement ddsizeType;
	
	//Size (Men's)
	@FindBy(xpath="//select[@id='x-msku__select-box-1001']")
	public WebElement ddMenSize;
	
	//Shade
	@FindBy(xpath="//select[@id='x-msku__select-box-1002']")
	public WebElement ddShade;
	
	//Quantity
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement ddtxbxQty;
	
	//Add To Cart
	@FindBy(xpath="//span[text()='Add to cart']")
	public WebElement ddAddCart;
	

}
