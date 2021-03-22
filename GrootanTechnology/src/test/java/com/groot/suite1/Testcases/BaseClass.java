package com.groot.suite1.Testcases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class BaseClass {
	static WebDriver driver;
	String baseUrl = "https://www.grootan.com/";
	ChromeOptions options;
	String screenshot;
	String nameoffolder = "Folder1";
	BufferedImage expectedImage1;
	BufferedImage actualImage1;

	// Launch the Chrome Browser
	@BeforeClass
	public void beforeSuite() throws IOException {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Senthilnathan\\workspace\\GrootanTechnology\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
	}

	// Close the Chrome Browser
	@AfterClass
	public void afterSuite() {
		driver.quit();
	}

	public static void takescreenshot(String screenshotName, String folder) throws IOException {
		Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE, 500, true).withName(screenshotName)
				.save("C:\\Users\\Senthilnathan\\workspace\\" + "GrootanTechnology\\Screenshots\\" + folder);
	}

	// <-To get the expected image screenshots from the Folder1->
	public static void ExpectedImage(String Exp_foldername, String Exp_ssName) throws IOException {
		BufferedImage expectedImage1 = ImageIO.read(new File("C:\\Users\\Senthilnathan\\workspace\\"
				+ "GrootanTechnology\\Screenshots\\" + Exp_foldername + "\\" + Exp_ssName + ".png"));
	}

	// <-To get the actual image screenshots from the Folder1->
	public static void ActualImage(String Act_foldername, String Act_ssName) throws IOException {
		BufferedImage actualImage1 = ImageIO.read(new File("C:\\Users\\Senthilnathan\\workspace\\"
				+ "GrootanTechnology\\Screenshots\\" + Act_foldername + "\\" + Act_ssName + ".png"));
	}

}