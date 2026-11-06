package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.infoezPage;

public class BusinessAccount extends Base {
	infoezPage BA ; 
	
	@Given("user launches the Explore Page footer Application URL")
	public void user_launches_the_explore_page_footer_application_url() {
		BrowserLaunch();
		BA= new infoezPage(driver);
		openUrl("https://d2mojgetgp5xie.cloudfront.net/");
	}

	@When("user scrolls to the footer")
	public void user_scrolls_to_the_footer() {
		ScrollToBottom();
	}

	@When("user click the Add your business button")
	public void user_click_the_add_your_business_button() {
	    click(BA.AddBusinessBtn);
	}

	@When("user enters the Full name {string}")
	public void user_enters_the_full_name(String name) {
		wait.until(ExpectedConditions.visibilityOf(BA.fullName)); 
		sendkeys(BA.fullName,name );
	}

	@When("user enters the Email {string}")
	public void user_enters_the_email(String email) {
		sendkeys(BA.email,email );
	}

	@When("user enters the Phone {string}")
	public void user_enters_the_phone(String phone) {
		sendkeys(BA.phone,phone );
	}

	@When("user enters the Password {string}")
	public void user_enters_the_password(String password) {
		sendkeys(BA.password,password );
	}

	@When("user click an create account button")
	public void user_click_an_create_account_button() {
		 click(BA.submit);
	}

	@Then("user should see the {string}")
	public void user_should_see_the(String expectedMessage) {
		wait.until(ExpectedConditions.visibilityOf(BA.successfulMessage));
		String actualMessage = BA.successfulMessage.getText();
		Assert.assertEquals(expectedMessage,actualMessage);
	}




}
