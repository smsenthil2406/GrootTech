package com.groot.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServicesSectionPage {

	public WebElement servicessection(WebDriver driver){
		return driver.findElement(By.linkText("Services"));
	}
	
	public WebElement allowCookies(WebDriver driver){
		return driver.findElement(By.className("allow"));
	}
	public WebElement fingerprint(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[1]/div/main/section[1]/div[2]/div[2]/div[1]/div"));
	}
	public WebElement cloud(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[1]/div/main/section[1]/div[2]/div[2]/div[2]/div"));
	}
	public WebElement webapp(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[1]/div/main/section[1]/div[2]/div[2]/div[3]/div"));
	}
}
