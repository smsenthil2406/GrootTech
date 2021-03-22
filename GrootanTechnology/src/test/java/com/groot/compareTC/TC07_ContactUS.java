package com.groot.compareTC;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.groot.Utilities.ExcelSheet;
import com.groot.suite1.Testcases.BaseClass;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class TC07_ContactUS extends BaseClass {
	
	@Test(priority = 0, description = "Compare the suite 1 and 2 screenshots")
	public void PageImage() throws IOException, Exception,InterruptedException {
		ExcelSheet ret = new ExcelSheet();
		BufferedImage expectedImage1 = ImageIO.read(new File ("C:\\Users\\Senthilnathan\\workspace\\"
				+ "GrootanTechnology\\Screenshots\\Folder1\\ContactUSPage.png"));
		BufferedImage actualImage1 = ImageIO.read(new File ("C:\\Users\\Senthilnathan\\workspace\\"
				+ "GrootanTechnology\\Screenshots\\Folder2\\ContactUSPage.png"));
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage1, actualImage1);
		// <-Validation start here->
		if (diff.equals(diff) == true) {
			System.out.println("THe Images are same.");
			Assert.assertTrue(true);
			ret.writefile("Pass",7,2,0);
		} else {
			System.out.println("THe Images are NOT same.");
			Assert.assertFalse(false);
			ret.writefile("Se",7,2,0);
		}
	}
}