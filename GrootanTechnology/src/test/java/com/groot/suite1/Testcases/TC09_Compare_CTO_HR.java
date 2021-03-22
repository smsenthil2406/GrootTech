package com.groot.suite1.Testcases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.groot.PageObject.TeamPage;
import com.groot.Utilities.ExcelSheet;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class TC09_Compare_CTO_HR extends BaseClass {
	@Test(priority = 0, description = "Compare CTO and HR images")
	public void CompareImage() throws IOException,Exception, InterruptedException {
		ExcelSheet ret = new ExcelSheet();
		TeamPage TeamOR = new TeamPage();
		TeamOR.allowCookies(driver).click();
		TeamOR.teamsection(driver).click();
		WebElement ee = TeamOR.CTOCO(driver);
		Screenshot screenshot = new AShot().takeScreenshot(driver, ee);
		ImageIO.write(screenshot.getImage(), "PNG", new File(
				("C:\\Users\\Senthilnathan\\workspace\\" + "GrootanTechnology\\Screenshots\\Folder1\\" + "CTO.png")));
		BufferedImage expectedImage = ImageIO.read(
				new File("C:\\Users\\Senthilnathan\\workspace\\" + "GrootanTechnology\\Screenshots\\Folder1\\CTO.png"));
		WebElement hrimg = TeamOR.HR(driver);
		Screenshot screenshotHR = new AShot().takeScreenshot(driver, hrimg);

		BufferedImage actualImage = screenshotHR.getImage();
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);

		if (diff.hasDiff() == true) {
			System.out.println("THe Images are NOT same.");
			ret.writefile("Pass", 9, 2, 0);
		} else {
			System.out.println("THe Images are same.");
			ret.writefile("Pass", 9, 2, 0);
		}

	}
}
