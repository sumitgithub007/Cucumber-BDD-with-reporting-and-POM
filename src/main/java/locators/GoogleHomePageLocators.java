package  locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageLocators {

       public WebDriver driver ;	
       
       public GoogleHomePageLocators(WebDriver driver)
       {
    	   this.driver=driver;
    	   PageFactory.initElements(this.driver,this );
       }
	
       
       
    @FindBy(xpath="//input[@title='Search']")
    public WebElement SearchBox;
	 
      
  
	
}
