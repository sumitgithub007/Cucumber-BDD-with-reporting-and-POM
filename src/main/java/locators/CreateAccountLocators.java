package  locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;

public class CreateAccountLocators {

       public WebDriver driver ;	
       
       public CreateAccountLocators(WebDriver driver)
       {
    	   this.driver=driver;
    	   PageFactory.initElements(this.driver,this );
       }
	
       
       
    @FindBy(xpath="//div[@class='a-box-inner']/h1")
    public WebElement CreateAccountLabel;
    
    @FindBy(xpath="//div[@class='a-box-inner']/div[1]/input")
    public WebElement YourName;
	
    @FindBy(xpath="//input[@type='tel']")
    public WebElement MobileNumber;
    
    @FindBy(xpath="//input[@type='email']")
    public WebElement Email;
    
    @FindBy(xpath="//span[@id='auth-continue']")
    public WebElement ContinueButton;
    
    @FindBy(xpath="(//div[@class='a-alert-content'])[12]")
    public WebElement ErrorMessagePassword;
    
    
    
    
    
    
    
    
    
     
    
  
    
}
