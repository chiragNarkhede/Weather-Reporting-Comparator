package commonUtil;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import base.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import model.WeatherReportResponse;

public class ApiOps {

	final static int statusCode_Ok = 200;
	 public static Logger log =LogManager.getLogger(ApiOps.class.getName());

	public static WeatherReportResponse GetResponse() {
		
		WeatherReportResponse reportResponse = null;
		Response response = null;
		try {
			String apiUrl = PropertyReader.getApiUrl();
			String city=PropertyReader.getCity();
			String key=PropertyReader.getKey(); 
			String uRI = apiUrl.replace("city", city).replace("key", key);
			response = RestAssured.get(uRI);
			int statusCode = response.getStatusCode();
			if (statusCode != statusCode_Ok) {
				log.error("Request not Completed.");
			}
			reportResponse = response.getBody().as(WeatherReportResponse.class);

		} catch (Exception e) {
			log.fatal("Exception Occured" + e.getMessage() + e.getStackTrace());
		}

		return reportResponse;
	}

}
