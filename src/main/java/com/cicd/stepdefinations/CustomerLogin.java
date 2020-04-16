package com.cicd.stepdefinations;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerLogin {

	@Given("^I navigate to banking portal$")
	public void i_navigate_to_banking_portal() throws Throwable {
		System.out.println("Pranav:I navigate to banking portal");
	}

	@When("^I click on Customer Login button$")
	public void i_click_on_Customer_Login_button() throws Throwable {
		System.out.println("Pranav:I click on Customer Login button");
	}

	@Then("^System displays Your Name dropdown$")
	public void system_displays_Your_Name_dropdown() throws Throwable {
		System.out.println("Pranav:System displays Your Name dropdown");
	}

	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
		System.out.println("Pranav:I am on login page");
	}

	/*
	 * @When("^I select valid username from the dropdown$") public void
	 * i_select_valid_username_from_the_dropdown(DataTable table) throws Throwable {
	 * 
	 * // For automatic transformation, change DataTable to one of //
	 * List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>. // E,K,V must be a
	 * scalar (String, Integer, Date, enum etc) List<List<String>> userNameList =
	 * table.raw();
	 * 
	 * System.out.println("User name selected is " + userNameList.get(0).get(0)); }
	 */

	@When("^I select \"([^\"]*)\" username from the dropdown$")
	public void i_select_username_from_the_dropdown(String arg1) throws Throwable {
		System.out.println("Pranav:I select \\\"([^\\\"]*)\\\" username from the dropdown");
		System.out.println("User name selected: " + arg1);

	}

	@When("^System displays Login button$")
	public void system_displays_Login_button() throws Throwable {
		System.out.println("Pranav:System displays Login button");
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
		System.out.println("Pranav:I click on Login button");
	}

	/*
	 * @Then("^System displays Welcome page$") public void
	 * system_displays_Welcome_page() throws Throwable {
	 * 
	 * }
	 */

	@Then("^Login is \"([^\"]*)\"$")
	public void login_is(String arg1) throws Throwable {
		System.out.println("Pranav:");
		System.out.println("Login type: " + arg1);
	}

}
