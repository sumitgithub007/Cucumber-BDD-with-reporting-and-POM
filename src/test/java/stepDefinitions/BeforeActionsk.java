
package stepDefinitions;

 
import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActionsk {

	@Before
	public  void setUp() {
		// ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		System.out.println("Before");
		 SeleniumDriver.setUpDriver();
	}
}
