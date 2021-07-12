package runner;

 
import org.junit.runner.RunWith;

//import com.cucumber.listener.ExtentCucumberFormatter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications=true,tags="@createAccountonAmazonUsingExcel or @createAccountonAmazon or @Search-Mobiles-Google",monochrome = true,dryRun=false,
features =
{"src/test/resources/feature/" },
		  plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		 
glue = {"stepDefinitions"} )    

public class TestRunnerTest {

 

}
