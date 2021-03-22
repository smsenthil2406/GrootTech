package com.groot.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUSPage {

	public WebElement contactussection(WebDriver driver){
		return driver.findElement(By.linkText("Contact Us"));
	}
	
	public WebElement allowCookies(WebDriver driver){
		return driver.findElement(By.className("allow"));
	}
	
}
