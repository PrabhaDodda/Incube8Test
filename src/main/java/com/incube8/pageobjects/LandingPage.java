package com.incube8.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.incube8.commonfunctions.BaseFunctions;

public class LandingPage extends BaseFunctions{
	@FindBy(xpath="//div[@class='ipc-button__text']/span")
	private WebElement profileText;
	@FindBy(xpath="(//*[@class='ipc-icon ipc-icon--arrow-drop-down navbar__flyout__button-pointer'])[2]")
	private WebElement profileButton;
	@FindBy(xpath="//a[@class='ipc-list__item imdb-header-account-menu__sign-out']")
	private WebElement signOut;
	public LandingPage(WebDriver driver) {
	super(driver);
	}
	public String verifyProfile() {
		return profileText.getText();
	}
	public void clickSignOut() throws Throwable {
		clickElement(profileButton);
		clickElement(signOut);
	}
}
