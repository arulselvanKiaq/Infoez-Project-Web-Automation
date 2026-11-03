package stepdefinition;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.infoezPage;

public class Search extends Base {
	infoezPage SP = new infoezPage(driver); 
	
			
	
	@When("user launches the login Page Application URL")
	public void user_launches_the_login_page_application_url() {
		openUrl("https://d2mojgetgp5xie.cloudfront.net/");
	}


	@When("user enters the shop name in search field")
	public void user_enters_the_shop_name_in_search_field() {
		ElementWait(SP.ShopSearch);
		sendkeys(SP.ShopSearch, "Iron Peak gym");
		
	}

	@When("user enters the city name in search field")
	public void user_enters_the_city_name_in_search_field() {
		sendkeys(SP.CitySearch, "Bengaluru");
	}

	@When("user click the search button")
	public void user_click_the_search_button() {
	    click(SP.searchbtn);
	}

	@Then("see the related results")
	public void see_the_related_results() {
		ElementWait(SP.shopName);
	    String name = SP.shopName.getText();
	    System.out.println("Shop Name: "+name);
	}
}
