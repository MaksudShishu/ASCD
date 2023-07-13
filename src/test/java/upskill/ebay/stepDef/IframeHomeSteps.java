package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.IframeActions;

public class IframeHomeSteps {
	IframeActions IframeActionsobj=new IframeActions();
	

@Given("^Open Shetty Homepage$")
public void open_Shetty_Homepage() throws Throwable {
	IframeActionsobj.shettyHomepage();
}

@When("^Click on iframe Home$")
public void click_on_iframe_Home() throws Throwable {
	IframeActionsobj.iframeHome();

}

@Then("^It should reload iframe homepage$")
public void it_should_reload_iframe_homepage() throws Throwable {
	IframeActionsobj.verifyHomepage();
	
}
}
