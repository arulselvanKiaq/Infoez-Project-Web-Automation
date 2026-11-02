package stepdefinition;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.infoezPage;

public class Search extends Base {
	infoezPage SP = new infoezPage(driver); 
	
	
	
	
	
	@When("user click the customer credentials")
	public void user_click_the_customer_credentials() {
		ElementWait(SP.Customeridpassword);
	    click(SP.Customeridpassword);
	}
	@When("user click the login btn")
	public void user_click_the_login_btn() {
		ElementWait(SP.loginbtn);
	    click(SP.loginbtn);
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
