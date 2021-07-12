package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageLocators {

	
    public WebDriver driver ;	
    
    public AmazonHomePageLocators(WebDriver driver)
    {
 	   this.driver=driver;
 	   PageFactory.initElements(this.driver,this );
    }
	
    
    
 @FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
 public WebElement SignIn_Accounts_Lists;
	
    
	@FindBy(how=How.XPATH,using="//div[@id='nav-xshop']/a[2]")
	public WebElement Mobiles;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='nav-xshop']/a[3]")
	public WebElement Fashion;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='nav-xshop']/a[4]")
	public WebElement Electronics;
	
	
}
