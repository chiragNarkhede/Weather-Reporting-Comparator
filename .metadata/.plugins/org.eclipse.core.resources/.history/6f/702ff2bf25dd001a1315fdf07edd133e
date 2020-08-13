package commonUtil;

import model.WeatherReportResponse;

public class UiOps {
	
	static WeatherReportResponse responseObj = new WeatherReportResponse();
	
	public static boolean checkTemp(String uiTemp)
	{
			
		boolean result=true;
		double feelTemp = responseObj.getMain().getFeelslike();
		double normalTemp = responseObj.getMain().getTemp();
		double tempUI = Double.parseDouble("uiTemp");  
		
		return true;
	}
	
	public static boolean checkHumidity(String uiHumidity)
	{
		boolean result=true;
		double humidityAPI = responseObj.getMain().getHumidity();
		double humidityUI = Double.parseDouble(uiHumidity);  
		return result;
		
	}
	public static boolean CheckWindSpeed(String uiWindSpeed)
	{
		boolean result=true;
		double windAPI = responseObj.getWind().getSpeed();
		double windUI = Double.parseDouble(uiWindSpeed);  
		return result;
	}

}
