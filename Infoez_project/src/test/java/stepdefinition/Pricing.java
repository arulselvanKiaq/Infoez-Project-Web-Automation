package stepdefinition;

import baseclass.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.infoezPage;

public class Pricing extends Base {
	infoezPage PP;  
	@When("user launches the Pricing Page Application URL")
	public void user_launches_the_pricing_page_application_url() {
		BrowserLaunch();
		PP= new infoezPage(driver);
	    openUrl("https://d2mojgetgp5xie.cloudfront.net/pricing");
	}

	@When("user click and subscribe the Free Plan")
	public void user_click_and_subscribe_the_free_plan() {
		click(PP.FreePlan);
	}

	@When("user click and subscribe the starter Plan")
	public void user_click_and_subscribe_the_starter_plan() {
		click(PP.StarterPlan);
	}

	@When("user click and subscribe the pro Plan")
	public void user_click_and_subscribe_the_pro_plan() {
		click(PP.ProPlan);
	}

	@When("user click and subscribe the Enterprise Plan")
	public void user_click_and_subscribe_the_enterprise_plan() {
		  click(PP.EnterprisePlan);
	}

	@Then("see the toasted message")
	public void see_the_toasted_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
