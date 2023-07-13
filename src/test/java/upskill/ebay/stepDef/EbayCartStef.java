package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayCartAction;

public class EbayCartStef {

	EbayCartAction EbayCartActionobj= new EbayCartAction();
	
	@When("^Select Size$")
	public void select_Size() throws Throwable {
		EbayCartActionobj.switchNewWindow();
		EbayCartActionobj.selectSizeType();
	
	}

	@When("^Select men size$")
	public void select_men_size() throws Throwable {
		EbayCartActionobj.selectMenSize();

	}

	@When("^select shade$")
	public void select_shade() throws Throwable {
		EbayCartActionobj.selectShade();
	  
	}

	@When("^Select quantity$")
	public void select_quantity() throws Throwable {
		EbayCartActionobj.enterQuantity();

	}

	@Then("^Add to shopping cart$")
	public void add_to_shopping_cart() throws Throwable {
		EbayCartActionobj.addToCart();
	
	}


}
