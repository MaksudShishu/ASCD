package upskill.api.restassured;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;

public class ApiAction {

	public void createPet(){
		
		given().
			body(new File(System.getProperty("user.dir")+
					"src/test/resource/ApiReponseSchemas/CreateRequest.json")).
		when().
			header("Content-Type","application/json").
			header("Username","upskill").
			header("password","123").
			post("https://petstore.swagger.io/v2/pet").
		then().
			log().body().
		and().
			assertThat().statusCode(200).
		and().
			body(matchesJsonSchema(new File(System.getProperty("user.dir")+
					"src/test/resource/ApiRequestPayload/CreateResponce.json")));
		
		
	}
	public void getPet(){
		given().
		
	when().
		header("Content-Type","application/json").
		header("Username","upskill").
		header("password","123").
		get("https://petstore.swagger.io/v2/pet/100").
	then().
		log().body().
	and().
		assertThat().statusCode(200).
	and().
		body(matchesJsonSchema(new File(System.getProperty("user.dir")+
				"src/test/resource/ApiRequestPayload/GetResponce.json")));
	
	}
	
	
	public void updatePet(){
		given().
		body(new File(System.getProperty("user.dir")+
				"src/test/resource/ApiReponseSchemas/UpdateRequest.json")).
	when().
		header("Content-Type","application/json").
		header("Username","upskill").
		header("password","123").
		put("https://petstore.swagger.io/v2/pet").
	then().
		log().body().
	and().
		assertThat().statusCode(200).
	and().
		body(matchesJsonSchema(new File(System.getProperty("user.dir")+
				"src/test/resource/ApiRequestPayload/UpdateResponce.json")));
	
	}

	public void deletePet(){
		given().
		
	when().
		header("Content-Type","application/json").
		header("Username","upskill").
		header("password","123").
		delete("https://petstore.swagger.io/v2/pet/100").
	then().
		log().body().
	and().
		assertThat().statusCode(200).
	and().
		body(matchesJsonSchema(new File(System.getProperty("user.dir")+
				"src/test/resource/ApiRequestPayload/DeleteResponce.json")));
	
//GIT and gitHub	
	}
}
