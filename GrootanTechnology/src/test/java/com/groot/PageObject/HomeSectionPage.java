package com.groot.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeSectionPage {

	public WebElement homesection(WebDriver driver){
		return driver.findElement(By.linkText("Home"));
	}
	
	public WebElement allowCookies(WebDriver driver){
		return driver.findElement(By.className("allow"));
	}
}
