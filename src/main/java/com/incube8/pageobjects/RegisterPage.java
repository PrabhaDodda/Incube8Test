package com.incube8.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.incube8.commonfunctions.BaseFunctions;


public class RegisterPage extends BaseFunctions{
	@FindBy(xpath="//a[text()='Create a New Account']")
	private WebElement newAccount;
	@FindBy(xpath="//input[@id='ap_customer_name']")
	private WebElement name;
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='ap_password_check']")
	private WebElement passwordCheck;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	@FindBy(xpath="//div[@class='list-group']/a[1]")
	private WebElement loginImdb;
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement submit;
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	public void clickNewAccount() {
		try {
			clickElement(newAccount);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void registerUser(String name, String email, String password) {
		this.name.sendKeys(name);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		this.passwordCheck.sendKeys(password);
		try {
			clickElement(continueButton);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enterUserDetails(String email, String password) {
		this.email.sendKeys(email);
		this.password.sendKeys(password);
	}
	
	public void clickLoginImdb() {
		try {
			clickElement(loginImdb);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickSubmit() {
		try {
			clickElement(submit);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
