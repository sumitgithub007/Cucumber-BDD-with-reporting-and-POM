
package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class AfterActionsm {

	@AfterStep
	public static void tearDown(Scenario scenario) {

	   System.out.println("After run");
		WebDriver driver = SeleniumDriver.getDriver();
		//System.out.println(scenario.isFailed());
		/*if (scenario.isFailed())*/  
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		 
				scenario.attach(screenshotBytes,"image/png",scenario.getName());
 	
 		
		//*///SeleniumDriver.tearDown();
	}

}
