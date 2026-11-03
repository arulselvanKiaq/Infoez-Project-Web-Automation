package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class infoezPage {
	WebDriver driver;
	public infoezPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@data-testid='header-signin-btn']")
	public WebElement signin;
	@FindBy(xpath = "//button[@data-testid='login-submit-btn']")
	public WebElement loginbtn;
	@FindBy(xpath = "//a[@href='/register']")
	public WebElement createone;
	@FindBy(xpath = "//button[@data-testid='quick-customer']")
	public WebElement Customeridpassword;
	@FindBy(xpath = "//input[@data-testid='register-name']")
	public WebElement fullName;
	@FindBy(xpath = "//input[@type='email']")
	public WebElement email;
	@FindBy(xpath = "//input[@data-testid='register-phone']")
	public WebElement phone;
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;
	@FindBy(xpath="//*[contains(text(),'Welcome to Infoez')]")
	public WebElement successfulMessage;
	
	@FindBy(xpath = "//input[@data-testid='hero-search-query']")
	public WebElement ShopSearch;
	@FindBy(xpath = "//input[@data-testid='hero-search-location']")
	public WebElement CitySearch;
	@FindBy(xpath = "//button[@data-testid='hero-search-submit']")
	public WebElement searchbtn;
	@FindBy(xpath = "//h3")
	public WebElement shopName;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/aside/div[2]/div[1]/button/svg")
	public WebElement categorydrpdwn;
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/aside/div[2]/div[2]/button/svg")
	public WebElement sortbydrpdwn;
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/aside/div[2]/div[3]/button/svg")
	public WebElement ratingdrpdwn;
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/aside/div[2]/label/input")
	public WebElement verifiedcheckbox;
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/aside/div[2]/div[1]/button")
	public WebElement restaurants;
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/aside/div[2]/div[2]/button")
	public WebElement toprated;
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/aside/div[2]/div[3]/button")
	public WebElement ratings;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/section[3]/div/div[2]/a[1]/div[2]/div[1]/h3")
	public WebElement Businesscard;
	@FindBy(xpath = "//*[@id=\"radix-:rf3:-content-reviews\"]/div[1]/button")
	public WebElement review;
	@FindBy(xpath = "//*[@id=\"radix-:rf7:\"]/div[2]/div[2]/textarea")
	public WebElement reviewsection;
	@FindBy(xpath = "//*[@id=\"radix-:rf7:\"]/div[3]/button")
	public WebElement postreviewbtn;
	
	
}

