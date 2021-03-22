package com.groot.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeamPage {

	public WebElement teamsection(WebDriver driver){
		return driver.findElement(By.linkText("Team"));
	}
	
	public WebElement allowCookies(WebDriver driver){
		return driver.findElement(By.className("allow"));
	}
	public WebElement CTO(WebDriver driver){
	return driver.findElement(By.className("profile-one"));
}
	public WebElement CTOCO(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/div/div[1]/div[1]/img"));
	}
	public WebElement HR(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/div/div[1]/div[2]/img"));
	}
	public WebElement DR(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/div/div[1]/div[3]/img"));
	}
	public WebElement TL(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/div/div[1]/div[4]/img"));
	}
	public WebElement TestEngineers(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='root']/div/section[2]/div/div/div/div/div/div[4]/div[4]/h5"));
	}
	public List<WebElement> TestEngineer(WebDriver driver){
		return driver.findElements(By.linkText("Test Engineer"));
	}
	
}
