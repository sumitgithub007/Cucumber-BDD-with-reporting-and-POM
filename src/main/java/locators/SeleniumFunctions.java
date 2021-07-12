package locators;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
 
public class SeleniumFunctions {

	
	public WebDriver driver;
	
	
	public SeleniumFunctions(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void ClickElement(WebElement element)
	{
		 element.click();
	
	}
	

	public void SendEnter(WebElement element)
	{
		element.sendKeys(Keys.ENTER);
	}
	
	
	
	public void ClearTextFromTextBox(WebElement element)
	{
		 element.clear();
	
	}
	
	public void EnterText(WebElement element,String text)
	{
	        element.sendKeys(text);
	}
	
	
	public void ValidateAnyTextAssertion(WebElement element,String expected)
	{
		Assert.assertEquals(element.getText().trim(), expected);
	}
	
	
	
	
	
	
	
	
	
}
