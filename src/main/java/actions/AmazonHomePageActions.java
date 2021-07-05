package actions;

import org.openqa.selenium.support.PageFactory;

import locators.AmazonHomePageLocators;
import utils.SeleniumDriver;

public class AmazonHomePageActions {

	AmazonHomePageLocators amazonhomepagelocators=null;
	
	
	public AmazonHomePageActions()
	{
		this.amazonhomepagelocators = new AmazonHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),this.amazonhomepagelocators);
		
	}
	
	public void clickMobilesMenu()
	{
		amazonhomepagelocators.Mobiles.click();
	}
	
	public void ValidateMenuText_HomePage()
	{
		
	}
	
	
}
