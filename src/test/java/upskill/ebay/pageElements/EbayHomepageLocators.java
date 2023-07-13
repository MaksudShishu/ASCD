package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomepageLocators {
	
	//Search TextBox				//For EbayBrandOutline
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txbxSearch;
	
	//Search Button					//For EbayBrandOutline
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;

	//My Ebay Link			//For EbaySummaryMouseHover
	@FindBy(xpath="//a[@title='My eBay']")
	public WebElement linkMyEbay;
		
	//My eBay Summary			//For EbaySummaryMouseHover
	@FindBy(xpath="//a[contains(text(),'Summary')]")
	public WebElement linkSummary;
	
	//My eBay Watchlist			//For EbayWatchlistMouseHover
	@FindBy(xpath="//a[contains(text(),' Watchlist')]")
	public WebElement linkWatchlist;
	
	//a[text()=' Watchlist
}
