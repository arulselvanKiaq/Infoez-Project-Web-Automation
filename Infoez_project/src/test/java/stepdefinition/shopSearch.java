package stepdefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;

import baseclass.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.infoezPage;

public class shopSearch extends Base {
	infoezPage SS;
	@When("user launches the Application URL")
	public void user_launches_the_application_url() {
		SS= new infoezPage(driver);
		openUrl("https://d2mojgetgp5xie.cloudfront.net/search");	
		
	}


	@When("user enters the shop name {string} in search field without login")
	public void user_enters_the_shop_name_in_search_field_without_login(String shopName) {
	   SS.ShopSearchWL.sendKeys(shopName);
	}

	@When("user enters the city name {string} in search field without login")
	public void user_enters_the_city_name_in_search_field_without_login(String cityName) {
		SS.CitySearchWL.sendKeys(cityName);
	}

	@When("user click the search button in explore page")
	public void user_click_the_search_button_in_explore_page() {
	  click(SS.searchbtnWL);
	}

	@Then("see the related results in explore page")
	public void see_the_related_results_in_explore_page() {
		wait.until(ExpectedConditions.visibilityOf(SS.shopNameWL)); 
	    String name = SS.shopNameWL.getText();
	    System.out.println("Shop Name: "+name);
	}

}
