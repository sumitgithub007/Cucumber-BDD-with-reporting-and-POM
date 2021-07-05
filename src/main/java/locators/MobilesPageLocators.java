package  locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MobilesPageLocators {

	
	
	
	@FindBy(how=How.XPATH,using="//div[@id='nav-subnav']/a[2]/span[1]")
	public WebElement Mobiles_Accessories;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='nav-subnav']/a[6]/span[1]")
	public WebElement Cameras;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='nav-subnav']/a[5]/span[1]")
	public WebElement Audio;
	
}
