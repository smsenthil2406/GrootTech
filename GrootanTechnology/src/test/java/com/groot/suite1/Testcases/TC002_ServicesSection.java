package com.groot.suite1.Testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.groot.PageObject.ServicesSectionPage;
import com.groot.Utilities.ExcelSheet;

public class TC002_ServicesSection extends BaseClass {

	@Test(priority = 0, description = "Testcase Two")
	public void ServicesSection() throws IOException, AWTException, Exception {
		ExcelSheet ret = new ExcelSheet();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		ServicesSectionPage SersecOR = new ServicesSectionPage();
		SersecOR.allowCookies(driver).click();
		SersecOR.servicessection(driver).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(SersecOR.fingerprint(driver), SersecOR.cloud(driver),
				SersecOR.webapp(driver)));
		Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE, 500, true).withName("ServicesPage")
				.save("C:\\Users\\Senthilnathan\\workspace\\" + "GrootanTechnology\\Screenshots\\Folder1");
		System.out.println(driver.getCurrentUrl());
		String ExpectedURL = "https://www.grootan.com/#built-tech";
		String ActualURL = (driver.getCurrentUrl()).trim();
		if (ExpectedURL == ActualURL) {
			Assert.assertTrue(true);
			ret.writefile("Pass",2,2,0);
		} else {
			Assert.assertFalse(false);
			ret.writefile("Fail",2,2,0);
			;
		}

	}
}
