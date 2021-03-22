package com.groot.suite1.Testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.groot.PageObject.CareersPage;
import com.groot.Utilities.ExcelSheet;

public class TC06_Careers extends BaseClass {
	@Test(priority = 0, description = "Open the Careers page and take the whole screenshot")
	public void CareersSection() throws IOException,Exception, AWTException, InterruptedException {
		ExcelSheet ret = new ExcelSheet();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		CareersPage CareersOR = new CareersPage();
		CareersOR.allowCookies(driver).click();
		CareersOR.careerssection(driver).click();
		// <-Take the whole page screenshot->
		Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE, 500, true).withName("CareersPage")
				.save("C:\\Users\\Senthilnathan\\workspace\\" + "GrootanTechnology\\Screenshots\\Folder1");
		System.out.println(driver.getCurrentUrl());
		String ExpectedURL = "https://www.grootan.com/careers";
		String ActualURL = (driver.getCurrentUrl()).trim();
		// <-Validation start here->
		if (ExpectedURL == ActualURL) {
			Assert.assertTrue(true);
			ret.writefile("Pass",6,2,0);
		} else {
			Assert.assertFalse(false);
			ret.writefile("Fail",6,2,0);
		}
	}
}