package commonUtil;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import base.TestBase;
import model.WeatherReportResponse;

public class UiOps {
	
	public static Logger log = LogManager.getLogger(TestBase.class.getName());
	
	
	public static boolean checkTemp(String uiTemp,WeatherReportResponse responseObj) throws MatcherException
	{
		boolean result=false;
		log.info("Get Values for temperature.");
		double feelTemp = responseObj.getMain().getFeelslike();
		
		double normalTemp = responseObj.getMain().getTemp();
		
		String tempRange = PropertyReader.getTemperatureRange();
		
		double range = Double.parseDouble(tempRange);
	
		double tempUI = Double.parseDouble(uiTemp);
	
		double calculatedRange = Math.abs(tempUI-((feelTemp+normalTemp)/2));
		log.info("Compare temperature from UI and API using variance logic.");
		if(calculatedRange>=0 &&calculatedRange<range)
		{
			result=true;
		}
		
		throw new MatcherException(result);
	}
	
	public static boolean checkHumidity(String uiHumidity,WeatherReportResponse responseObj) throws MatcherException
	{
		log.info("Compare humidity from UI and API.");
		boolean result=true;
		double humidityAPI = responseObj.getMain().getHumidity();
		double humidityUI = Double.parseDouble(uiHumidity);  
		
		throw new MatcherException(result);
	}
	public static boolean CheckWindSpeed(String uiWindSpeed,WeatherReportResponse responseObj) throws MatcherException
	{
		log.info("Compare Wind Speed from UI and API.");
		boolean result=true;
		double windAPI = responseObj.getWind().getSpeed();
		double windUI = Double.parseDouble(uiWindSpeed);  
		
		throw new MatcherException(result);
	}

}
