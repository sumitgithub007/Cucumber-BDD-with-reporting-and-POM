package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.GoogleHomePageLocators;
import locators.SeleniumFunctions;
import utils.SeleniumDriver;

public class SearchMobilesGoogle {

	GoogleHomePageLocators googlehomepage = new GoogleHomePageLocators(SeleniumDriver.getDriver());
	SeleniumFunctions s = new SeleniumFunctions(SeleniumDriver.getDriver());

	@Given("I am on the Home Page {string} of Google")
	public void i_am_on_the_home_page_of_google(String url) {

		SeleniumDriver.openPage(url);

	}

	@When("I Enter {string} in Google search Box")
	public void i_enter_in_google_search_box(String text) {

		s.EnterText(googlehomepage.SearchBox, text);
		Assert.assertTrue(false);
	}

	@When("click on search Icon")
	public void click_on_search_icon() {

		s.SendEnter(googlehomepage.SearchBox);
		
	}

	@Then("Information Reated to mobiles will display")
	public void information_reated_to_mobiles_will_display() {

	}

}
