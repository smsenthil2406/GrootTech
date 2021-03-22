package com.groot.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareersPage {

	public WebElement careerssection(WebDriver driver){
		return driver.findElement(By.linkText("Careers"));
	}
	
	public WebElement allowCookies(WebDriver driver){
		return driver.findElement(By.className("allow"));
	}
	public WebElement CTOCO(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/div/div[1]/div[1]/img"));
	}
	
	
}
