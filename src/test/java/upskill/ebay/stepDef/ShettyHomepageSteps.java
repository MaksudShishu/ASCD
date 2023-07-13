package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.ShettyHomepageaction;

public class ShettyHomepageSteps {
	
	ShettyHomepageaction ShettyHomepageactionobj=new ShettyHomepageaction();



	@Given("^Open Shetty Automation Practice page$")
	public void open_Shetty_Automation_Practice_page() throws Throwable {
	   
	}

	@When("^Enter the name click Allert$")
	public void enter_the_name_click_Allert() throws Throwable {
	ShettyHomepageactionobj.rahulSheety();
	}

	@Then("^Handle the pop-up with ok button$")
	public void handle_the_pop_up_with_ok_button() throws Throwable {
	ShettyHomepageactionobj.handleAlert(); 
	}
	@Then("^Enter the name Click confirm$")
	public void enter_the_name_Click_confirm() throws Throwable {
		ShettyHomepageactionobj.rahulSheety2();
	}


@Then("^Handle the pop-up with cancle button$")
public void handle_the_pop_up_with_cancle_button() throws Throwable {
	ShettyHomepageactionobj.handleAlert2();;
	}

 
}

