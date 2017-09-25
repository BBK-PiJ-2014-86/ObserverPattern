
public class WeatherStation {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		CurrentConditions tempDisplay = new CurrentConditions (weatherData);
		Humidity humidity = new Humidity (weatherData);
		
		weatherData.setMeasurements(26, 50, 0);

		
	}

}
