package stepdefinition;

import baseclass.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.infoezPage;

public class Pricing extends Base {
	infoezPage PP = new infoezPage(driver);  
	@When("user launches the Pricing Page Application URL")
	public void user_launches_the_pricing_page_application_url() {
	    openUrl("https://d2mojgetgp5xie.cloudfront.net/pricing");
	}

	@When("user click and subscribe the Free Plan and see the toasted message")
	public void user_click_and_subscribe_the_free_plan_and_see_the_toasted_message() {
		ElementWait(PP.FreePlan);
	    click(PP.FreePlan);
	}

	@When("user click and subscribe the starter Plan and see the toasted message")
	public void user_click_and_subscribe_the_starter_plan_and_see_the_toasted_message() {
		click(PP.StarterPlan);
	}

	@When("user click and subscribe the pro Plan and see the toasted message")
	public void user_click_and_subscribe_the_pro_plan_and_see_the_toasted_message() {
		click(PP.ProPlan);
	}

	@Then("user click and subscribe the Enterprise Plan and see the toasted message")
	public void user_click_and_subscribe_the_enterprise_plan_and_see_the_toasted_message() {
	    click(PP.EnterprisePlan);
	}

}
