package runner;


import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/feature/search.feature",
glue = {"stepdefinition","Hooks"},
 
dryRun = false,
 
//tags = "@InvalidRegister",
 
plugin = {
 
"pretty",
 
"html:target/CucumberReport.html",
 
"json:target/Cucumber.json",
 
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
 
},

monochrome = true
 
)
public class TestRunner{
}



	
	