package com.groot.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPage {

	public WebElement blogsection(WebDriver driver){
		return driver.findElement(By.linkText("Blog"));
	}
	
	public WebElement allowCookies(WebDriver driver){
		return driver.findElement(By.className("allow"));
	}
	
	public WebElement HR(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div/div[1]/div/div/section/div/div/div/div[2]/article/div[2]/ul/li[2]/img"));
	}
	public WebElement QA(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div/div[1]/div/div/section/div/div/div/div[3]/article/div[2]/ul/li[2]/img"));
	}
	public WebElement TL(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div/div[1]/div/div/section/div/div/div/div[4]/article/div[2]/ul/li[2]/img"));
	}
	
	
}
