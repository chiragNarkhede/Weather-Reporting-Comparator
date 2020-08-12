package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/* This class contains all landing page elements.  
 * Initialization of Web element
*/

public class WeatherReportPage {
	
	public WebDriver driver;
	
	/*Web Elements */
	
	private By weatherLogo = By.xpath(".//*[@id='logo']");
	private By searchContainerTitle = By.xpath("//span[@class='message_holder_header']");
	private By searchBox = By.xpath(".//*[@id='searchBox']");
	private String checkBox = ".//*[@id='cityName'][@type='checkbox']";
	
	private String searchOnMap = "//div[@class='cityText'][text()='cityName']";
	private By cityPopUp = By.xpath("//div[@class='leaflet-popup-content']");
	private String dTemperature=".//div[@class='outerContainer'][@title='Pune']//following ::span[@class='tempRedText']";
	private String fTemperature=".//div[@class='outerContainer'][@title='Pune']//following ::span[@class='tempWhiteText']";
	private String leafLetPopUp = "//span[@class='heading'][1]//following::b[num]";
	
	
	
	public WeatherReportPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getLogo()
	{
		return driver.findElement(weatherLogo);
	}

	public WebElement getSearchContainerTitle()
	{
		return driver.findElement(searchContainerTitle);
	}
	
	public WebElement getSearchBox()
	{
		return driver.findElement(searchBox);
	}
	
	public WebElement getCheckBox(String cityName)
	{
		
		return driver.findElement(By.xpath(checkBox.replace("cityName", cityName)));
	}

	public WebElement getCityOnMap(String cityName)
	{
		return driver.findElement(By.xpath(searchOnMap.replace("cityName", cityName)));
	}
	
	public WebElement getLeafPopUp()
	{
		return driver.findElement(cityPopUp);
	}
	
	public WebElement getDTemperature(String cityName)
	{
		return driver.findElement(By.xpath(dTemperature.replace("cityName", cityName)));
	}

	public WebElement getFTemperature(String cityName)
	{
		return driver.findElement(By.xpath(fTemperature.replace("cityName", cityName)));
	}

	public WebElement getPopUpData(String index)
	{
		return driver.findElement(By.xpath(leafLetPopUp.replace("num",index)));
	}
	
	
}
