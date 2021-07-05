package  locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonHomePageLocators {

	@FindBy(how=How.XPATH,using="//div[@id='nav-xshop']/a[2]")
	public WebElement Mobiles;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='nav-xshop']/a[3]")
	public WebElement Fashion;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='nav-xshop']/a[4]")
	public WebElement Electronics;
	
}
