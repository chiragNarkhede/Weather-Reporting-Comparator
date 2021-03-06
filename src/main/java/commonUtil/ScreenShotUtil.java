package commonUtil;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;

import base.TestBase;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import commonUtil.PropertyReader;
import testSuit.VerifyCityTemperatureWithAPIandUI;

public class ScreenShotUtil {

	private static Logger logger = LogManager.getLogger(ScreenShotUtil.class.getName());

	/*
	 * Capture Screen Shot.
	 * 
	 * @param TestCaseName
	 * 
	 * @param WebDriver
	 * 
	 * @param pass/fail
	 */
	public static void CaptureScreenShot(WebDriver driver, boolean error) {

		logger.debug("START: Capturing Screen Shot.");
		String folder = PropertyReader.getScreenshotFolder();
		try {
			String destinationFile;
			if (!error) {
				destinationFile = System.getProperty("user.dir") + folder + "\\Failed-" + System.currentTimeMillis()
						+ ".png";
			} else {
				destinationFile = System.getProperty("user.dir") + folder + "\\Passed-" + System.currentTimeMillis()
						+ ".png";
			}
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(destinationFile));
		} catch (Exception e) {
			logger.fatal("Exception Occured" + e.getMessage() + e.getStackTrace());

		} finally {
			logger.debug("END: Capturing Screen Shot.");
		}

	}

}
