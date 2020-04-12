package com.incube8.commonfunctions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseFunctions {
	
	WebDriver driver=null;
	WebDriverWait wait;
	public BaseFunctions(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//This function waits for the element to be clickable and then click would be perform
	public void clickElement(WebElement e) throws Throwable{
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(e));
		e.click();
	}
	//This function waits for the page to completely load
	public void waitForThePageToLoad(WebDriver driver) {
		ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }};
       wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
	}

	//Function to load the required url
	public void openUrl(String url) {
		// TODO Auto-generated method stub
		driver.get(url);			
	}
	
	//Function to quit the browser
	public void browserclose()
	{
		driver.quit();
	}
}
