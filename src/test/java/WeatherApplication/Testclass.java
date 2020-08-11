package WeatherApplication;


import baseClass.TestBase;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
public class Testclass extends TestBase {

	public WebDriver driver;
	@Test
	public void abc() throws IOException
	{
	
		 driver = DriverInitializer();
		 driver.get(url);
		 System.out.println("Opened");

	}
	
}
