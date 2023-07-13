package upskill.ebay.stepDef;

import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySignInActions;

public class EbaySignInSteps {
	
	EbaySignInActions EbaySignInActionsobj=new EbaySignInActions();
	
	@When("^click on Sign in$")
	public void click_on_Sign_in() throws Throwable {
		EbaySignInActionsobj.clicksignIn();
		
	}

	@When("^click textbox & email or username$")
	public void click_textbox_email_or_username() throws Throwable {
		EbaySignInActionsobj.sendUser();
		Thread.sleep(2000);
	}

	@When("^click on contune button$")
	public void click_on_contune_button() throws Throwable {
		EbaySignInActionsobj.clickButton();
		Thread.sleep(2000);
	}

	@When("^click on textbox and enter Password$")
	public void click_on_textbox_and_enter_Password() throws Throwable {
		EbaySignInActionsobj.sendPassword();
		Thread.sleep(2000);
	}

	@When("^click in Sign in button$")
	public void click_in_Sign_in_button() throws Throwable {
		EbaySignInActionsobj.click();
		Thread.sleep(2000);
	}

}
