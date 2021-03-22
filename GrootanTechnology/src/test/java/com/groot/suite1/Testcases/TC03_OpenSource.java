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
import com.groot.PageObject.OpenSourcePage;
import com.groot.Utilities.ExcelSheet;

public class TC03_OpenSource extends BaseClass{
	
	
	@Test(priority = 0, description = "Testcase Three")
	  public void OpenSourceSection() throws IOException, AWTException,Exception, InterruptedException{ 
		ExcelSheet ret = new ExcelSheet();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		WebDriverWait wait = new WebDriverWait(driver,60);
		    driver.get(baseUrl);
		    OpenSourcePage OpenSOR = new OpenSourcePage();
		    OpenSOR.allowCookies(driver).click();
		    OpenSOR.OPSsection(driver).click();Thread.sleep(7000);
		    wait.until(ExpectedConditions.visibilityOfAllElements(OpenSOR.kweb(driver),
		    		OpenSOR.slack(driver)));
		    Shutterbug.shootPage(driver,ScrollStrategy.WHOLE_PAGE ,500,true).withName("OpenSourcePage").save("C:\\Users\\Senthilnathan\\workspace\\"
					+ "GrootanTechnology\\Screenshots\\Folder1");
			System.out.println(driver.getCurrentUrl());
			String ExpectedURL ="https://www.grootan.com/opensource";
			String ActualURL = (driver.getCurrentUrl()).trim();
			if (ExpectedURL == ActualURL)
			{
				Assert.assertTrue(true);
				ret.writefile("Pass",3,2,0);
			}
			else
			{
				Assert.assertFalse(false);
				ret.writefile("Fail",3,2,0);
			}
				
		  }
}
