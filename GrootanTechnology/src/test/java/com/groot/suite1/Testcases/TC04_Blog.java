package com.groot.suite1.Testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.groot.PageObject.BlogPage;
import com.groot.Utilities.ExcelSheet;

public class TC04_Blog extends BaseClass{
 
	@Test(priority = 0, description = "Testcase Four")
	  public void BlogSection() throws IOException, AWTException, Exception{ 
		ExcelSheet ret = new ExcelSheet();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		    driver.get(baseUrl);
		    BlogPage BlogOR = new BlogPage();
		    String oldTab = driver.getWindowHandle();
		    //Click Blog Section
		    BlogOR.blogsection(driver).click();
		    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		    newTab.remove(oldTab);
		    // change focus to new tab
		    driver.switchTo().window(newTab.get(0));
		    wait.until(ExpectedConditions.visibilityOfAllElements(BlogOR.HR(driver),
		    		BlogOR.QA(driver), BlogOR.TL(driver)));
		    TC04_Blog.takescreenshot("BlogPage", "Folder1");
		    String ActualURL = (driver.getCurrentUrl()).trim();
		    System.out.println("During :"+driver.getCurrentUrl());
		    // Do what you want here, you are in the new tab
		    driver.close();
		    // change focus back to old tab
		    driver.switchTo().window(oldTab);	   		    
			System.out.println("After :"+driver.getCurrentUrl());
			String ExpectedURL ="https://blog.grootan.com/";
			
			if (ExpectedURL == ActualURL)
			{
				Assert.assertTrue(true);
				ret.writefile("Pass",4,2,0);
			}
			else
			{
				Assert.assertFalse(false);
				ret.writefile("Fail",4,2,0);
			}
				
		  }
}
