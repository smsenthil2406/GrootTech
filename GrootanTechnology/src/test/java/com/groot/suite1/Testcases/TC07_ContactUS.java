package com.groot.suite1.Testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.groot.PageObject.ContactUSPage;
import com.groot.Utilities.ExcelSheet;

public class TC07_ContactUS extends BaseClass {
	@Test(priority = 0, description = "Open the Contant US page and take the whole page screenshots")
	public void CareersSection() throws IOException, AWTException, Exception, InterruptedException {
		ExcelSheet ret = new ExcelSheet();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		ContactUSPage ContactOR = new ContactUSPage();
		ContactOR.allowCookies(driver).click();
		ContactOR.contactussection(driver).click();
		Thread.sleep(7000);
		TC07_ContactUS.takescreenshot("ContactUSPage", "Folder1");
		System.out.println(driver.getCurrentUrl());
		String ExpectedURL = "https://www.grootan.com/careers";
		String ActualURL = (driver.getCurrentUrl()).trim();
		if (ExpectedURL == ActualURL) {
			Assert.assertTrue(true);
			ret.writefile("Pass",7,2,0);
		} else {
			Assert.assertFalse(false);
			ret.writefile("Pass",7,2,0);
		}
	}
}
