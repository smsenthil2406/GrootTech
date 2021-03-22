package com.groot.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenSourcePage {
	public WebElement OPSsection(WebDriver driver){
		return driver.findElement(By.linkText("Open Source"));
	}
	
	public WebElement allowCookies(WebDriver driver){
		return driver.findElement(By.className("allow"));
	}
	public WebElement kweb(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div[1]/div/div/div/a/div[1]/img"));
	}
	public WebElement slack(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div[2]/div/div/div/a/div[1]/img"));
	}
	
}
