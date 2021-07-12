package stepDefinitions;

import java.io.IOException;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.AmazonHomePageLocators;
import locators.CreateAccountLocators;
import locators.SeleniumFunctions;
import locators.SignInPageLocator;
import utils.ExcelReaderFile;
import utils.SeleniumDriver;

public class CreateAccountExcelSteps {


	AmazonHomePageLocators amazonHome = new AmazonHomePageLocators(SeleniumDriver.getDriver()) ;
	SeleniumFunctions seleniumfunction = new  SeleniumFunctions(SeleniumDriver.getDriver());
	SignInPageLocator signinlocator = new SignInPageLocator(SeleniumDriver.getDriver());
	CreateAccountLocators createAccount = new CreateAccountLocators(SeleniumDriver.getDriver());
	
	
	
	
	
	@Given("I am on the Home Page {string} of Amazon Website excel")
	public void i_am_on_the_home_page_of_amazon_website_excel(String websiteurl) {
	

		SeleniumDriver.openPage(websiteurl);

		 
		
	}

	@When("I click on Hello Sign In Accounts & List excel")
	public void i_click_on_hello_sign_in_accounts_list_excel() {
	
		seleniumfunction.ClickElement(amazonHome.SignIn_Accounts_Lists);
		
	}

	@Then("{string} page displays excel")
	public void page_displays_excel(String signInText) {
		
		
		seleniumfunction.ValidateAnyTextAssertion(signinlocator.SignI_Label, signInText);
	}

	@Then("I click on create Your Amazon Account Button excel")
	public void i_click_on_create_your_amazon_account_button_excel() {
	
		seleniumfunction.ClickElement(signinlocator.CreateYourAmazonAccountButton);
	
	
	}

	@Then("I will land on {string} page excel")
	public void i_will_land_on_page_excel(String string) {

		seleniumfunction.ValidateAnyTextAssertion(createAccount.CreateAccountLabel, string);
		
	}

	@Then("I will enter details from {string} and {int}")
	public void i_will_enter_details_from_and_row_number(String string,int rownumber) throws IOException {
	
		seleniumfunction.ClearTextFromTextBox(createAccount.YourName);
		seleniumfunction.ClearTextFromTextBox(createAccount.MobileNumber);
		seleniumfunction.ClearTextFromTextBox(createAccount.Email);
		
		String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\DataAccount.xlsx";
		
		
		ExcelReaderFile f = new ExcelReaderFile();
         List<String> alist = f.getData(filepath,"Sheet1",rownumber);
		 System.out.println(alist);
		 
			/*
			 * System.out.println("-----------------------"); for (int i = 0; i <
			 * alist.size(); i++) {
			 */
	            //System.out.println(alist.get(i) + " ");     
	      
	            seleniumfunction.EnterText(createAccount.YourName, alist.get(0));

	    		seleniumfunction.EnterText(createAccount.MobileNumber, alist.get(1));
	    		

	    		seleniumfunction.EnterText(createAccount.Email, alist.get(2)); 
	            
	            
	            
				/*
				 * }
				 * 
				 * System.out.println("--------------------------");
				 */
		

	
		
		
		
		
		
	
	}

	@Then("I will click on continue Button excel")
	public void i_will_click_on_continue_button_excel() {

		seleniumfunction.ClickElement(createAccount.ContinueButton);
		
	}

	@Then("A message {string} will be displayed to user excel")
	public void a_message_will_be_displayed_to_user_excel(String errormessage) throws InterruptedException {

		Thread.sleep(1000);
		seleniumfunction.ValidateAnyTextAssertion(createAccount.ErrorMessagePassword, errormessage);	
		
		
	}

}
