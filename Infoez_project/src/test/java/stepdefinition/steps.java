package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.infoezPage;

public class steps extends Base {
	infoezPage ip ; 
	@Given("user launches the Register page Application URL")
		public void user_launches_the_application_url() {
		BrowserLaunch();
		 ip= new infoezPage(driver);
			openUrl("https://d2mojgetgp5xie.cloudfront.net/");
		}
		
		@Given("user click the sigin button")
		public void user_click_the_sigin_button() {
		    click(ip.signin);
		}
		
		@Given("user click the create one link")
		public void user_click_the_create_one_link() {
			click(ip.createone);
		}

		@When("user enters Full name {string}")
		public void user_enters_full_name(String name) {
			wait.until(ExpectedConditions.visibilityOf(ip.fullName)); 
			sendkeys(ip.fullName,name );
		}

		@When("user enters Email {string}")
		public void user_enters_email(String email) {
			sendkeys(ip.email,email );
		}

		@When("user enters Phone {string}")
		public void user_enters_phone(String phone) {
			sendkeys(ip.phone,phone );
		}

		@When("user enters Password {string}")
		public void user_enters_password(String password) {
			sendkeys(ip.password,password );
		}

		@When("user click the create account button")
		public void user_click_the_create_account_button() {
		    click(ip.submit);
		}

		@Then("user should see {string}")
		public void user_should_see(String expectedMessage) {
			ElementWait(ip.successfulMessage);
			String actualMessage = ip.successfulMessage.getText();
			Assert.assertEquals(expectedMessage,actualMessage);
		}
		
}
