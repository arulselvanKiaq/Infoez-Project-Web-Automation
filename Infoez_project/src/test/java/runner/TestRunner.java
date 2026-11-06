package runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import baseclass.Base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/feature/Business account.feature",
glue = "BusinessAccount",
 
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
 
public class TestRunner extends Base {
 
@BeforeClass
 
public static void Startup() {
BrowserLaunch();
maximize();

}
 
@AfterClass
public static void end() {
driver.quit();
}}