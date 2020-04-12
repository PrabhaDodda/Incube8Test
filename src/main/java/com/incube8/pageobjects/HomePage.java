package com.incube8.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.incube8.commonfunctions.BaseFunctions;

public class HomePage extends BaseFunctions{
	@FindBy(xpath="//div[contains(text(),'Menu')]")
	private WebElement menu;
	@FindBy(xpath="//a[@href='/chart/toptv/?ref_=nv_tvv_250']")
	private WebElement topRatedShows;
	@FindBy(xpath="//h1[contains(text(),'Top Rated TV Shows')]")
	private WebElement topRatedShowsTitle;
	@FindBy(xpath="//input[@placeholder='Search IMDb']")
	private WebElement search;
	@FindBy(xpath="//ul[@class='react-autosuggest__suggestions-list anim-enter-done']")
	private WebElement suggestionsList;
	@FindBy(xpath="//li/a/div/div/img[@alt='Game of Thrones: The Last Watch']")
	private WebElement selectTerm;
	@FindBy(xpath="//div[@class='title_wrapper']/h1")
	private WebElement title;
	@FindBy(xpath="//div[@class='ratingValue']/strong/span")
	private WebElement rating;
	@FindBy(xpath="//span[@itemprop='ratingCount']")
	private WebElement ratingCount;
	@FindBy(xpath="//div[text()='Sign In']")
	private WebElement signIn;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickMenu() {
		try {
			clickElement(menu);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickTopRatedShows() {
		try {
			clickElement(topRatedShows);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void verifyTopRatedShows() {
		topRatedShowsTitle.isDisplayed();
	}
	
	public void enterSearchText(String searchTerm) {
		search.sendKeys(searchTerm);
	}
	
	public void clickSearch() {
		try {
			clickElement(search);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickSelectTerm() {
		try {
			clickElement(selectTerm);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getTitle() {
		return title.getText();
	}
	public String getRating() {
		return rating.getText();
	}
	public String getUserReviewCount() {
		return ratingCount.getText();
	}
	
	public void clickSignIn() {
		try {
			clickElement(signIn);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
