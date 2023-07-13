package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomepageSteps {
	EbayHomepageActions EbayHomepageActionsobj=new EbayHomepageActions();
	
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
	
	}

	@Given("^Search for \"([^\"]*)\"$")			//For EbayBrandOutline
	public void search_for(String items) throws Throwable {
		EbayHomepageActionsobj.searchItems(items);
		Thread.sleep(2000);
	}
	@Given("^Search for Big Tall Cotton Tee Made Usa$")		//EbayCartDropDown
	public void search_for_Big_Tall_Cotton_Tee_Made_Usa() throws Throwable {
		EbayHomepageActionsobj.searchItems("Big Tall Cotton Tee Made Usa");
	}
								//EbaySummery MouseHover
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
		EbayHomepageActionsobj.mouseHoverMyEbay();
	}

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomepageActionsobj.clickSummery();
	}
								//EbayWatclist MouseHover
	@When("^Mouse Hover MyeBay Watchlist$")
	public void mouse_Hover_MyeBay_Watchlist() throws Throwable {
	EbayHomepageActionsobj.mouseHovermyEbayWatchlist();
	}

	@Then("^Click on Watchlist$")
	public void click_on_Watchlist() throws Throwable {
	EbayHomepageActionsobj.clickWatchlist();
}

}
