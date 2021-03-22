package com.groot.suite1.Testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.groot.PageObject.TeamPage;
import com.groot.Utilities.ExcelSheet;

public class TC08_TestEngineer extends BaseClass {
	@Test
	public void findTE() throws Exception {
		ExcelSheet ret = new ExcelSheet();
		TeamPage TeamOR = new TeamPage();
		TeamOR.allowCookies(driver).click();
		TeamOR.teamsection(driver).click();
		List<WebElement> elements = driver.findElements(By.xpath("//*[text()='Test Engineer']/preceding::h3[1]"));
		List<String> all_elements_text = new ArrayList<String>();
		if (elements.size() > 0) {
			System.out.println("Pass");
			ret.writefile("Pass", 8, 2, 0);
		} else {
			System.out.println("Fail");
			ret.writefile("Fail", 8, 2, 0);
		}

		System.out.println("Number of elements:" + elements.size());
		for (int i = 0; i < elements.size(); i++) {
			String Test_Engineer = elements.get(i).getText();
			System.out.println("Test Engineer name is " + Test_Engineer);
			int j=0; j++;
			ret.writefile(Test_Engineer, j,i, 1);
			}
		
	}
}
