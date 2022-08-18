package com.cucumber.demo.stepDefinitions;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ProductDefs{
	
	@LocalServerPort
	private int port;
	
	
	@When("^customer calls the product with id 22$")
    public void customer_calls_the_product_with_id_22() throws Throwable {
    System.out.println("Pass");
    }

    @Then("^the customer recieves status code of 200$")
    public void the_customer_recieves_status_code_of_200() throws Throwable {
    	 System.out.println("Pass");
    }

    @And("^the response should contain:$")
    public void the_response_should_contain() throws Throwable {
    	 System.out.println("Pass");
    }

}
