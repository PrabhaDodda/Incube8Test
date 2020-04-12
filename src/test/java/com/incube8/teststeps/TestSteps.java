package com.incube8.teststeps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.incube8.commonfunctions.BaseFunctions;
import com.incube8.pageobjects.HomePage;
import com.incube8.pageobjects.LandingPage;
import com.incube8.pageobjects.RegisterPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TestSteps{
	BaseFunctions baseFunctions;
	HomePage homePage;
	LandingPage landingPage;
	RegisterPage registerPage;
	WebDriver driver;
	
	@Before
	public void BeforeScenario()
	{
		System.out.println("Start Scenario");
		
	}
	
	@After
	public void AfterScenario()
	{   baseFunctions.browserclose();
		System.out.println("End Scenario");
		System.out.println("------------------------------------------");
	}
	
	public void openBrowser(String browserName) {
			if(browserName.equals("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", (System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe"));	
				driver=new FirefoxDriver();
		
			}
			else if(browserName.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"));
				driver=new ChromeDriver();

			}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		baseFunctions = new BaseFunctions(driver);
		homePage = new HomePage(driver);
		registerPage = new RegisterPage(driver);
		landingPage = new LandingPage(driver);
	}
	
	@Given("^I open (.*) in (.*)$")
	public void iOpenUrlInBrowser(String url, String browserName) throws Throwable{
		openBrowser(browserName);
		baseFunctions.openUrl(url);
	}
	
	@When("I click Menu button")
	public void iClickMenuButton() throws Throwable{
		homePage.clickMenu();
	}
	
	@And("I select Top Rated Shows")
	public void iSelectTopRatedShows()throws Throwable{
		homePage.clickTopRatedShows();
	}
	
	@Then("the Top Rated Shows content is displayed")
	 public void theTopRatedShowsContentIsDisplayed() throws Throwable{
		homePage.verifyTopRatedShows();
	}

	@When("I do a Search using Game of thrones")
	public void iDoASearch() throws Throwable{
		baseFunctions.waitForThePageToLoad(driver);
		homePage.clickSearch();
		homePage.enterSearchText("Game of thrones");
	}
	@And("select term from suggestion list")
	public void selectTermFromSuggestionList() throws Throwable{
		homePage.clickSelectTerm();
	}
	@Then("Title, Rating and User reviews count are displayed")
	public void titleRatingAndUserReviewsCount() throws Throwable{
		String title = homePage.getTitle();
		Assert.assertEquals("Game of Thrones: The Last Watch (2019)", title);
		String rating = homePage.getRating();
		Assert.assertEquals("7.2",rating);
		String userReviews = homePage.getUserReviewCount();
		Assert.assertEquals("5,271", userReviews);
	}
	
	@When("I click SignIn")
	public void iClickSignIn() throws Throwable{
		homePage.clickSignIn();
	}
	
	@When("I click Create an Account")
	public void iClickCreateAnAccount()throws Throwable{
		registerPage.clickNewAccount();
	}
	
	@When("I provide (.*) (.*) (.*) and user registration successful")
	public void iProvideUserDetailsAndContinue(String name, String email, String password) throws Throwable{
		registerPage.registerUser(name, email, password);
		Assert.assertEquals(name, landingPage.verifyProfile());
	}

	@Then("I Logout and Login with (.*) (.*) successfully having profile (.*)")
	public void iLogoutAndLogin(String email, String password, String name) throws Throwable{
		landingPage.clickSignOut();
		homePage.clickSignIn();
		registerPage.clickLoginImdb();
		registerPage.enterUserDetails(email, password);
		registerPage.clickSubmit();
		Assert.assertEquals(name, landingPage.verifyProfile());
	}
}
