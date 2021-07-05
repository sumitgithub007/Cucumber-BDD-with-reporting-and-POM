package stepDefinitions;

import java.util.List;

import org.junit.Assert;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import  actions.AmazonHomePageActions;
import utils.SeleniumDriver;

public class SearchMobilesSteps {

	AmazonHomePageActions amazonhomepageactions = new AmazonHomePageActions();
	
	
	@Given("I am on the Home Page {string} of Amazon Website")
	public void i_am_on_the_home_page_of_amazon_website(String websiteurl/*List<String> menus*/){
 
		//before hook not r 
		SeleniumDriver.openPage(websiteurl);
	  // Assert.assertTrue(false);
	}
	
	 

	@When("I click on Mobiles section on flipkart")
	public void i_click_on_mobiles_section_on_flipkart() {

		//amazonhomepageactions.clickMobilesMenu();
		
		SeleniumDriver.openPage("https://mvnrepository.com/artifact/org.testng/testng/7.4.0");
		
	}

	@Then("The Electronics section is displayed having following items")
	public void the_electronics_section_is_displayed_having_following_items() {

	}

}
