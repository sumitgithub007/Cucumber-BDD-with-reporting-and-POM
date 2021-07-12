package  locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;

public class SignInPageLocator {

       public WebDriver driver ;	
       
       public SignInPageLocator(WebDriver driver)
       {
    	   this.driver=driver;
    	   PageFactory.initElements(this.driver,this );
       }
	
       
       
    @FindBy(xpath="//h1[@class='a-spacing-small']")
    public WebElement SignI_Label;
	
    @FindBy(xpath="//a[@id='createAccountSubmit']")
    public WebElement CreateYourAmazonAccountButton;
	
    
  
    
}
