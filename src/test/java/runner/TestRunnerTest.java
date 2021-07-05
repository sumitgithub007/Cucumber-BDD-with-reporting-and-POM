package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

//import com.cucumber.listener.ExtentCucumberFormatter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications=true,monochrome = true,dryRun=false,
features =
{"src/test/resources/feature/" },
		  plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		 
glue = {"stepDefinitions"} )    

public class TestRunnerTest {

 

}
