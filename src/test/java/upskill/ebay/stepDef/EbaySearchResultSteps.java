package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchResultSteps {

	EbaySearchResultActions EbaySearchResultActionsobj=new EbaySearchResultActions();
	
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		EbaySearchResultActionsobj.filterBrand(brand);
		Thread.sleep(2000);
	}
								//For Senerio outline
	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		EbaySearchResultActionsobj.verifyBrandItems(brand);
		Thread.sleep(2000);
	}							//EbayCartDropDown
	@When("^Select the first item on the item list$")
	public void select_the_first_item_on_the_item_list() throws Throwable {
		EbaySearchResultActionsobj.selectBigTallCottonTee();
	}
}
