package com.groot.suite1.Testcases;

import java.awt.AWTException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.groot.PageObject.HomeSectionPage;

public class TC001_HomeSection extends BaseClass {

	// String screenshot;
	@Test(priority = 0, description = "Testcase One")

	public void LaunchBroswer() throws IOException, AWTException,Exception {
		driver.get(baseUrl);
		HomeSectionPage HomesecOR = new HomeSectionPage();
		HomesecOR.homesection(driver).click();
		HomesecOR.allowCookies(driver).click();
		Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE, 500, true).withName("HomePage")
				.save("C:\\Users\\Senthilnathan\\workspace\\" + "GrootanTechnology\\Screenshots\\Folder1");

		if (driver.getTitle().equals("Grootan Technologies")) {
			Assert.assertTrue(true);
			
		} else {
			Assert.assertTrue(false);
		}
	}
}
