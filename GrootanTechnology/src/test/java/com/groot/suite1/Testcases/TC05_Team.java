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
import com.groot.PageObject.TeamPage;
import com.groot.Utilities.ExcelSheet;


public class TC05_Team extends BaseClass{
	TeamPage TeamOR = new TeamPage();	
	
	@Test(priority = 0, description = "Testcase Five-0")
	  public void ServicesSection() throws IOException, AWTException,Exception, InterruptedException{ 
		ExcelSheet ret = new ExcelSheet();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		WebDriverWait wait = new WebDriverWait(driver,60);
		    driver.get(baseUrl);
		    TeamPage TeamOR = new TeamPage();	
		    TeamOR.allowCookies(driver).click();
		    TeamOR.teamsection(driver).click();
		    Thread.sleep(9000);
		    wait.until(ExpectedConditions.visibilityOfAllElements(TeamOR.HR(driver),
		    		TeamOR.DR(driver), TeamOR.CTOCO(driver),TeamOR.TL(driver)));
		    Shutterbug.shootPage(driver,ScrollStrategy.WHOLE_PAGE ,500,true).withName("TeamPage").save("C:\\Users\\Senthilnathan\\workspace\\"
					+ "GrootanTechnology\\Screenshots\\Folder1");
			System.out.println(driver.getCurrentUrl());
			String ExpectedURL ="https://www.grootan.com/team";
			String ActualURL = (driver.getCurrentUrl()).trim();
			if (ExpectedURL == ActualURL)
			{
				Assert.assertTrue(true);
				ret.writefile("Pass",5,2,0);
			}
			else
			{
				Assert.assertFalse(false);
				ret.writefile("Fail",5,2,0);
			}
				
		  }
}
