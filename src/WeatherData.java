import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private ArrayList <Observer> observers;
	private double temp;
	private double humidity;
	private double pressure;
	
	public WeatherData () {
		observers = new ArrayList <Observer> ();
		temp =0.0;
		humidity = 0.0; 
		pressure = 0.0;
	}

	@Override
	public void registerObserver(Observer o) {
		
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer ob : observers) {
			ob.update(temp, humidity, pressure);
		}
	}
	
	public void setMeasurements (double temp, double humidity, double pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}

	
}
