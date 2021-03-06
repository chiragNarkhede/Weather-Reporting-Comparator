package commonUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* Read a property from property file */

public class PropertyReader {

	public static String url;

	public static String apiUrl ;
	public static String city;
	public static String key; 
	public static String browserName;
	public static Properties prop;
	public static String chromePath;
	public static String firefoxPath; 
	public static String screenshotFolder;
	public static String temperatureRange;
	
	
	public static String getTemperatureRange() {
		return temperatureRange;
	}


	public static void setTemperatureRange(String temperatureRange) {
		PropertyReader.temperatureRange = temperatureRange;
	}


	public static String getUrl() {
		return url;
	}


	public static String getScreenshotFolder() {
		return screenshotFolder;
	}


	public static void setScreenshotFolder(String screenshotFolder) {
		PropertyReader.screenshotFolder = screenshotFolder;
	}


	public static void setUrl(String url) {
		PropertyReader.url = url;
	}


	public static String getApiUrl() {
		return apiUrl;
	}


	public static void setApiUrl(String apiUrl) {
		PropertyReader.apiUrl = apiUrl;
	}


	public static String getCity() {
		return city;
	}


	public static void setCity(String city) {
		PropertyReader.city = city;
	}


	public static String getKey() {
		return key;
	}


	public static void setKey(String key) {
		PropertyReader.key = key;
	}


	public static String getBrowserName() {
		return browserName;
	}


	public static void setBrowserName(String browserName) {
		PropertyReader.browserName = browserName;
	}


	public static String getChromePath() {
		return chromePath;
	}


	public static void setChromePath(String chromePath) {
		PropertyReader.chromePath = chromePath;
	}


	public static String getFirefoxPath() {
		return firefoxPath;
	}


	public static void setFirefoxPath(String firefoxPath) {
		PropertyReader.firefoxPath = firefoxPath;
	}


	
	
	public static void ReadFile() throws IOException
	{
		prop = new Properties();
		FileInputStream fileInput = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\data.properties");
		prop.load(fileInput);
		apiUrl = prop.getProperty("apiURL");
		city = prop.getProperty("city");
		key = prop.getProperty("apiKey");
		url = prop.getProperty("applicationUrl");
		browserName = prop.getProperty("browser");
		chromePath = prop.getProperty("chromDriverPath");
		firefoxPath = prop.getProperty("firefoxDriverPath");
		screenshotFolder=prop.getProperty("screenshotFolder");
		temperatureRange=prop.getProperty("temperatureRange");
	}
	
}
