package stepdefinition;



import baseclass.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.infoezPage;

public class Filter extends Base {
	infoezPage FP ;
	@When("user launches the Explore Page Application URL")
	public void user_launches_the_explore_page_application_url() {
		BrowserLaunch();
		FP= new infoezPage(driver);
		openUrl("https://d2mojgetgp5xie.cloudfront.net/search");
	}

	@When("user click the category and select")
	public void user_click_the_category_and_select() {
		
		click(FP.categorydrpdwn); 
		click(FP.restaurants); 
		
	}

	@When("user click the Sortby and select")
	public void user_click_the_sortby_and_select() {
		click(FP.sortbydrpdwn);
		click(FP.toprated);
	}

	@When("user click the Min rating and select")
	public void user_click_the_min_rating_and_select() {
	    click(FP.ratingdrpdwn);
	    click(FP.ratings);
	}

	@Then("user click the verified only and see the results")
	public void user_click_the_verified_only_and_see_the_results() {
	    click(FP.verifiedcheckbox);
	}
}
