package stepdefinition;

import org.junit.Assert;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.infoezPage;

public class steps extends Base {
	infoezPage ip = new infoezPage(driver); 
	@Given("user launches the Register page Application URL")
		public void user_launches_the_application_url() {
			openUrl("https://d2mojgetgp5xie.cloudfront.net/");
		}
		
		@Given("user click the sigin button")
		public void user_click_the_sigin_button() {
		    click(ip.signin);
		}
		
		@Given("user click the create one link")
		public void user_click_the_create_one_link() {
			ElementWait(ip.createone);
			click(ip.createone);
		}

		@When("user enter the valid credentials in all input fields")
		public void user_enter_the_valid_credentials_in_all_input_fields() {
			ElementWait(ip.fullName);
			sendkeys(ip.fullName, "Gowthami");
			sendkeys(ip.email, "gowtham234@gmail.com");
			sendkeys(ip.phone, "8764678234");
			sendkeys(ip.password, "gowthami@123");
		}


		@Then("user click the create account button and registered successfully")
		public void user_click_the_create_account_button_and_registered_successfully() {
			ElementWait(ip.submit);
			click(ip.submit);
		}

		@When("user enters Full name {string}")
		public void user_enters_full_name(String name) {
			ElementWait(ip.fullName);
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
			ElementWait(ip.submit);
		    click(ip.submit);
		}

		@Then("user should see {string}")
		public void user_should_see(String expectedMessage) {
			ElementWait(ip.successfulMessage);
			String actualMessage = ip.successfulMessage.getText();
			Assert.assertEquals(expectedMessage,actualMessage);
		}
		
}
