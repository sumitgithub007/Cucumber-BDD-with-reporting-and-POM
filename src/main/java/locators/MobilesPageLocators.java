package  locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MobilesPageLocators {

	
	  public WebDriver driver ;	
      
	  public MobilesPageLocators(WebDriver driver)
      {
   	   this.driver=driver;
   	   PageFactory.initElements(this.driver,this );
      }
	
	
	
	
	@FindBy(how=How.XPATH,using="//div[@id='nav-subnav']/a[2]/span[1]")
	public WebElement Mobiles_Accessories;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='nav-subnav']/a[6]/span[1]")
	public WebElement Cameras;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='nav-subnav']/a[5]/span[1]")
	public WebElement Audio;
	
}
