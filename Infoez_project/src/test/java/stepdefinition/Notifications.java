package stepdefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;

import baseclass.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.infoezPage;

public class Notifications extends Base {
	infoezPage NP ; 
	@When("user launches the notification Page Application URL")
	public void user_launches_the_notification_page_application_url() {
		
		NP= new infoezPage(driver);
		openUrl("https://d2mojgetgp5xie.cloudfront.net/");
	}
	@When("user click the sigin using customer credentials")
	public void user_click_the_sigin_using_customer_credentials() {
	  click(NP.signin);
	  click(NP.Customeridpassword);
	  click(NP.submit);
	}

	@When("user click the customer profile")
	public void user_click_the_customer_profile() {
		wait.until(ExpectedConditions.visibilityOf(NP.customerProfile)); 
		 click(NP.customerProfile);
	}

	@When("user click the notifications")
	public void user_click_the_notifications() {
	    click(NP.notifications);
	}

	@Then("user click the mark all read button")
	public void user_click_the_mark_all_read_button() {
	  click(NP.MarkAllReadBtn);
	}

}
