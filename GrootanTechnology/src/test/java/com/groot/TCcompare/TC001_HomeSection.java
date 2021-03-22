package com.groot.TCcompare;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.groot.Utilities.ExcelSheet;
import com.groot.suite1.Testcases.BaseClass;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class TC001_HomeSection extends BaseClass {
	@Test
	public void CompareHome() throws Exception {

		ExcelSheet ret = new ExcelSheet();
		BufferedImage expectedImage1 = ImageIO.read(
				new File("C:\\Users\\Senthilnathan\\workspace\\GrootanTechnology\\Screenshots\\Folder1\\HomePage.png"));
		BufferedImage actualImage1 = ImageIO.read(
				new File("C:\\Users\\Senthilnathan\\workspace\\GrootanTechnology\\Screenshots\\Folder2\\HomePage.png"));
	
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage1, actualImage1);

		if (diff.hasDiff() == false) {
			System.out.println("The Images are same.");
			Assert.assertTrue(true);
			ret.writefile("Pass", 1, 2, 0);
		} else {
			System.out.println("The Images are NOT same.");
			Assert.assertFalse(false);
			ret.writefile("Fail", 1, 2, 0);
		}
	}
}
