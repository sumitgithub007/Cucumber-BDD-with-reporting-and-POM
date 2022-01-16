package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.AmazonHomePageLocators;
import locators.CreateAccountLocators;
import locators.SeleniumFunctions;
import locators.SignInPageLocator;
import utils.SeleniumDriver;

public class CreateAccountSteps {

	AmazonHomePageLocators amazonHome = new AmazonHomePageLocators(SeleniumDriver.getDriver()) ;
	SeleniumFunctions seleniumfunction = new  SeleniumFunctions(SeleniumDriver.getDriver());
	SignInPageLocator signinlocator = new SignInPageLocator(SeleniumDriver.getDriver());
	CreateAccountLocators createAccount = new CreateAccountLocators(SeleniumDriver.getDriver());
	
	
	@Given("I am on the Home Page {string} of Amazon Website")
	public void i_am_on_the_home_page_of_amazon_website(String websiteurl/*List<String> menus*/){
 
	 
		SeleniumDriver.openPage(websiteurl);
	   
	}
	
	
	
	
	@When("I click on Hello Sign In Accounts & List")
	public void i_click_on_hello_sign_in_accounts_list() {
	  
		seleniumfunction.ClickElement(amazonHome.SignIn_Accounts_Lists);
		
}
	@Then("{string} page displays")
	public void sign_in_page_displays(String signInText) {
	   
		seleniumfunction.ValidateAnyTextAssertion(signinlocator.SignI_Label, signInText);
		
	}
	@Then("I click on create Your Amazon Account Button")
	public void i_click_on_create_your_amazon_account_button() {
	   
		seleniumfunction.ClickElement(signinlocator.CreateYourAmazonAccountButton);
	}
	@Then("I will land on {string} page")
	public void i_will_land_on_create_account_page(String createaccountText) {
	   
		//seleniumfunction.ValidateAnyTextAssertion(createAccount.CreateAccountLabel, createaccountText);
		
		
	}
	@Then("I will enter {string} , {string} , {string}")
	public void i_will_enter(String name, String phone, String email) {
	   
		//First clear text if any
		seleniumfunction.ClearTextFromTextBox(createAccount.YourName);
		seleniumfunction.ClearTextFromTextBox(createAccount.MobileNumber);
		seleniumfunction.ClearTextFromTextBox(createAccount.Email);
		
		
		
		seleniumfunction.EnterText(createAccount.YourName, name);

		seleniumfunction.EnterText(createAccount.MobileNumber, phone);
		

		seleniumfunction.EnterText(createAccount.Email, email);
		
		
	}
	@Then("I will click on continue Button")
	public void i_will_click_on_continue_button() {
		

		seleniumfunction.ClickElement(createAccount.ContinueButton);
		
		
	     
	}
	@Then("A message {string} will be displayed to user")
	public void a_message_will_be_displayed_to_user(String errormessage) throws InterruptedException {
	     
		
		Thread.sleep(1000);
		seleniumfunction.ValidateAnyTextAssertion(createAccount.ErrorMessagePassword, errormessage);	
		
		
	}



	
}
