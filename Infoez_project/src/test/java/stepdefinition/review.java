package stepdefinition;

import baseclass.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.infoezPage;

public class review extends Base {
	infoezPage BP;  
	@When("user launches the Home Page Application URL")
	public void user_launches_the_home_page_application_url() {
		BrowserLaunch();
		BP= new infoezPage(driver);
	    openUrl("https://d2mojgetgp5xie.cloudfront.net/");
	}

	@When("user click the Businesses")
	public void user_click_the_businesses() {
	   
	    click(BP.Businesscard);
	}

	@When("user click the write a review")
	public void user_click_the_write_a_review() {
	   
	   click(BP.review);
	}

	@When("user enter the reviews in comment section")
	public void user_enter_the_reviews_in_comment_section() {
	    
	    sendkeys(BP.reviewsection,"Good Atmosphere");
	}

	@Then("user click the post review button and then see results")
	public void user_click_the_post_review_button_and_then_see_results() {
		 click(BP.postreviewbtn);
	}
	
}