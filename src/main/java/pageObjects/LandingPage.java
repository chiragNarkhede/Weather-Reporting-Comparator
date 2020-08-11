package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/* This class contains all landing page elements.  
 * Initialization of Web element
*/


public class LandingPage {
	
public WebDriver driver;
	
	private By subMenu = By.xpath("//a[@class =\"topnavmore\"]");
	
	private By weather = By.xpath("//a[text()='WEATHER']");
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getSubMenu()
	{
		return driver.findElement(subMenu);
	}

	public WebElement getWeatherOption()
	{
		return driver.findElement(weather);
	}

}
