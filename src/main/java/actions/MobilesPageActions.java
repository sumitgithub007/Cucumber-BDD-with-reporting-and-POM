package actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.support.PageFactory;

import  locators.MobilesPageLocators;
import utils.SeleniumDriver;

public class MobilesPageActions {

	MobilesPageLocators mobilespagelocators=null;
	
	
	public MobilesPageActions()
	{
		this.mobilespagelocators = new MobilesPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),this.mobilespagelocators);
		
	}
	
	public void validate_Electronics_Menu_Text(String ElectronicsMenu)
	{
		
 	 
		    String audio =mobilespagelocators.Audio.getText().trim();
		   String cameras =(mobilespagelocators.Cameras.getText().trim());
		   String accessories=(mobilespagelocators.Mobiles_Accessories.getText().trim());
		    
	   
	 
	}
	
	public void ValidateMenuText_HomePage()
	{
		
	}
	
	
}
