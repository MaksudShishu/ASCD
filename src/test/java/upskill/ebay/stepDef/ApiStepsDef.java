package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.api.restassured.ApiAction;

public class ApiStepsDef {
	ApiAction ApiActionobj=new ApiAction();

	@Given("^Create The pet$")
	public void create_The_pet() throws Throwable {
		ApiActionobj.createPet();
	}

	@Given("^Get the pet$")
	public void get_the_pet() throws Throwable {
		ApiActionobj.getPet();
	}

	@When("^Update the pet$")
	public void update_the_pet() throws Throwable {
		ApiActionobj.updatePet();
	}

	@Then("^Delete the pet$")
	public void delete_the_pet() throws Throwable {
		ApiActionobj.deletePet();
	}


}
