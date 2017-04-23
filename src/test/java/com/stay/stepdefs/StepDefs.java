package com.stay.stepdefs;



import org.junit.Assert;

import com.stay.pageobjects.HomePage;

import com.stay.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
	
	@When("^I run this$")
	public void i_run_this() throws Throwable {
	    Driver.getInstance().get("https://www.google.com/");
	}

	@Then("^it should pass$")
	public void it_should_pass() throws Throwable {
	    HomePage home=new HomePage();
	    home.search.sendKeys("smth");
	    Assert.assertTrue(Driver.getInstance().getTitle().contains("Google"));
	}

}
